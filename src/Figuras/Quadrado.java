package Figuras;

public class Quadrado extends Calculos{

	private double lado;
	
	public Quadrado (int lado) {
		this.lado = lado;
	}
	
	@Override
	public double areaCalcular() {
		return lado*lado;
	}
	
	@Override
	public double perCalcular() {
		return lado*4;
	}

}
