package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AfterStream {
    public static void main(String[] args) {
        List<Product> prodcutList = List.of(
                productFactory(1,"A",1000),
                productFactory(2,"A",1500),
                productFactory(3,"A",300),
                productFactory(4,"B",3000),
                productFactory(5,"C",2000)
        );

        List<Integer> aProductId = prodcutList.stream()
                .filter(product -> product.getName().equals("A"))//필터링
                .sorted(Comparator.comparing(Product::getPrice))//정렬
                .map(Product::getId).collect(Collectors.toList());//아이디 값 출력

        System.out.println("Sorted List: " + aProductId);
    }



    public static Product productFactory(int id, String name, int price) {
        return new Product(id,name,price);
    }

}
