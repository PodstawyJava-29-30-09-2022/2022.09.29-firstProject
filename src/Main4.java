public class Main4 {
    public static void main(String[] args) {
        int a = 3;

        /*if(a > 5 && a < 7) {
            System.out.println("to jest piątka");
            //
            //
            //
        } else if (a == 6) {
            System.out.println("to jest sześć");
        } else if(a == 7) {
            System.out.println("to jest siedem");
        } else if(a == 8) {
            System.out.println("to jest osiem");
        } else {
            System.out.println("to jest cos innego");
        }*/

        String b = "Karol";

        switch(b) {
            case "Janusz":
                System.out.println("czesc janusz");
                break;
            case "Karol":
                System.out.println("czesc karol");
                break;
            case "3":
                System.out.println("to jest trzy");
                break;
            case "4":
                break;

            default:
                System.out.println("nie wiadomo co to");
                break;
        }


        System.out.println("koniec");
    }
}
