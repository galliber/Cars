import java.util.Scanner;
import java.util.InputMismatchException;

public class Main 
{
	static Scanner sc=new Scanner(System.in);
	public static int counter=0;
	
	
	public static void main(String[]args)
	{
		showIntroduction();
		int numberOfCars=0;
		try
		{
			numberOfCars=sc.nextInt();
		}
		catch (InputMismatchException e)
		{

			System.out.println("You didn’t enter integer.");

		}
		sc.nextLine();
		
		Car[] car=new Car[numberOfCars];
		fillUpCar(car);
		
		getCounter(car);
		Car[] carsWithA=new Car[counter];
		String[] carsWithAString=new String[counter];
		String[] models=new String[counter];
		getString(car, carsWithA);
		
		
		
		for(int i=0;i<carsWithA.length;i++)
		{
			carsWithAString[i]=carsWithA[i].getBrand(); 
		}
		
		for(int i=0;i<carsWithA.length;i++)
		{
			models[i]=carsWithA[i].getModel();
		}
		
		
		System.out.println("There are |"+carsWithAString.length+"| cars that have a brand that starts with a/A. These are the cars :");
		for(int i=0;i<carsWithAString.length;i++)
		{
			if(carsWithAString[i]!=null&&models[i]!=null)
				System.out.println(carsWithAString[i]+" "+models[i]);
		}
	}
	
	public static void showIntroduction()
	{
		System.out.println("This program will ask you to enter a number");
		System.out.println("of cars that need a brand and a model to be entered");
		System.out.println("and after you enter the brands and models of the cars");
		System.out.println("it will show the cars with brands that start with a/A.\n\n");
		
		System.out.println("Enter the number of car that'll be entered:");
	}
	
	public static void fillUpCar(Car[] car)
	{
		for(int i=0;i<car.length;i++)
		{
			System.out.println("Enter the brand of car "+(i+1)+":");
			car[i]=new Car();
			car[i].setBrand(sc.nextLine());
			System.out.println("Enter the model of car "+(i+1)+":");
			car[i].setModel(sc.nextLine());
		}
	}
	
	public static void getCounter(Car[] car)
	{
		for (int i=0;i<car.length;i++)
		{
			if(car[i].getBrand().charAt(0)=='a'||car[i].getBrand().charAt(0)=='A'||/* Следващите две са за кирилица.*/car[i].getBrand().charAt(0)=='а'||car[i].getBrand().charAt(0)=='А')
			{
				counter++;
			}
		}
	}
	
	
	public static Car[] getString(Car[] car, Car[] car1)
	{
		int count=0;
		for (int i=0;i<car.length;i++)
		{
			if(car[i].getBrand().charAt(0)=='a'||car[i].getBrand().charAt(0)=='A'||/* Следващите две са за кирилица.*/car[i].getBrand().charAt(0)=='а'||car[i].getBrand().charAt(0)=='А')
			{
				car1[count]=car[i];
				count++;
			}
		}
		return car1;
	}
	
	
}




