package src.Excsize;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res1 = 0;
        while (in.hasNextLine()) {
            String s = in.nextLine();
            String[] str = s.split(" ");
            String s2 = str[str.length - 1];
            char[] arr = s2.toCharArray();
            res1 = arr.length;

        }
        System.out.println(res1);
    }
}

