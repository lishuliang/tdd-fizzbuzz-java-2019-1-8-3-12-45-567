package com.thoughtworks.tdd;

public class FizzBuzz {
    public String output(int num){
        String result = "";
        if(num % 3 == 0) result += "Fizz";
        if(num % 5 == 0) result += "Buzz";
        if(num % 7 == 0) result += "Whizz";
        if(result.isEmpty()) result = String.valueOf(num);

        return result;
    }
}
