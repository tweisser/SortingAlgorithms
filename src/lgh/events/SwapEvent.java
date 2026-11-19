package lgh.events;

public class SwapEvent extends SortEvent{
  int i;
  int j;

  public SwapEvent(int i, int j){
    this.i=i;
    this.j=j;
  }
}
