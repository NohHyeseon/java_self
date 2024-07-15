package framwrok;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> animal = new java.util.LinkedList<>();

        animal.add("dog");
        animal.add("cat");
        animal.add("cow");

        animal.add(0,"bird"); //특정위치에 요소 추가
        System.out.println("animal: " + animal);

        String firstAnimal = animal.get(0);
        System.out.println("first animal: " + firstAnimal);

    }
}
