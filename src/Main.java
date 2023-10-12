import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    public static void testList2(){
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(2);
        List<Number> numbers = new ArrayList<>();
        numbers.add(3.5);
        Main.<Number>copy(numbers,ints);
    }

    public void tesstList() {
        List<Number> numbers = new ArrayList<Number>();
        numbers.add(2);
        numbers.add(4.34);

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(2);
        ints.add(4);
        //List<Number> nums = ints; //complite time error
        // List<Number> - не базовый тип для List<Integer>
        //хотя Number - базовый тип для Integer
    }

    public static void main(String[] args) {
//        List list = new ArrayList(); //без джинерика((( так не пишем
//        List<Integer> listInt = new ArrayList();  // юзаем дженерик тип
//        listInt = list; //unchecked warning те ворнинг который говорит что мб будет клас каст ексепшон
//        Integer a = listInt.get(0);
//        System.exit(a);

        testList2();

    }
}

/*   GENERICS - обобщённые типы
как коллекции интерисуют обычно
все E это массив типов object
вообще вся инфа о типы класса стираются при компиляции и становятся байт кодом просто

cast-iron guarantee - железная гарантия
-- не сущ unchecked warning

Substitution принцып - принцып подстановки
-переменной данного типаа можно присвоить любое знач любого подтипа данного типа
-метод с параметром данного типа мб вызван с аргументомм любого подтипа данного типа


Wildcard extends/ get principle-чтение из джинерик колеекций
//символы подстановки для джинерик
public static double sum(Collection<? extends Number> nums){  // - либо Number либо любой наследник
    doubles=0.0;
    for (Number num: nums) s+=num.doubleValue();
    return s;
}
//те для Integer Double и Number листов можем юзать один этот метод


Put Principe:
public static <T> void copy(List <? super T> dst, List<? extends T>src){
// -копирует эл из одной колеекции в др
// super-тип T и его предки   extends - тип T и его наследники
    for (int i = 0; i <src.size(); i++){
        dst.set(i,src.get(i));
    {
}

Collections.<Object>copy (objs,int);

ТЕ
-Get principle - extends там, где знач только читаются get
-Put Principe - super там, где знач только записываются
- если и пиш и чит не писать wildcard


<?> = <? extends Object>  - одно обозначение

 */