public class Person extends Figur {

    private final int mainBodyWidth = 10;
    private final int mainBodyHeight = 10;
    private final int legsWidth = 4;
    private final int legsHeight = 10;
    private final int headRadius = 6;
    private final int neckWidth = 4;
    private final int neckHeight = 4;
    private final int armsHeight = 8;
    private final int armsWidth = 3;

    public int getHeight() {
        return legsHeight + mainBodyHeight + (int)(headRadius*0.75) + armsHeight + neckHeight;
    }

    public int getWidth() {
        return (armsWidth*2 + mainBodyWidth)*factor;
    }
}
