package framwrok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethodExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("list after add: " + list);

        boolean containsApple = list.contains("Apple");
        System.out.println("list contains Apple: " + containsApple);

        //컬렉션 요소를 반복하는 Iterator 얻기
        Iterator<String> iterator = list.iterator();
        System.out.println("Iterator: ");
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit+ "");
        }
        System.out.println();
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Apple");
        anotherList.add("Banana");
        anotherList.add("Cherry");
        boolean isEqual = list.equals(anotherList);
        System.out.println("list equals: " + isEqual);

        list.clear();// 모든 요소 제거
        System.out.println("List cleared: " + list);

        boolean isEmpty = list.isEmpty();//list가 비었는지 확인
        System.out.println("list is empty: " + isEmpty);

        System.out.println("---------------나머지 다른 메소드------------------------");

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        List<String> list2 = new ArrayList<>();
        list2.add("Cherry");
        list2.add("Date");

        list1.addAll(list2);//list1에 list2더하기
        System.out.println("list after add: " + list1);


        List<String> list3 = new ArrayList<>();
        list3.add("Apple");
        list3.add("Banana");
        list3.add("Date");

        List<String> subList = new ArrayList<>();
        subList.add("Apple");
        subList.add("b");

        boolean containsAll = list1.containsAll(subList); //sublist 요소가 list1에 다 있는지 확인
        System.out.println("list containsAll: " + containsAll);

        list3.remove("Apple");
        System.out.println("list3 contains Apple: " + list3);

        int size3 = list3.size(); //size확인
        System.out.println("size3: " + size3);

        isEmpty = list3.isEmpty();//비었는지 확인
        System.out.println("isEmpty: " + isEmpty);

        Object[] array = list3.toArray();//현재 컬렉션 모든 요소 포함하는 배열 반환
        System.out.println("Array: " );
        for(Object object : array){
            System.out.println(object);
        }
        String [] array2 = new String[list3.size()];
        list3.toArray(array2);
        System.out.println("Array:");
        for(Object object : array2){
            System.out.println(object);
        }


    }
}
