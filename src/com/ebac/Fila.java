package com.ebac;

public class Fila {

    private Object[] fila;
    private int inicio;
    private int fim;

    public Fila(int capacidade){
        fila = new Object [capacidade];
    }

    public void enfileirar(Object obj){

        if(!filacheia()){
            if(fim == fila.length)
                moverElementosParaInicio();

            fila[fim] = obj;
            fim++;
        }else{
            System.out.println("A fila está cheia");
        }

    }

    private void moverElementosParaInicio() {

        int indice = 0;

        for (int i = inicio; i < fim; i++) {

            fila[indice] = fila[i];
            indice++;
            
        }
        inicio = 0;
        fim = indice;
        limparItensMovidos(indice);

    }

    public void desenfileirar(){

        if (!filaVazia()){
            System.out.println(String.format("O elemento '%s' foi retirado da fila", fila[inicio]));
            fila[inicio] = null;
            inicio++;
        }else
            System.out.println("A fila está vazia, você precisa enfileirar algum elemento para desenfileirar!");

    }

    private void limparItensMovidos(int comeco) {

        do{
            fila[comeco] = null;
            comeco++;
        }while (comeco < fila.length);

    }

    public boolean filaVazia(){
        return inicio == fim;
    }

    public boolean filacheia(){
        return getquantidadeFila() == fila.length;
    }


    public int getquantidadeFila() {
        return fim - inicio;
    }

    public void mostrarFila(){

        if (!filaVazia()){
            for (int i = inicio; i < fim; i++) {
                System.out.println(fila[i]);
            }
        }else
            System.out.println("a fila está vazia");

    }
}
