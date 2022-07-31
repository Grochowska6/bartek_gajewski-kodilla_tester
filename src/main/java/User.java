public class User {

    double age;
    double height;
    String name;

    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkAge() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller  than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public void checkHeight() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller  than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");

            }
        }
    }
}

