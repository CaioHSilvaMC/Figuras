package Figuras;

public class Triangulo extends Calculos{

	private double lado;
	private double altura;
	private double base;
	
	public Triangulo (int lado, int altura, int base) {
		this.lado = lado;
		this.altura = altura;
		this.base = base;
	}
	
		@Override
		public double areaCalcular() {
			return (base*altura)/2;
		}
	
		@Override
		public double perCalcular() {
			return lado + base + altura;
		}
}


