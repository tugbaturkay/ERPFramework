package polymorphismTasks;

public abstract class Chair {

    String model;
    double weight;
    String color;

    public abstract void sit();

    public abstract void stepOnIt();

    public void changeColor(String color){
        System.out.println("Color is changing to " + color);
      this.color=color;
    }

}
