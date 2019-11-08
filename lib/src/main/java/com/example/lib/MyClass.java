package com.example.lib;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("輸入三角形三邊長");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int [] arry = new int[3];
        arry[0] = x;
        arry[1] = y;
        arry[2] = z;
        Arrays.sort(arry);
        if((arry[0]+arry[1])>arry[2]){
            System.out.println("可以拼出");
        }else{
            System.out.println("不能拼出");
        }
    }

}
