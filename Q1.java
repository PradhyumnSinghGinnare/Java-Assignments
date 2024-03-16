/* Que 1. Write a program to accept n number from command line and display the sum of queue of each number. */

public class Q1{
    public static void main(String s[]) {
        int sum = 0;
        for(int i=0; i<s.length; i++){
            sum += Integer.parseInt(s[i]);
        }
        System.out.println("Sum : " + sum);
    }
}
