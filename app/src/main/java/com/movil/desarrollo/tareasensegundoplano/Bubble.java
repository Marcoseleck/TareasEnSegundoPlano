package com.movil.desarrollo.tareasensegundoplano;

import android.util.Log;

/**
 * Created by adrian_servin on 28/04/15.
 */
public class Bubble {

    private float []datos;

    public String sort(float []datos){
        String aux="";

        this.datos=datos;
        int left = 0;
        int right = datos.length-1;
        bubbleSort(left,right);
       for (int i=0;i<this.datos.length;i++){
           aux+=this.datos[i];
       }

        return aux;
    }

    private void bubbleSort(int left,int right){

        for(int i=right;i>1;i--){
            for(int j=left;j<i;j++){
                if(datos[j] > datos[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }

    public void swap(int left,int right){
        float temp = datos[left];
        datos[left] = datos[right];
        datos[right] = temp;

    }


}
