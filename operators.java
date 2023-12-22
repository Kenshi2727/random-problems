   //returns 1 for X greater -1 for Y greater and 0 for Equal 
import java.math.BigInteger;
import java.util.Scanner;

public class operators {
    static int compare(BigInteger x, BigInteger y) {
      return x.compareTo(y);
    }
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter in order: a1,a2,b1,b2");
          BigInteger a1=sc.nextBigInteger();
          BigInteger a2=sc.nextBigInteger();
          BigInteger b1=sc.nextBigInteger();
          BigInteger b2=sc.nextBigInteger();
          BigInteger x,y; //for handling humungous data values
          System.out.println("Values given are:");
          System.out.println("a1:"+a1+" a2:"+a2+" b1:"+b1+" b2:"+b2);
          //for verification purpose
           BigInteger X,Y;
         X=a1.multiply(a2);
         Y=b1.multiply(b2);
           
          if(((a1.intValue()==b1.intValue())&&(a2.intValue()==b2.intValue())) || ((a1.intValue()==b2.intValue())&&(a2.intValue()==b1.intValue())))
          {//logic for equal
            System.out.println("*********************************");
           System.out.println("Expected result:0");
            System.out.println("*********************************");
          System.out.println("*********************************");
           System.out.println("Observed result:0");
           System.out.println("*********************************");
          }
          else{
              System.out.println("*********************************");
           System.out.println("Expected result:"+compare(X,Y));
            System.out.println("*********************************");
               //applying bit level manipulation
           x=a1.shiftLeft(a2.intValue());
           y=b1.shiftLeft(b2.intValue());
          //  System.out.println("X:"+x+" Y:"+y);
           System.out.println("*********************************");
           System.out.println("Observed result:"+compare(x,y));
           System.out.println("*********************************");
          }
      
	}
}
