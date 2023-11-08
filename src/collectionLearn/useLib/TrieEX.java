package collectionLearn.useLib;

import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;

import java.util.Map;
import java.util.SortedMap;

/*
trie - префексное дерево
текст разбиваем на куосчки и делаем в дерево а на листа уже конечные слова получаются
это для поиска вхождения слолва в текст
 */
public class TrieEX {

    public static void main(String[] args) {
        Trie<String,String> trie = new PatriciaTrie<>();
        
        trie.put("Awesome","value");
        trie.put("Awe","some");
        trie.put("awesome","sdfs value");
        trie.put("lol","heh");
        trie.put("a","b");
        
        SortedMap<String,String> prefixMap = trie.prefixMap("Awe");
        printPrefixMap(prefixMap);
    }

    private static void printPrefixMap(SortedMap<String, String> prefixMap) {
        System.out.println("----------");

        for (Map.Entry<String,String> entry: prefixMap.entrySet()){
            System.out.println("Key:  <" + entry.getKey() + "> Value: <"+ entry.getValue()+">");
        }

        System.out.println("----------");

    }
}
