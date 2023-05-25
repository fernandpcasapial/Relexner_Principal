package Actividades;

public class BSTree<E extends Comparable<E>> {
    class Node {
        protected E data;       // Dato almacenado en el nodo
        protected Node left;    // Referencia al hijo izquierdo
        protected Node right;   // Referencia al hijo derecho
        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;// Raíz del árbol

    public BSTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(E element) throws ItemDuplicated {
        root = insertRecursive(root, element);
    }

    private Node insertRecursive(Node current, E element) throws ItemDuplicated {
        if (current == null) {  // Si el nodo actual es nulo, creamos un nuevo nodo con el elemento
            return new Node(element);
        }

        int compareResult = element.compareTo(current.data);  // Comparamos el elemento con el valor del nodo actual

        if (compareResult == 0) {  // Si son iguales, lanzamos la excepción ItemDuplicated
            throw new ItemDuplicated("El elemento " + element + " ya se encuentra en el árbol.");
        } else if (compareResult < 0) {  // Si es menor, lo insertamos en el subárbol izquierdo recursivamente
            current.left = insertRecursive(current.left, element);
        } else {  // Si es mayor, lo insertamos en el subárbol derecho recursivamente
            current.right = insertRecursive(current.right, element);
        }

        return current;
    }

    public E search(E element) throws ItemNotFound {
        Node result = searchRecursive(root, element);
        if (result == null) {  // Si no se encontró el elemento, lanzamos la excepción ItemNotFound
            throw new ItemNotFound("El elemento " + element + " no se encuentra en el árbol.");
        }
        return result.data;  // Si se encontró el elemento, devolvemos su valor
    }

    private Node searchRecursive(Node current, E element) {
        if (current == null || current.data.equals(element)) {  // Si el nodo actual es nulo o encontramos el elemento, lo devolvemos
            return current;
        }

        int compareResult = element.compareTo(current.data);  // Comparamos el elemento con el valor del nodo actual

        if (compareResult < 0) {  // Si es menor, buscamos en el subárbol izquierdo recursivamente
            return searchRecursive(current.left, element);
        } else {  // Si es mayor, buscamos en el subárbol derecho recursivamente
            return searchRecursive(current.right, element);
        }
    }

    public void remove(E element) throws ItemNotFound {
        root = removeRecursive(root, element);
    }

    private Node removeRecursive(Node current, E element) throws ItemNotFound {
        if (current == null) {  // Si el nodo actual es nulo, lanzamos la excepción ItemNotFound
            throw new ItemNotFound("El elemento " + element + " no se encuentra en el árbol.");
        }

        int compareResult = element.compareTo(current.data);  // Comparamos el elemento con el valor del nodo actual

        if (compareResult < 0) {  // Si es menor, lo eliminamos del subárbol izquierdo recursivamente
            current.left = removeRecursive(current.left, element);
        } else if (compareResult > 0) {  // Si es mayor, lo eliminamos del subárbol derecho recursivamente
            current.right = removeRecursive(current.right, element);
        } else {  // Si encontramos el elemento a eliminar
            if (current.left == null && current.right == null) {  // Caso 1: El nodo no tiene hijos
                return null;
            } else if (current.left == null) {  // Caso 2: El nodo solo tiene
            }
        }
		return current;
    }

    private Node findMin(Node current) {//No es necesario
        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    public String toString() {
        return toStringRecursive(root);
    }

    private String toStringRecursive(Node current) {
        if (current == null) {
            return "";
        }

        String result = "";

        result += toStringRecursive(current.left);
        result += current.data.toString() + " ";
        result += toStringRecursive(current.right);

        return result;
    }


        public void inOrder() {
            inOrderRecursive(root);
        }

        private void inOrderRecursive(Node current) {
            if (current == null) {
                return;
            }

            inOrderRecursive(current.left);
            System.out.print(current.data + " ");
            inOrderRecursive(current.right);
        }
    }
