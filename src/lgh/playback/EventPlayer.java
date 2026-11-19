package lgh.playback;

import java.util.ArrayList;

import lgh.events.CompareEvent;
import lgh.events.SortEvent;
import lgh.model.DataSet;

public class EventPlayer{
    /**
     * This class processes the events from eventrecorder and lets the gui fetch its events 
     * @param events
     */
    public int position = 0; 
    public EventRecorder recorder = new EventRecorder(); 
    public DataSet data = new DataSet(); 

    public EventPlayer(EventRecorder events){
        this.recorder = events; 
    }; 

    public DataSet next(){
        SortEvent event = recorder.get(position); 
        data = event.apply(data.clone()); 
        position++;
        return data;
    }
}
