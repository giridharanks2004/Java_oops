package oops;

class appform{
    private int roll;
    private String name;

    public void SetValues(int num,String str){
        roll=num;
        name=str;
    }

    public int GetRoll(){
        return roll;
    }

    public String GetName(){
        return name;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("roll: "+roll);
    }
}

public class SettersGetters {
    public static void main(String [] args){
        appform a = new appform();
        a.SetValues(306,"giri"); // setter method to safely update the private variables in the class 
        System.out.println(a.GetName()); // getter methods to return or access the private variable
        System.out.println(a.GetRoll());
        a.display();
    }
}

