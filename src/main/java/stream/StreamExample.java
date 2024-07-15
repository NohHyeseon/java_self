package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println); // 배열 스트림

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::print);

        Stream<String> stream3 = Stream.<String>builder()
                .add("a").add("b").add("c").build();
        stream3.forEach(System.out::print);



    }
}
