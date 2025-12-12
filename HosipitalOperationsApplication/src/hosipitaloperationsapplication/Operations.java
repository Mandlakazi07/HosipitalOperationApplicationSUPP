/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hosipitaloperationsapplication;

/**
 *
 * @author MandlakaziS
 */
class Operations implements IOperation {

    // Method to calculate total operations across all quarters
    @Override
    public int TotalOperations(int[] operations) {
        int total = 0;

        for (int i = 0; i < operations.length; i++) {
            total = total + operations[i];
        }

        return total;
    }

    // Method to calculate average operations
    @Override
    public double AverageOperations(int[] operations) {
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            sum = sum + operations[i];
        }

        double average = (double) sum / operations.length;
        return average;
    }

    // Method to find the maximum number of operations
    @Override
    public int MaxOperations(int[] operations) {
        int max = operations[0];

        for (int i = 1; i < operations.length; i++) {
            if (operations[i] > max) {
                max = operations[i];
            }
        }

        return max;
    }

    // Method to find the minimum number of operations
    @Override
    public int MinOperations(int[] operations) {
        int min = operations[0];

        for (int i = 1; i < operations.length; i++) {
            if (operations[i] < min) {
                min = operations[i];
            }
        }

        return min;
    }
}
