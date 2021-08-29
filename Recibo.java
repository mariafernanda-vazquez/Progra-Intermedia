//María Fernanda Vázquez 
//616683
//Programa que define el total a pagar
import java.io.*;
import java.util.*;
class Recibo{
   public static void main (String args[]){
   Scanner s=new Scanner (System.in);
   double mesAnterior, mesActual;
   double costo=0;
   double consumidos=0;
   System.out.println("¿Cuantos metros cubicos del mes anterior?");
   mesAnterior=s.nextFloat();
   System.out.println("¿Cuantos metros cubicos del mes actual?");
   mesActual=s.nextFloat();  
   consumidos=mesActual-mesAnterior;
   if(consumidos<=60)
      costo=15.00;
   else if(consumidos<=160)
      costo=(consumidos-60)*0.50+15;
   else if (consumidos<=260)
      costo=(consumidos-160)*.025+65;
   else 
      costo=(consumidos-260)*.015+67.5;
  System.out.println("Tu total es: "+ costo);
}
}