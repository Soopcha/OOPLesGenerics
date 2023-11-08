package collectionLearn.useLib;


/*
RangeSet - храним в  сете в кач значения  интервал
(или отрезрк закрыт интервал полузакрытый интервал как хотим)

RangeMap - в кач ключа- также интервал
 в кач значения - что угодно
 */

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class RangeSetGuavaEx {
    public static void main(String[] args) {


        RangeSet<Integer> septemberAvailabilityTimetable = TreeRangeSet.create();

        septemberAvailabilityTimetable.add(Range.closed(1,2));
        septemberAvailabilityTimetable.add(Range.closed(4,9));
        septemberAvailabilityTimetable.add(Range.closed(12,18));
        septemberAvailabilityTimetable.add(Range.closedOpen(15,24));

        septemberAvailabilityTimetable.remove(Range.closedOpen(15,17));

        System.out.println(septemberAvailabilityTimetable.asRanges());

    }

}

