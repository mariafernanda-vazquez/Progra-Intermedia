//Mar�a Fernanda V�zquez 
//616683
//Programa que menciona la calificaci�n de un promedio en letra (A, B, C, D, F)
import java.io.*;
import java.util.*;
class Promedio{
   public static void main (String args[]){
   Scanner x=new Scanner (System.in);
   double examen1;
   double examen2;
   double examen3;
   double promedio;
   char promedioLetra;
   System.out.println("�Cu�l es la calificaci�n del examen 1? ");
   examen1=x.nextDouble();
   if (examen1>100)
      System.out.println("No es v�lido");
   System.out.println("�Cu�l es la calificaci�n del examen 2? ");
   examen2=x.nextDouble();
   if (examen2>100)
      System.out.println("No es v�lido");
   System.out.println("�Cu�l es la calificaci�n del examen 3? ");
   examen3=x.nextDouble();
   if (examen3>100)
      System.out.println("No es v�lido");
   promedio=(examen1+examen2+examen3)/3;
   if (promedio>=90 && promedio <=100)
      promedioLetra='A';
   else if (promedio>=80 && promedio<=89)
      promedioLetra='B';
   else if (promedio>=70 && promedio<=79)
      promedioLetra='C';
   else if (promedio>=60 && promedio<=69)
      promedioLetra='D';
   else 
      promedioLetra='F';
   System.out.println("Calificaci�n: "+promedioLetra);
}
}
  