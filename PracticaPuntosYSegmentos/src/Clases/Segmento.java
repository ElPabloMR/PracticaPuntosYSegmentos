package Clases;

public class Segmento {
Punto a;
Punto b;
/**
 * Este contructor creara un segmento con los puntos (0,0) y (1,1)
 */
public Segmento() {
	a=new Punto(0,0);
	b=new Punto(1,1);
}
/**
 * A este constructor se le pasaran dos puntos para crear el segmento
 * @param a
 * @param b
 */
public Segmento(Punto a, Punto b) {
	this.a=a;
	this.b=b;
}
/**
 * Con este metodo editaremos el punto A
 * @param a
 */
public void setA(Punto a) {
	this.a=a;
}
/**
 * Con este metodo editaremos el punto B
 * @param b
 */
public void setB(Punto b) {
	this.b=b;
}
/**
 * Con este metodo obtendremos el punto A
 * @return el punto A
 */
public Punto getA() {
	return a;
}
/**
 * Con este metodo obtendremos el punto B
 * @return el punto B
 */
public Punto getB() {
	return b;
}
/**
 * Editamos el metodo toString
 */
@Override
public String toString() {
	return "["+a+","+b+"]";
}
/**
 * Con este metodo calcularemos la distancia entre los puntos
 * @return la distancia entre los puntos
 */
public double distancia() {
	double distancia=0;
	distancia=Math.sqrt((Math.pow(b.getX()-a.getX(),2))+(Math.pow(b.getY()-a.getY(),2)));
	return distancia;
}
}
