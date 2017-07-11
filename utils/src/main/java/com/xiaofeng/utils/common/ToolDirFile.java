package com.xiaofeng.utils.common;


import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.*;

/**
 * 文件和目录相关
 *
 * @author 陈晓峰 2012-9-7 下午2:06:13
 */
public abstract class ToolDirFile {

    private static String libPath;
    private static String classesPath;


    /**
     * 获取classes路径
     *
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String getClassesPath(Class classs) {
        String classRootPath = classs.getClassLoader().getResource("").getFile();
        try {
            classRootPath = java.net.URLDecoder.decode(classRootPath, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return classRootPath;
    }

    /**
     * 获取当前代码所在行
     *
     * @return
     */
    public static String getLineNumber() {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        return ste.getFileName() + ": Line " + ste.getLineNumber();
    }

    /**
     * 获取目录下的文件名称，不包含子目录名称
     *
     * @param dirPath
     * @return
     * @author 陈晓峰 2012-9-6 下午8:17:51
     */
    public static List<String> getDirFileNames(String dirPath) {
        List<String> nameList = new ArrayList<String>();
        File file = new File(dirPath);
        File[] files = file.listFiles();
        for (File fileTemp : files) {
            if (!fileTemp.isDirectory()) {
                nameList.add(fileTemp.getName());
            }
        }
        return nameList;
    }

