package JavaPractice;

public class Max {
    public static void main(String[] args){
        int[] a = {4,5,8,1,3,4,5};

        int max =a[0];
        int min =a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }

            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Maximum element is : "+min);
    }
}
