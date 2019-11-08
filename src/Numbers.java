import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Numbers {


//    split

//    tocharArray

//    char , arraylist -->>  for loop la birlikte toplami bulma

//    even rakamlarin toplamini bulma

//    odd rakamlarin toplammini bulma

//

    ArrayList<Integer> Numbers;

    String MyString;

    public Numbers() {


    }



    /*
            You have string number get the each characters from the string and return the char array

            hint use tochararray
     */
    public char[] test1(String number) {

        char[] eachWord;

        //        write your code here ----->>>>

        eachWord = number.toCharArray();

        return eachWord;

    }

    /*
        You have string "sentence" get the each word from the string and return string array

        hint use split
 */
    public String[] test2(String sentence) {

        String[] eachWord;

        //        write your code here ----->>>>

        eachWord = sentence.split(" ");

        return eachWord;
    }

/*
        You have an arrayList name is numbers

        numbers arraylist have numbers like >> 1,2,3,4

        calculate the total numbers 1+2+3+4 = 10

 */

    public int test3(ArrayList<Integer> myList) {

        int total = 0;

//        Write your code here  --->>


        for (int i = 0; i < myList.size(); i++) {

            total = total + myList.get(i);

        }

//       <<----

        return total;

    }


    /*
           get the total numbers of the even numbers

           for example if arrayList has the 1,2,3,4,5,6,7,8,9

           2+4+6+8 = 20

            total should be 20 ;

    */
    public int test4(ArrayList<Integer> MyNumbers) {

        int total = 0;

        //        write your code here ----->>>>

        for (int i = 0; i < MyNumbers.size(); i++) {

            if (MyNumbers.get(i) % 2 == 0) {

                total = total + MyNumbers.get(i);

            }

        }

        return total;

    }

    /*
           get the total numbers of the odd numbers

           for example if arrayList has the 1,2,3,4,5,6,7,8,9

           1+3+5+7+9 = 25

            total should be 25 ;

    */
    public int test5(ArrayList<Integer> MyNumbers) {

        int total = 0;

        //        write your code here ----->>>>

        for (int i = 0; i < MyNumbers.size(); i++) {

            if (MyNumbers.get(i) % 2 == 1) {

                total = total + MyNumbers.get(i);

            }

        }


        return total;

    }


    /*
        make the name upper case

      */
    @Test
    public String test6(String Name) {
        String UpperCaseName;

        //        write your code here ----->>>>

        UpperCaseName = Name.toUpperCase();

        return UpperCaseName;

    }

    /*
       make the name Lower case

     */
    @Test
    public String test7(String Name) {
        String LowerCaseName;

//        write your code here ----->>>>

        LowerCaseName = Name.toLowerCase();


        return LowerCaseName;

    }


}