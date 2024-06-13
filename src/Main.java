import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
      
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

        ArrayList<Figur> figuresInOrder = new ArrayList<Figur>();
        for (Figur figure : figures) {
            if (figure == figures.get(0)) {
                figuresInOrder.add(figure);
            } else {
                for (int i = 0; i < figuresInOrder.size(); i++) {
                    if (figure.getHeight() > figuresInOrder.get(i).getHeight()) {
                        figuresInOrder.add(i, figure);
                        break;
                    }
                }
            }
        
    }
    for (Figur figure : figuresInOrder) {
        System.out.println(figure.getHeight());
    }
}
