// Declaramos una clase llamada Figura.
//
// La palabra clave "abstract" indica que esta clase es abstracta.
// Eso significa que NO se puede crear un objeto directamente de Figura.
//
// Por ejemplo, esto NO estaría permitido:
// Figura f = new Figura("F1");
//
// La idea es que Figura sirva como clase base para otras clases más concretas,
// como Circulo, Rectangulo, Triangulo, etc.
public abstract class Figura {

    // Atributo protegido llamado id.
    //
    // "protected" significa que este atributo será accesible:
    // - desde la propia clase Figura
    // - desde las clases que hereden de Figura
    //
    // Se usa para identificar cada figura.
    // Por ejemplo: "C1", "R1", "T1", etc.
    protected String id;

    // Constructor de la clase Figura.
    //
    // Aunque la clase sea abstracta, puede tener constructor.
    // Este constructor será llamado desde las subclases usando super(id).
    //
    // Sirve para inicializar los atributos comunes de todas las figuras.
    public Figura(String id) {
        this.id = id;
    }

    // Método abstracto para calcular el área.
    //
    // No tiene cuerpo porque cada figura calcula su área de forma distinta:
    // - Un círculo usa PI * radio * radio
    // - Un rectángulo usa base * altura
    // - Un triángulo usa base * altura / 2
    //
    // Al ser abstracto, cualquier clase hija concreta estará obligada
    // a implementar este método.
    public abstract double calcularArea();

    // Método abstracto para calcular el perímetro.
    //
    // Tampoco tiene cuerpo porque cada figura calcula el perímetro
    // de una forma distinta.
    //
    // Por ejemplo:
    // - Círculo: 2 * PI * radio
    // - Rectángulo: 2 * (base + altura)
    // - Triángulo: lado1 + lado2 + lado3
    //
    // Las subclases deben sobrescribirlo obligatoriamente.
    public abstract double calcularPerimetro();
}