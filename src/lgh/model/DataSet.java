package lgh.model;

public class DataSet {

    private int[] data = {0,1,2,3,4,5,6,7,8,9};
    private int length = 10;
    private String name;

    public DataSet(int[] data, String name){
        if(data != null){
            this.data = data;
            this.length = data.length;
        }
        this.name = name;
    }
    
}

