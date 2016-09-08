package edu.gatech.seclass;

public class MyCustomString implements MyCustomStringInterface {

    String currentString = "apple 12 orange 12";

    // Returns the current string.
    public String getString() {
        return currentString;
    }

    public void setString(String str) {
        currentString = str;
    }

    /**
     * Returns the number of numbers in the current string, where a number is defined as a
     * contiguous sequence of digits.
     * <p>
     * If the current string is empty, the method should return 0.
     * <p>
     * Examples:
     * - countNumbers would return 2 for string "My numbers are 11 and 96".
     *
     * @return Number of numbers in the current string
     * @throws NullPointerException If the current string is nullA
     */

    public int countNumbers() {
        int counter = 0;
        //String currentString = "I'd b3tt3r put s0me d161ts in this 5tr1n6, right?";
        //String currentString = "apppleere23 34";
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

            }
        }
        return counter;
    }

    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
        if (n <= 0) {
            throw new IllegalArgumentException("N should be greater than 0");
        }

        if (currentString == null) {
            throw new NullPointerException("String cannot be null");
        }
        String returnString = "";

        int startingPoint = n;
        int endingPoint = currentString.length();
        int step = n;

        if (startFromEnd == true) {
            startingPoint = currentString.length() - n;
            endingPoint = 0;
            step = -n;
            for (int i = startingPoint; i >= endingPoint; i = i + step) {
                char c = currentString.charAt(i);
                returnString = c + returnString;
            }
        } else if (startFromEnd == false) {

            for (int i = startingPoint - 1; i < endingPoint; i = i + step) {
                char c = currentString.charAt(i);
                returnString = returnString + c;
            }
        }
        return returnString;
    }

    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {

        if (startPosition > endPosition) {
            throw new IllegalArgumentException("Start Position is greater than End Position");
        }
        if ((startPosition < 1) || (endPosition > currentString.length())) {
            throw new MyIndexOutOfBoundsException("Check your index Bound");
        }

        if (currentString == null) {
            throw new NullPointerException("String cannot be null");
        }
        String realString = "";
        String alphabetSum = "";
        String firstPartString = "";
        String endPartString = "";

        for (int i = 0; i < startPosition - 1; i++) {
            char c = currentString.charAt(i);
            firstPartString = firstPartString + String.valueOf(c);

        }
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
            } else {
                alphabet = String.valueOf(c);
                System.out.print("character = " + alphabet);
            }
            alphabetSum = alphabetSum + alphabet;
        }


        for (int i = endPosition; i < currentString.length(); i++) {
            char c = currentString.charAt(i);
            endPartString = endPartString + String.valueOf(c);
        }

        realString = firstPartString + alphabetSum + endPartString;
        currentString = realString;
    }

}

