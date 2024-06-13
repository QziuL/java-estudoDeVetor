package br.qziul.inplementacao;

public interface IListaDeCompras {
    void add(final String item);
    void list();
    void delete(final int index);
    int getQtdItens();
}
