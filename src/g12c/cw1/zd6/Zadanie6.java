package g12c.cw1.zd6;


import java.util.Random;

public class Zadanie6 {

    public static void main(String[] args){

        int[] randomowaLista = new int[10];

        Random generator = new Random();

        for(int i=0; i<randomowaLista.length; i++){

            randomowaLista[i] = (int)(2+Math.random()*10)*50;
        }
        
    sort(randomowaLista);

    }

    public static void sort (int[]arr){
        int temp;
        int zmiana = 1;
        while(zmiana >0){
            zmiana =0;
            for(int i=1; i<arr.length; i++){
                if(arr[i-1]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    zmiana++;
                }
            }
        }
        for(int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
