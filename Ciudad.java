//María Fernanda Vázquez 
//616683
//Programa que define la clasificación del clima
import java.io.*;
import java.util.*;
class Ciudad{
   public static void main (String args[]){
   Scanner s=new Scanner (System.in);
   System.out.println("Ingrese le indice de contaminacion");
   short indice=s.nextShort();
   String clasificacion;
   if (indice<35)
      clasificacion="Agradable";
   else if (indice<=60)
      clasificacion="Desagradable";
   else 
      clasificacion="peligroso";
   System.out.println("La clasificacion es: "+clasificacion);
   }
   }
