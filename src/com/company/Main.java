package com.company;

public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        //for static method
        hello.A("hi");       // this is not wrong answer display. but give warning
        Hello.A("hi static");  //direcly from class name, not from object

        //for non static method
        hello.B("hi non static");

        //for static varicble
        Hello.age = 10;
    }
}
