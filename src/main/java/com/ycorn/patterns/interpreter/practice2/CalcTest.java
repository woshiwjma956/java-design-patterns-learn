package com.ycorn.patterns.interpreter.practice2;

import java.util.Arrays;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.regex.Pattern;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 15:23
 */

public class CalcTest {

    public static void main(String[] args) {
        String exp = "1+2+3-5";
        Calc calc = new Calc(exp);

        Deque<Integer> val = new LinkedBlockingDeque<>();
        Arrays.stream(exp.split("")).filter(e -> Pattern.matches("[0-9]", e)).forEach(e -> val.addLast(Integer.valueOf(e)));
        int result = calc.run(val);
        System.out.println(result);
    }
}
