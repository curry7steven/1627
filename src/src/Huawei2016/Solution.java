package src.Huawei2016;

import java.util.Scanner;

public class Solution<Char> {

    public  static  void  main(String[] args){
        int M = 0;
        int N = 0 ;
        int A = 0,B =0;
        String c = null;
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){//hasNext遇到空格停止
            N = in.nextInt();
            M = in.nextInt();

            int[] score = new int[N];
            for(int i = 0;i < N;i++){
                score[i] = in.nextInt();
            }

            for(int j = 0;j<M;j++){
                c = in.next();//next方法返回string类型
                A = in.nextInt();
                B= in.nextInt();
                process(c,A,B,score);


            }
        }

    }

    public static void  process(String c, int a, int b, int[] score){
        int begin,end,max = 0;

        end = b;
        begin = a-1;
        if(c.equals('Q')) {
            for (int i = begin; i < b; i++) {
                max = Math.max(max, score[i]);
            }

            System.out.println(max);
        }
        if(c.equals('U')){
            score[a-1] = b;
        }
    }
}
