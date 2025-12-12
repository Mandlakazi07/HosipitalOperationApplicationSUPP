/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaloperation;

/**
 *
 * @author Studentvmcloudlabs
 */
public class Operations implements IOperations {

    // Surgery data for the hospital
    private int[][] surgeryData = {
        {300, 150, 700}, // Year 1 - Planned, Unplanned, Emergency
        {250, 200, 600} // Year 2 - Planned, Unplanned, Emergency
    };

    @Override
    public int[] GetOperationsData() {
        // Flatten the 2D array into 1D
        int[] flatData = new int[surgeryData.length * surgeryData[0].length];
        int index = 0;

        for (int i = 0; i < surgeryData.length; i++) {
            for (int j = 0; j < surgeryData[i].length; j++) {
                flatData[index] = surgeryData[i][j];
                index++;
            }
        }

        return flatData;
    }

    @Override
    public int GetTotalOperations() {
        int total = 0;

        for (int i = 0; i < surgeryData.length; i++) {
            for (int j = 0; j < surgeryData[i].length; j++) {
                total = total + surgeryData[i][j];
            }
        }

        return total;
    }

    @Override
    public int GetTotalOperationsForYearOne() {
        int year1Total = 0;

        for (int j = 0; j < surgeryData[0].length; j++) {
            year1Total = year1Total + surgeryData[0][j];
        }

        return year1Total;
    }

    @Override
    public int GetTotalOperationsForYearTwo() {
        int year2Total = 0;

        for (int j = 0; j < surgeryData[1].length; j++) {
            year2Total = year2Total + surgeryData[1][j];
        }

        return year2Total;
    }
}

