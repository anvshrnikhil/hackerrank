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
      int  temp = price - (int)(disc/100)*price ; 
      result += temp;
      price = temp;
    }
    System.out.println(result);
  }
}
