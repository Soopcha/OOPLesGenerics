package collectionLearn.SetsLearn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSets {

    public static void testHashset(){ //не поддерживает порядок добавления
        Set<String> names = new HashSet<>();
        names.add("Ivan");
        names.add("Ivan"); //второй иван не добавится
        names.add("Oleg");
        names.add("pt");
        names.add("Ceno");
        names.add("Cum");

        for (String s:names){
            System.out.println(s);
        }
        System.out.println();
        System.out.println();

    }

    public static void testLinkedset(){ //поддерживает порядок добавления
        Set<String> names = new LinkedHashSet<>();
        names.add("Ivan");
        names.add("Ivan"); //второй иван не добавится
        names.add("Oleg");
        names.add("pt");
        names.add("Ceno");
        names.add("Cum");

        for (String s:names){
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
    }

    public static void testTreeset(){ //сортирует базово по алфовиту но а так можно мб свой поставить параметр длдя сорта
        Set<String> names = new TreeSet<>();
        names.add("Ivan");
        names.add("Ivan"); //второй иван не добавится
        names.add("Oleg");
        names.add("pt");
        names.add("Ceno");
        names.add("Cum");
        names.add("Aaum");

        for (String s:names){
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
    }
}
