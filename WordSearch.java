import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;



public class WordSearch {
    private static final int ROWS_AR = 30;
    private static final int COLUMNS_AR = 30;
    private static final SecureRandom randomNumbers = new SecureRandom();


    char[][] solutionArray = new char[ROWS_AR][COLUMNS_AR];
    char[][] searchArray = new char[ROWS_AR][COLUMNS_AR];
    ArrayList<String> words = new ArrayList<String>();

    public void arrayWithWords() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter up to 8 words up to 15 char for array: ");
        String wordString;
        do {//put words entered by user to arrayList
            wordString = input.next().toUpperCase();
            if (wordString.contains("DONE")){
            } else {
                words.add(wordString);
            }
        }
        while (!wordString.contains("DONE"));

        //take words from arrayList and put it char array
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            switch (i) {
                case 0:
                    for (int o = 0; o < word.length(); o++){
                        searchArray[i][o] = word.charAt(o);
                    }
                    break;
                case 1:
                    int c = 0;
                    for (int o = ROWS_AR - 1; o > ROWS_AR - 1 - word.length(); o--){
                        searchArray[o][o] = word.charAt(c++);
                    }
                    break;
                case 2:
                    int a = 0;
                    for (int o = COLUMNS_AR - 6; o > COLUMNS_AR - 6 - word.length(); o--){
                        searchArray[ROWS_AR - 16][o] = word.charAt(a++);
                    }
                    break;
                case 3:
                    int b = 0;
                    for (int o = COLUMNS_AR - word.length(); o < COLUMNS_AR; o++)
                        searchArray[ROWS_AR - 17][o] = word.charAt(b++);
                    break;
                case 4:
                    int d = 0;
                    for (int o = COLUMNS_AR - 27; o < COLUMNS_AR - 27 + word.length(); o++){
                        searchArray[o + 5][o] = word.charAt(d++);
                    }
                    break;
                case 5:
                    int e = 0;
                    for (int o = ROWS_AR - 1; o > ROWS_AR - 1 - word.length(); o--){
                        searchArray[o][1] = word.charAt(e++);
                    }
                    break;
                case 6:
                    for (int o = 0; o > word.length(); o++){
                        searchArray[i][o] = word.charAt(o);
                    }
                    break;
                case 7:

                    break;
            }

        }
        
    }

    public void printArray() {
        //for (int c = 0; c < COLUMNS_AR; i++)
        for (int r = 0; r < ROWS_AR; r++)  {
            for (int c = 0; c < COLUMNS_AR; c++) {
                System.out.print(searchArray[r][c] + " ");
            }
            System.out.println();
        }
        
    }
    
    public void fillUpArrayWithDot() {
        for(int r = 0; r < ROWS_AR; r++) {
            for(int c = 0; c < COLUMNS_AR; c++) {
                searchArray[r][c] = '.';
            }
        }
    }

    public void fillUpArrayRandom() {
        for(int r = 0; r < ROWS_AR; r++) {
            for(int c = 0; c < COLUMNS_AR; c++) {
                int ranNum = randomNumbers.nextInt(65, 90);
                searchArray[r][c] = (char) ranNum;
            }
        }
    }
    
}




