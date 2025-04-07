class car {
  String color;

  public car() {
    this.color=color;
  }

  public void display() {
    System.out.println("Car color:" + color);
  }

  public static void main(String[] args) {
    car c = new car();
    car c2=new car();
    c.color="Cyan";
    c2.color="Red-Sky-Blue";
    c.display();
    c2.display();
  }
}
