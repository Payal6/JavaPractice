package JavaPractice;

/*public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n  = sc.nextInt();
        
        int og = n;
        int rem , rev=0;

        while (n>0) {
            rem  = n%10;

            rev = rev * 10 + rem;

            n=n/10;
        }
        //System.out.println(rev);

        if (og==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
*/

public class ReverseArray{
    static int reverse(int num , int rev){

        if(num==0)
            return rev;

        return reverse(num/10, rev * 10 + num % 10);
    }
    public static void main(String[] args) {
        int num =121;
        int rev = reverse(num, 0);

        if (num==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}