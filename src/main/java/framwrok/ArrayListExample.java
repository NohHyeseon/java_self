package framwrok;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");//요소추가
        list.add("B");//요소추가
        list.add("C");//요소추가

        //요소출력
        System.out.println("list: "+list);
        //요소제거
         list.remove("B");
         //출력
        System.out.println("list after removing B: "+list);
        //요소접근
        String element = list.get(0);
        System.out.println("Rist element:" +element);
        //리스트크기
        int size = list.size();
        System.out.println("size: "+size);

    }
}
