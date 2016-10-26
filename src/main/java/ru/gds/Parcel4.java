package ru.gds;

import java.util.Objects;

/**
 * Created by Дмитрий on 05.09.2016.
 */
public class Parcel4 {

    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        public void somF() {
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

}



class TestParcel {
    public static void main(String[] args) {
//        String s = "5";
//        System.out.println(s);
        strtt("");
//        System.out.println(s);
//        Parcel4 p = new Parcel4();
//        Contents c = p.contents();
//        Destination d = p.destination("Tasmandsfvsdcvszd vxdzfdsxv sd ia");
//        System.out.println(d.readLabel());
//        System.out.println(c.value());
// Запрещено - нет доступа к private-классу:
//! Parcel4.PContents pc = p.new PContents();
    }
    public static void  strtt(String s){

        Object a = new Integer[10];
        Object[] b = new Integer[10];
       // System.out.println("ds");
        A a1 = new B();
        System.out.println(a1.methodA(1));
    }
}

class A {
    Number methodA(Number arg) { return 3; }
}
class B extends A {

    Short methodA(Number arg) {
        return 2;
    }
//    Short methodB(Integer arg) { return 2; }
}
