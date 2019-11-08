import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class NumberTest {

    Numbers num1 = new Numbers();


    @Test
    public void Test3Test1() {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        int total = num1.test3(a1);

        Assert.assertTrue(total == 10);

    }

    @Test
    public void Test3Test2() {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(10);
        a1.add(20);
        a1.add(100);
        a1.add(4);

        int total = num1.test3(a1);

        Assert.assertTrue(total == 134);

    }

    @Test
    public void Test3Test3() {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(0);
        a1.add(0);
        a1.add(00);
        a1.add(0);

        int total = num1.test3(a1);

        Assert.assertTrue(total == 0);

    }

    @Test
    public void Test1Test1() {

        String s1 = "I love Java";

        char[] c1 = num1.test1(s1);

        char[] c2 = s1.toCharArray();

        for (int i = 0; i < c2.length; i++) {

            Assert.assertTrue(c2[i] == c1[i]);
        }
    }
        @Test
        public void Test1Test2 () {

            String s2 = "I love Selenium";

            char[] c3 = num1.test1(s2);

            char[] c4 = s2.toCharArray();

            for (int i = 0; i < c4.length; i++) {

                Assert.assertTrue(c3[i] == c4[i]);
            }


        }

    @Test
    public void Test1Test3 () {

        String s2 = "ArrayList";

        char[] c3 = num1.test1(s2);

        char[] c4 = s2.toCharArray();

        for (int i = 0; i < c4.length; i++) {

            Assert.assertTrue(c3[i] == c4[i]);
        }


    }

    @Test
    public void Test2Test1() {

        String s1 = "I love Java";

        String[] strCha2 = num1.test2(s1);

        String[] strChar = s1.split(" ");

        for (int i = 0; i < strCha2.length; i++) {

            Assert.assertTrue(strChar[i].equals( strCha2[i]));
        }
    }

        @Test
        public void Test2Test2() {

            String s1 = "My name is Some thing";

            String[] strCha2=num1.test2(s1);

            String[] strChar =s1.split(" " );

            for (int i = 0; i < strCha2.length; i++) {

                Assert.assertTrue(strChar[i].equals( strCha2[i]));
            }
    }

    @Test
    public void Test2Test3() {

        String s1 = "1 2 3 4 5 6 7 8 9";

        String[] strCha2=num1.test2(s1);

        String[] strChar =s1.split(" " );

        for (int i = 0; i < strCha2.length; i++) {

            Assert.assertTrue(strChar[i].equals( strCha2[i]));
        }
    }

    @Test
    public void Test4Test1() {

        ArrayList<Integer> i1 = new ArrayList<>();

        i1.add(10);
        i1.add(20);
        i1.add(30);
        i1.add(40);
        i1.add(31);
        i1.add(45);

        int Total=num1.test4(i1);


            Assert.assertTrue(100==Total);

    }

    @Test
    public void Test4Test2() {

        ArrayList<Integer> i1 = new ArrayList<>();

        i1.add(40);
        i1.add(50);
        i1.add(90);
        i1.add(100);
        i1.add(1);
        i1.add(3);

        int Total=num1.test4(i1);


        Assert.assertTrue(280==Total);

    }

    @Test
    public void Test4Test3() {

        ArrayList<Integer> i1 = new ArrayList<>();

        i1.add(1);
        i1.add(2);
        i1.add(3);
        i1.add(4);
        i1.add(1);
        i1.add(3);

        int Total=num1.test4(i1);


        Assert.assertTrue(6==Total);

    }

    @Test
    public void Test5Test1() {

        ArrayList<Integer> i1 = new ArrayList<>();

        i1.add(1);
        i1.add(2);
        i1.add(3);
        i1.add(4);
        i1.add(1);
        i1.add(3);

        int Total=num1.test5(i1);


        Assert.assertTrue(8==Total);

    }

    @Test
    public void Test5Test2() {

        ArrayList<Integer> i1 = new ArrayList<>();

        i1.add(10);
        i1.add(20);
        i1.add(31);
        i1.add(15);
        i1.add(12);
        i1.add(30);

        int Total=num1.test5(i1);

        System.out.println(Total);
        Assert.assertTrue(46==Total);

    }


    @Test
    public void Test5Test3() {

        ArrayList<Integer> i1 = new ArrayList<>();

        i1.add(11);
        i1.add(13);
        i1.add(15);
        i1.add(15);
        i1.add(12);
        i1.add(30);

        int Total=num1.test5(i1);

        Assert.assertTrue(54==Total);

    }

    @Test
    public void Test6Test1() {

        String s1 = "United States of America";

        String mys1=num1.test6(s1);



        Assert.assertTrue(mys1.equals(s1.toUpperCase()));

    }

    @Test
    public void Test6Test2() {

        String s1 = "I am in the world";

        String mys1=num1.test6(s1);

        Assert.assertTrue(mys1.equals(s1.toUpperCase()));

    }

    @Test
    public void Test6Test3() {

        String s1 = "I love java";

        String mys1=num1.test6(s1);

        Assert.assertTrue(mys1.equals(s1.toUpperCase()));

    }

    @Test
    public void Test7Test1() {

        String s1 = "I love java";

        String mys1=num1.test7(s1);

        Assert.assertTrue(mys1.equals(s1.toLowerCase()));

    }

    @Test
    public void Test7Test2() {

        String s1 = "I live in United States of America";

        String mys1=num1.test7(s1);

        Assert.assertTrue(mys1.equals(s1.toLowerCase()));

    }

    @Test
    public void Test7Test3() {

        String s1 = "Dont look here dude ";

        String mys1=num1.test7(s1);

        Assert.assertTrue(mys1.equals(s1.toLowerCase()));

    }

}
