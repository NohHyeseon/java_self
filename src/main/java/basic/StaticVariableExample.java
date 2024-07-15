package basic;

public class StaticVariableExample {
    private static int count;
    public StaticVariableExample(){
        count++;
    }
    public static void displatCount(){
        System.out.println("Number of instances: "+count);
    }
    public static void main(String[] args){
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        StaticVariableExample.displatCount();
    }


    //Java Collection Framework 의 이해 및 구현 클래스의 실습
    // -  java.util.Collection  /  java.util.Map 인터페이스 및 구현 클레스의 이해
    // - 구현 클래스의 사용 방법 이해 (주요 메소드 활용 add, clear, contains, equals, iterator 등)
    // - Lambda Expression, Stream
//    - 다양한 종류의 데이터 셋의 컨트롤 방법
//- 효율적인 데이터 처리 방법
//- DB 쿼리에서 Java Logic 으로 데이터 처리 이관
}
