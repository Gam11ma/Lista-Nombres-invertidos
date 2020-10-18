/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaalumnos;

/**
 *
 * @author Gama
 */
public class Colas {
    class Nodo {
        String info;
        Nodo sig;
    }
    
    Nodo raiz,fondo;
    
    Colas() {
        raiz=null;
        fondo=null;
    }
    
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (String info)
    {
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado");
        while (reco!=null) {
            System.out.print(reco.info);
            reco=reco.sig;
        }
        System.out.println();
    }
}
    



