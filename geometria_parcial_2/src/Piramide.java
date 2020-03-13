
public class Piramide extends Retangulo implements Tridimensional{

	private double largura;
	
	public Piramide(double base, double altura, double largura) {
		super(base,altura);
		this.largura = largura;
	}
	
	@Override
	public double volume() {
		return area() * largura*1/3;
	}

	@Override
	public String toString() {
		return "Piramide [Comprimento=" + getBase() + ", altura=" + getAltura() + ", largura=" + largura + "]";
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
}
