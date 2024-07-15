package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Product> productList = List.of( //product선언
                productFactory(1,"A",1000),
                productFactory(2,"A",1500),
                productFactory(3,"A", 300),
                productFactory(4,"B", 3000),
                productFactory(5,"C",2000)
        );



        //A제품 선택하기
        List<Product> aProduct = new ArrayList<>();
        for(Product p : productList) {
            if(p.getName().equals("A")) {
                aProduct.add(p);
            }
        }

        //가격 순 정렬
        aProduct.sort(Comparator.comparing(Product::getPrice));

        //아이디출력
        List<Integer> aProductPrice = new ArrayList<>();
        for(Product p : aProduct) {
            aProductPrice.add(p.getPrice());
        }

        System.out.println("Sorted prices of 'A' products: " + aProductPrice);
    }


    public static Product productFactory(Integer id, String name, int price) {
        return new Product(id, name, price);
    }


}
