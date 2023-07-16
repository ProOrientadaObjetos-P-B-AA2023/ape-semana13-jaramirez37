package paquete01;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class ListaMarcas {

    public static String listaMarcasVendidas(ArrayList<Televisor> t) {
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        return s;
    }
}
