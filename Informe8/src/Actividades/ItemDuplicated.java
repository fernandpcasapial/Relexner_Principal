package Actividades;

public class ItemDuplicated extends Exception {
    // Se define el campo serialVersionUID para mantener la compatibilidad de serialización/deserialización
    private static final long serialVersionUID = 1L;

    // Constructor que acepta un mensaje personalizado para la excepción
    public ItemDuplicated(String msg) {
        super(msg);  // Llama al constructor de la clase base (Exception) para establecer el mensaje de la excepción
    }

    // Constructor sin argumentos
    public ItemDuplicated() {
        super();  // Llama al constructor de la clase base (Exception) sin ningún mensaje
    }
}




/*ACTIVIDAD 2 
ARBOL 1
Arreglo lineal: [15, 9, 6, 14, 13, 20, 17, 64, 26, 72]


*/