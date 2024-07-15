package framwrok;

import java.util.HashSet;
import java.util.Set;


public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        //중복 용소 추가 시도
        set.add("A");

        System.out.println("set: "+set);

        set.remove("B");
        System.out.println("set: "+set);
        int size = set.size();
        System.out.println("size: "+size);
    }
}
