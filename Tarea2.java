import java.util.Scanner;

class Tarea2 {
    private static final String Auto = null;

    public static <Auto> void main (String[] args) {
    
        Estacionamiento.inicializar(2, 60, 180); 
        // se inicializa el estacionamiento con 2 lugares, 
        // $60 para el ingreso, $180 la noche
            
        Persona juan = new Persona("Juan", 0);
        Auto autoJuan = Auto(Auto.MERCEDEZ_BENZ, "BCF-235", juan);

        Estacionamiento.entra(autoJuan); 
        // se inicializa la cuenta corriente a Juan y se le agrega $60

        Persona ana = new Persona("Ana");
        Auto autoAna = Auto(Auto.FIAT, "BRF-535", ana);
        Estacionamiento.entra(autoAna);

        Estacionamiento.sale(autoJuan);

        Estacionamiento.nuevoDia(); 
        // cierra el estacionamiento y abre el dia siguiente

        Estacionamiento.entra(autoJuan);
        Persona felipe = new Persona("Felipe");
        Auto autoFelipe = Auto(Auto.PEUGEOT, "BFD-124", felipe);
        Estacionamiento.entra(autoFelipe);
        // notar que no entra el auto, asi que no tiene ningun efecto

        Estacionamiento.calcular();
    }
}
