import java.io.*;
import java.text.*;
import java.util.*;
class Fraccion {
   public static void main(String arg[]) {
      double num=Fraccion.pedirN();
      double den=Fraccion.pedirD();
      double division=Fraccion.dividir(num,den);
      Fraccion.desplegar(division);
      }
    public static double pedirN(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingresa el valor del numerador: ");
      double num=s.nextDouble();
      return num;
      }
    public static double pedirD(){
      Scanner s=new Scanner (System.in);
      System.out.println("Ingresa el valor del denominador: ");
      double den=s.nextDouble();
      while (den==0){
         System.out.println("Intenta no ingresar 0, intenta de nuevo: ");
         den=s.nextDouble();}
      return den;
      }
    public static double dividir(double num, double den){
      double division=num/den;
      return division;
      }
    
    public static void desplegar(double division){
      System.out.println("El resultado de la division es: " + division);
    }
}
    
   