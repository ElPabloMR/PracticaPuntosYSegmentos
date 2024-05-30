package Clases;

public class Punto {
int x;
int y;
/**
 * Este constructor creara directamente un punto con las coordenadas (0,0).
 */
public Punto() {
	x=0;
	y=0;
}
/**
 * A este constructor le pasaremos 2 parametros los cuales tendran los valores de x e y.
 * @param x
 * @param y
 */
public Punto(int x, int y) {
	this.x=x;
	this.y=y;
}
/**
 * En este set editaremos solo el valor x
 * @param x
 */
public void setX(int x) {
	this.x=x;
}
/**
 * En este set editaremos solo el parametro y
 * @param y
 */
public void setY(int y) {
	this.y=y;
}
/**
 * Con este metodo obtendremos el valor de x
 * @return el valor de x
 */
public int getX() {
	return x;
}
/**
 * Con este metodo obtendremos el valor de y
 * @return el valor de y
 */
public int getY() {
	return y;
}
/**
 * Modifica el metodo toString
 */
@Override
public String toString() {
	return "("+x+","+y+")";
}
}
