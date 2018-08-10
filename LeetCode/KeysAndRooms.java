package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KeysAndRooms {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
    if(rooms.size() == 0)
        return false;
    boolean visit[] = new boolean[rooms.size()];
    visit = visit(rooms.get(0),rooms,visit);
    visit[0] =  true;

    for(int i=0 ; i<visit.length ; i++) {
        if(!visit[i])
            return false;
    }

    return true;
}

    public static boolean[] visit(List<Integer> room, List<List<Integer>> rooms, boolean[] visit) {

        for(Integer singleRoom : room) {
            if(!visit[singleRoom]) {
                visit[singleRoom] = true;
                visit(rooms.get(singleRoom), rooms, visit);
            }
        }
        return visit;
    }

    public static void main(String args[]) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(0);
        l2.add(1);
        List<Integer> l3 = new ArrayList<>();
        l3.add(2);
        List<Integer> l4 = new ArrayList<>();
        l4.add(0);
        List<List<Integer>> visit = new ArrayList<>();
        visit.add(l1);
        visit.add(l2);
        visit.add(l3);
        visit.add(l4);

        System.out.println(canVisitAllRooms(visit));
    }
}
