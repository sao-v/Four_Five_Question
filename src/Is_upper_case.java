public class Is_upper_case {
    static void isUpperCase (char a){
        if(Character.isUpperCase(a)) {
            System.out.println("The input is in upper case");
        }
        else if(Character.isLowerCase(a)){
            System.out.println("The input is in Lower Case");
            }
        else
        {
            System.out.println("The input is not a alphabet");
        }
    }public static void main(String[] args){
        isUpperCase('A');
    }

}
