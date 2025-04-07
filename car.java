class car{
  String color;

  public void color(String color){
    this.color=color;
  }

  public void display(){
    System.out.println("Car color:"+color);
  }
  public static void main(String[] args){
    color c=new color();
    c.color="Red";
    new display();
  }
}