    /**
     * 复制文件夹或文件
     *
     * @param source
     * @param target
     * @throws IOException
     * @author 陈晓峰 2012-9-3 下午7:29:28
     */
    public static void copyDir(String source, String target) throws IOException {
        (new File(source)).mkdirs();
        // 获取源文件夹当前下的文件或目录
        File[] file = (new File(source)).listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                // 复制文件
                copyFile(file[i], new File(target + file[i].getName()));
            }
            if (file[i].isDirectory()) {
                // 复制目录
                String sourceDir = source + File.separator + file[i].getName();
                String targetDir = target + File.separator + file[i].getName();
                copyDirectiory(sourceDir, targetDir);
            }
        }
    }

    /**
     * copy文件或目录
     *
     * @param source
     * @param target
     * @author 陈晓峰 2012-9-3 下午7:31:57
     */
    public static void lovecopy(String source, String target) {
        // (new File(url2)).mkdirs();
        File f = new File(target);
        if (!f.exists()) {
            f.mkdirs();
        }

        // 获取源文件夹当前下的文件或目录
        File[] file = (new File(source)).listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                // 复制文件
                try {
                    copyFile(file[i], new File(target + file[i].getName()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (file[i].isDirectory()) {
                // 复制目录
                String sourceDir = source + File.separator + file[i].getName();
                String targetDir = target + File.separator + file[i].getName();
                try {
                    copyDirectiory(sourceDir, targetDir);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 复制文件
     *
     * @param sourceFile
     * @param targetFile
     * @throws IOException
     * @author 陈晓峰 2012-9-3 下午7:32:26
     */
    public static void copyFile(File sourceFile, File targetFile) throws IOException {
        // 新建文件输入流并对它进行缓冲
        FileInputStream input = new FileInputStream(sourceFile);
        BufferedInputStream inBuff = new BufferedInputStream(input);

        // 新建文件输出流并对它进行缓冲
        FileOutputStream output = new FileOutputStream(targetFile);
        BufferedOutputStream outBuff = new BufferedOutputStream(output);

        // 缓冲数组
        byte[] b = new byte[1024 * 5];
        int len;
        while ((len = inBuff.read(b)) != -1) {
            outBuff.write(b, 0, len);
        }
        // 刷新此缓冲的输出流
        outBuff.flush();

        // 关闭流
        inBuff.close();
        outBuff.close();
        output.close();
        input.close();
    }

    /**
     * 复制文件夹
     *
     * @param sourceDir
     * @param targetDir
     * @throws IOException
     * @author 陈晓峰 2012-9-3 下午7:32:33
     */
    public static void copyDirectiory(String sourceDir, String targetDir) throws IOException {
        // 新建目标目录
        (new File(targetDir)).mkdirs();
        // 获取源文件夹当前下的文件或目录
        File[] file = (new File(sourceDir)).listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                // 源文件
                File sourceFile = file[i];
                // 目标文件
                File targetFile = new File(new File(targetDir).getAbsolutePath() + File.separator + file[i].getName());
                copyFile(sourceFile, targetFile);
            }
            if (file[i].isDirectory()) {
                // 准备复制的源文件夹
                String dir1 = sourceDir + "/" + file[i].getName();
                // 准备复制的目标文件夹
                String dir2 = targetDir + "/" + file[i].getName();
                copyDirectiory(dir1, dir2);
            }
        }
    }

    /**
     * 检查目录是否存在，如果不存在就创建目录
     *
     * @param dirPath
     * @author 陈晓峰 2012-9-10 下午5:17:58
     */
    public static void createDirectory(String dirPath) {
        File file = new File(dirPath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /**
     * 删除文件或者目录
     *
     * @param file
     */
    public static void delete(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File files[] = file.listFiles();
                for (int i = 0, length = files.length; i < length; i++) {
                    delete(files[i]);
                }
            } else {
                file.delete();
            }
        }
    }

    /**
     * 文件下载
     *
     * @param response
     * @param fileName
     * @param filePath
     * @throws IOException
     */
    public static void download(HttpServletResponse response, String fileName, String filePath) throws IOException {
        FileInputStream fis = null;
        BufferedInputStream buff = null;
        try {
            File file = new File(filePath);
            response.setContentType("application/x-msdownload");// 设置response的编码方式
            response.setContentLength((int) file.length());// 写明要下载的文件的大小
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + new String(fileName.getBytes(ToolString.encoding), "iso-8859-1")); // 解决中文乱码

            // 读出文件到i/o流
            fis = new FileInputStream(file);
            buff = new BufferedInputStream(fis);
            byte[] bytes = new byte[1024];// 相当于我们的缓存
            long k = 0;// 该值用于计算当前实际下载了多少字节
            OutputStream os = response.getOutputStream();// 从response对象中得到输出流,准备下载

            // 开始循环下载
            while (k < file.length()) {
                int j = buff.read(bytes, 0, 1024);
                k += j;
                os.write(bytes, 0, j);// 将b中的数据写到客户端的内存
            }

            os.flush();// 将写入到客户端的内存的数据,刷新到磁盘

            buff.close();
            buff = null;

            fis.close();
            fis = null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (buff != null) {
                buff.close();
                buff = null;
            }
            if (fis != null) {
                fis.close();
                fis = null;
            }
        }
    }

    /**
     * 创建文件
     *
     * @param savePath 保存路径
     * @param content  文件内容
     */
    public static void createFile(String savePath, String content) {
        try {
            File file = new File(savePath);
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(content);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 指定位置开始写入文件
     *
     * @param outPath  输出文件的路径(路径+文件名)
     * @param tempFile 输入文件
     *                 描述 ：把目标文件的指针，移到文件末尾，然后把分片文件追加进去，实现文件合并
     */
    public static void writeFile(String outPath, File tempFile) {
        RandomAccessFile raFile = null;
        BufferedInputStream inputStream = null;
        try {
            File dirFile = new File(outPath);
            raFile = new RandomAccessFile(dirFile, "rw"); //以读写的方式打开目标文件
            raFile.seek(raFile.length());
            inputStream = new BufferedInputStream(new FileInputStream(tempFile));
            byte[] buf = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buf)) != -1) {
                raFile.write(buf, 0, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (raFile != null) {
                    raFile.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /***
     * 压缩GZip
     *
     * @param data
     * @return
     */
    public static byte[] gZip(byte[] data) {
        byte[] b = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            GZIPOutputStream gzip = new GZIPOutputStream(bos);
            gzip.write(data);
            gzip.finish();
            gzip.close();
            b = bos.toByteArray();
            bos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return b;
    }

    /***
     * 解压GZip
     *
     * @param data
     * @return
     */
    public static byte[] unGZip(byte[] data) {
        byte[] b = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            GZIPInputStream gzip = new GZIPInputStream(bis);
            byte[] buf = new byte[1024];
            int num = -1;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((num = gzip.read(buf, 0, buf.length)) != -1) {
                baos.write(buf, 0, num);
            }
            b = baos.toByteArray();
            baos.flush();
            baos.close();
            gzip.close();
            bis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return b;
    }

    /***
     * 压缩Zip
     *
     * @param data
     * @return
     */
    public static byte[] zip(byte[] data) {
        byte[] b = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ZipOutputStream zip = new ZipOutputStream(bos);
            ZipEntry entry = new ZipEntry("zip");
            entry.setSize(data.length);
            zip.putNextEntry(entry);
            zip.write(data);
            zip.closeEntry();
            zip.close();
            b = bos.toByteArray();
            bos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return b;
    }

    /***
     * 解压Zip
     *
     * @param data
     * @return
     */
    public static byte[] unZip(byte[] data) {
        byte[] b = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ZipInputStream zip = new ZipInputStream(bis);
            while (zip.getNextEntry() != null) {
                byte[] buf = new byte[1024];
                int num = -1;
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                while ((num = zip.read(buf, 0, buf.length)) != -1) {
                    baos.write(buf, 0, num);
                }
                b = baos.toByteArray();
                baos.flush();
                baos.close();
            }
            zip.close();
            bis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return b;
    }

}
