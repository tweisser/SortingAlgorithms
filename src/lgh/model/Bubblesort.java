package lgh.model;

public class Bubblesort {
    
public void bubbleSort(int[] liste) {
        int n = liste.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (liste[j]>liste[j+1]){
                    int temporar = liste[j];
                   liste[j] = liste[j+1];
                    liste[j+1] = temporar;}
            }
        }
       }
    



}
