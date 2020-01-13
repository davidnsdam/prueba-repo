/*
20 Realiza un programa java que:
	contenga clases independientes llamadas Circulo, Cuadrado, Linea y Punto,
	cada clase tendrá el número mínimo de atributos necesarios 
para que cada objeto que se genere a partir de la clase tenga definida sin 
ambigüedad su posición en el plano (x,y), por ejemplo para definir sin ambigüedad 
un objeto de la clase Punto basta con dos datos, la posición en el eje x y la posición
en el eje y donde se encuentra el punto,
	además se declararán en cada clase dos constructores, los métodos get y set, 
el método mueve, el método gira, el método mide, el método superficie,
	cada uno de esos métodos recibirá (y devolverá) los parámetros necesarios
para realizar la tarea que indica sobre el objeto correspondiente, así si se aplica 
el método mueve(x1,y1) sobre un objeto punto cuya posición es (x,y), lo que ocurrirá
es que el objeto punto pasará a tener la posición (x1,y1) (el objeto punto se ha movido)
	puede ser que alguno de los métodos no tengan efecto sobre alguno de los objetos
, pero se deben declarar y definir todos en todas las clases,
	crea una clase GeoMain, con un procedimiento main en el que:
		se genera un número al azar entre 1 y 10 de objetos de las clases 
Circulo, Cuadrado, Linea y Punto,
		cada objeto generado tendrá atributos al azar dentro de los valores
permitidos,
		se aplican al menos dos de los métodos propios de cada clase 
(no gets y sets) a al menos dos objetos de cada clase que se hayan generado,
		se comprueba cuál es el efecto sobre los objetos de la aplicación 
de los métodos.
 */
package javaapplication18;

/**
 *
 * @author usuario
 */
public class Linea {
    static String nombre="linea";
    private int posicionx1;
    private int posicionx2;
    private int posiciony1;
    private int posiciony2;

    public void informacion() {
        String posiciont = "LA LINEA VA DE " + posicionx1 + "," + posiciony1 + " A " + posicionx2 + "," + posiciony2;
        System.out.println(posiciont);
    }

    public Linea(int a, int b, int c, int d) {
        posicionx1 = a;
        posicionx2 = b;
        posiciony1 = c;
        posiciony2 = d;
    }

    public Linea(int a, int b) {
        posicionx1 = a;
        posiciony1 = b;
    }

    public int getPosicionx1() {
        return posicionx1;
    }

    public void setPosicionx1(int posicionx1) {
        this.posicionx1 = posicionx1;
    }

    public int getPosicionx2() {
        return posicionx2;
    }

    public void setPosicionx2(int posicionx2) {
        this.posicionx2 = posicionx2;
    }

    public int getPosiciony1() {
        return posiciony1;
    }

    public void setPosiciony1(int posiciony1) {
        this.posiciony1 = posiciony1;
    }

    public int getPosiciony2() {
        return posiciony2;
    }

    public void setPosiciony2(int posiciony2) {
        this.posiciony2 = posiciony2;
    }

    public String getPosiciont() {
        return posiciont;
    }

    public void setPosiciont(String posiciont) {
        this.posiciont = posiciont;
    }
   /**info sobre el método mueve
    * 
    * @param a
    * @param b 
    */
    public void mueve(int a, int b) {

        posicionx1 = posicionx1 + a;
        posicionx2 = posicionx2 + a;
        posiciony1 = posiciony1 + b;
        posiciony2 = posiciony2 + b;
    }

    public void gira() {

    }

    public int mide() {
        int mide = (posicionx1 - posicionx2) + (posiciony1 - posiciony2);
        return mide;
    }

}
