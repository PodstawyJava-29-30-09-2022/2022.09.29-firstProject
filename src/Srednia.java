import java.util.Random;

public class Srednia {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        Random random = new Random();

        //petla po wierszach
        for(int w = 0; w < 5; w++) {
            //petla po kolumnach
            for(int k = 0; k < 5; k++) {
                tab[w][k] = random.nextInt(101);
                System.out.print(tab[w][k] + " ");
            }
            System.out.println();
        }
        /*****************************************/

        for(int w = 0; w < 5; w++) {
            int sum = 0;
            for(int k = 0; k < 5; k++) {
                sum += tab[w][k];
            }
            System.out.println("Srednia dla wiersza " + w + " wynosi: " + sum/5.0);
        }
    }
}
