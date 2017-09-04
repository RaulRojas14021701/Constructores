
package constructor;

/**
 *
 * @author Raul Daniel Rojas Santiago 
 * @version 1.0
 */
public class Pcoche {

    void valor(Coche gas) {
        //   imprime el valor de la marca del carro y de la gasolina
        System.out.println("\nNombre: " + gas.marca);
        System.out.println("Litros de gasolina: " + gas.getGasolina() + "\n");

    }

    public static void main(String args[]) {
        Pcoche meter = new Pcoche();
        /* Se declaran dos objetos de la clase Coche */
        Coche carro1, carro2;

        /* Se utiliza el primer valor de un carro vacio por default*/
        carro1 = new Coche();
        meter.valor(carro1);

        /* Se utiliza el segundo valor del Coche */
        carro1 = new Coche("Fiesta", 14);
        meter.valor(carro1);

        /* Se utiliza el tercer valor del Coche */
        carro2 = new Coche(carro1);
        
        /*Le da valores a los coches*/
        meter.valor(carro1);
        meter.valor(carro2);
        carro1.setGasolina(20);
        carro2.setMarca("Sentra");
        carro2.setGasolina(25);

    }

}
