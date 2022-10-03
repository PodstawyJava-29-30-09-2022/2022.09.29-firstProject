public class Main2 {
    public static void main(String[] args) {
        int a = 13;
        int b = 13;
        int result;

        result = a % b;
        System.out.println(result);

        String t1 = "Mateusz";
        String t2 = "Bereda";
        String space = " ";

        String t3 = t1 + space + t2;

        System.out.println(t3);

        boolean equal = a != b;
        System.out.println(equal);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 || b2;

        System.out.println(b3);

        boolean b4 = !b1;

        System.out.println(b4);

        int i = 5;
        i = i + 1;
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);

        int j = 0;
        System.out.println(++j);
        System.out.println(j++);
        System.out.println(--j);
        System.out.println(j--);
        System.out.println(j);

        System.out.println(a + b);
        System.out.println("mateusz" + " " + "bereda");

        int c = 5;
        System.out.println(++c);
        int d = c;
        System.out.println(d);
        c = 5;
        System.out.println(c);

        System.out.println(a + " " + b);
        System.out.printf("%f %f %f", 3.33, 5.345, 456.45);

    }
}
