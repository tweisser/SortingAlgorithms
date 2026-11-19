package lgh.events;
import lgh.model.DataSet;

public class SwapEvent extends SortEvent{
  int i;
  int j;

  public SwapEvent(int i, int j){
    this.i=i;
    this.j=j;
  }

public DataSet apply(DataSet data){
  data.swap(i,j);
  return data;
}
}