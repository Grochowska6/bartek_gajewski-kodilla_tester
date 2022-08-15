import java.util.Scanner;

public class UserColors {

    public static void main(String[] args) {
        String color;

        System.out.println("Enter the first letter of the colour");
        color = getLetter();

        switch (color){
            case "Y":
                System.out.println("Yellow");
                break;
            case "B":
                System.out.println("Brown" + " " + "Black" + " " + "Blue");
                break;
            case "C":
                System.out.print("Cream");
                break;
            case "P":
                System.out.println("Pink");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "F":
                System.out.println("Fuschia");
                break;
            case "G":
                System.out.println("Green" + " " + "Grey");
                break;
            case "W":
                System.out.println("White");
                break;
            case "R":
                System.out.println("Red");
                break;
            default:
                System.out.println("Color is not found");
        }
    }
    public static String getLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter");
        boolean letter = scanner.nextBoolean();
        return letter;
    }
}
