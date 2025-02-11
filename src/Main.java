// Made by Benjamin Rubio
// For Mr. Gross Software and Programming Dev 2 Class
// Contact at benjamin.rubio@malad.us

import java.util.Scanner;

public class Main {
    // creates a method to easily get all the words in text given
    public static int getWordsInText(String text) {
        String splitRegex = "[\\.\\s]"; // creates the regex to split the string
        String[] splitText = text.split(splitRegex); // splits the string into an array with the regex

        int amountOfWordsInText = 0; // creates the value we're going to use to store the amount of spaces found in the testText

        // creates a for loop to count the words in the testText string
        for (String s : splitText) {
            amountOfWordsInText += 1; // add one to amountOfWordsInText value
        }

        return amountOfWordsInText; // returns the amount of words in the text
    }

    public static void main(String[] args) {
        /*
        String testText = "The quick brown fox jumped over the lazy dog."; // creates the string we're going to use to test the program

        int amountOfWordsInText = getWordsInText(testText); // gets the amount of words in the test text

        System.out.println("There is " + amountOfWordsInText + " words in the text: " + testText); // tells the user the amount of words in the testText string
        */

        System.out.println("Type in a sentence: ");

        Scanner inputScanner = new Scanner(System.in); // creates a new scanner to get input from the user

        int amountOfWordsInInput = getWordsInText(inputScanner.nextLine()); // gets the amount of words in the text from the user input

        System.out.println("There is " + amountOfWordsInInput + " words in the sentence.");
    }
}