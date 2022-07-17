public class Notebook {

    int weight;
    int price;
    int year;

    public static void main(String[] args) {

    }

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;


    }

    public void CheckPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very Cheap");
        } else {
        }
        if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
        }
        if (this.price > 1000 ) {
            System.out.println("This notebook is expensive");
        } else {
        }
    }
    public void CheckWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light as a feather");
        } else {
        }
        if (this.weight > 600 && this.weight < 1200) {
            System.out.println("This notebook is passable");
        } else {
        }
        if (this.weight >= 1200) {
            System.out.println("This notebook is to heavy");
        } else {
        }
    }
    public void CheckYear() {
        if (this.price < 900) {
        } else if (this.year < 2010){
            System.out.println("this notebook is old and to expensive");

        }


    }

}

