//Mar�a Fernanda V�zquez
//616683
/*Realiza un programa que dibuje un tri�ngulo con asteriscos como se presenta en la imagen, considerando que el usuario solo puede ingresar un valor 
superior 2  e impar, y en caso contrario debe de seguir pidi�ndolo, hasta que sea el valor correcto. Este n�mero representar� la base  y 
la altura del tri�ngulo del tri�ngulo para que el programa genere el tri�ngulo completo utilizando ciclos no solo con System.out.println y 
optimizado. Checa bien tu programa analizando c�mo deben ser los n�meros para que puedas formar el tri�ngulo correcto. Utilice m�todos para 
solucionar su problema y realice su diagrama de m�todos con el paso de par�metros correcto.*/
import java.io.*;
import java.util.*;
class Triangulo{
  public static void main(String arg[]){
  short num=Triangulo.PedirN();
  Triangulo.DespT(num);
  }
  public static short PedirN(){
  Scanner s=new Scanner(System.in);
  short num=0;
  do{
  //Se pide el numero
  System.out.println("Ingresa n�mero");
  num=s.nextShort();
  if((num<=2) || (num%2==0))
  System.out.println("No se puede ingresar ese numero, tiene que ser mayor a dos o impar");
  //Validacion de numero                                                                                  
  }while((num<=2) || (num%2==0));
  return num;
  }
  public static void DespT(short num){
  //Se crean altura
  for(short i=1; i<=num;i++){
  //se crean base
   for(short j=1;j<=i;j++){
   System.out.print("*");
   }
   System.out.println();
   }
   }
   }
  
  
