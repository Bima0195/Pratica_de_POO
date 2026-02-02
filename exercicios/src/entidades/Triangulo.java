package entidades;

public class Triangulo {
	
	
	public double b = 0;
	public double c = 0;
	public double a = 0;
	
	public double area() {
		double p = (a + b + c)/2.0;
		return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}

}
