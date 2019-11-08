import java.util.ArrayList;

public class Numbers {

    /**
     * 1. split
     * 2. toCharArray
     * 3. char, ArrayList, calculate sum using for loop
     * 4. calculate even numbers sum
     * 5. calculate odd numbers sum
     * 6. upper case
     * 7. lower case
     */

    /**
     * You have string "number", get each character from the string and return the char array
     * Hint: use toCharArray method
     */
    public char[] getChars(String number) {
        char[] eachWord = {};
        // write your code here

        eachWord = number.toCharArray();

        // end of code
        return eachWord;
    }

    /**
     * You have string "sentence", get each word from the string and return string array
     * Hint: use split method
     */
    public String[] getWords(String sentence) {
        String[] eachWord = {};
        // write your code here

        eachWord = sentence.split(" ");

        // end of code
        return eachWord;
    }

    /**
     * Calculate sum of numbers
     * ex: arrayList is: 1, 2 ,3 ,4
     * 1+2+3+4 = 10
     * total should be 10;
     */
    public int total(ArrayList<Integer> myList) {
        int total = 0;
        // write your code here

        for (int i = 0; i < myList.size(); i++) {
            total = total + myList.get(i);
        }

        // end of code
        return total;
    }

    /**
     * Calculate sum of even numbers
     * <p>
     * ex: arrayList is: 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
     * 2+4+6+8 = 20
     * total should be 20;
     */
    public int evenTotal(ArrayList<Integer> MyNumbers) {
        int total = 0;
        // write your code here

        for (int i = 0; i < MyNumbers.size(); i++) {
            if (MyNumbers.get(i) % 2 == 0) {
                total = total + MyNumbers.get(i);
            }
        }

        // end of code
        return total;
    }

    /**
     * Calculate sum of odd numbers
     * <p>
     * ex: arrayList is: 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
     * 1+3+5+7+9 = 25
     * total should be 25;
     */
    public int oddTotal(ArrayList<Integer> MyNumbers) {
        int total = 0;
        // write your code here

        for (int i = 0; i < MyNumbers.size(); i++) {
            if (MyNumbers.get(i) % 2 == 1) {
                total = total + MyNumbers.get(i);
            }
        }

        // end of code
        return total;
    }


    /**
     * Make the name upper case
     */
    public String getUpperCase(String name) {
        String upperCaseName = null;
        // write your code here

        upperCaseName = name.toUpperCase();

        // end of code
        return upperCaseName;
    }

    /**
     * Make the name lower case
     */
    public String getLowerCase(String name) {
        String lowerCaseName = "";
        // write your code here

        lowerCaseName = name.toLowerCase();

        // end of code
        return lowerCaseName;
    }
}
