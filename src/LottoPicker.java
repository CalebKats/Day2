import java.util.Random;

public class LottoPicker {
    public static void main(String[] args){
        String nameOfIt = "Application started...";
        System.out.println(nameOfIt);
        Random random = new Random();


        int numberOfNumbersGenerated = 0;
        int total = 5;

        while(numberOfNumbersGenerated < total){
            int randomNumber = random.nextInt(30);
            System.out.println(randomNumber);
            numberOfNumbersGenerated = numberOfNumbersGenerated + 1;
        }
    }
}