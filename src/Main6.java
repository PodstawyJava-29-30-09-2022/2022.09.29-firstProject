public class Main6 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < 10; i++) {
            tab[i] = i;
        }

        /*for(int kolejnyElement : tab) {
            System.out.println(kolejnyElement);
            int a = kolejnyElement + 5;
            System.out.println("a="+a);
        }*/
        /*int i = 0;
        for(int element : tab) {
            element = i++;
        }*/

        for(int element : tab) {
            if (element == 5) {
                continue;
            }
            System.out.println(element);
        }

        System.out.println("koniec");
    }
}
