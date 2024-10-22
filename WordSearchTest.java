import java.util.Scanner;

public class WordSearchTest{

    public static void main(String[] args) {
        WordSearch myWordSearch = new WordSearch();
        Scanner scn = new Scanner(System.in);
        int input;
        do {
            System.out.println("'1' - Create a crossword puzzle");
            System.out.println("'2' - View a crossword puzzle with solutions");
            System.out.println("'3' - View a crossword puzzle without solutions");
            System.out.println("'4' - Quit");

            input = scn.nextInt();

            switch (input) {
                case 1:
                    myWordSearch.userPrompt();
                    break;
                case 2:
                    myWordSearch.fillUpArrayWithDot();
                    myWordSearch.fillArrayWithWords();
                    myWordSearch.printArray();
                    break;
                case 3:
                    myWordSearch.fillUpArrayRandom();
                    myWordSearch.fillArrayWithWords();
                    myWordSearch.printArray();
                    break;
                case 4:
                    System.out.println("It were nice to see you!");
                    break;
                default:
                    System.out.println("Enter Valid Value!");
                    break;
            }

        } while (input != 4);
    }
}
