
public class Car 
{
	private String brand;
	private String model;
	
	public Car(String brand, String model)
	{
		this.brand=brand;
		this.model=model;
	}
	
	public Car()
	{
		this.brand="";
		this.model="";
	}
	
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return this.brand;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public String getModel()
	{
		return this.model;
	}
	
	
}


