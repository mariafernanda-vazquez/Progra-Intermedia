//María Fernanda Vázquez
//616683
/*Realiza un programa que dibuje un triángulo con asteriscos como se presenta en la imagen, considerando que el usuario solo puede ingresar un valor 
superior 2  e impar, y en caso contrario debe de seguir pidiéndolo, hasta que sea el valor correcto. Este número representará la base  y 
la altura del triángulo del triángulo para que el programa genere el triángulo completo utilizando ciclos no solo con System.out.println y 
optimizado. Checa bien tu programa analizando cómo deben ser los números para que puedas formar el triángulo correcto. Utilice métodos para 
solucionar su problema y realice su diagrama de métodos con el paso de parámetros correcto.*/
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
  System.out.println("Ingresa número");
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
  
  
