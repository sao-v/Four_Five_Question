public class Is_palindrome {
    static boolean ispalindrome (int num){
        int a=num;
        int reversed_num =0;
        while(a>0){
            int last_digit= a%10;
            reversed_num=reversed_num*10+last_digit;
            a=a/10;
        }
    System.out.println(reversed_num);

        if(reversed_num==num){
            boolean b=true;
            return (b);
        }
        else {
            boolean b = false;
            return (b);
        }
    }
    public static void main(String[] args){
        System.out.println(ispalindrome(121));
    }
}
