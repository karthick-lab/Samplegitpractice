
public class TestCar {

	public static void main(String[] args) {
	
		// child class object reffered by same child class reference variable
		BMW bmw=new BMW();
		bmw.theftsafety();
		bmw.engine();
		bmw.wheel();
		
		Car car=new Car();
		car.wheel();
		car.engine();
		
		// Child class object is referenced by parent class refernce variable 
		Car car2=new Merc();
		car2.wheel();
		car2.engine();
		
		Merc merc=new Merc();
		merc.wheel();
		merc.engine();
		merc.autogear();
		
		
		

	}

}
