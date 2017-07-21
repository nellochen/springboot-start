package com.xiaofeng.utils.designpatterns.adapter;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/18
 * @email chenxf84@gmail.com
 */


public interface IScoreOperation {
    public int[] sort(int array[]); //成绩排序

    public int search(int array[], int key); //成绩查找
}
