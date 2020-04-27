import java.util.Random;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){

            System.out.println(randomNum(1, 6));
        }


        }

    public static int randomNum(int bottom, int top){

        Random rand = new Random();

        return rand.nextInt(top) + bottom;


    }

}
