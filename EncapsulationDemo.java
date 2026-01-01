class Reactangle{
    private int length;
    private int width;

    public void setLength(int l){
        length=l;
    }

    public void setWidth(int w){
    width = w;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    public int area(){
        return length*width;
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Reactangle r = new Reactangle();

        
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Area : "+r.area());
   
    }
}
