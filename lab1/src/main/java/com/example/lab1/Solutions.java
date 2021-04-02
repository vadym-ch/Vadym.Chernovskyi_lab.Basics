package com.example.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Character.toLowerCase;

public class Solutions {
    
    //  Task 1
    static ArrayList getIntegersFromList(List list){
        ArrayList intList = new ArrayList();
        for (var value:list) {
            if(value instanceof Integer) {
                intList.add(value);
            }
        }
        return intList;
    }

    //  Task 2
    static char firstNonRepeatingLetter(String input){
        for (int i = 0; i < input.length(); i++) {
            boolean unique = true;
            char ch = toLowerCase(input.charAt(i));
            for (int j = 0; j < input.length(); j++) {
                if (i != j && ch == toLowerCase(input.charAt(j))) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return input.charAt(i);
            }
        }
        return ' ';
    }
   

    //  Task 3
    static int digitalRoot(int input){
        int number = input;
        int sum = 0;
        while(number%10 > 0)
        {
            sum = (number%10) + sum;
            number = number/10;
        }
        if(sum/10 > 0)
            return digitalRoot(sum);
        return sum;
    }

    //  Task 4
    static int countSumPairs(int[] array, int sum){
        int pairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++){
                if( i!= j && array[i] + array[j] == sum)
                    pairs++;
            }
        }
        return pairs;
    }
    static int streamCountSumPairs(int[] array, int sum){
        int pairs = 0;
        for(int i = 0; i < array.length; i++) {
            int finalInt = i;
            pairs += IntStream.range(finalInt,  array.length)
                    .filter(j -> finalInt != j && array[finalInt] + array[j] == sum).count();
        }
        return pairs;
    }

    //  Task 5
    static class Guest{
        private String firstName;
        private String lastName;

        Guest(String fn, String ln){
            this.firstName = fn;
            this.lastName = ln;
        }

        public String getFirstName() {
        return firstName;
        }

        public String getLastName() {
        return lastName;
        }

        @Override
        public String toString() {
            return ("(" + lastName + ", " + firstName + ")");
        }
    }

    static String sortGuests(String guests){
        List<Guest> guestList = new ArrayList<>();
        guests = guests.toUpperCase();
        for (String g : guests.split(";")) {
            guestList.add(new Guest(g.split(":")[0], g.split(":")[1]));
        }
        Collections.sort(guestList, Comparator.comparing(Guest::getLastName).thenComparing(Guest::getFirstName));
        StringBuilder guestsList = new StringBuilder();
        for (Guest gue : guestList) {
            guestsList.append(gue.toString());
        }
        return guestsList.toString();
    }


    //Additional Extra Task (the second one)
    static String convertToIPv4(long i) {
        return 
        (i >> 24 & 0xFF) + "." + 
        ((i >> 16) & 0xFF) + "." + 
        ((i >> 8) & 0xFF) + "." + 
        (i & 0xFF);
    }
    
}
