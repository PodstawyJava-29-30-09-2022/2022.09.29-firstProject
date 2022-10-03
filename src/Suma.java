import java.util.Random;

public class Suma {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            tab[i] = random.nextInt(101);
            System.out.println(tab[i]);
        }
        /**********************************************/

        /*int sum = tab[0];
        for(int i = 1; i < 10; i++) {
            sum = sum + tab[i];
        }*/

        int sum = 0;
        for(int element : tab) {
            sum += element;
        }

        System.out.println(sum);
    }
}
