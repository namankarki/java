import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int Original_Number = sc.nextInt();

    int number= Original_Number, reversed_number=0, remainder;

    while(number!=0){
        remainder= number%10;
        reversed_number= reversed_number*10 + remainder;
        number= number/10;
    }

    if (Original_Number==reversed_number){
        System.out.println("The number is Palidrome");
    }
    else{
        System.out.println("The number is not Palindrome");
    }

    sc.close();
        
    }





}
