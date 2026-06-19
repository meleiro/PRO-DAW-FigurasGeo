/*
 * Clase Rectangulo
 * ----------------
 * Esta clase representa un rectángulo dentro de nuestro sistema.
 *
 * Hereda de la clase abstracta Figura, por lo que debe implementar
 * obligatoriamente los métodos:
 *
 * - calcularArea()
 * - calcularPerimetro()
 *
 * Además hereda el atributo id definido en Figura.
 */
public class Rectangulo extends Figura implements Redimensionable {

    /*
     * Base del rectángulo.
     *
     * Es un atributo específico de esta figura.
     */
    private double base;

    /*
     * Altura del rectángulo.
     *
     * También es un atributo propio de la clase Rectangulo.
     */
    private double altura;

    /*
     * Constructor de la clase Rectangulo.
     *
     * Recibe:
     * - id: identificador heredado de Figura
     * - base: longitud de la base
     * - altura: longitud de la altura
     *
     * La instrucción super(id) llama al constructor
     * de la clase Figura para inicializar el atributo id.
     */
    public Rectangulo(String id, double base, double altura) {
        super(id);
        this.base = base;
        this.altura = altura;
    }

    /*
     * Implementación del método abstracto calcularArea().
     *
     * Fórmula:
     *
     * Área = base × altura
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }

    /*
     * Implementación del método abstracto calcularPerimetro().
     *
     * Fórmula:
     *
     * Perímetro = 2 × (base + altura)
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    /*
     * @Override indica que estamos implementando
     * el método definido en la interfaz Redimensionable.
     *
     * Java comprobará que existe un método con esa
     * misma firma en la interfaz.
     */
    @Override
    public void redimensionar(double factor) {

        /*
         * Multiplicamos la base actual por el factor.
         *
         * Ejemplo:
         *
         * base = 10
         * factor = 2
         *
         * nueva base = 20
         */
        this.base = this.base * factor;

        /*
         * Multiplicamos la altura actual por el mismo factor.
         *
         * Ejemplo:
         *
         * altura = 5
         * factor = 2
         *
         * nueva altura = 10
         */
        this.altura = this.altura * factor;
    }

    /*
     * Sobrescritura del método toString().
     *
     * Permite obtener una representación textual del objeto.
     *
     * Por ejemplo:
     *
     * Rectangulo{base=5.0, altura=3.0, id='R1'}
     *
     * Esto resulta muy útil para depuración y para mostrar
     * información por consola.
     */
    @Override
    public String toString() {

        /*
         * Creamos un StringBuilder para construir
         * la cadena de texto.
         */
        final StringBuilder sb = new StringBuilder("Rectangulo{");

        /*
         * Añadimos el valor de la base.
         */
        sb.append("base=").append(base);

        /*
         * Añadimos el valor de la altura.
         */
        sb.append(", altura=").append(altura);

        /*
         * Añadimos el identificador heredado de Figura.
         */
        sb.append(", id='").append(id).append('\'');

        /*
         * Cerramos la representación textual.
         */
        sb.append('}');

        /*
         * Convertimos el StringBuilder en String y lo devolvemos.
         */
        return sb.toString();
    }
}