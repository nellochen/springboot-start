package com.xiaofeng.service;

import freemarker.template.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/24
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    Configuration freemarkerConfiguration;

    //Velocity 1.7 dates back to 2010. After more than five years of no maintenance in the original project, it's about time to deprecate Velocity support on Spring's side.
//    @Autowired
//    private VelocityEngineUtils;

    @Before
    public void setUp() {
    }

    @Test
    public void test() throws Exception {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("chenxf84@qq.com");
        message.setTo("chenxf84@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
        sendAttachmentsMail();
        sendInlineMail();
        sendTemplateMail();
    }

    public void sendAttachmentsMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("chenxf84@qq.com");
        helper.setTo("chenxf84@qq.com");
        helper.setSubject("主题：有附件");
        helper.setText("有附件的邮件");
        FileSystemResource file = new FileSystemResource(new File("pom.xml"));
        helper.addAttachment("附件-1.jpg", file);
        helper.addAttachment("附件-2.jpg", file);
        mailSender.send(mimeMessage);
    }

    public void sendInlineMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("chenxf84@qq.com");
        helper.setTo("chenxf84@qq.com");
        helper.setSubject("主题：嵌入静态资源");
        helper.setText("<html><body><img src=\"cid:weixin\" ></body></html>", true);
        FileSystemResource file = new FileSystemResource(new File("pom.xml"));
        helper.addInline("weixin", file);
        mailSender.send(mimeMessage);
    }

    public void sendTemplateMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("chenxf84@qq.com");
        helper.setTo("chenxf84@qq.com");
        helper.setSubject("主题：模板邮件");
        Map<String, Object> model = new HashMap();
        model.put("username", "didi");
        String text = FreeMarkerTemplateUtils.processTemplateIntoString(
                freemarkerConfiguration.getTemplate("welcome.ftl"), model);
        helper.setText(text, true);
        mailSender.send(mimeMessage);
    }
}
