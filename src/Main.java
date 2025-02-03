// Made by Benjamin Rubio
// For Mr. Gross Software and Programming Dev 2 Class
// Contact at benjamin.rubio@malad.us

public class Main {
    public static void main(String[] args) {
        String testText = "The quick brown fox jumped over the lazy dog."; // creates the string we're going to use to test the program
        int amountOfSpacesBetweenWordsInText = 0; // creates the value we're going to use to store the amount of spaces found in the testText

        // creates a for loop to go from 0 to the length of characters in the testText string
        for (int i = 0; i < testText.length(); i++) {
            // checks if the character at the current index is a space and the space is not at the very end of the text and also that there is actually a character after the space
            if (testText.charAt(i) == ' ' && i != (testText.length() - 1) && testText.charAt(i+1) != ' ') {
                amountOfSpacesBetweenWordsInText += 1; // adds one to amountOfSpacesBetweenWordsInText
            }
        }

        int amountOfWordsInText = amountOfSpacesBetweenWordsInText + 1; // adds one to the amount of spaces to get the amount of real words

        System.out.println("There is " + amountOfWordsInText + " words in the text: " + testText); // tells the user the amount of words in the testText string
    }
}