/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_2;

import Validation.Validator;



/**
 *
 * @author Nguyen Phuong
 */
public class Main {
    public static void main(String[] args){
        
        int arraySize = Validator.inputPositiveInt("Enter number of array", 1, Integer.MAX_VALUE);
        int target = Validator.inputPositiveInt("Enter search value", 0, arraySize - 1);
        
        
        LinearSearch linearSearch = new LinearSearch(arraySize);
        linearSearch.addArray(arraySize);
        System.out.print("The array: ");
        linearSearch.displayArray();
        int resultIndex = linearSearch.findElement(target);
        if(resultIndex < 0) System.out.println("There is no match with "+target);
        else System.out.println("Found "+ target +" at index: "+resultIndex);
        
    }
}

