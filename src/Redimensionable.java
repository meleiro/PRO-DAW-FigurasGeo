/*
 * Interfaz Redimensionable
 * ------------------------
 *
 * Una interfaz define un contrato.
 *
 * No indica cómo debe hacerse algo,
 * únicamente especifica qué debe poder hacer
 * cualquier clase que implemente esta interfaz.
 *
 * En este caso, cualquier objeto que implemente
 * Redimensionable deberá saber cambiar su tamaño.
 *
 * Ejemplos:
 *
 * - Un círculo puede aumentar o disminuir su radio.
 * - Un rectángulo puede aumentar o disminuir su base y altura.
 * - Una imagen puede aumentar o disminuir su resolución.
 *
 * Todos pertenecen a familias distintas,
 * pero comparten una capacidad común:
 *
 * "Poder redimensionarse".
 */
public interface Redimensionable {

    /*
     * Método abstracto.
     *
     * En una interfaz, los métodos son abstractos por defecto
     * (salvo que se indique default o static).
     *
     * Esto significa que NO existe implementación aquí.
     *
     * Cada clase que implemente la interfaz deberá proporcionar
     * su propia versión del método.
     *
     * Parámetro:
     * factor
     *
     * Representa cuánto queremos redimensionar el objeto.
     *
     * Ejemplos:
     *
     * factor = 2
     * -> duplicar tamaño
     *
     * factor = 0.5
     * -> reducir tamaño a la mitad
     *
     * factor = 1
     * -> mantener tamaño actual
     */
    void redimensionar(double factor);
}