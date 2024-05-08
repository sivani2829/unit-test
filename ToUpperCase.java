package org.example.Practice;

public class ToUpperCase {
    public static void main(String[] args) {
        System.out.println(testCaseforEmptyString());
        System.out.println(testCaseForNull());
        System.out.println (testCaseWithChar());
        System.out.println(singleChar());
        System.out.println(charnumspecial());
        System.out.println(singleUppercase());
        System.out.println(specialChar());
        System.out.println( charandCharSpaces());
        System.out.println(spacesAndchar());
        System.out.println( numricalInput());
        System.out.println( spaceswithpattern());



    }
    //Method for upper case for given input string
    public static String convertToUppercase(String var) {
        String result = "";
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) >= 97 && var.charAt(i) <= 122) {
                result += (char) (var.charAt(i) - 32);

            } else {
                result += var.charAt(i);
            }

        }
        return result;
    }

    //Method for empty string
    public static boolean testCaseforEmptyString() {
        String expected = "";
        String input = "";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean testCaseForNull() {
        String expected = null;
        String input = null;
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean testCaseWithChar() {
        String expected = "PHENOM";
        String input = "phenom";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean singleChar() {
        String expected = "S";
        String input = "s";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }



    public static boolean numricalInput(){
        String expected = "12753";
        String input = "12753";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean spaceswithpattern(){
        String expected = "  SIVA 12233  ";
        String input = "  Siva 12233  ";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }



    public static boolean charnumspecial(){
        String expected = "SIVA*(/)^!!123";
        String input = "siva*(/)^!!123";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean singleUppercase(){
        String expected = "SIVANI";
        String input = "siVani";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean specialChar(){
        String expected = "@!%$";
        String input = "@!%$";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean  charandCharSpaces(){
        String expected = "K R I S H N A";
        String input = "K r I s h n a";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean spacesAndchar(){
        String expected = "  PHENOM@144 ";
        String input = "  pHeNoM@144 ";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }




}