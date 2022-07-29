public class Application {

    double age;
    double height;

    String name;

    public static void main(String[] args) {
    }
    public User(double age, double height){
        this.age = age;
        this.height = height;
        this.name = name;

    }
    public void CheckAge() {
        if(name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older then 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

}










