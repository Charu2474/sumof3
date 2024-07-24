import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();
        int sum=0,temp=0;
        while(num!=0)
            {
                temp=num%10;
                sum+=temp;
                num/=10;
            }
            System.out.println(sum);
    }
}
