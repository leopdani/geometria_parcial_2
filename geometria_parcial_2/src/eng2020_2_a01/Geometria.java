package eng2020_2_a01;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {

		ArrayList<Figura> figuras = new ArrayList<>();

		figuras.add(new Circulo(10));
		figuras.add(new Circulo(5));
		figuras.add(new Quadrado(5));
		figuras.add(new Retangulo(6,6));
	    /*figuras.add(new Triangulo(3,4));*/
		figuras.add(new Trapezio(2,2,2));
		figuras.add(new Cubo(2)); ;
		figuras.add(new Piramide(2,2,2)); 
		figuras.add(new Esfera(5)); 
		figuras.add(new Cilindro(10,2));

		for(Figura fig: figuras) {
			if(fig instanceof Tridimensional) {
				System.out.println("        ");
				System.out.println(fig);
				Tridimensional tri = (Tridimensional) fig;
				System.out.println("Volume = " + tri.volume());
				
				

			}else {
				System.out.println("        ");
				System.out.println(fig);
				System.out.println("Area = " + fig.area());

				if(fig instanceof Diagonal) {
					Diagonal d = (Diagonal) fig;
					System.out.println("Diagonal = " + d.diagonal());
				}
				
			}
		}

	}

}
