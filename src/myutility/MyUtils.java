package myutility;

import java.util.List;

public class MyUtils {
    //Iterate through any Type of list / any kind of list
    public static <T> void iterateListOfPreStudents(List<T> anyList) {
        for (T temp : anyList) {
            System.out.println(temp);
        }
    }
}
