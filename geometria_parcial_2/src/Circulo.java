
public class Circulo extends Figura {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", perimetro=" + perimetro() + "]";
	}

	@Override
	public double perimetro() {
		return Math.PI * 2 * raio;
	}

	
}
