package framwrok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasmapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //요소추가
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        //출력
        System.out.println("map = " + map);
        //요소제거
        map.remove("a");
        System.out.println("map= "+map);
        //요소 접근
        int value = map.get("b");
        System.out.println("value = " + value);
        int size = map.size();
        System.out.println("size = " + size);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }


        boolean contains = map.containsKey("b");
        System.out.println(contains);//값 있는지 확인
        boolean contains2 = map.containsValue(2);//지정된 value와 map의 key객체 있는지 확인
        System.out.println(contains2);
        boolean equlas = map.equals(map);//동일한 map인지 비교
        System.out.println(equlas);
        Object o = map.get(3);//지정한 key객체에 대응하는 value반환
        int hashCode = map.hashCode();//hash코드 반환
        System.out.println(hashCode);
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);//map이 비어있는지 확인
        Set keySet = map.keySet();//저장된 모든 객체 반환
        System.out.println(keySet);
       map.putAll(map); //모든 map보여주기
       System.out.println(map);
       int size2 = map.size();// size보여주기
        Collection values = map.values(); //모든 value 반환
    }
}
