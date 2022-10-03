public class Main5 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for(int i = 0; i < 10; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }

        for(int i = 0; i < 10; i++) {
            tab[i] = (i + 1) * 2;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(tab[i]);
        }

        System.out.println(tab[5]);
        System.out.println("koniec");

        for(int i = 0; i < 10; i++) {
            tab[i] = (i + 1) * 2;
            System.out.println(tab[i]);
        }

        System.out.println(tab[5]);


        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                System.out.println(i);
            }
        }
    }
}
