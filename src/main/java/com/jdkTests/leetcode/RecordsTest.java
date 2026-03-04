package com.jdkTests.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.leetcode.COMMON.print;


public class RecordsTest {

    static void main() {
        record Employee(int id, String name, String position){}

        //compact constructor
        record EmployeeSecond(int id, String name, String position){
            public EmployeeSecond {
                if (id < 0 ){
                    throw new RuntimeException("Invalid ID");
                }
            }
        }
    }
}
