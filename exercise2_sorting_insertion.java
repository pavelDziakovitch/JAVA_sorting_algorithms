import java.util.Random;

public class exercise2_sorting_insertion {

    public static void main(String[] args) {

        Random randomGen = new Random();
        int tempNumber;


    //Create and Fill Array
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length;i++){
            numbers[i] = randomGen.nextInt(1000);
        }
    //

    //Output unsorted String
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "  ");
        }
        System.out.println("");
    //

    //SORT

        for(int position = 0; position < numbers.length;position++ ){
            for(int currentPosition = position; currentPosition > 0 && numbers[currentPosition] < numbers[currentPosition-1];currentPosition--){
                tempNumber = numbers[currentPosition-1];
                numbers[currentPosition-1] = numbers[currentPosition];
                numbers[currentPosition] = tempNumber;
            }

            for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i] + "  ");
            }
            System.out.println("");
        }
    //

    // Output for sorted arrays
        for(int k = 0; k < numbers.length; k++){
            System.out.print(numbers[k] + "  ");
        }
    //

    }
}
