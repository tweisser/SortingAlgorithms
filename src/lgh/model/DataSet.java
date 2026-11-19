package lgh.model;

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
    public void swap(int i, int j) {
        int temporar = data[j];
        data[j] = data[i];
        data[i] = temporar;
    }
    public void move(int i, int j){
        int temporar = data[i];
        for(int a = i; a<j; a++){
            data[a] = data[a+1];}
            data[j] = temporar;

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
