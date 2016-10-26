package ru.gds;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public final class ClassNameUtil {
    private ClassNameUtil() {
    }

    public static String getCurrentClassName(){
        try{
            throw new RuntimeException();
        }catch (RuntimeException e){
            return e.getStackTrace()[1].getClassName();
        }
    }
}
