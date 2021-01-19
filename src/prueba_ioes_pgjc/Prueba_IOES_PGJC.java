/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_ioes_pgjc;

/**
 *
 * @author juanc
 */
public class Prueba_IOES_PGJC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Llamadas a metodos de la clase IO_ES para comprobar su funcionamiento
        
        //leerInteger
        IO_ES.leerInteger();
        IO_ES.leerInteger("Escribe un numero entero");
        IO_ES.leerInteger("Escribe un numero entero", 1);
        IO_ES.leerInteger("Escribe un numero entero", 1, 10);
        
        //leerEnteroLargo
        IO_ES.leerEnteroLargo();
        IO_ES.leerEnteroLargo("Introduce un numero entero largo");
        
        //leerReal
        IO_ES.leerReal();
        IO_ES.leerReal("Introduce un numero real");
        IO_ES.leerReal("Introduce un numero real", (float)(10.5));
        
        //leerRealLargo
        IO_ES.leerRealLargo();
        IO_ES.leerRealLargo("Introduce un numero real largo");
        
        //leerCadena
        IO_ES.leerCadena();
        IO_ES.leerCadena("Introduce una cadena");
        IO_ES.leerCadena("Introduce una cadena" , 9 );
        
        //leerCaracter
        IO_ES.leerCaracter();
        IO_ES.leerCaracter("Introduce una caracter o una cadena de la cual se coge el primer caracter de esta");
        
        //leerBooleano
        IO_ES.leerBooleano();
        IO_ES.leerBooleano("Introduce true o false");
        
        //escribir
        IO_ES.escrbir("Mensaje a mostrar(print)");
        IO_ES.escrbirLn("Mensaje a mostrar(printLn)");
        
    }
    
}
