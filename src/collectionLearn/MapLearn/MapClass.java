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
        System.out.println();

        TestMapAll.testHashMap();
        //те странный порядок, но если не менять порядок не изменится
        System.out.println();

        TestMapAll.testLinkedHashMap();
        //по порядку добавления
        System.out.println();

        TestMapAll.testTreeMap();
        //базово по алфавиту сортируется по ключу
        System.out.println();

        TestMapAll.testTreeMap2();
        System.out.println();
    }
}
/*
мапа внутри и бакетов
бакет - односвязанный список
лучше чтобы бакет содержал  1 эл
в мапе не может быть 2 одинкаа ключей
ключ может быть null и при том только один
и ключ и знач не может быть элементальных типов

Map<K, V>
● int size() - число entry
● boolean isEmpty()
● boolean containsKey (Object key) - есть ли обьект с таким ключом
● boolean containsValue (Object value) - есть ли валуе в мапе
● V get(Object key)
● V getOrDefault(Object key, V defaultValue)
● V put(K key, V value)
● V putIfAbsent(K key, V value)
● V remove (Object key)
● boolean remove(Object key, Object value)
● boolean replace(K key, V oldValue, V newValue)


Map<K, V>
● Set<K> keySet() - получить все ключи
● Collection<V> values()
● Set<Map. Entry<K, V>>entrySet()
// Create a map using HashMap as the implementation class
Map<String, String> map = new HashMap<>();
// Put an entry to the map - "John" as the key and "(342)113-9878" as the value
map.put("John", "(342)113-9878");


Map<K, V>
● Map<K, V>
● HashMap<K, V> - нет порядка
● LinkedHashMap<K, V> - в порядке добавления
● SortedMap<K, V>
● TreeMap<K, V> implements NavigableMap<K, V> - в порядке заданном компоратором
● WeakHashMap<K, V>

временная сложность
у HashMap<K, V>
O(1)
O(n)  - когда например много обьектов в 1 и том же бакете
O(logn) - становится TreeMap
но обычно O(1)

TreeMap<K, V>  - O(logn) всееегда

SortedMap<K, V>
Comparator<String> keyComparator = Comparator.comparing(String::length);
SortedMap<String, String> sMap = new TreeMap<>(keyComparator);
sMap.put("John", "(342)113-9878");
sMap.put("Richard", "(245)890-9045");
sMap.put("Donna", "(205)678-9823");
sMap.put("Ken", "(205)678-9823");


Обход коллекции
-iterator
-for-each loop
-for-Each() method



Collection Equality by Element - сравнение коллекций

List<T> list1, list2;
list.equals(list2)
Set<T> set1, set2;
set1.equals(set2)
Map<K, V> map1, map2;
map1.equals(map2);


Comparable<T> - 1 интерфейс для сравнения обьектов
//compareTo
//1 если 1 объект больше другого
//0 если меньше
//-1 если равны
public interface Comparable<T> {
    int compareTo(T object);
}
public class Employee implements Comparable<Employee> {
    @Override
    public int compareTo(Employee e) {
        if (this > e) return 1;
        if (this < e) return -1;
        return 0;
    }
}



Comparator<T> 2 интерфейс для сравнения обьектов
public interface Comparator<T> {
    int compare<T object1, T object2);
}
не привязывается к классу он сам по себе принимает 2 обектт в отличие
от Comparable






Sorting List
List<String> list = new ArrayList<>();
list.add("John");
list.add("Richard");
list.add("Donna");
list.add("Ken");
Collections.sort(list);
list.sort(Comparator.comparing(String::length))

Collections - класс для коллекций, помогает работать с ними
Collections - Searching List
● <T> int binarySearch(List<? extends Comparable<? super T>>list, T key)
● <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
бинарный поиск - делится на части и поиск

Collections - Searching List
List<String> list = new ArrayList<>();
list.add("John");
list.add("Richard");
list.add("Donna");
list.add("Ken");
Collections.sort(list); [Donna, John, Ken, Richard] // на сортированном списке бинари серч только работает
int index = Collections.binarySearch(list, "Donna");
System.out.println("Donna in List is at " + index);
index = Collections.binarySearch(list, "Ellen");
System.out.println("Ellen in List is at " + index);
Donna in List is at 0
Ellen in List is at -2
insert pos = -(index + 1), -((-2) + 1) = 1

//это все ещё в классе  Collections
Shuffling, Reversing, Swapping, Rotating List
● void shuffle(List<?> list) - случайным образом рассортировывает список
● void shuffle(List<?> list, Random rnd)
● void reverse(List<?> list) - обращает лист в обратную сторону
● void swap(List<?> list, int i, int j) - меняет два эл местами
● void rotate(List<?> list, int distance) - сдвинуть эл списка куда нибудь


Collections - Different Views of Collection
Readonly views
● <T> Collection<T> unmodifiableCollection(Collection<? extends T> c)
● <T> List<T> unmodifiableList(List<? extends T> list)
● <K,V> Map<K,V> unmodifiableMap(Map<? extends K,? extends V> m)
● <K,V> NavigableMap<K,V> unmodifiableNavigableMap(NavigableMap<K,?
extends V> m)
● <T> Set<T> unmodifiableSet(Set<? extends T> s)
● <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s)
● static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> s)
● <K,V> SortedMap<K,V> unmodifiableSortedMap(SortedMap<K,? extends V>
m)

Collections - Creating Empty Collections
● <T> List<T> emptyList()
● <K,V> Map<K,V> emptyMap()
● <T> Set<T> emptySet()
● <T> Iterator<T> emptyIterator()
● <T> ListIterator<T> emptyListIterator()
с пустым списком нечего нельзя сделать
он нужен когда нужен лёгкий оптимальный пустой список


Collections - Creating Singleton Collections - колеекции из 1 эл
● <T> Set<T> singleton(T o)
● <T> List<T> singletonList(T o)
● <K,V> Map<K,V> singletonMap(K key, V value)
 */
