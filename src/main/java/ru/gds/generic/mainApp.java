package ru.gds.generic;

/**
 * Created by Дмитрий on 20.10.2016.
 */
public class mainApp {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.somMetod();
        ClassB classB = new ClassB();
        classB.somMetod();
        classB.somMetodB();
        ClassC classC = new ClassC();
        classC.somMetodC();
        ClassGen<ClassA> classAClassGen = new ClassGen<ClassA>(classA);
        ClassGen<ClassB> classBClassGen = new ClassGen<ClassB>(classB);
//        ClassGen<ClassC> classCClassGen = new ClassGen<ClassC>(classC);
        classAClassGen.fon();
        classBClassGen.fon();
//        classCClassGen.fon();
    }
}
