package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        int input1 = 1;
        int input2 = 2;
        int input3 = 3;
        int input4 = 4;
        int input5 = 5;
        int input6 = 6;
        int input7 = 7;
        int input8 = 8;
        int input9 = 9;

        int input11 = 11;
        int input12 = 12;
        int input13 = 13;
        int input14 = 14;
        int input15 = 15;

        int input105 = 105;

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result1 = fizzBuzz.output(input1);
        String result2 = fizzBuzz.output(input2);
        String result3 = fizzBuzz.output(input3);
        String result4 = fizzBuzz.output(input4);
        String result5 = fizzBuzz.output(input5);
        String result6 = fizzBuzz.output(input6);
        String result7 = fizzBuzz.output(input7);
        String result8 = fizzBuzz.output(input8);
        String result9 = fizzBuzz.output(input9);

        String result11 = fizzBuzz.output(input11);
        String result12 = fizzBuzz.output(input12);
        String result13 = fizzBuzz.output(input13);
        String result14 = fizzBuzz.output(input14);
        String result15 = fizzBuzz.output(input15);

        String result105 = fizzBuzz.output(input105);

        assertEquals(result1, "1");
        assertEquals(result2, "2");
        assertEquals(result3, "Fizz");
        assertEquals(result4, "4");
        assertEquals(result5, "Buzz");
        assertEquals(result6, "Fizz");
        assertEquals(result7, "Whizz");
        assertEquals(result8, "8");
        assertEquals(result9, "Fizz");

        assertEquals(result11, "11");
        assertEquals(result12, "Fizz");
        assertEquals(result13, "13");
        assertEquals(result14, "Whizz");
        assertEquals(result15, "FizzBuzz");

        assertEquals(result105, "FizzBuzzWhizz");

    }
}
