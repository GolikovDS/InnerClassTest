package ru.gds.generic;

/**
 * Created by Дмитрий on 20.10.2016.
 */
public class ClassGen<T extends ClassA> {
    public ClassGen(T t) {
        this.t = t;
    }

    T t;

    public void fon(){
        System.out.println(t.getClass().getName());
    }
}
