import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

public class NumberTest {

    private Numbers numbers;

    @Before
    public void init() {
        numbers = new Numbers();
    }

    @Test
    public void total_test1() {
        // GIVEN
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        // WHEN
        int actual = numbers.total(a1);
        int expected = 10;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void total_test2() {
        // GIVEN
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(100);
        a1.add(4);

        // WHEN
        int actual = numbers.total(a1);
        int expected = 134;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void total_test3() {
        // GIVEN
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(0);
        a1.add(00);
        a1.add(0_0);
        a1.add(0);

        //WHEN
        int actual = numbers.total(a1);
        int expected = 0;

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChars_test1() {
        // GIVEN
        String str = "I love Java";

        // WHEN
        char[] actual = numbers.getChars(str);
        char[] expected = str.toCharArray();

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getChars_test2() {
        // GIVEN
        String str = "I love Selenium";

        // WHEN
        char[] actual = numbers.getChars(str);
        char[] expected = str.toCharArray();

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getChars_test3() {
        // GIVEN
        String str = "TechnoStudy";

        // WHEN
        char[] actual = numbers.getChars(str);
        char[] expected = str.toCharArray();

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getWords_test1() {
        // GIVEN
        String str = "I love Java";

        // WHEN
        String[] actual = numbers.getWords(str);
        String[] expected = str.split(" ");

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getWords_test2() {
        // GIVEN
        String str = "My name is Josh Long";

        // WHEN
        String[] actual = numbers.getWords(str);
        String[] expected = str.split(" ");

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getWords_test3() {
        // GIVEN
        String str = "1 2 3 4 5 6 7 8 9";

        // WHEN
        String[] actual = numbers.getWords(str);
        String[] expected = str.split(" ");

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void evenTotal_test1() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(31);
        list.add(45);

        // WHEN
        int actual = numbers.evenTotal(list);
        int expected = 100;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evenTotal_test2() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(50);
        list.add(90);
        list.add(100);
        list.add(1);
        list.add(3);

        // WHEN
        int actual = numbers.evenTotal(list);
        int expected = 280;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evenTotal_test3() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(3);

        // WHEN
        int actual = numbers.evenTotal(list);
        int expected = 6;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oddTotal_test1() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(3);

        // WHEN
        int actual = numbers.oddTotal(list);
        int expected = 8;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oddTotal_test2() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(31);
        list.add(15);
        list.add(12);
        list.add(30);

        // WHEN
        int actual = numbers.oddTotal(list);
        int expected = 46;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oddTotal_test3() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(15);
        list.add(15);
        list.add(12);
        list.add(30);

        // WHEN
        int actual = numbers.oddTotal(list);
        int expected = 54;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUpperCase_test1() {
        // GIVEN
        String str = "United States of America";

        // WHEN
        String actual = numbers.getUpperCase(str);
        String expected = str.toUpperCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUpperCase_test2() {
        // GIVEN
        String str = "I am in the world";

        // WHEN
        String actual = numbers.getUpperCase(str);
        String expected = str.toUpperCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUpperCase_test3() {
        // GIVEN
        String str = "I love java";

        // WHEN
        String actual = numbers.getUpperCase(str);
        String expected = str.toUpperCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLowerCase_test1() {
        // GIVEN
        String str = "I love java";

        // WHEN
        String actual = numbers.getLowerCase(str);
        String expected = str.toLowerCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLowerCase_test2() {
        // GIVEN
        String str = "I live in United States of America";

        // WHEN
        String actual = numbers.getLowerCase(str);
        String expected = str.toLowerCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLowerCase_test3() {
        // GIVEN
        String str = "Don't look here dude";

        // WHEN
        String actual = numbers.getLowerCase(str);
        String expected = str.toLowerCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

}
