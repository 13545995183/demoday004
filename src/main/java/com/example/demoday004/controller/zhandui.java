package com.example.demoday004.controller;

import java.util.Arrays;
import java.util.Stack;

public class zhandui {
    public static void main(String[] args) {

        int[] nums={1,2,1,2,2,1,3};

        int candidate = -1;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        int length = nums.length;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        //System.out.println(count*2>=nums.length?candidate:-1);
        int a=1;
        double d=1.6;
        System.out.println(a+=d);
        //背景
        //负责内容
        //主要业务流程
        //业务核心点
        //
    }
}
