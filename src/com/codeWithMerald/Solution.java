//package com.codeWithMerald;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
////        public int solution(int N) {
////            // write your code in Java SE 8
////            String binaryNumber = Integer.toBinaryString(N);
////            int count = 0;
////            List<Integer> countList = new ArrayList<>();
////            for(int index = 0; index < binaryNumber.length(); index++){
////                if(binaryNumber.charAt(index) == '0'){
////                    count++;
////                     if( (index + 1 < binaryNumber.length()) && (binaryNumber.charAt(index+1) == '1')){
////                        countList.add(count);
////                        count = 0;
////                    }
////                }
////            }
////            if(countList.size() == 0){
////                return 0;
////            }
////            return Collections.max(countList);
////        }
////public static int main(String[] args) {
////    int N = 15;
////    String binaryNumber = Integer.toBinaryString(N);
////    System.out.println(binaryNumber);
////    int count = 0;
////    List<Integer> countList = new ArrayList<>();
////    for(int index = 0; index < binaryNumber.length(); index++){
////        if(binaryNumber.charAt(index) == '0'){
////            count++;
////            if( (index + 1 < binaryNumber.length()) && (binaryNumber.charAt(index + 1) == '1')){
//////                System.out.println(count);
////                countList.add(count);
////                count = 0;
////            }
////        }
////    }
////    if(countList.size() == 0){
////        return 0;
////    }
////    int maximumValue = Collections.max(countList);
////    System.out.println("max value is " + maximumValue);
//////    for (Integer integer : countList) {
//////        System.out.println(integer);
//////    }
//////    System.out.println(binaryNumber);
////}
//public static void main(String[] args) {
//    int[] arr = {9,1,2,3,4, 7,5,6,8};
//    int m;
//    int count = 0;
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 1; j < (arr.length - i); j++){
//            int k = arr[j];
//            int l = arr[j-1];
//            if (l > k) {
//                m = arr[j-1];
//                arr[j-1] = arr[j];
//                arr[j] = m;
//                count++;
//            }
//           // System.out.println(Arrays.toString(arr));
////            else if( k > l){
////                m = arr[j-1];
////                arr[j-1] = arr[j];
////                arr[j] = m;
////            }
//
//        }
//    }
//    int first = arr[0];
//    int last = arr.length;
//    //System.out.println(Arrays.toString(arr));
//    System.out.println(count);
//    System.out.println(first);
//    System.out.println(last);
//}
//    }
