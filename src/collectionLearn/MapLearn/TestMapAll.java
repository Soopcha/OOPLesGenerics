package collectionLearn.MapLearn;

import java.util.*;

public class TestMapAll {

    public static void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivan", "12");
        map.put("Heh", "132");
        map.put("Seny", "142");
        map.put("Anna", "82");
        map.put("Tat", "3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }//.entrySet() - это метод, который возвращает набор Map.Entry объектов, представляющих пары "ключ-значение" из карты.
    }


    public static void testLinkedHashMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Ivan", "12");
        map.put("Heh", "132");
        map.put("Seny", "142");
        map.put("Anna", "82");
        map.put("Tat", "3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }//.entrySet() - это метод, который возвращает набор Map.Entry объектов, представляющих пары "ключ-значение" из карты.
    }

    public static void testTreeMap() {
        Map<String, String> map = new TreeMap<>();
        map.put("Ivan", "12");
        map.put("Heh", "132");
        map.put("Seny", "142");
        map.put("Anna", "82");
        map.put("Tat", "3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }//.entrySet() - это метод, который возвращает набор Map.Entry объектов, представляющих пары "ключ-значение" из карты.
    }

    public static void testTreeMap2() {
        Map<String, String> map = new TreeMap<>(Comparator.comparing(String::length));
        //тут сорт по длине строки
        map.put("Ivan", "12");
        map.put("Heh", "132");
        map.put("Seny", "142");
        map.put("Anna", "82");
        map.put("Tat", "3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }//.entrySet() - это метод, который возвращает набор Map.Entry объектов, представляющих пары "ключ-значение" из карты.


    }


    public static void udalenieElVCollection() {

        List<String> myList = new ArrayList<>();
        myList.add("Красный");
        myList.add("Синий");

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if ("Синий".equals(color)) {
                iterator.remove(); // Безопасное удаление элемента
            }
        }
    }
}
