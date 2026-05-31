package com.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class COMMON {
    public static void ezprint(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            System.out.println("Error parsing" + Object.class);
        }
    }
    public static void ezprint(String label, Object object) {
        System.out.print(label);
        ezprint(object);
    }
    public static void ezprint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ezprint(int[][] matrix, int[] rowLabels, int[] colLabels) {
        // Column labels
        System.out.print("    ");
        for (int col : colLabels) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // Rows
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%4d", rowLabels[i]);

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void ezprint(boolean[][] matrix) {
        // Iterate through each row
        for (int i = 0; i < matrix.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Use a ternary operator to print 1 for true and 0 for false
                System.out.print((matrix[i][j] ? 1 : 0) + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }

    public static void ezprint(boolean[][] matrix, int[] rowLabels, int[] colLabels) {
        // Column labels
        System.out.print("    ");
        for (int col : colLabels) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // Rows
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%4d", rowLabels[i]);

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j] ? 1 : 0);
            }
            System.out.println();
        }
    }
}
