package com.movil.desarrollo.tareasensegundoplano;


import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Marcos on 5/3/2015.
 */
public class Hilos {
int opcion;
       //METODO CON PARAMETROS DE LA OPCION Y ARREGLO
        public  void miThread(final int opcion, final float [] datos){
            this.opcion=opcion;
/*SE CREA UN HILO PARA PODER DETENRLO UNOS SEGUNDOS Y SABER IDENTIFICAR CUANDO EMPIEZA EL METODO DE ORDENACION*/
            Thread t = new Thread(){
                public void run(){
                    /*Segun la opcion que obtengamos de la invocacion del metodo*/
                    switch (opcion) {

                       /*METODO BURBUJA*/ case 1:
                            Bubble b=new Bubble();
                           b.sort(datos);
                            break;

                        case 2:Merge m=new Merge();

                            break;
                        case 3:
                            MyQuickSort q=new MyQuickSort();
                            q.sort(datos);
                            break;

                    }
                        

                }
            };
            t.start();
        }


}