package collectionLearn.SetsLearn;
//  МНОЖЕСТВА SETS
//  содержат только уникальные эл
public class SetsMain {
    public static void main(String[] args) {
        TestSets.testHashset();
        TestSets.testLinkedset();
        TestSets.testTreeset();
    }
}
/* реализации:
HashSet- неупорядоченное множ
linkedHashSet- упорядоченно по порядку добавления
TreeSet- упорядочено по какому-то критерию
    -SortedSet реализует TreeSet
 */