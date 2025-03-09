class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write Anything");
    }
    
    public void PrintColor(){
        System.out.println(this.color);
    }

    
    public void PrintType(){
        System.out.println(this.type);
    }

}

class Student {
    int rollno ;
    String name;
    String standard;

    public void Info() {
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.standard);
    }
}

public class OOPS {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "Ballpoint";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";
        
        pen1.write();
        pen2.PrintColor();
        pen1.PrintType();

        Student p1 = new Student();
        p1.name = "ABCD";
        p1.rollno = 25;
        p1.standard = "10th";

        p1.Info();
    }
}