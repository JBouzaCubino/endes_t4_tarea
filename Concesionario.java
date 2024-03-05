
package endes_t4_tarea;

import java.util.ArrayList;

/**
 * Clase que simula un concesionario.
 * @author Jesús Bouza Cubino
 * @version 1.0
 */
public class Concesionario {
    
    /**
     * ArrayList para almacenar objetos de la clase Auto.
     * Solo acepta objetos de tipo Auto.
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor de la clase Concesionario.
     * Crea un nuevo ArrayList para objetos de tipo Auto.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Método que añade un nuevo coche al concesionario.
     * Agrega un objeto de tipo Auto al ArrayList autos.
     * @param auto Objeto a añadir
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Método que devuelve el ArrayList autos.
     * @return ArrayList autos
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Método para revisar el inventario de coches en el concesionario.
     * Imprime por consola la marca y modelo de cada coche del concesionario.
     */
    public void imprimirAutos(){
        //Bucle for-each para recorrer el ArrayList autos.
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
