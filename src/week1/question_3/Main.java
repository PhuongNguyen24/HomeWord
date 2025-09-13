/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_3;

import Validation.Validator;

/**
 *
 * @author Nguyen Phuong
 */
public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter();
        ConvertionView convertionview = new ConvertionView();

        int inputBase = convertionview.selectBase("Choose the base number input: ");
        int outputBase = convertionview.selectBase("Choose the base number outputBase: ");

        String inputValue = Validator.inputBase(inputBase, "Enter input value: ").toUpperCase();

        String result;

        if (inputBase == outputBase) {
            result = inputValue;
        } else {
            int decimalValue = (inputBase == 10)
                    ? Integer.parseInt(inputValue)
                    : converter.convertToBase10(inputValue, inputBase);

            result = (outputBase == 10)
                    ? String.valueOf(decimalValue)
                    : converter.convertFromBase10To(decimalValue, outputBase);
        }

        System.out.println("The result: " + result);
    }
}
