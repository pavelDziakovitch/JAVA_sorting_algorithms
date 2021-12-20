import java.util.Random;

public class exercise4_sorting_bubble {

    public static void main(String[] args) {

        //Utils
        Random randomGen = new Random();

        //Vars
        int tempMemoryForSwitching;
        int[] numbers = new int[5000];
        boolean changed = true;

        //Fill Array
        for (int i = 0; i < numbers.length;i++){
            numbers[i] = randomGen.nextInt(200)-100;
        }
        //

        //Output unsorted String
        for (int k : numbers) {
            System.out.print(k + "  ");
        }
        System.out.println("");
        //

        //SORT
        for (int i = numbers.length;i > 1 && changed;i--){
            changed = false;
            for(int j = 0; j < i-1; j++){
                if(numbers[j+1] < numbers[j]) {
                    tempMemoryForSwitching = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempMemoryForSwitching;
                    //marks phase as changed, when in a phase nothing changed, than the array is sorted
                    changed = true;
                }
            }
        }
        //

        //Output for sorted arrays
        for (int number : numbers) {
            System.out.print(number + "  ");
        }
        System.out.println("");
        //
    }
}
