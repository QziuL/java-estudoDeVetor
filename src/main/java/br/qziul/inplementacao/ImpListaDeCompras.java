package br.qziul.inplementacao;

public class ImpListaDeCompras implements IListaDeCompras {
    private String[] itens;
    private int ultimaPosicao;

    public ImpListaDeCompras(int TAM) {
        this.itens = new String[TAM];
        ultimaPosicao = -1;
    }

    @Override
    public void add(final String item) {
        if(ultimaPosicao == (itens.length-1))
            System.err.println("A lista está cheia.");
        else {
            ultimaPosicao++;
            itens[ultimaPosicao] = item;
        }
    }

    @Override
    public void list() {
        System.out.println("==============================");
        if(ultimaPosicao == -1) {
            System.out.println("Lista está vazia.");
        }
        for(int i = 0; i <= ultimaPosicao; i++){
            System.out.println(i+" - "+itens[i]);
        }
        System.out.println("==============================");
    }

    @Override
    public void delete(int index) {
        if(index < 0 || index > ultimaPosicao)
            System.err.println("Index inválido: "+index);
        else
            shift(index);
    }

    @Override
    public int getQtdItens() {
        return (ultimaPosicao + 1);
    }

    private void shift(int index){
        for(int i = index; i < ultimaPosicao; i++) {
            itens[i] = itens[i+1];
        }
        ultimaPosicao--;
    }
}