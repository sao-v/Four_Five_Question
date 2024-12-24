import java.awt.*;

public class Reverse_Num {
    static int reversed_Num(int num){
        int reversed = 0;
        while(num!=0){
            int last_digit= num%10;// Extracting last digit
            reversed= reversed*10+last_digit;
            num=num/10;// Removing last digit
        }
        return (reversed);
    }
    public static void main(String[] args){
        System.out.println(reversed_Num(12345));

    }
}
