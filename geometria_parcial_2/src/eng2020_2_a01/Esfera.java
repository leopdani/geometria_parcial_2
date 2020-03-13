package eng2020_2_a01;

public class Esfera extends Circulo implements Tridimensional {

	
	public Esfera(double raio) {
		super(raio);
	
	}

	@Override
	public double volume() {
		return area() * getRaio() * (4 / 3);
	}

	@Override
	public String toString() {
		return "Esfera [raio=" + getRaio() + "]";
	}


}
