package DuplicateWordFilter;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class WordFilter {
    HashSet<String> filter = new HashSet<>();

    public void addWord(List<String> words){
        filter.addAll(words);
    }
    public boolean wordExists(String word){
        return filter.contains(word);
    }
    public void removeWord(String word){
        filter.remove(word);
        System.out.println("WORD REMOVED");
    }
    public void displayAll(){
        System.out.println("Words In Collection");
        for (String word: filter){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Add words");
            System.out.println("2. Check if a word exists");
            System.out.println("3. Remove a word");
            System.out.println("4. Display all unique words");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter words separated by space: ");
                    String input = scanner.nextLine();
                    List<String> words = List.of(input.split("\\s+"));
                    wordFilter.addWord(words);
                    System.out.println("Words added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the word to check: ");
                    String wordToCheck = scanner.nextLine();
                    if (wordFilter.wordExists(wordToCheck)) {
                        System.out.println("The word exists in the collection.");
                    } else {
                        System.out.println("The word does not exist in the collection.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the word to remove: ");
                    String wordToRemove = scanner.nextLine();
                    wordFilter.removeWord(wordToRemove);
                    break;
                case 4:
                    wordFilter.displayAll();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

