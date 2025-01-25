import java.util.*;
public class Largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest = 0;
        if (num1 >= num2){
            if(num1 >= num3){
                largest = num1;
            }else{
                largest = num3;
            }
        }else{
            if(num2 >= num3){
                largest = num2;
            }else{
                largest = num3;
            }
        }
        System.out.println("Largest number: "+largest);
    }
}




