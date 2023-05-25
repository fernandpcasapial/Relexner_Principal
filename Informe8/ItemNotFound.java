package Actividades;

public class ItemNotFound extends Exception {
    // Número de versión para la serialización de la clase
    private static final long serialVersionUID = 1L;

    // Constructor que recibe un mensaje de error personalizado
    public ItemNotFound(String msg) {
        super(msg);
    }

    // Constructor por defecto sin argumentos
    public ItemNotFound() {
        super();
    }
}
