import com.ebac.Fila;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila(8);

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.enfileirar(6);
        fila.enfileirar(7);
        fila.enfileirar(8);

        fila.mostrarFila();

        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();

        fila.mostrarFila();

        fila.enfileirar(9);
        fila.enfileirar(10);

        fila.mostrarFila();

        System.out.println("Quantidade esperando na fila: " + fila.getquantidadeFila());
    }
}
