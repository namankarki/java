import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        //153=1^3+5^3+3^3-> arm strong number
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int Orginal_number = sc.nextInt();
        int number = Orginal_number;
        int remainder, result=0;

        while(Orginal_number!=0){
            remainder= Orginal_number%10;
            result+= Math.pow(remainder, 3);
            Orginal_number /= 10;
        }

        if(result==number){
            System.out.println(number + " is an ArmStrong Number");
        }
        else{
            System.err.println(number + " is not a ArmStrong Number");
        }

        sc.close();
    }

}
