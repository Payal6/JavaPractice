package JavaPractice;

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l,int b){
        length = l;
        breadth = b;
    }

    public int area(){
        return length*breadth;
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area());
        Rectangle r1 = new Rectangle(10, 10);
        System.out.println(r1.area());
    }
}
