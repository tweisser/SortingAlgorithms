package lgh.playback;

import java.util.ArrayList;

import lgh.events.SortEvent;

public class EventRecorder {
  private ArrayList<SortEvent> events = new ArrayList<>();


  public void add(SortEvent event) {
    events.add(event);
  }


}
