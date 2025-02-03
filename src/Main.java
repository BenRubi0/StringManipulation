// Made by Benjamin Rubio
// For Mr. Gross Software and Programming Dev 2 Class
// Contact at benjamin.rubio@malad.us

public class Main {
    public static void main(String[] args) {
        String testText = "The quick brown fox jumped over the lazy dog."; // creates the string we're going to use to test the program
        String splitRegex = "[,\\.\\s]"; // creates the regex to split the string
        String[] splitText = testText.split(splitRegex); // splits the string into an array with the regex

        int amountOfWordsInText = 0; // creates the value we're going to use to store the amount of spaces found in the testText

        // creates a for loop to count the words in the testText string
        for (int i = 0; i < splitText.length; i++) {
            amountOfWordsInText += 1; // add one to amountOfWordsInText value
        }

        System.out.println("There is " + amountOfWordsInText + " words in the text: " + testText); // tells the user the amount of words in the testText string
    }
}