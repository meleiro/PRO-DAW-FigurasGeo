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
public class Circulo extends Figura {

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
    public Circulo(String id, double r) {
        super(id);      // Llama al constructor de Figura
        this.radio = r; // Inicializa el radio del círculo
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
    @Override
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
}