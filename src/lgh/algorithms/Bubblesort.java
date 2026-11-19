package lgh.algorithms;
import lgh.events.CompareEvent;
import lgh.events.SwapEvent;
import lgh.model.DataSet;
import lgh.playback.EventRecorder;
public class Bubblesort extends SortingAlgorithm{
    public Bubblesort(DataSet data){
        this.data = data.clone(); 
    }    
    public EventRecorder sort() {      
        int n = data.getLength();   
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (data.get(j)>data.get(j+1)){
                    recorder.add(new CompareEvent(j,j+1, false));
                    recorder.add(new SwapEvent(j,j+1));
                    data.swap(j,j++);}
                else{recorder.add(new CompareEvent(j,j+1,true));}}}
    return recorder;}}
