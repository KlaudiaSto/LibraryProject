package exercise.day1;

public class exercise11 {

    public static void main (String [] args){

        int n = 123;
        int sum = 0;
        if (n > 9){
            while (n != 0){
                sum += n % 10;
                n /= 10;
            }
        }
        System.out.print(sum);

    }
}
