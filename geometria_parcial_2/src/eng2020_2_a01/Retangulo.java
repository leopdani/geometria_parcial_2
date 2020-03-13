package eng2020_2_a01;


public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + getBase() + ", altura=" + getAltura() + ", perimetro=" + perimetro() + "]";
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}

	@Override
	public double perimetro() {
		return getBase() * 2 + getAltura() * 2;
	}
	
	

}