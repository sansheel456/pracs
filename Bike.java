package Executor;

import java.util.Scanner;
public class Bike 
{
	String bno;
    String name;
    int days,charge;
    public void input()
    {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your bike number= ");
        bno = scanner.nextLine();
        System.out.print("Enter your name= ");
        name = scanner.nextLine();
        System.out.print("Enter number of days= ");
        days = scanner.nextInt();
    }
public void compute()
    {
if (days <= 5)    // first 5 days Rs500 per day
        {
charge = 500 * days;
        }
else if (days <= 10)    // next 5 days Rs400 per day
        {
charge = 5 * 500 + (days - 5) * 400;
        }
else
        {
charge = 5 * 500 + 5 * 400 + (days - 10) * 200;     // Rs200 for remaining days  
        }
    }
public void display()
    {
System.out.println("Bike No.="+bno);
        System.out.println("Name="+name);
        System.out.println("Days="+days);
        System.out.println("Charge="+charge);        
    
    }
	public static void main(String[] args) {
		Bike bike=new Bike();
        bike.input();
        bike.compute();
        bike.display();

	}

}
