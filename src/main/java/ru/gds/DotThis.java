package ru.gds;

import java.util.Iterator;

/**
 * Created by Дмитрий on 05.09.2016.
 */
public class DotThis {

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
// A plain "this" would be Inner's "this"
        }
    }

    public class inner2{
        public void say(){
            System.out.println("Inner say gav");
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();

        DotThis.inner2 dotThis = dt.new inner2();
        dotThis.say();


    }
}
