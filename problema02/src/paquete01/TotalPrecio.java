package paquete01;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class TotalPrecio {
    
    public static double totalPrecioTvs(ArrayList<Televisor> t){
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();
            
        }
        return s;
    }
}
