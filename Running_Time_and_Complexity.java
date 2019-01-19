
//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

import java.util.Scanner;
public class Running_Time_and_Complexity {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            int temp=sc.nextInt();
            if(temp==1){
                System.out.println("Not prime");
            }else if(temp==2){
                System.out.println("Prime");
            }
            else
            {
                if(temp%2==0){
                    System.out.println("Not prime");
                    continue;
                }
                boolean b=true;
                for(int i=3;i<=(int)Math.sqrt((double)temp)+1;i+=2){
                    if(temp%i==0){
                        System.out.println("Not prime");
                        b=false;
                        break;
                    }
                }
                if(b)
                    System.out.println("Prime");
            }
        }
    }
}
