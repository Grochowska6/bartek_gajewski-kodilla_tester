public class UserBartek_27 {
    public static void main(String[] args) {

    }

    public class User {
        int age;
        String name;
        private int[] users;

        private int size;

        public User(String name, int age) {
            this.age = age;


            User anna = new User("Anna", 20);
            User betty = new User("Betty", 33);
            User carl = new User("Carl", 58);
            User david = new User("David", 13);
            User eva = new User("Eva", 18);
            User frankie = new User("Frankie", 45);

            User[] users = {anna, betty, carl, david, eva, frankie};
        }



            public User() {
                this.users = new int[6];
                this.size = 0;
            }


            public float average() {
                float sum = 0;
                if (this.size  == 0) {
                    return 0;
                } else {
                    for (int i = 0; i < this.size i++) {
                        sum = sum + this.age[i];
                    }
                    return sum / this.size;
                }
            }
        }


    }

