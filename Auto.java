
package endes_t4_tarea;

/**
 * Clase que simula un coche.
 * @author Jesús Bouza Cubino
 * @version 1.0
 */
public class Auto {
    
    /**
     * Cadena de texto que almacena la marca del coche.
     */
    private String marca;

    /**
     * Cadena de texto que almacena el modelo del coche.
     */
    private String modelo;

    /**
     * Constructor de la clase Auto.
     * @param marca Marca del coche.
     * @param modelo Modelo del coche.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método getter que devuelve la marca del coche.
     * @return La marca del coche.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método setter para establecer la marca del coche.
     * @param marca La marca del coche.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método getter que devuelve el modelo del coche.
     * @return El modelo del coche.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método setter para establecer el modelo del coche.
     * @param modelo El modelo del coche.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que convierte una instancia de la clase Auto en String.
     * @return Cadena de texto describiendo las características de la instancia.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
