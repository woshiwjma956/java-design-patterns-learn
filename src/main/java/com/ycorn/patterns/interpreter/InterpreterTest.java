package com.ycorn.patterns.interpreter;


import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/26 14:23
 */

public class InterpreterTest {

    public static void main(String[] args) {
        String exp = "a+b+c";
        HashMap<String, Integer> map = getMap(exp);
        Calculator calculator = new Calculator(exp);
        int result = calculator.run(map);
        System.out.println(exp + " = " + result);
    }

    private static HashMap<String, Integer> getMap(String exp) {
        char[] chars = exp.toCharArray();
        HashMap<String, Integer> params = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (char c : chars) {
            if (c != '+' && c != '-') {
                if (!params.containsKey(String.valueOf(c))) {
                    System.out.print("«Î ‰»Î" + String.valueOf(c) + "µƒ÷µ£∫");
                    int val = scanner.nextInt();
                    params.put(String.valueOf(c),val);
                }
            }
        }
        scanner.close();

        return params;
    }

}
