package Actividades;

public class Test {
    public static void main(String[] args) {
        // Crear un árbol binario de búsqueda
        BSTree<Integer> bst = new BSTree<>();

        try {
            // Insertar elementos en el árbol
            bst.insert(8);
            bst.insert(3);
            bst.insert(10);
            bst.insert(1);
            bst.insert(6);
            bst.insert(14);
            bst.insert(4);
            bst.insert(7);
            bst.insert(13);

            // Imprimir el árbol
            System.out.println("Árbol binario de búsqueda:");
            System.out.println(bst);

            // Buscar un elemento en el árbol
            int searchElement = 7;
            System.out.println("Búsqueda del elemento " + searchElement + ":");
            try {
                Integer result = bst.search(searchElement);
                System.out.println("Resultado: " + result);
            } catch (ItemNotFound e) {
                System.out.println(e.getMessage());
            }

            // Eliminar un elemento del árbol
            int removeElement = 6;
            System.out.println("Eliminación del elemento " + removeElement + ":");
            try {
                bst.remove(removeElement);
                System.out.println("Árbol después de eliminar " + removeElement + ":");
                System.out.println(bst);
            } catch (ItemNotFound e) {
                System.out.println(e.getMessage());
            }

            // Obtener la altura de un nodo
            int nodeElement = 10;
            try {
                int height = bst.getHeight(nodeElement);
                System.out.println("Altura del nodo " + nodeElement + ": " + height);
            } catch (ItemNotFound e) {
                System.out.println(e.getMessage());
            }
        } catch (ItemDuplicated e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Soy Gozuuu");
    }
}

