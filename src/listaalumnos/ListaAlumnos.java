/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaalumnos;
import java.util.Scanner;
/**
 *
 * @author Gama
 */
public class ListaAlumnos {
    //Metodo para invertir cadena de caracteres
    public String invertir(String nombre){
        String inverso;
        inverso="";
        for(int i=nombre.length();i>0;i--){
              inverso=inverso+nombre.substring(i-1,i);   
          }
        return inverso;
    }
    //Metodo para ordenar la cadena invertida.
    public String inversOrdenado(String inverso){
        String nombreInverso, espacio;
        String [] cadenaSeparada; //
        espacio=" ";
        cadenaSeparada=inverso.split(" ");
        nombreInverso="";
          for(int i=cadenaSeparada.length-1;i>=0;i--){
                nombreInverso=nombreInverso+cadenaSeparada[i]+espacio;
        }
        return nombreInverso;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        //Declarar variables e inicializar.
        String nombre, inverso, inversOrdenado, lista, puntos, saltoLinea, respuesta;
        saltoLinea="\n";
        puntos=":";
        ListaAlumnos lis=new ListaAlumnos();//Crear objeto de la clase para hacer llamado de los metodos.
        Colas cola=new Colas();// crear objeto de la clase Colas para poder llamar a los metodos de dicha clase.
        
        do{
            System.out.print("Introducir nombre:");
            nombre=teclado.nextLine();
            inverso=lis.invertir(nombre);// invertir la cadena de caracteres (metodo invertir) y guardamos en variable "inverso".
            inversOrdenado=lis.inversOrdenado(inverso);// Ordenamos las palabra (metodo inversOrdenado) y guardamos en "InversOrdenado".
            lista=nombre+puntos+inversOrdenado+saltoLinea;// Guardamos en "lista" la cadena.
            cola.insertar(lista);// Agregamos en una lista tipo cola el primer nombre ya listo(lista).
                System.out.print("¿Desea invertir otro nombre?:");
                respuesta=teclado.nextLine();     
        }while("si".equalsIgnoreCase(respuesta));
        
        cola.imprimir();
        
        // TODO code application logic here
    }
    
}
