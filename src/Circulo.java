/*
 * Clase Circulo
 * -------------
 * Esta clase representa un círculo concreto dentro de nuestro sistema.
 *
 * Hereda de la clase abstracta Figura, por lo que está obligada
 * a implementar los métodos:
 *
 * - calcularArea()
 * - calcularPerimetro()
 *
 * Gracias a la herencia, también dispone del atributo id
 * definido en la clase padre.
 */
public class Circulo extends Figura implements Redimensionable{

    /*
     * Radio del círculo.
     *
     * Es un atributo propio de la clase Circulo.
     * No existe en la clase Figura porque no todas las
     * figuras tienen radio.
     */
    private double radio;

    /*
     * Constructor de la clase Circulo.
     *
     * Recibe:
     * - id: identificador heredado de Figura
     * - r: radio del círculo
     *
     * La llamada a super(id) ejecuta el constructor de la
     * clase padre (Figura) para inicializar el atributo id.
     */
    public Circulo(String id, double radio) {
        super(id);      // Llama al constructor de Figura
        this.radio = radio; // Inicializa el radio del círculo


    }
    public String toString() {

        /*
         * StringBuilder es una clase eficiente para construir
         * cadenas de texto cuando se realizan múltiples
         * concatenaciones.
         */
        final StringBuilder sb = new StringBuilder("Circulo{");
        

        /*
         * Añadimos el identificador heredado de Figura.
         */
        sb.append("id='").append(id).append('\'');

        /*
         * Añadimos el radio propio del círculo.
         */
        sb.append(", radio=").append(radio);

        /*
         * Cerramos la representación textual.
         */
        sb.append('}');

        /*
         * Convertimos el StringBuilder a String y lo devolvemos.
         */
        return sb.toString();
    }

    /*
     * Implementación obligatoria del método abstracto
     * calcularArea() definido en Figura.
     *
     * Fórmula del área de un círculo:
     *
     * Área = π × radio²
     *
     * Math.PI contiene el valor de π.
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /*
     * Implementación obligatoria del método abstracto
     * calcularPerimetro() definido en Figura.
     *
     * Fórmula del perímetro (circunferencia):
     *
     * Perímetro = 2 × π × radio
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    /*
     * @Override indica que este método está implementando
     * (o sobrescribiendo) un método declarado en una interfaz
     * o heredado de una clase padre.
     *
     * En este caso implementa el método:
     *
     * void redimensionar(double factor);
     *
     * definido en la interfaz Redimensionable.
     */
    @Override
    public void redimensionar(double factor) {

        /*
         * this.radio hace referencia al atributo radio
         * del objeto actual.
         *
         * La operación:
         *
         * radio = radio * factor
         *
         * multiplica el tamaño actual del círculo
         * por el factor recibido.
         *
         * Ejemplos:
         *
         * radio = 10
         * factor = 2
         *
         * nuevo radio = 20
         *
         * -----------------------
         *
         * radio = 10
         * factor = 0.5
         *
         * nuevo radio = 5
         *
         * -----------------------
         *
         * radio = 10
         * factor = 1
         *
         * nuevo radio = 10
         *
         * (el tamaño permanece igual)
         */
        this.radio = this.radio * factor;
    }

    /*
     * Sobrescritura del método toString().
     *
     * toString() existe en la clase Object, de la que
     * heredan todas las clases Java.
     *
     * Su función es devolver una representación textual
     * del objeto.
     *
     * Esto permite hacer:
     *
     * System.out.println(circulo);
     *
     * y obtener información legible del objeto.
     */


}