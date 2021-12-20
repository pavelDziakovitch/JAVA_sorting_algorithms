import java.util.Random;

public class exercise5_divide_and_conquer {

    public static void main(String[] args) {
    //UTIL
        Random randomGen = new Random();

    //VAR
        int[] numbers = new int[10];

    //FILL STRING
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGen.nextInt(200) - 100;
        }

    //PRINT MAX-VALUE, which we get from getMax
        System.out.println("MAX-VALUE: " + getMax(numbers,0,numbers.length));
    }

    public static int getMax(int[] numbers, int front, int back) {
        int mid = (front + back)/2;
        int max1 = numbers[front];
        int max2 = numbers[mid];

        if(back - front > 2) {
            for (int i = front; i < back; i++) {
                if(i < mid && numbers[i] > max1){
                    max1 = numbers[i];
                }
                else if(i >= mid && numbers[i] > max2){
                    max2 = numbers[i];
                }
            }
            output_for_better_view(numbers, max1,max2,front, back);
            if (max1 >= max2) {
                return getMax(numbers, front, mid);
            } else {
                return getMax(numbers, mid, back);
            }
        }
        System.out.println("ENDE");
        output_for_better_view(numbers, max1,max2,front, back);
        if(max1 >= max2){
            return max1;
        }
        return max2;
    }

    //FOR BETTER OUTPUT TO CHECK CORRECTNESS
    public static void output_for_better_view(int[] numbers, int max1, int max2, int front, int back){
        for (int i = front; i < back; i++){
            System.out.print(numbers[i] + "  ");

        }
        System.out.println();
        System.out.println(("MAX1: " + max1 + " MAX2: " + max2));
        System.out.println(("FRONTINDEX: " + front + " BACKINDEX: " + (back-1)));
        System.out.println();
    }
}
