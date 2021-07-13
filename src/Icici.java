
public class Icici implements RBI, USBank {

	@Override
	public void FD() {
	
		System.out.println("icici----FD");
		
	}

	@Override
	public void educationloan() {
	
		System.out.println("icici-----educationloan");
		
	}
	
	public void insurance()
	
	{
		System.out.println("icici-----insurance");
	}

	@Override
	public void houseloan() {
		System.out.println("icici--- house loan");
	}

	@Override
	public void carloan() {
		
		System.out.println("icici----carloan");
		System.out.println(RBI.minbal);
	}

}
