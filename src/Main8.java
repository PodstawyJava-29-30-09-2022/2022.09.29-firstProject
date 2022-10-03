public class Main8 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                tab[j][i] = j*i;
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }


    }
}
