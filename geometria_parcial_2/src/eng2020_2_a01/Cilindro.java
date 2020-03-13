package eng2020_2_a01;

public class Cilindro extends Circulo {

	private double altura;
	
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Cilindro [raio=" + getRaio() + ", altura=" + altura + "]";
	}
	
	
}
