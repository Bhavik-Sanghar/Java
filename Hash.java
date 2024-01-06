import java.util.HashSet;

import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(22);
        set.add(3);
        set.add(3);
        set.add(5);

        System.out.println(set);
        System.out.println("Set Size is : " +set.size());
        set.remove(1);
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
