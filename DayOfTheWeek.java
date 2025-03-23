package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayOfTheWeek {
    public static void main(String[] args) {
        // Create a LocalDate object for a specific date
        // Arrays.sort(charArray);

        String pattern =
                "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // public String pattern = "^(\\d{1,3}\\.){3}\\d{1,3}$";
        String s = "";
        // Write your code here.
        String [] array = s.trim().split("[!,?._'\\s]+");

        System.out.println(array.length);
        for (String str: array) {
            System.out.println(str);
        }
        // scan.close();

        String regex = "\\w";
        String text = "%";

        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(text);
        boolean result = mt.matches();

        System.out.println("RegEx result = " + result);

        LocalDate date = LocalDate.of(2025, 1, 15);

        // Get the day of the week for the given date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Print the day of the week
        System.out.println("The day of the week for " + date + " is " + dayOfWeek);
    }
}