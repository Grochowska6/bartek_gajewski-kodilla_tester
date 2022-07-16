public class FirstClass {

    public static void main(String[] args) {


        Notebook notebook = new Notebook(600,1000,2020);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.CheckPrice();
        notebook.CheckWeight();
        notebook.CheckYear();

        Notebook HeavyNotebook = new Notebook(2000,1500,2005);
        System.out.println(HeavyNotebook.weight + " " + HeavyNotebook.price + " " + HeavyNotebook.year);
        HeavyNotebook.CheckPrice();
        HeavyNotebook.CheckWeight();
        HeavyNotebook.CheckYear();

        Notebook OldNotebook = new Notebook(1200,500,1999);
        System.out.println(OldNotebook.weight + " " + OldNotebook.price + " " + OldNotebook.year);
        OldNotebook.CheckPrice();
        OldNotebook.CheckWeight();
        OldNotebook.CheckYear();

        Notebook FutureNotebook = new Notebook(567,9999,2023);
        System.out.println(FutureNotebook.weight + " " + FutureNotebook.price + " " + FutureNotebook.year);
        FutureNotebook.CheckPrice();
        FutureNotebook.CheckWeight();
        FutureNotebook.CheckYear();



        }


    }




