package com.dungeon.task4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        AgeHelper helper = new AgeHelper();
        String answer = helper.getAgeCategory(age);
        System.out.println(answer);
    }
}
