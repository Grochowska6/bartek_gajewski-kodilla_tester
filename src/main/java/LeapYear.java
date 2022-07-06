public class LeapYear {
    public static void main(String[] args) {
        int a = 2000;
        int b = 4;
        int c = 100;
        int d = 400;


        boolean aIsEven = a % b == 0;
        System.out.println("liczba jest parzysta" + aIsEven);{

        }
        boolean result1 = a % b == 0; // true, gdy jest parzysta
        boolean result2 = a % c == 0; // true, gdy jest parzysta
        boolean result3 = a % d == 0; // true, gdy jest parzysta
        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result1);

        if (a % b <= 0){
            System.out.println("przestępny");
        } else {
            System.out.println("zwykły");
        }
        if (a % c <= 0){
            System.out.println("przestępny");
        } else {
            System.out.println("zwykły");
        }
        if (a % d <= 0){
            System.out.println("przestępny");
        } else {
            System.out.println("zwykły");
        }


        }
    }
















