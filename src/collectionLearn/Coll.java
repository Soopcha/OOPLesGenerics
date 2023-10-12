package collectionLearn;

import java.util.ArrayList;
import java.util.List;

//Java Collections
public class Coll {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(1000);
        // это оптимизирует, когда мы сразу знаем кол-во эл
    }
}
/*
Типы коллекций:
  -Список
      -очередь, стек
      -связанный список
  -Множество
  -Словарь/соответствие/карта


  Итератор - идет только вперед
  hasNext()   //если true то дальше перебирает те
  next()

  Iterator<E>
● boolean hasNext()
● E next()
● default void remove()
● default void forEachRemaining(Consumer<? super E> action

Collection Interface
    Simple Operations
● int size()
● boolean isEmpty()
● boolean contains(Object o)
● boolean add(E o)
● boolean remove(Object o)
● Iterator<E> iterator()


Collection Interface
    Bulk Operations
● boolean addAll(Collection<? extends E> c)
● void clear()
● boolean containsAll(Collection<?> c)
● boolean removeAll(Collection<?> c)
● boolean retainAll(Collection<?> c)

Lists
List, ArrayList
● add(int index, E element)
● addAll(int index, Collection<? extends E> c)
● get(int index)
● remove(int index)
● set(int index, E element)
● indexOf(Object o)
● lastIndexOf(Object o)
● subList(int fromIndex, int toIndex)

Size Capacity - местимость(шаг увеличения внутренней колекции для хранения эл)
те шажочек по увиличению длинны массива


LinkedList<E> implements Deque<E>
● addFirst(E element), addLast(E element)
● getFirst(), getLast()
● void push(E element) //stack
● E pop() //stack    // получает эл сначала
● boolean offer(E e) //queue
● E poll() //queue    //получает из начала
● E peek()          // получает 1 эл из коллекции не удаляя его
 */
