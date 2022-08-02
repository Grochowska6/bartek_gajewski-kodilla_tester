public class SimplyNames {
    public static void main(String[] args){

        String[] name = new String[3];

        name[0] = "Anna";
        name[1] = "Kinga";
        name[2] = "Monika";

        String names = name[0];

        int numberOfElements = name.length;

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        for (int i = name.length - 1; i >= 0; i--){
            System.out.println(name[i]);

        }
    }
}
