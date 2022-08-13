
    import java.lang.Math;
    import java.util.Scanner;

    public class FermatsTheorem {


    public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    System.out.println("	Enter First Number");
    double num1 = s.nextDouble();
    System.out.println("Enter Second Number");
    double num2 = s.nextDouble();
 
    System.out.println("Enter Exponent");
    double expo = s.nextDouble();


    double v =  FLaw(num1,num2,expo);
    double k = FLawRes(v, expo);

    System.out.println("The answer is " + v);
    System.out.println("Your answer rooted by your exponent is " + k);
    Law(v, Pow(k, expo));
  
    
    }

    public static double Pow(double a, double b) {
    double res = Math.pow (a, b);
    return (res);
    }

    public static double FLaw(double frst, double scnd, double expo) {
    double D1 = Pow(frst, expo);
    double D2 = Pow(scnd, expo);
   
    
    return (D1 + D2);
    
     }
  
     public static double FLawRes(double res, double base) {
     
     double D3 = Pow(res, 1/base);
     return D3;
      }
     
     public static void Law(double v, double k) {
       if (v==k) {
     System.out.println(" Fermatslaw works.");
      } else {
     System.out.println("Fermatslaw doesnt work");
    }
   }
 }

