// import javax.swing.JSpinner.NumberEditor;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(236));
        // int number = 4;
        // int finishNumber = 20;
        // int evenCout = 0;
        // int oddCout = 0;

        // while (number <= finishNumber) {
        //     number++;
        //     if (!isEvenNumber(number)) {
        //         oddCout++;
        //         continue;
        //     }
        //     System.out.println("Even number: " + number);
        //     evenCout++;
        //     if (evenCout >= 5 ){
        //         break;
        //     }
        // }
        // System.out.println("Total even numbers found " + evenCout);
        // System.out.println("Total odd numbers found " + oddCout);
    }
    // public static boolean isEvenNumber(int number){
    //     if (number % 2 == 0) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }
    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        while (number > 9){
            sum += (number % 10);
            number /= 10;
        }
        sum += number;
        return sum;

    }
}