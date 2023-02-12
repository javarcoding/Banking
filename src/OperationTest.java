
import java.util.Scanner;
public class OperationTest 
{
	public void homePage()
	{
        System.out.println("Please Select Option");
		
		System.out.println("1==Create Account");
		
		System.out.println("2==View Balance");
		
		System.out.println("");
		
	}
	
	
	public static void main(String[] args) {
		
		Operation o=new Operation();
		OperationTest t=new OperationTest();
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("**Welcome To Axis Bank**");
		
		System.out.println("");
		
		t.homePage();		
		
		int slectedValue=sc.nextInt();
		
		switch (slectedValue) 
		{
		case 1: 
			
			o.accountCreate();
			break;
		
        case 2: 
			
			o.viewBalance();
		    break;
		default:
			System.out.println("Please Select Valid Option");
		}
		
		
		
	}
}
