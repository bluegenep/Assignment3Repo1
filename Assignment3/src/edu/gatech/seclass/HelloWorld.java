package edu.gatech.seclass;

/**
 * Created by swengineer on 9/5/16.
 */
public class HelloWorld {
    public static void main(String[] args) {

        HelloWorld hello = new HelloWorld();

        hello.letsGetCounters();
        hello.letsGetNthCharacters(2, false); //oasepa
        hello.convertDigitsToNamesInSubstring(5, 7);

    }

    public void letsGetCounters() {
        int counter = 0;
        //String currentString = "I'd b3tt3r put s0me d161ts in this 5tr1n6, right?";
        String currentString = "apppleere23 34";
        if (currentString == null) {
            throw new NullPointerException("String cannot be null");
        }
        for (int i = 0; i < currentString.length(); i++) {
            char c = currentString.charAt(i);
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                counter++;
                for (int j = i + 1; j < currentString.length(); j++) {
                    char aCS = currentString.charAt(j);
                    if (aCS == '0' || aCS == '1' || aCS == '2' || aCS == '3' || aCS == '4' || aCS == '5' || aCS == '6' || aCS == '7' || aCS == '8' || aCS == '9') {
                        i++;
                    } else {
                        break;
                    }

                }
                /*char aCS = currentString.charAt(i + 1);
                if (aCS == '0' || aCS == '1' || aCS == '2' || aCS == '3' || aCS == '4' || aCS == '5' || aCS == '6' || aCS == '7' || aCS == '8' || aCS == '9') {
                    i++;
                }*/
            }
        }
        System.out.println("Counter ==  " + counter);
    }

    public void letsGetNthCharacters(int n, boolean startFromEnd) {
        if (n <= 0) {
            throw new IllegalArgumentException("N should be greater than 0");
        }

        int counter = 0;
        //String currentString = "I'd b3tt3r put s0me d161ts in this 5tr1n6, right?";
        String currentString = "appleis agood";
        if (currentString == null) {
            throw new NullPointerException("String cannot be null");
        }
        String returnString = "";


        int startingPoint = n;
        int endingPoint = currentString.length();
        int step = n;
        if (startFromEnd == true) {
            startingPoint = currentString.length() - (n + 1);
            endingPoint = 0;
            step = -n;
            for (int i = startingPoint; i >= endingPoint; i = i + step) {
                char c = currentString.charAt(i);
                returnString = returnString + c;
            }
        } else if (startFromEnd == false) {

            for (int i = startingPoint; i < endingPoint; i = i + step) {
                char c = currentString.charAt(i);
                returnString = returnString + c;
            }

        }


        System.out.println("Return String == " + returnString);
    }

    public void testconvertDigitsToNamesInSubstring(int startPosition, int endPosition) {
        int number = 1234;
        String alphabetSum = "";
        while (number > 0) {
            int digit = number % 10;
            String alphabet = "";

            if (digit == 0) {
                alphabet = "Zero";
            } else if (digit == 1) {
                alphabet = "One";
            } else if (digit == 2) {
                alphabet = "Two";
            } else if (digit == 3) {
                alphabet = "Three";
            } else if (digit == 4) {
                alphabet = "Four";
            } else if (digit == 5) {
                alphabet = "Five";
            } else if (digit == 6) {
                alphabet = "Six";
            } else if (digit == 7) {
                alphabet = "Seven";
            } else if (digit == 8) {
                alphabet = "Eight";
            } else if (digit == 9) {
                alphabet = "Nine";
            }

            alphabetSum = alphabet + alphabetSum;
            number /= 10;
            //System.out.println(digit);

        }
        System.out.println("Text == " + alphabetSum);


    }

    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
        String currentString = "app1234";
        if (startPosition > endPosition) {
            throw new IllegalArgumentException("Start Position is greater than End Position");
        }
        if ((startPosition < 1) || (endPosition > currentString.length())) {
            throw new MyIndexOutOfBoundsException("Check your index Bound");
        }

        if (currentString == null) {
            throw new NullPointerException("String cannot be null");
        }

        String alphabetSum = "";
        for (int i = startPosition - 1; i < endPosition; i++) {
            char c = currentString.charAt(i);
            String alphabet = "";
            if (c == '0') {
                alphabet = "Zero";
            } else if (c == '1') {
                alphabet = "One";
            } else if (c == '2') {
                alphabet = "Two";
            } else if (c == '3') {
                alphabet = "Three";
            } else if (c == '4') {
                alphabet = "Four";
            } else if (c == '5') {
                alphabet = "Five";
            } else if (c == '6') {
                alphabet = "Six";
            } else if (c == '7') {
                alphabet = "Seven";
            } else if (c == '8') {
                alphabet = "Eight";
            } else if (c == '9') {
                alphabet = "Nine";
            }

            alphabetSum = alphabetSum + alphabet;
            //System.out.println(digit);
        }
        System.out.println("Text == " + alphabetSum);


    }


}



