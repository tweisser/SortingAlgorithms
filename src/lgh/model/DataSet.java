package lgh.model;

import lgh.events.SwapEvent;

public class DataSet {

    private int[] data = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int length = 10;
    private String name;

    public DataSet(int[] data, String name) {
        if (data != null) {
            this.data = data;
            this.length = data.length;
        }
        this.name = name;
    }

    public SwapEvent swap(int i, int j) {
        int temporar = data[j];
        data[j] = data[j + 1];
        data[j + 1] = temporar;

        return new SwapEvent(i,j);
    }

    public DataSet clone(){
        return new DataSet(data.clone(), name);
    }

    public int get(int i){
        return data[i];
    }

    public int getLength(){
        return length;
    }
}
