/**
*@author DiegoGVDev
*@version v0.0.1
*/

public class Main{

    static String reverseString(String str){

        String reverse ="";
        int stringLength = str.length() - 1;
        for(int i = 0; i < str.length(); i++){
            reverse += (str.charAt(stringLength - i));
        }
        return reverse;
    }

    public static void main(String[] args){
        String testReverseString = "This is a test of reverse string";
        String result = reverseString(testReverseString);
        System.out.println(result);
    }
}