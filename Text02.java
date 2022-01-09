package com.itheima;
import java.util.Scanner;

public class Text02 {
    public static void main(String[] args) {

        while (true) {

            System.out.println("请输入一个星期数[1-7]：");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("今天的减肥活动是跑步！！！");
                    break;
                case 2:
                    System.out.println("今天的减肥活动是游泳！！！");
                    break;
                case 3:
                    System.out.println("今天的减肥活动是慢走！！！");
                    break;
                case 4:
                    System.out.println("今天的减肥活动是骑动感单车！！！");
                    break;
                case 5:
                    System.out.println("今天的减肥活动是打拳击！！！");
                    break;
                case 6:
                    System.out.println("今天的减肥活动是爬山！！！");
                    break;
                case 7:
                    System.out.println("今天是星期天哦，不用运动，可以好好吃一顿！！！");
                    break;
                default:
                    System.out.println("您输入的数字不符合规定，请再输入一次：");
            }
        }
    }
}
