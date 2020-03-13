
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public double area() {
		return Math.pow(getBase(), 2);
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + getBase() + ", perimetro=" + perimetro() + "]";
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) * 2);
	}

	@Override
	public double perimetro() {
		return getBase() * 4;
	}

}
