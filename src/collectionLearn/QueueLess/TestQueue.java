package collectionLearn.QueueLess;

public class TestQueue {
}
/*
Deque - котопёс эл можно и с нчаал и с конца собирать

LinkedBlockingQueue- пока эл нет в очереди мы не можем забрать ничего
или когда очередь переполнена нечего положить нельзя


Queue Interface
● add(elem) // can throw exception
● offer(elem) // == add()
● remove() // can throw exception
● poll() // == remove()  удаление
● E element() // can throw exception
● E peek() // == element()   текущий эл с главы не удаляя его


пример Simple Queue
Queue<String> queue = new LinkedList<>();
queue.add("John");
// offer() will work the same as add()
queue.offer("Richard");
queue.offer("Donna");
queue.offer("Ken");

Double Ended Queue (Deque)
Deque<E> extends Queue<E>
ArrayDeque<E> implements Deque<E>
● addFirst(e), addLast(e)
● offerFirst(e), offerLast(e)
● E removeFirst(), E removeLast()
● E pollFirst(), E pollLast()
● E getFirst(), E getLast()
● E peekFirst(), E peekLast()

Priority Queue
public class ComparablePerson extends Person implements Comparable {}
Queue<ComparablePerson> pq = new PriorityQueue<>();
pq.add(new ComparablePerson(1, "John"));
pq.add(new ComparablePerson(4, "Ken"));
pq.add(new ComparablePerson(2, "Richard"));
while (pq.peek() != null) {
System.out.println("Head Element: " + pq.peek());
pq.remove();
}
 */
