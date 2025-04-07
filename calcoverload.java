public class calcoverload {

    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }

    public static void main(String[] args){

        calcoverload a=new calcoverload();
        System.out.println("Resuilt:"+a.add(2.25,3.56));    
    }
    
}
