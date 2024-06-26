/**
 * @author DiegoGVDev
 * @version v0.0.1
 */

package programmation_logic;

public class BinaryToInt {


    private static String reverseString(String strParam) {
        int countStr = strParam.length() - 1;
        String reversed = "";

        for (int i = 0; i < strParam.length(); i++) {
            reversed += strParam.charAt(countStr - i);
        }
        return reversed;
    }

    public static double decimal(String str) {
        String numBinaryReversed = BinaryToInt.reverseString(str);
        int pow = 1;
        double numDecimal = 0;

        for (int i = 0; i < numBinaryReversed.length(); i++) {
            String charToStr = Character.toString(numBinaryReversed.charAt(i));
            double strToDouble = Double.parseDouble(charToStr);
            numDecimal += strToDouble * pow;
            pow *= 2;
        }
        return numDecimal;
    }

    //test local.

    public static void main(String[] args) {
        String testBinary = "100010";
        double decimal = BinaryToInt.decimal(testBinary);
        System.out.println(testBinary + " is equal to " + decimal + " in decimal system.");
    }
}
