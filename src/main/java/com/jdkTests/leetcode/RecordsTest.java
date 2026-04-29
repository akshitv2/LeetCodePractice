package com.jdkTests.leetcode;

import static com.leetcode.COMMON.ezprint;


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
