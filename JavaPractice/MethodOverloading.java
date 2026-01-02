package JavaPractice;

 class Calculator {
    public int add(int a,int b){
        return a+b;
    }
        public int add(int a,int b,int c){
        return a+b+c;
    }
}

class Test{
    public int max(int a,int b){
        return a>b?a:b;
    }

    public int max(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return c;
        }else {
            return c;
        }
    }
}

public class MethodOverloading {
public static void main(String[] args) {
    Calculator c =new Calculator();
    System.out.println(c.add(10,20));
    System.out.println(c.add(10,20,30));

    Test t=new Test();
    System.out.println(t.max(10, 20));
    System.out.println(t.max(20, 5, 10));
}
}
