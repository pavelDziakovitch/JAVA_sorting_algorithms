import java.util.Random;

public class exercise3_sorting_selection {

    public static void main(String[] args) {
    //Utils
        Random randomGen = new Random();

    //Vars
        int tempMemoryForSwitching;
        int posMin;
        int[] numbers = new int[10];

    //Fill Array
        for (int i = 0; i < numbers.length;i++){
            numbers[i] = randomGen.nextInt(200)-100;
        }
    //

    //Output unsorted Array
        printArray(numbers);
    //

    //SORT
        //FOR1: Runs through every Int in Array
        for(int i = 0; i < numbers.length-1;i++){
            posMin = i;
            //FOR2: Checks if there is any smaller number starting with next number in array --> i+1
            for(int j = i+1; j < numbers.length;j++){
                if (numbers[j] < numbers[i] && numbers[j] < numbers[posMin]){
                    posMin = j;
                }
            }
            //for better performance only swap when posMin has changed
            if(posMin != i) {
                //Save one of two int, which will we switched in a temp variable
                tempMemoryForSwitching = numbers[i];
                //switching min and starter-number
                numbers[i] = numbers[posMin];
                numbers[posMin] = tempMemoryForSwitching;
            }
        }
    //
        // Output sorted Array
        printArray(numbers);
        //

    }

    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
    }

}