package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("노혜선","김젤리","이싱싱");

        Predicate<String> startsWithA = s -> s.startsWith("김");
        for(String name : names) {
            if(startsWithA.test(name)) {
                System.out.println(name);
            }
        }
    }
}
