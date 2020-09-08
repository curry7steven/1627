package src.Huawei2016;
//先分成三个string，

import java.util.Scanner;

//先比较有没有王，然后比较有没有炸，然后比较同一数目数组的最左边谁大
public class ThreeJoker {
    //先分成三个string，
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] left,right;
        String[] line;
        String nextLine,outString;

        //先比较有没有王，然后比较有没有炸，然后比较同一数目数组的最左边谁大
        while(sc.hasNext()) {
            nextLine = sc.nextLine();

            if(nextLine.contains("joker JOKER")){
                outString = "joker JOKER";
            }else{
                line = nextLine.split("-");
                left = line[0].split(" ");
                right = line[1].split(" ");

                //炸弹最大
                if(left.length == 4 && right.length != 4){
                    outString = line[0];
                }else if(right.length == 4 && left.length != 4){
                    outString = line[1];
                }
                // 牌数相同的情况下比较最小的牌的大小，compare方法返回牌所对应的值
                else if(right.length == left.length){
                    if(count(left[0])>count(right[0])){
                        outString = line[0];
                    }
                    else{
                        outString = line[1];
                    }
                }else{
                    outString = "ERROR";
                }
            }

            System.out.println(outString);

        }
    }
    //2-JOKER 按大小返回2-16
    private static int count(String str) {
        return "345678910JQKA2jokerJOKER".indexOf(str);

    }

}






