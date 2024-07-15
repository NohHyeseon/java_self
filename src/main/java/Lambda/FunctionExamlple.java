package Lambda;

import java.util.function.Function;

public class FunctionExamlple {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length: " + stringLength.apply("123324dfggfd"));
    }
}
