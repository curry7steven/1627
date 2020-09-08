package src.huawei09066;

import java.util.Scanner;

public class Solution2 {
    public  static  void main(String[] args){
        //
        //第一个问题，怎么读取二维字符数组

        //首先读取二维的规模
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String[] str2 = str.split(",");
            int n = Integer.valueOf(str2[0]);
            int m = Integer.valueOf(str2[1]);
        }
    }

    public void dfs(char[][] ab ,int i ,int j ,int m){
        if(i<0||i>m) return;
        if(ab[i][j] == 'S') ab[i][j] = 'H';
        else
            dfs(ab,i-1,j,m);
            dfs(ab,i,j-1,m);

    }
}
