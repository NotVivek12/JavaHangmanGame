import java.util.*;

public class game {
    public static void main(String[] args) {
        chooseWord();
    }
    public static void  chooseWord() {
        String[] words = {"apple","banana","grapes","watermelon","melon"};
        System.out.println("Welcome To Hangman Game");
        Random r = new Random();
        int n = r.nextInt(5);
        String word = words[n];
        word = word.toUpperCase();
        String dash = word.replaceAll("[A-Z]", "_");
        play(word,dash);
    }
    public static void play(String word,String dash) {
        Scanner sc = new Scanner(System.in);
        int totalGuess = 0;
        int wrong = 0;
        String letter1;
        char letter;
        System.out.println("Let's Start\nYou have total 5 guesses\nALL THE BEST!!");
        while(wrong != 5) {
            System.out.print("Enter Your Guess(A Single Letter): ");
            letter1 = sc.next();
            letter = letter1.toUpperCase().charAt(0);
            
        }
    }
}