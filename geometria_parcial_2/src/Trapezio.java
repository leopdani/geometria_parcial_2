
public class Trapezio extends Figura {

	private double baseMa;
	private double baseMe;
	private double altura;
	
	public Trapezio(double baseMa, double baseMe, double altura) {
		this.baseMa = baseMa;
		this.baseMe = baseMe;
		this.altura = altura;
	}

	@Override
	public double area() {
		return (baseMa + baseMe) * altura / 2;
	}

	@Override
	public double perimetro() {
		return Math.sqrt(Math.pow(((baseMa - baseMe) / 2), 2) + Math.pow(altura, 2)) * 2 + baseMa + baseMe;
	}

	public double getBaseMa() {
		return baseMa;
	}
	
	public void setBaseMa(double baseMa) {
		this.baseMa = baseMa;
	}

	public double getBaseMe() {
		return baseMe;
	}

	public double getAltura() {
		return altura;
	}

	public void setBaseMe(double baseMe) {
		this.baseMe = baseMe;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Trapezio [baseMa=" + baseMa + ", baseMe=" + baseMe + ", altura=" + altura + ", area()=" + area()
				+ ", perimetro()=" + perimetro() + "]";
	}



}
