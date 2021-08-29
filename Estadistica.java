import java.io.*;
import java.util.*;
class Estadistica{
  public static void main(String arg[]){
     String meses[]={"enero","febrero","marzo","abril","mayo","junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
     short horas[][]=new short[5][12];
     horas=Estadistica.llenarA(meses);
     short totalMeses[]=new short[6];
     totalMeses=Estadistica.totalMeses(horas);
     short totalAnual[]=new short[6];
     totalAnual=Estadistica.totalAnual(horas);
     Estadistica.Desplegar(totalAnual, totalMeses, horas, meses);
  }
  public static short[][] llenarA(String meses[]){
     short horas[][]=new short[5][12];
     for (byte i=0; i<5; i++){
     System.out.println("Curso "+(i+1));
      for (byte j=0; j<12; j++){
      System.out.println("Horas en el mes de " +meses[j]);
      Scanner s = new Scanner(System.in);
      short resp=s.nextShort();
      horas[i][j]=resp;
      }
      }
     return horas;
  }
  public static short[] totalMeses(short horas[][]){
     short suma=0;
     short totalMeses[]=new short[12];
      for (byte i=0; i<12; i++){
      suma=0;
       for (byte j=0; j<5; j++){
       suma+=horas[j][i];
       }
       totalMeses[i]=suma;
       }
       return totalMeses;
   }
       
   public static short[] totalAnual(short horas[][]){
   short suma=0;
     short totalAnual[]=new short[5];
      for (byte i=0; i<5; i++){
      suma=0;
       for (byte j=0; j<12; j++){
       suma+=horas[i][j];
       }
        
       totalAnual[i]=suma;
       }
       return totalAnual;
       }
    public static void Desplegar(short totalAnual[], short totalMeses[], short horas[][], String meses[]){
       for (byte i=0; i<5; i++){
       System.out.println("curso "+(i+1)+" horas: "+totalAnual[i]);
       }
       System.out.println();
       for (byte i=0; i<12; i++){
       System.out.println(meses[i]+" horas: "+totalMeses[i]);  
       }
    }
}


