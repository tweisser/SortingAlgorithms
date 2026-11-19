package lgh.events;

public class MoveEvent extends SortEvent{
    int i;
    int j;

  public MoveEvent(int i, int j){
    this.i=i;
    this.j=j;
  }
  
}
