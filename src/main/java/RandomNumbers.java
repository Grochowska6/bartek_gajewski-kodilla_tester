import java.util.Random;

public class RandomNumbers {
    public int getCountOfRandomNumber(int max) {

        Random random = new Random();

        int result = 0;
        int sum = 0;
        int max = 5000;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public int getMinMax() {
        int temp = 0;
        int min = 0;



        boolean True = true;
        while (True) {
            for (int i = 0; i < tenp.length; i++) {
                if (temp[i] == min) ;
                True = false;
            }
            min++;
        }
        int max = 30; True = true;
        while(True){
            for(int i = 0; i < temp.length; i++){
                if(temp[i] == max);
                True = false;
            }
            max--;
        }


}