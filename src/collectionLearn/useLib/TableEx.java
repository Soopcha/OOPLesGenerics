package collectionLearn.useLib;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/*
    table
    r - тип ключей стр таблицы
    c - тип ключей колонок таблицы
    v - тип отоброжаемых знач

    если попросить столбец то мы получим мапу

    табл как эксель
     */

public class TableEx {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");

        Table<Vertex,Vertex,Integer> weightGraph = HashBasedTable.create();
        weightGraph.put(v1,v2,4);
        weightGraph.put(v1,v3,20);
        weightGraph.put(v3,v2,5);

        System.out.println(weightGraph.row(v1));
        System.out.println(weightGraph.column(v3));
    }

    private record Vertex(String id) {}
}
