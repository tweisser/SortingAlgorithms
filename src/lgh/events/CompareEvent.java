package lgh.events; 
import lgh.model.DataSet;
public class CompareEvent extends SortEvent{
    private int i ;
    private int j;
    private boolean inorder;
    public CompareEvent(int i, int j, boolean good ){
    this.i=i;
    this.j=j;
    this.inorder = good; }

    public DataSet apply(DataSet data){
  return data;
}


}
