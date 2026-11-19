package lgh.gui.bardiagram;

import java.awt.Color;

public class Bar {
    private int height, value;
    private int width;
    private int nwx;
    private int nwy;
    private Color color;

    public Bar() {}
    public Bar(int height, int width, int value, int nwx, int nwy)
    {
        this.height = height;
        this.width = width; 
        this.value = value; 
        this.nwx = nwx;
        this.nwy = nwy;
    }

}
