package com.jdkTests.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.leetcode.COMMON.print;


public class StreamsTest {


    static void main() {

        ArrayList<String> stringArrayList = new ArrayList<>(List.of("Hi", "Hello", "Bye", "Hi"));
//        ArrayList<String> stringArrayList = new ArrayList<>();
        print("Original Arr: ", stringArrayList);

        //TERMINAL OPERATIONS (with sorting)
        //To array
        print("CAST LIST: ", stringArrayList.stream().sorted().toArray());

        // casts to list
        print("CAST LIST: ", stringArrayList.stream().sorted().toList());

        // casts to list
        print("CAST LIST: ", stringArrayList.stream().sorted().collect(Collectors.toList()));

        //for each
        stringArrayList.forEach(word -> print("For each: ", word));

        //reduce
        //NOTE: UNSAFE THIS WAY
        print("REDUCE LIST: ", stringArrayList.stream().map(String::length).reduce(Integer::sum).get());

        //Intermediate Operations
        //filter
        print("FILTERED LIST: ", stringArrayList.stream().filter(word -> word.startsWith("H")).toList());
        //map
        print("MAPPED LIST: ", stringArrayList.stream().map(String::length).toList());
        //sorting
        print("SORTED LIST: ", stringArrayList.stream().sorted().toList());
        //distinct
        print("DISTINCT LIST: ", stringArrayList.stream().distinct().toList());

        List<List<String>> complexList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"), Arrays.asList("e", "f"));

        // Map would result in a Stream<List<String>>
        // flatMap results in a Stream<String>
        print("FLATMAP : " , complexList.stream().flatMap(Collection::stream) // Flattening the List<String> into a Stream<String>
                .collect(Collectors.toList()));

        //peek
        List<String> result = Stream.of("apple", "banana", "cherry")
                // Peek at elements before filtering
                .peek(e -> System.out.println("Processing: " + e))
                .filter(e -> e.length() > 5)
                // Peek at elements after filtering
                .peek(e -> System.out.println("Filtered: " + e))
                .collect(Collectors.toList());

        System.out.println("Final List: " + result);

        //Parallel Stream
        print("PARALLEL OP: " , stringArrayList.parallelStream().sorted().toList());
    }
}
