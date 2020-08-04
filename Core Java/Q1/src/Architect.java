
public class Architect extends Human implements MathGenius, Artist{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Calculate method from MathGenius Interface");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walk method from Abstract class Human");
		
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println("Think method from Abstract class Human");
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw method from Artist interface");
		
	}
	
}