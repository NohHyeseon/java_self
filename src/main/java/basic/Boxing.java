package basic;

public class Boxing {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //박싱
        Integer num = 1;
        //언박싱
        int n = num;
        //재박싱
        n = n + 100;
        System.out.println(n);
        //박싱
        Integer num1 = 5;
        Integer num2 =10;
        //언박싱
        int int1 = num1.intValue();
        int int2 = num2.intValue();
        //오토 언박싱 후 연산하여 다시 박싱하여 저장
        Integer result1 = num1+num2;
        Integer result2 = int1+int2;
        int result3 = num1*int2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("----------------------------");

        String str = "10";
        String str2 = "10.5";
        String str3 = "true";
        byte b = Byte.parseByte(str);
        int i = Integer.parseInt(str2);
        short s = Short.parseShort(str);
        long l = Long.parseLong(str);
        float f = Float.parseFloat(str);
        double d = Double.parseDouble(str);
        boolean bool = Boolean.parseBoolean(str);

        System.out.println("문자열 byte값 변환 : "+b);

        System.out.println("문자열 int값 변환 : "+i);
        System.out.println("문자열 short값 변환 : "+s);
        System.out.println("문자열 long값 변환 : "+l);
        System.out.println("문자열 float값 변환 : "+f);
        System.out.println("문자열 double값 변환 : "+d);
        System.out.println("문자열 boolean값 변환 : "+bool);



    }
}
