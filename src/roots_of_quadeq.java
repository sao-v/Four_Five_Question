import java.util.Scanner;
import java.lang.Math;
public class roots_of_quadeq {
    static int discremenat(int a, int b, int c){
        int dis=(b*b)-4*a*c;
        return (dis);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of cofficient 1");
        int coff_1= sc.nextInt();
        System.out.println("Enter value of cofficient 2");
        int coff_2= sc.nextInt();
        System.out.println("Enter value of constant");
        int const_= sc.nextInt();

        int dis = discremenat(coff_1,coff_2,const_);
        if(dis>0){
            int root1=(int)((-coff_1+Math.sqrt(dis))/2*coff_1);
            int root2=(int)((-coff_1-Math.sqrt(dis))/2*coff_1);
            System.out.println("The Discreminent is greater then zero, Equation has two real roots: "+ root1+" and"+root2);
        }
        if (dis<0) {

            System.out.println("The Discreminent is lesser then zero, Equation has two imaginary roots: "+'('+'-'+coff_1+'+'+"\u221A"+dis+'i'+')'+'/'+2*coff_1+"and"+'('+'-'+coff_1+'-'+"\u221A"+dis+'i'+')'+'/'+2*coff_1);
        }
        if (dis==0){
            int root=-coff_2/(2*coff_1);
            System.out.println("The Discreminent is equal to zero, Equation has one real roots: "+root);
        }
    }

}
