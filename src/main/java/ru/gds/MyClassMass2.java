package ru.gds;

import static ru.gds.MyClassMass.somMetod;
import static ru.gds.ClassNameUtil.getCurrentClassName;

public class MyClassMass2 {

    public static void main(String[] args) throws InterruptedException {
        StringBuilder string = new StringBuilder("123");
        System.out.println(getCurrentClassName());

        somMetod(new String[]{"s"});

        MyClassMass2 myClassMass = new MyClassMass2();
        myClassMass.one();
    }

    public void somMetod2(StringBuilder strings) {
        System.out.println(strings);
        strings.append("897");
        System.out.println(strings);
    }

    public void one() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("one");
        tho();
    }


    public void tho() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("tho");
        one();
    }
}
