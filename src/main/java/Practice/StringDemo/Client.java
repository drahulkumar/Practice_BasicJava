package Practice.StringDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Geeks");
        sb.append("forGeeks");


        System.out.println(sb);

        //System.out.println(sb.getChars(0 , 4));

        StringBuilder sbilder = new StringBuilder("My Name is ");
        sbilder.append("Rahul !");

        System.out.println(sbilder);


        //Q1: Lambdas and Streams Given a list of words, find a list that contains
        // the length of each word that starts with ‘b’.
//        List<String> words = new ArrayList<>();
//        words.add("apple");
//        words.add("banana");
//        words.add("bythewayf");
//        words.add("hjdshdjsd");
//        words.add("bks");
//        words.add("dsdjdgsd");
//
//        List<Integer> st = words.stream()
//                .filter(fruits -> fruits.startsWith("b"))
//                .map(String::length)
//                .collect(Collectors.toList());
//
//        System.out.println(st);



    }
}
