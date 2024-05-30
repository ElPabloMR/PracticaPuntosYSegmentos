package app;
import Clases.Punto;
import Clases.Segmento;
import java.util.Random;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto a=new Punto((int)(Math.random()*11),(int)(Math.random()*11));
		Punto b=new Punto ((int)(Math.random()*11),(int)(Math.random()*11));
		Punto c=new Punto ((int)(Math.random()*11),(int)(Math.random()*11));
		Punto d=new Punto ((int)(Math.random()*11),(int)(Math.random()*11));
		Segmento seg1=new Segmento(a,b);
		Segmento seg2=new Segmento(c,d);
		double dist1=seg1.distancia();
		double dist2=seg2.distancia();
		
	}

}
