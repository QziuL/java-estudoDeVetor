package br.qziul.inplementacao;

public interface ISupermercado {
    void add(final String item);
    void list();
    void delete(final int index);
    int getQtdItens();
}
