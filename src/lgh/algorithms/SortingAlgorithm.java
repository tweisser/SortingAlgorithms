package lgh.algorithms;

import lgh.model.DataSet;
import lgh.playback.EventRecorder;

public abstract class SortingAlgorithm {
  protected Boolean sorted = false;
  protected DataSet data; 
  protected EventRecorder recorder = new EventRecorder();

  public EventRecorder sort(DataSet data) {
    return null;
  }

} 
