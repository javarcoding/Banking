
import java.util.Scanner;
public class Operation
{
Scanner sc=new Scanner(System.in);
	
	OperationTest t=new OperationTest();
	
	public void accountCreate() 
	{
		System.out.println("Please Enter Your Name");
		String myName=sc.next();
		
		System.out.println("Please Enter Your Mobile No");
		int myNo=sc.nextInt();
		
		System.out.println("Please Enter Your Email");
		String myEmail=sc.next();
		
		System.out.println("Please Enter Your Pin No");
		int myPin=sc.nextInt();
		
		System.out.println(myName);
		System.out.println(myNo);
		System.out.println(myEmail);
		System.out.println(myPin);
		
		System.out.println("");
		
		System.out.println("*****Account Created Successfully*****");
		
        System.out.println("Do you want to Continue please select option");
		
		System.out.println("");
		
		System.out.println("1==Yes");
		System.out.println("2==NO");
		
       int slectedValue=sc.nextInt();
       
		if(slectedValue==1)
		{
			t.homePage();
		}
		
		
	}

	
	public void viewBalance() {
		System.out.println("view Balance");
		int amount=2000;
		
		System.out.println("Account balance is=="+amount);
		
	}
		
		
}
