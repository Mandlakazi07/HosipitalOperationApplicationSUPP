/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hosipitaloperationsapplication;

/**
 *
 * @author MandlakaziS
 */
interface IOperation {
    // IOperation interface - defines the contract for Operations class

    int TotalOperations(int[] operations);

    double AverageOperations(int[] operations);

    int MaxOperations(int[] operations);

    int MinOperations(int[] operations);
}
