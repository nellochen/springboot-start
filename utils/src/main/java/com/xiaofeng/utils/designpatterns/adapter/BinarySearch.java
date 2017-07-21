package com.xiaofeng.utils.designpatterns.adapter;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/18
 * @email chenxf84@gmail.com
 */


public class BinarySearch {
    public int binarySearch(int array[], int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return 1; //找到元素返回1
            }
        }
        return -1;  //未找到元素返回-1
    }
}
