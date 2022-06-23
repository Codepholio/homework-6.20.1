import java.util.Scanner;

public class homework620 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println(" Please enter an integer between 1 and 20: ");
        int n = input.nextInt();

        while(n<0 && n>20){
            System.out.println("Please enter an integer between 1 and 20: ");
            n = input.nextInt();

        }
        int [] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
           arr[i]= (int) Math.pow(2,i);
        System.out.println(arr[i] + " ");}
    }
}
