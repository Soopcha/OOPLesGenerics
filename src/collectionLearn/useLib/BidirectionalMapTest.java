package collectionLearn.useLib;
 /*
    bidirectional - двунаправленая мапа
    ключ может быть значением а значения ключами
    те 1 null и тд правила для ключа
    но в 2 раза больше ресов потребляет она
     */

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BidirectionalMapTest {

    public static String createCapitalCityMassage(BiMap<String,String> capitals, String capitalCityKey){
        return capitalCityKey + "  is a  capital of  "  + capitals.inverse().get(capitalCityKey);
    }

    public static String createCountryMassage(BiMap<String,String> capitals, String countryKey){
        return capitals.get(countryKey) + "  is a  capital of  "  + countryKey;
    }
    public static void main(String[] args) {
        BiMap<String,String> capitals = HashBiMap.create();

        capitals.put("Russia","Moscow");
        capitals.put("Canada","Ottawa");

        System.out.println(createCapitalCityMassage(capitals,"Moscow"));
        System.out.println(createCountryMassage(capitals,"Canada"));
    }


}
