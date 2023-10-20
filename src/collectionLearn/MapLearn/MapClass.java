package collectionLearn.MapLearn;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    public static void testHashMap(){
        Map<String,String> map = new HashMap();
        map.put("123","хехх");
        // ключ значение
        // считаем хеш код ключа
        map.put("123","1");
        map.put("12ывы3","2");
        map.put("1вы23","3");
        map.put("12ыв3","4");
        map.put("12выыф3","5");
        System.out.println(map.size());
    }

    public static void main(String[] args) {
        testHashMap();
    }
}
/*
мапа внутри и бакетов
лучше чтобы бакет содержал  1 эл
в мапе не может быть 2 одинкаа ключей
ключ может быть null и при том только один
и ключ и знач не может быть элементальных типов
 */
