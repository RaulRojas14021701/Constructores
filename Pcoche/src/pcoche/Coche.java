
package constructor;

/**
 *
 * @author Raul Daniel Rojas Santiago
 * @version 1.0
 */
public class Coche {

    String marca;
    int gasolina;


    /* El constructor Coche esta sobrecargado :) */
    Coche() {
        marca= null;
        gasolina = 0;

    }

    Coche(String nombre, int gasolina) {
        this.marca = nombre;
        this.gasolina = gasolina;

    }

    Coche(Coche gas) {
        marca = gas.getMarca();
        gasolina = gas.getGasolina();

    }
    /*El metodo Gasolina tiene sobrecarga de datos :)*/
    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    


    public void acelerar() {

    }

}
