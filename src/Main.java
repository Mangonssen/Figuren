import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) throws Exception {


        int spaceInBetweenFigures = (int) (Math.random() * ((15-5) + 1)) + 5;



      
        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        Cat catThree = new Cat();
        Cat catFour = new Cat();
        Cat catFive = new Cat();

        Person personOne = new Person();
        Person personTwo = new Person();
        Person personThree = new Person();
        Person personFour = new Person();
        Person personFive = new Person();


        ArrayList<Figur> figures = new ArrayList<Figur>();

        figures.add(catOne);
        figures.add(catTwo);
        figures.add(catThree);
        figures.add(catFour);
        figures.add(catFive);
        figures.add(personOne);
        figures.add(personTwo);
        figures.add(personThree);
        figures.add(personFour);
        figures.add(personFive);

        ArrayList<Figur> keyFigures = new ArrayList<Figur>(figures);

        int key = figures.get(0).getHeight();
        for(Figur f : figures) {
            if (f.getHeight() > key) {
                key = f.getHeight();
            }
        }

        for(Figur f : figuresInOrder) {
           System.out.println(f.getHeight());
        }

    int totalWidthPanel = 
    spaceInBetweenFigures 
    + figuresInOrder.get(0).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(1).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(2).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(3).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(4).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(5).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(6).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(7).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(8).getWidth()
    + spaceInBetweenFigures
    + figuresInOrder.get(9).getWidth()
    + spaceInBetweenFigures;
    
    int maxHeightPanel = 0;

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    frame.setSize(totalWidthPanel, maxHeightPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(Color.BLACK);
    frame.add(panel);
    frame.setVisible(true);
    frame.pack();
    frame.setTitle("Figuren");

    panel.setSize(totalWidthPanel, maxHeightPanel);
    panel.paintComponents(frame.getGraphics());


}
}
