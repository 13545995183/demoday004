package com.example.demoday004.controller;

import java.util.ArrayList;
import java.util.List;

public class Stringtest {
    public static void main(String[] args) {
        int[] a={-2,-3},b={5,4};
        //System.out.println(bllo(a));
        //System.out.println(bool(b));
        //System.out.println(bool1(b));
        //System.out.println(boo01(5));
        int n=7*8;
        //System.out.println(n/=2);
        String[]words = {"at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""};
        String solution="ball";
        String guess="baal";
        int caizhong=0,weicaizhong=0;
        char[] schar=solution.toCharArray();
        char[] s1char=guess.toCharArray();
        int[] dp=new int[2];
        /*System.out.println(dp[0]+" "+dp[1]);
        System.out.println(massage(b));*/
        List<Integer> A=new ArrayList<>();
        A.add(3);
        A.add(2);
        A.add(1);
        List<Integer> B=new ArrayList<>();
        List<Integer> C=new ArrayList<>();
        move(A,B,C);
    }

    private static void move(List<Integer> a, List<Integer> b, List<Integer> c) {
        move1(a.size(),a,b,c);
        System.out.println(c);
    }

    private static void move1(int size, List<Integer> a, List<Integer> b, List<Integer> c) {
        if(size<0){
            return;
        }
        move1(size-1,a,c,b);
        c.add(a.get(size-1));
        a.remove(a.size()-1);
        move1(size-1,c,b,a);
    }

    private static int massage(int[] nums) {
        if(nums.length==0){
            return 0;
        }else if(nums.length ==1){
            return nums[0];
        }

        int[] sum=new int[nums.length];
        //
        sum[0]=nums[0];
        sum[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sum[i]=Math.max(sum[i-1],sum[i-2]+nums[i]);
        }
        return sum[nums.length-1];
    }

    private static int boo01(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 3;
        }else if(n==3){
            return 4;
        }
        int dp1 = 1;
        int dp2 = 2;
        int dp3 = 4;
        int dp4 = 0;

        for(int i = 4; i <= n; ++i) {
            dp4 = ((dp1 + dp2) % 1000000007 + dp3) % 1000000007;
            dp1 = dp2;
            dp2 = dp3;
            dp3 = dp4;
        }
        System.out.println();
        return dp4;
    }

    private static int bool1(int[] b) {
        int sum=0;
        for (int i = 0; i < b.length; i++) {
            sum+=b[i];
        }
        return b.length*(b.length+1)/2-sum;
    }

    private static int bool(int[] b) {
        /*int number=0;
        while(number<b.length){
            if(b[number]==number){
                return 0;
            }else if(b[number]>number){
                number=b[number];
            }else{
                number++;
            }
        }*/
        int a=1,c=1;
        while((a&c)!=0){
            int num=0;
            a=(a&c)<<1;
            c^=num;
        }
        System.out.println(a^c);
        return -1;
    }

    private static int bllo(int[] nums) {
        int b = nums[0];
        int sum = b;
        for(int i = 1; i<nums.length;i++){
            if(b<0){
                b=nums[i];
            }else{
                b+=nums[i];
            }
            if(b>sum){
                sum=b;
            }
        }
        return sum;
    }

}
