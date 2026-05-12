class ArbolBinario {
    Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierda = insertarRecursivo(actual.izquierda, valor);
        } else if (valor > actual.valor) {
            actual.derecha = insertarRecursivo(actual.derecha, valor);
        }
        return actual;
    }
}
