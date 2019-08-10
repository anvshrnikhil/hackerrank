import java.util.Scanner;

class Coffee
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int p = sc.nextInt();
    int price = p;
    int disc = sc.nextInt();
    int result = price;
    while(price != 0)
    {
      int  temp = price*disc/100 ; 
	    if(temp!=0){
	      temp = price -temp;
        result += temp;
        price = temp;
	    }else{
		    break;
	    }
    }
    System.out.println(result);
  }
}
