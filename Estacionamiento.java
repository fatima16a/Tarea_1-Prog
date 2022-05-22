import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estacionamiento {
    static Auto [] lugares;
    static ArrayList<Persona> clientes  = new ArrayList <Persona> ();
    static int lugaresDisponibles;
    static int costoIngreso; // $60
    static int costoNoche; // $180

    public static void calcular() {
        int total = 0; 
    }

    public static void inicializar(int cantLugar, int tarifaEntrada, int tarifaNoche){
        lugares = new Auto [8];
        lugares = new Auto [cantLugar];
    }

    public static void entra(Auto auto) {
        boolean esta = false;
        for (int i =0; i < clientes.size(); i++) {
            if(auto.persona == clientes.get(i)) {
                esta = true;
                break;
            }
        }

        if(!esta) {
            clientes.add(auto.persona);
            lugaresDisponibles--;
        }
        auto.persona.cuentaCorriente += costoIngreso;
    }

    public static void sale(Auto auto) {
        clientes.remove(auto);
    }
}