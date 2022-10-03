public class Main3 {
    public static void main(String[] args) {
        int a = 5;
        int[] tab = new int[10];
        boolean[] tab2 = new boolean[15];
        String[] strings = new String[20];


        tab[5] = 5;
        tab[3] = 10;
        tab[8] = 456;

        tab[9] = tab[5] + tab[3];

        //tab[10] = 15;

        System.out.println(tab2[0]);
        System.out.println(tab2[1]);
        System.out.println(tab2[2]);
        System.out.println(tab2[3]);
        System.out.println(tab2[4]);

        int[] tab3 = new int[20];
        System.out.println(tab3[0]);
        System.out.println(tab3[1]);
        System.out.println(tab3[2]);
        System.out.println(tab3[3]);
        System.out.println(tab3[4]);

        System.out.println(tab3);

        int[] tablica = {1,2,3,4,5,6};
        String[] napisy = {"ABC", "BCD", "asdf", "asdf", "afghsd"};

        System.out.println(napisy[3]);

        int[][] tablicaDwuwymiarowa = new int[10][5];

        tablicaDwuwymiarowa[3][4] = 10;

        int[][] tablicaDwuwymiarowa2 = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };
    }
}
