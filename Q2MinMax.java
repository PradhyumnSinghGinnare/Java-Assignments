/* Que 2. Write a java program to find minimum and maximum of given n number without using any explicit array. */

public class Q2MinMax {
    public static void main(String s[]) {
        int min = Integer.parseInt(s[0]);
        int max = Integer.parseInt(s[0]);
        for(int i=0; i<s.length; i++){
            int temp = Integer.parseInt(s[i]);
            if(temp > max){
                max = temp;
            } else if(temp < min){
                min = temp;
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
