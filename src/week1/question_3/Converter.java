/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_3;

/**
 *
 * @author Nguyen Phuong
 */

public class Converter {

    public int convertToBase10(String value, int base) { // can validation positive or negative
        if(base == 10) return Integer.parseInt(value);
        int result = 0;
        int i = 0;
        boolean isNegative = value.startsWith("-");

        if (isNegative) {
            value = value.replaceFirst("-", "");
        }
        if (value.startsWith("+")) {
            value = value.replaceFirst("\\+", "");
        }

        String[] valueTokens = value.split("");

        switch (base) { // 2:binary ,8 octal, 16 hexa
            case 2 -> {
                int temp = Integer.parseInt(value);

                while (temp != 0) {
                    result += temp % 10 * Math.pow(2, i);
                    temp /= 10;
                    i++;
                }

                return result * (isNegative ? -1 : 1);
            }
            case 8 -> {
                int temp = Integer.parseInt(value);

                while (temp != 0) {
                    result += temp % 10 * Math.pow(8, i);
                    temp /= 10;
                    i++;
                }

                

            }
            case 16 -> {

                for (i = valueTokens.length - 1; i >= 0; i--) {
                    switch (valueTokens[i]) {
                        case "A" -> {
                            valueTokens[i] = valueTokens[i].replaceFirst("A", "10");
                        }
                        case "B" -> {
                            valueTokens[i] = valueTokens[i].replaceFirst("B", "11");
                        }
                        case "C" -> {
                            valueTokens[i] = valueTokens[i].replaceFirst("C", "12");
                        }
                        case "D" -> {
                            valueTokens[i] = valueTokens[i].replaceFirst("D", "13");
                        }
                        case "E" -> {
                            valueTokens[i] = valueTokens[i].replaceFirst("E", "14");
                        }
                        case "F" -> {
                            valueTokens[i] = valueTokens[i].replaceFirst("F", "15");
                        }
                        default -> {
                        }
                    }
                    result += Integer.parseInt(valueTokens[i]) * Math.pow(16, valueTokens.length -1 - i);
                    
                }
                return result * (isNegative ? -1 : 1);

            }
            default ->{ 
                throw new IllegalArgumentException("Invalid base type: " + base);
                }
            
            
        }
        
        // 2 component
//        int bits = value.length() * (base == 16 ? 4 : base == 8 ? 3 : 1); 
//            int msbMask = 1 << (bits - 1);
//            if ((result & msbMask) != 0) { // MSB=1 -> negative
//            result -= 1 << bits;        //X = storedValue - 2^bits (1 << bits)
//        }
            
            /* Thầy xem thử xem có cần two's complement và yêu cầu user nhập só bit không hay chỉ cần đơn giản như vậy thôi*/

        return result * (isNegative ? -1 : 1);
            
        // 1:binary ,2 octal, 3 hexa

    }

    public String convertFromBase10To(int value, int base) {
        if(base == 10) return String.valueOf(value);
        
        StringBuilder sb = new StringBuilder();
        
        boolean isNegative = value < 0;
        if(isNegative) value *= -1;

        switch (base) { // 2:binary ,8 octal, 16 hexa
            case 2, 8 -> {
                do {
                    int remainder = value % base;
                    sb.append(remainder);
                    
                    value /= base;
                }while (value != 0);
            }
            
            case 16 -> {

                do {
                    int remainder = value % base;
                    if (remainder >= 10) {
                        sb.append((char) ('A' + remainder - 10));
                    } else {
                        sb.append(remainder);
                    }
                    value /= base;
                }while (value != 0);

            }
            default ->{
                throw new IllegalArgumentException("Invalid base type: " + base);
            }
                
        }
        
        return (isNegative ? "-" : "") + sb.reverse().toString();
    }
}









        
// int mask = (1 << bits) - 1;   // VD bits=8 -> 0xFF
//    int twosComp = value & mask;  // cắt theo số bit
//    String result = Integer.toString(twosComp, base).toUpperCase();
//
//    // Đảm bảo chuỗi có đủ số ký tự tương ứng với bits
//    int expectedLength = switch (base) {
//        case 2 -> bits;
//        case 8 -> (int) Math.ceil(bits / 3.0);
//        case 16 -> (int) Math.ceil(bits / 4.0);
//        default -> 0;
//    };
//
//    // Thêm  0 cho đủ độ dài
//    while (result.length() < expectedLength) {
//        result = "0" + result;
//    }