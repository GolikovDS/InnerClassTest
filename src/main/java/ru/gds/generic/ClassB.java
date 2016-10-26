package ru.gds.generic;

/**
 * Created by Дмитрий on 20.10.2016.
 */
public class ClassB extends ClassA {
    private String clazzB;
    public void somMetodB(){
        System.out.println("ClassB somMetodB");
    }

    public String getClazzB() {
        return clazzB;
    }

    public void setClazzB(String clazzB) {
        this.clazzB = clazzB;
    }
}
