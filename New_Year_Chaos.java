
import java.util.*;
//Hint:use array of natural numbers and queue
public class New_Year_Chaos{
	
	static void minimumBribes(int[] q) {
        
        java.util.LinkedList<Integer> l=new java.util.LinkedList<Integer>();
        int a[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            a[i]=i+1;
        }
        int diff=0;
        int count=0;
        for(int i=0;i<q.length;i++){
            diff=q[i]-(i+1);
            if(diff>0){
                if(diff>2){
                    System.out.println("Too chaotic");
                    return;
                }else{
                    count+=diff;
                    a[q[i]-1]=0;
                    if(a[i]!=0){
                        l.addLast(a[i]);
                    }
                }
            }else{
                if(l.size()!=0){
                    if(diff==0){
                        count++;
                        a[q[i]-1]=0;
                    }
                    else if(l.getFirst()==q[i]){
                        l.remove(0);
                        a[q[i]-1]=0;
                        if (a[i] != 0) {
                            l.addLast(a[i]);
                        }
                        
                    }else{
                        int position=l.indexOf(q[i]);
                        count+=position;
                        l.remove(l.indexOf(q[i]));
                        if (a[i] != 0) {
                            l.addLast(a[i]);
                        }
                        a[q[i]-1]=0;
                        
                    }
                }else{
                    a[q[i]-1]=0;
                    
                }
            }
        }
        System.out.println(count);
    }


	
	
	public static void main(String args[])
	{
		System.out.print("Enter noof elements: ");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int q[]=new int[len];
		System.out.println("Enter elements");
		for(int i=0;i<len;i++)
		{
			q[i]=sc.nextInt();
		}
		minimumBribes(q);
	}
}