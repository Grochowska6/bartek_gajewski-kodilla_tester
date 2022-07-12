public class LeapYear {
    public static void main(String[] args) {
        int a = 2022;
        int b = 4;
        int c = 100;
        int d = 400;


        boolean aIsEven = a % b == 0;


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
















