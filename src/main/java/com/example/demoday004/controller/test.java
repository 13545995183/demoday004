package com.example.demoday004.controller;

import com.example.demoday004.entity.ListNode;

import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        //System.out.println(b);
        //------------------
        String f="aabcccccaaa";
        //String str= bool5(f);
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        /*boolean boolea=isFlipedString(s1,s2);
        System.out.println(boolea);*/
        //System.out.println(a>b?a:b);
        int [] arr={1,0,0,0,1};
        //System.out.println(flower(arr,2));
        boolean b10=booleanForContrast("horse","orse");
        //System.out.println(b10);
        int[] A={1,2,2,3,0,0,0};
        int[] B={3,4,5};
        //System.out.println(cent());
        merge(A,4,B,3);

        //-------
        String palindrome="a.. b.a.";

        //System.out.println(isPalindrome(palindrome));

    }

    private static void merge(int[] a, int m, int[] b, int n) {
        //总长度m+n，从a中的m点开始在添加b的元素；
        for(int i=m;i<m+n;i++){
            a[i]=b[i-m];
        }
        Arrays.sort(a);

    }



    private static boolean isPalindrome(String palindrome) {
        palindrome=palindrome.replaceAll("[^a-zA-Z0-9\\n\\r]+","");
        System.out.println(palindrome);
        String reverse=new StringBuilder(palindrome).reverse().toString();
        //长度是奇数还是偶数
        if(reverse.equalsIgnoreCase(palindrome)){
            return  true;
        }
        return false;
    }

    private static int cent() {
        int[] nums={1,2,5,7,11,20};
        int target=6;
        int start=0,end=nums.length-1,centre=0;
        while (start<=end){
            centre=start+(end-start)/2;
            if(nums[centre]==target){
                return centre;
            }else if(nums[centre]>target){
                end= centre-1;
            }else{
                start=centre+1;
            }
        }
        return start;
    }

    private static boolean flower(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i += 2) {
            // 如果当前为0,
            if (flowerbed[i] == 0) {
                // 如果是最后一个和下一个是否为0
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    n--;
                } else {
                    i++;
                }
            }
        }

        return n<=0;
    }

    private static String bool5(String S) {
        int len = S.length();
        if (len == 0) {
            return "";
        }

        char[] chars = S.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(chars[0]);

        int index = 0;
        int cnt = 1;
        for (int i = 1; i < len; i++) {
            if (chars[i] == chars[index]) {
                cnt++;
            } else {
                stringBuilder.append(chars[index]);
                stringBuilder.append(cnt);
                index = i;
                cnt = 1;
            }
        }

        stringBuilder.append(chars[len - 1]);
        stringBuilder.append(cnt);

        String res = stringBuilder.toString();
        if (res.length() >= len){
            return S;
        }
        return res;
    }

    private static boolean bool4(String first, String second) {
        int a=first.length()-second.length();
        if(Math.abs(a)>1){
            return false;
        }
        char[] firstArr=first.toCharArray();
        char[] secondArr=second.toCharArray();
        int b=0;
        if(firstArr.length==secondArr.length){

            for (int i = 0; i < firstArr.length; i++) {
                if(firstArr[i]!=secondArr[i]){
                    b++;
                }
            }
            if(b>1){
                return false;
            }

        }else if(firstArr.length>secondArr.length){
            int lenght=firstArr.length-secondArr.length;
            if(lenght>1){
                return false;
            }else{
                for (int i = 0; i < secondArr.length; i++) {
                    if(firstArr[i]!=secondArr[i]){
                        b=i;
                    }
                }
                String firstStr="";
                if(b==0){
                    firstStr=first.substring(0,0);
                }else{
                    firstStr=first.substring(0,b-1);
                }
                String lastStr=first.substring(b);
                String first1=firstStr+lastStr;
                char[] first2Arr=first1.toCharArray();
                System.out.println(first2Arr==secondArr);
                System.out.println(first1==second);
                if(first2Arr.length!=secondArr.length){
                    return false;
                }else{
                    for (int i = 0; i < first2Arr.length; i++) {
                        if(first2Arr[i]!=secondArr[i]){
                            return false;
                        }
                    }
                    return true;
                }
            }

        }else{
            for (int i = 0; i < firstArr.length; i++) {
                if(firstArr[i]!=secondArr[i]){
                    b=i;
                }
            }
            String firstStr="";
            if(b==0){
                firstStr=second.substring(0,0);
            }else{
                firstStr=second.substring(0,b-1);
            }
            String lastStr=second.substring(b);
            String seconfirstArr=firstStr+lastStr;
            char[] seconfirst2ArrArr=seconfirstArr.toCharArray();
            System.out.println(seconfirst2ArrArr==firstArr);
            System.out.println(second==seconfirstArr);
            if(seconfirst2ArrArr.length!=firstArr.length){
                return false;
            }else {
                for (int i = 0; i < seconfirst2ArrArr.length; i++) {
                    if(seconfirst2ArrArr[i]!=firstArr[i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean booleanForContrast(String first, String second){
        int a=first.length()-second.length();
        if(Math.abs(a)>1){
            return false;
        }
        char[] firstArr=first.toCharArray();
        char[] secondArr=second.toCharArray();
        int b=0;
        if(firstArr.length==secondArr.length){
            for (int i = 0; i < firstArr.length; i++) {
                if(firstArr[i]!=secondArr[i]){
                    b++;
                }
            }
            if(b>1){
                return false;
            }
        }else{
            char[] loogArr,shosrArr;
            //判断谁长谁短；
            if(firstArr.length>secondArr.length){
                loogArr=firstArr;
                shosrArr=secondArr;
            }else {
                loogArr=secondArr;
                shosrArr=firstArr;
            }
            for (int i = 0; i < shosrArr.length; i++) {
                if(shosrArr[i]!=loogArr[i]){
                    if(i==0){
                        //如果是第一个直接虫第二个开始截取字符串  例如shosrArr：bcd     loogArr：abcd
                        String loogStr=new String(loogArr).substring(i+1);
                        if(loogStr.length()==0){
                            return false;
                        }
                        if(!loogStr.equals(new String(shosrArr))){
                            return false;
                        }
                        return true;
                    }else {
                        //例如 shosrArr：abc      loogArr：abcd
                        String loogStartStr=new String(loogArr).substring(0,i);
                        String loogLastStr=new String(loogArr).substring(i+1);
                        //截取比较
                        if(!(loogStartStr+loogLastStr).equals(new String(shosrArr))){
                            return false;
                        }
                        return true;
                    }
                }
            }

        }
        return true;
    }

    private static boolean bool3(String s) {
        if(s.length()==0){
            return false;
        }
        Set<Character> set=new HashSet<>();
        char[] a1=s.toCharArray();
        //判断是否有值
        for (char c: a1) {
            if(set.contains(c)){
                set.add(c);
            }else{
                set.remove(c);
            }
        }
        return set.size()<=1;
    }

    private static String bool2(String s1, int length) {
        String b1=s1.replace(" ","%20");
        System.out.println(length);
        return b1;
    }

    private static boolean bool1(String s, String s1) {
        char[] a1=s.toCharArray();
        char[] a2=s1.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(a1.length!=a2.length){
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean bool(String s) {
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            if(s.lastIndexOf(a)!=i){
                return false;
            }
        }
        return true;
    }

    private static boolean isFlipedString(String s1, String s2) {
        // 长度不相等，肯定不符合要求
        if (s1.length() != s2.length()) {
            return false;
        }

        // 长度相等时，若s2是s1旋转而成的，那么把s2和自身拼接一次，s1就会出现在其中
        // "erbottlewat" + "erbottlewat" = erbottle waterbottle wat
        // 如果s2不是s1旋转而成的，那么那么把s2和自身拼接一次，s1就肯定不会出现在其中
        return (s2 + s2).indexOf(s1) != -1;
    }

}
