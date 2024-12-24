public class Check_Num {
    static int check_num(int a) {
        if (a < 0) {
            System.out.println(a + " is negative integer ");
        }
        if (a > 0) {
            System.out.println(a + " is positive intger ");
        }
        if (a == 0) {
            System.out.println(a + " is zero");

        }
        return 0;
    }

    public static void main(String[] args) {
        int b = check_num(10);
    }
}