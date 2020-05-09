package com.ycorn.patterns.vistor.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/9 17:44
 */

public class VisitorTest {

    public static void main(String[] args) {
        Report report = new Report();
        report.showReport(new CTOVisitor());
        System.out.println("===========================================");
        report.showReport(new CEOVisitor());
    }
}
