/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_ioes_pgjc;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class IO_ES {
    
    public static int leerInteger(){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                try{
                  entero = a.nextInt();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
    
    public static int leerInteger(String mensaje){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                System.out.println(mensaje);
                try{
                  entero = a.nextInt();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
    
    public static int leerInteger(String mensaje, int min){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                System.out.println(mensaje);
                try{
                    entero = a.nextInt();
                    if (entero >= min){    
                        bln=true;
                    }else {
                        System.out.println("Numero introudcido menor al especificado por parametro");
                    }
                  
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
    
    public static int leerInteger(String mensaje, int min, int max){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                System.out.println(mensaje);
                try{
                    entero = a.nextInt();
                    if (entero >= min && entero <= max){
                        bln=true;
                    }else{
                        System.out.println("Numero introudcido es menor o mayor que el indicado por parametro");
                    }
                  
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
     public static long leerEnteroLargo(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       long enteroLargo = 0 ;
            do{
                try{
                  enteroLargo = c.nextLong();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return enteroLargo;    
   }
    
     public static long leerEnteroLargo(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       long enteroLargo = 0 ;
            do{
                System.out.println(mensaje);
                try{
                  enteroLargo = c.nextLong();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return enteroLargo;    
   }
     
     public static float leerReal(){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       float real = 0;
            do{
                try{
                  real = a.nextFloat();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return real;
   }
    
    public static float leerReal(String mensaje){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       float real = 0;
            do{
                System.out.println(mensaje);
                try{
                  real = a.nextFloat();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return real;
   }
    
    public static float leerReal(String mensaje, float min){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       float real = 0;
            do{
                System.out.println(mensaje);
                try{
                    real = a.nextFloat();
                    if (real >= min){    
                        bln=true;
                    }else {
                        System.out.println("Numero introudcido menor al especificado por parametro");
                    }
                  
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return real;
    }
    
    public static double leerRealLargo(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       double realLargo = 0 ;
            do{
                try{
                  realLargo = c.nextDouble();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return realLargo;    
   }
    
     public static double leerRealLargo(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       double realLargo = 0 ;
            do{
                System.out.println(mensaje);
                try{
                  realLargo = c.nextDouble();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return realLargo;    
   }
     
   public static String leerCadena(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String cadena = "" ;
            do{
                try{
                  cadena = c.next();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return cadena;    
   }
   
   public static String leerCadena(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String cadena = "" ;
            do{
                System.out.println(mensaje);
                try{
                  cadena = c.next();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return cadena;    
   }
   
   public static String leerCadena(String mensaje, int longitud){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String cadena = "" ;
       int comparacion;
            do{
                System.out.println(mensaje);
                try{
                  cadena = c.next();
                  comparacion = cadena.length();
                    if (comparacion == longitud) {
                        bln = true;
                    }else{
                        System.out.println("La longitud de la cadena no es la indicada");
                    }
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return cadena;    
   }
   
   public static char leerCaracter(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String cadena ;
       char caracter = 'a' ;
            do{
                try{
                  cadena = c.next();
                  caracter = cadena.charAt(0);
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return caracter;    
   }
   
   public static char leerCaracter(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String cadena;
       char caracter = 'a' ;
            do{
                System.out.println(mensaje);
                try{
                  cadena = c.next();
                  caracter = cadena.charAt(0);
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return caracter;    
   }
   
   public static boolean leerBooleano(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       boolean b = true;
            do{
                try{
                  b = c.nextBoolean();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return b;    
   }
   
   public static boolean leerBooleano(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       boolean b = true;
            do{
                System.out.println(mensaje);
                try{
                  b = c.nextBoolean();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return b;    
   }
   
   public static void escrbir(String mensaje){
                System.out.print(mensaje);
   }
   
  public static void escrbirLn(String mensaje){
                System.out.println(mensaje);
                 
   }
   
    
}
