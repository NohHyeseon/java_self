package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
//        //Class 찾기
//
//        Class clazz = Child.class;
//        System.out.println("Class anme: "+ clazz.getName());
//
//        Class clazz2 = Class.forName("reflection.Child");//패키지 네임 포함된 클래스명
//        System.out.println("Class name: "+ clazz2.getName());
// //-------------------------------Constructor 찾기---------------------------------------
//        Class clazz3 = Class.forName("reflection.Child");
//        Constructor constructors = clazz3.getDeclaredConstructor();
//        System.out.println("constructors: " + constructors.getName());
//
//        Class clazz = Class.forName("reflection.Child");
//        Constructor constructor = clazz.getDeclaredConstructor(String.class);
//        System.out.println("Constructor(String): "+constructor.getName());
//
//        //----------모든 생성자 가져오기 --------------
//        Class clazz = Class.forName("reflection.Child");
//        Constructor constructors[] = new Constructor[]{clazz.getDeclaredConstructor()};
//        for(Constructor c : constructors) {
//            System.out.println("get constructor in Child: " + c);
//        }
//
//        //--------public 생성자만 가져오기 ---------------
//        Class clazz = Class.forName("reflection.Child");
//        Constructor constructor[] = clazz.getConstructors();
//        for (Constructor c : constructor) {
//            System.out.println("get public constructor in Childe: " + c);
//        }
//
////----------method ---------------
//        Class clazz = Class.forName("reflection.Child");
//        Method method4 = clazz.getDeclaredMethod("method4", int.class);
//        System.out.println("Find method: " + method4);
////--------Field 변경-----------------
//
//        Class clazz2 = Class.forName("reflection.Child");
//        Field field = clazz2.getDeclaredField("cstr1");
//        System.out.println("Find field: " + field);

    }
}
