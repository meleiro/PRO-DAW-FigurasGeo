import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * Creamos un objeto Scanner para leer datos
         * introducidos por teclado.
         */
        Scanner sc = new Scanner(System.in);

        /*
         * Creamos un array de Figura.
         *
         * Aunque Figura es abstracta y no podemos hacer:
         *
         * Figura f = new Figura(...);
         *
         * sí podemos declarar referencias de tipo Figura.
         *
         * Esto es posible gracias al polimorfismo.
         */
        Figura[] figuras = new Figura[3];

        /*
         * ==========================
         * CREACIÓN DEL CÍRCULO
         * ==========================
         */
        System.out.println("==CREAR CIRCULO==");

        System.out.println("Introduce id del círculo: ");
        String idCirculo = sc.nextLine();

        System.out.println("Introduce radio del círculo: ");
        double radio = sc.nextDouble();

        /*
         * Consumimos el salto de línea que queda pendiente
         * después de leer un número con nextDouble().
         */
        sc.nextLine();

        /*
         * Creamos un objeto Circulo.
         *
         * Aunque el objeto es un Circulo, lo almacenamos
         * en una posición de tipo Figura.
         *
         * Esto es polimorfismo.
         */
        figuras[0] = new Circulo(idCirculo, radio);

        /*
         * ==========================
         * CREACIÓN DEL RECTÁNGULO
         * ==========================
         */
        System.out.println("==CREAR RECTÁNGULO==");

        System.out.println("Introduce el id del rectángulo: ");
        String idRectangulo = sc.nextLine();

        System.out.println("Introduce la base del rectángulo: ");
        double baseRectangulo = sc.nextDouble();

        System.out.println("Introduce la altura del rectángulo: ");
        double alturaRectangulo = sc.nextDouble();

        sc.nextLine();

        /*
         * Creamos un Rectangulo y lo almacenamos
         * en el array de Figura.
         */
        figuras[1] = new Rectangulo(
                idRectangulo,
                baseRectangulo,
                alturaRectangulo
        );

        /*
         * ==========================
         * CREACIÓN DEL TRIÁNGULO
         * ==========================
         */
        System.out.println("==CREAR TRIÁNGULO==");

        System.out.println("Introduce el id del triángulo: ");
        String idTriangulo = sc.nextLine();

        System.out.println("Introduce la base del triángulo: ");
        double baseTriangulo = sc.nextDouble();

        System.out.println("Introduce la altura del triángulo: ");
        double alturaTriangulo = sc.nextDouble();

        System.out.println("Introduce el lado 1 del triángulo: ");
        double ladoTriangulo1 = sc.nextDouble();

        System.out.println("Introduce el lado 2 del triángulo: ");
        double ladoTriangulo2 = sc.nextDouble();

        System.out.println("Introduce el lado 3 del triángulo: ");
        double ladoTriangulo3 = sc.nextDouble();

        sc.nextLine();

        /*
         * Creamos un objeto Triangulo y lo almacenamos
         * como Figura.
         */
        figuras[2] = new Triangulo(
                idTriangulo,
                baseTriangulo,
                alturaTriangulo,
                ladoTriangulo1,
                ladoTriangulo2,
                ladoTriangulo3
        );

        /*
         * ==================================
         * RECORRIDO MEDIANTE FOR-EACH
         * ==================================
         *
         * El for-each es ideal cuando queremos recorrer
         * todos los elementos de una colección o array.
         */
        for (Figura figura : figuras) {

            /*
             * Java llama automáticamente al método toString()
             * correspondiente al objeto real.
             *
             * Si figura es un Circulo:
             * se ejecuta Circulo.toString()
             *
             * Si figura es un Rectangulo:
             * se ejecuta Rectangulo.toString()
             *
             * Esto también es polimorfismo.
             */
            System.out.println(figura);

            /*
             * Aunque la variable sea de tipo Figura,
             * Java ejecutará el método de la clase concreta.
             *
             * Circulo -> calcularArea() de Circulo
             * Rectangulo -> calcularArea() de Rectangulo
             * Triangulo -> calcularArea() de Triangulo
             */
            System.out.println("Area: " + figura.calcularArea());

            System.out.println(
                    "Perímetro: "
                            + figura.calcularPerimetro()
            );
        }

        /*
         * ==================================
         * RECORRIDO MEDIANTE FOR CLÁSICO
         * ==================================
         *
         * Hace exactamente lo mismo que el anterior,
         * pero utilizando índices.
         */
        for (int i = 0; i < figuras.length; i++) {

            System.out.println(figuras[i]);

            System.out.println(
                    "Area: "
                            + figuras[i].calcularArea()
            );

            System.out.println(
                    "Perímetro: "
                            + figuras[i].calcularPerimetro()
            );
        }

        /*
         * Cerramos el Scanner para liberar recursos.
         */
        sc.close();
    }
}