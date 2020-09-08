package src.huawei09066;

import java.util.Scanner;

public class Solution {
    // n个人，每个人有一种礼物，一共有两种礼物
    //求三个人 礼物数量相加和最大

    //思路：arr1存储A类的礼物数，arr2存储b类的礼物数，然后分别求最大的前三个值。
    //存储的礼物数跟行号怎么对应呢？公共变量count计数
    public  static  void  main(String[] args){
        Scanner input = new Scanner(System.in);
        // n代表有多少人
        int n  = input.nextInt();

        while (input.hasNextLine()){
            // 每一行用line表示
            String line = input.nextLine();

        }
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int  count = -1;
        while (input.hasNext()){

            int a = input.nextInt();
            int b = input.nextInt();
            if(b == 2){
                arr1[++count] =a;
            }
        }
    }
}
