package bridge;

public class Pentagon extends Shape {
	public Pentagon(Color c)
	{
		super(c);
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("pentagon filled with color");
		color.applyColor();
		
	}
	

}
