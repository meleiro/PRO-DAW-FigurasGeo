/*
 * Clase Triangulo
 * ---------------
 * Esta clase representa un triángulo dentro de nuestro sistema.
 *
 * Hereda de la clase abstracta Figura, por lo que está obligada
 * a implementar los métodos:
 *
 * - calcularArea()
 * - calcularPerimetro()
 *
 * Además hereda el atributo id definido en Figura.
 */
public class Triangulo extends Figura implements Redimensionable{

    /*
     * Base del triángulo.
     *
     * Se utiliza para calcular el área.
     */
    private double base;

    /*
     * Altura del triángulo.
     *
     * También se utiliza para calcular el área.
     */
    private double altura;

    /*
     * Longitud del primer lado.
     */
    private double lado1;

    /*
     * Longitud del segundo lado.
     */
    private double lado2;

    /*
     * Longitud del tercer lado.
     */
    private double lado3;

    /*
     * Constructor de la clase Triangulo.
     *
     * Recibe:
     * - id: identificador heredado de Figura
     * - base: base del triángulo
     * - altura: altura del triángulo
     * - lado1, lado2, lado3: lados necesarios para calcular el perímetro
     *
     * La llamada a super(id) inicializa el atributo id
     * definido en la clase padre Figura.
     */
    public Triangulo(String id,
                     double base,
                     double altura,
                     double lado1,
                     double lado2,
                     double lado3) {

        super(id);

        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /*
     * Implementación del método abstracto calcularPerimetro().
     *
     * Fórmula:
     *
     * Perímetro = lado1 + lado2 + lado3
     *
     * Se suman las longitudes de los tres lados.
     */
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    /*
     * Implementación del método abstracto calcularArea().
     *
     * Fórmula:
     *
     * Área = (base × altura) / 2
     *
     * Esta fórmula es válida cuando conocemos
     * la base y la altura del triángulo.
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    /*
     * @Override indica que este método está implementando
     * el método definido en la interfaz Redimensionable.
     */
    @Override
    public void redimensionar(double factor) {

        /*
         * Multiplicamos la base por el factor indicado.
         *
         * Si base = 10 y factor = 2,
         * la nueva base será 20.
         */
        this.base = this.base * factor;

        /*
         * Multiplicamos la altura por el mismo factor.
         *
         * Si altura = 5 y factor = 2,
         * la nueva altura será 10.
         */
        this.altura = this.altura * factor;

        /*
         * Multiplicamos el primer lado.
         */
        this.lado1 = this.lado1 * factor;

        /*
         * Multiplicamos el segundo lado.
         */
        this.lado2 = this.lado2 * factor;

        /*
         * Multiplicamos el tercer lado.
         */
        this.lado3 = this.lado3 * factor;
    }

    /*
     * Sobrescritura del método toString().
     *
     * Permite mostrar el contenido del objeto de una forma
     * legible para el programador.
     *
     * Sin este método, Java mostraría algo parecido a:
     *
     * Triangulo@4f023edb
     *
     * Con este método obtenemos una salida mucho más útil.
     */
    @Override
    public String toString() {

        /*
         * StringBuilder se utiliza para construir cadenas
         * de texto de forma eficiente.
         */
        final StringBuilder sb = new StringBuilder("Triangulo{");

        /*
         * Añadimos los atributos del objeto.
         */
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append(", lado1=").append(lado1);
        sb.append(", lado2=").append(lado2);
        sb.append(", lado3=").append(lado3);

        /*
         * Añadimos el identificador heredado de Figura.
         */
        sb.append(", id='").append(id).append('\'');

        /*
         * Cerramos la representación textual.
         */
        sb.append('}');

        return sb.toString();
    }
}