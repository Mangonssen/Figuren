import java.awt.Graphics;

abstract class Figur {

    protected static final int factor = (int) (Math.random() * ((16-7) + 1)) + 7;
    private int offsetLeft;
    private int maxHeightPanel;


    abstract int getHeight();

    abstract int getWidth();

    abstract void paintOnGraphics(Graphics g);
    
    public void paintOnGraphics(Graphics g, int offsetLeft, int maxHeightPanel) {
        this.offsetLeft = offsetLeft;
        this.maxHeightPanel = maxHeightPanel;
        paintOnGraphics(g);
    }
}
