package com.example.gitdemo.test;

import java.util.Random;

/**
 * @author ldtianzhe
 * @description
 * @date 2021/6/29
 */
public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("<<<<<<<========>>>>>>>>");
            // String str = new Random().nextInt() % 2 == 0 ? null : "not null";

            // System.out.println(str);
            // assert str != null;

            Boolean bo = 1 > 2;
            assert bo;
            System.out.println(".....");
            System.out.println(">>>>>>>=========<<<<<<");
        }

    }
}
