package collectionLearn.useLib;
/*
Библиотеки
Apache Common Collections
Google Guava Collections

Multiset - коллекция позволяющая подсчитывать число вождений одинак
эл в набор
 */

//import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections4.Bag;

import java.util.Arrays;
//import org.apache.commons.collections4.Multiset;
//import com.google.common.collect.Multiset;

//import org.apache.commons.collections4.MultiSet;
//import org.apache.commons.collections4.MultiSetUtils;
import org.apache.commons.collections4.bag.HashBag;
//import org.apache.commons.collections4.bag.HashMultiSet;





public class LibImportant {
   public static void main(String[] args) {
        String str = """
                fwee e e e e e e dfasg dfasd ad
                da sedsdf
               s adfas
                d asdf
                asdf asdf
                assdf

                """;
        String word = "e";
        System.out.println("кол во " + word + " "+ getWordQuantity(str,word));
    }

   /* private static String getWordQuantity(String str, String word) {
       String[] words = str.toLowerCase().split("[\\s,;.]+");
       MultiSet<String> multiSet = new HashMultiSet<>(Array.asList(words));
       return multiSet.getCount(word);
    }

    */

    private static int getWordQuantity(String str, String word) {
        String[] words = str.toLowerCase().split("[\\s,;.]+");
        Bag<String> bag = new HashBag<>(Arrays.asList(words));
        return bag.getCount(word);
    }
    //если бы работало то наситало бы е
}


/*
Bag -
коллекция как мульти но разные реализации
хранятся два настоящих живых обьекта а не как в мульти сете просто кол-во хранится


коллекция multimap
ключ -  указывает на коллекцию значений
 */
