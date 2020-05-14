package com.ycorn.patterns.interpreter.practice;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 14:52
 */

public class ExpressionTest {

    public static void main(String[] args) {
        String exp = "a+b+c";
        HashMap<String, Integer> map = ExpressionTest.getMap(exp);
        Calculator calculator = new Calculator(exp);
        int result = calculator.run(map);
        System.out.println(result);
    }

    private static HashMap<String, Integer> getMap(String exp) {
        char[] chars = exp.toCharArray();
        HashMap<String, Integer> params = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (char c : chars) {
            if (c != '+' && c != '-') {
                if (!params.containsKey(String.valueOf(c))) {
                    System.out.print("请输入" + String.valueOf(c) + "的值：");
                    int val = scanner.nextInt();
                    params.put(String.valueOf(c), val);
                }
            }
        }
        scanner.close();

        return params;
    }
}
