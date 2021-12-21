import java.util.Random;

public class exercise6_merge_sort {

    public static void main(String[] args) {
        //UTIL
        Random randomGen = new Random();

        //VAR
        int[] numbers = new int[1000];

        //FILL STRING
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGen.nextInt(200) - 100;
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n\n");

        //Initialise recursive method
        divideArray(numbers, 0, numbers.length-1);

        //PRINT ARRAY
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


    public static void divideArray(int[] numbers, int front, int back){
        //if front == back --> one number left (1 index)
        if (front < back) {
            int mid = (front+back)/2;
            divideArray(numbers,front, mid); //recursion
            divideArray(numbers,mid+1, back); //recursion
            sortAndMerge(numbers,front,back,mid); //sorting out of boths halfs and overwrite array at end
        }
    }
    
    public static void sortAndMerge(int[] numbers, int front, int back, int mid){

        //Geenrate Array : Size --> how many elements needed
        int[] tempArray = new int[back-front+1];

        //left / right pos for running trought both halfs
        int leftPos = front;
        int rightPos = mid+1;
        int counterTempPos = 0;//counter for temp array

        //sort as long as one half is sorted in
        while(leftPos <= mid && rightPos <= back){
            if(numbers[leftPos] <= numbers[rightPos]){
                tempArray[counterTempPos] = numbers[leftPos];
                leftPos++;
            }
            else{
                tempArray[counterTempPos] = numbers[rightPos];
                rightPos++;
            }
            counterTempPos++;
        }

        //when one half is sorted in temp array, just insert the leftover other half
        while(leftPos <= mid){
            tempArray[counterTempPos] = numbers[leftPos];
            counterTempPos++;
            leftPos++;
        }

        while(rightPos <= back){
            tempArray[counterTempPos] = numbers[rightPos];
            counterTempPos++;
            rightPos++;
        }

        //overwritte numbers at range front to back with temp array values
        for (int i = front, j=0; i <= back; i++, j++) {
            numbers[i] = tempArray[j];
        }
    }
}
