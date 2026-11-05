//package model;

public class DataSet {

    private int[] data;
    private int length;
    private String name;

    public DataSet(int[] data, String name){
        if(data == null){
            int[] i = {0,1,2,3,4,5,6,7,8,9};
            this.data = i;
            this.length = 10;
        } else{
            this.data = data;
            this.length = data.length;
            this.name = name;
        }
    }
    
}

