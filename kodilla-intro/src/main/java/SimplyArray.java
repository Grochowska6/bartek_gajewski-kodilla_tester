public class SimplyArray {
    public static void main(String[] args) {

        String[] book = new String[5];

        book[0] = "Kżyżacy";
        book[1] = "Chłopi";
        book[2] = "Lalka";
        book[3] = "Pan Tadeusz";
        book[4] = "Wiedźmin";

        String books = book[0];

        for(int i=1; i < book.length; i++){
            System.out.println(book[i]);
        }

        System.out.println(book[0]);

        int numberOfElemenmts = book.length;

        String[] name =new String[5];

        name[0] = "Katarzyna";
        name[1] = "Karolina";
        name[2] = "Marta";
        name[3] = "Agnieszka";
        name[4] = "Natalia";

        String names = name[3];

        System.out.println(name[3]);

        int numberOfElements = name.length;

        System.out.println(numberOfElements);
        System.out.println("Moja tablica ma 5 elementów");

    }
}
