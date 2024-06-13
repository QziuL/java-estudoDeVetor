package br.qziul;

import br.qziul.inplementacao.IListaDeCompras;
import br.qziul.inplementacao.ImpListaDeCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int TAM, opcao;

        System.out.println("\n== Configuração inicial ==");
        System.out.println("Quantos itens você vai adicionar na sua lista? ");
        System.out.print("-> ");
        TAM = scan.nextInt();

        IListaDeCompras supermercado = new ImpListaDeCompras(TAM);

        do {
            System.out.println("\n== Lista de Compras ("+supermercado.getQtdItens()+"/"+TAM+") ==");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Deletar item");
            System.out.println("3 - Listar itens");
            System.out.println("4 - Encerrar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do item a ser inserido: ");
                    String item = scan.next();
                    supermercado.add(item);
                    break;
                case 2:
                    System.out.print("Informe o index do item a ser deletado: ");
                    int index = scan.nextInt();
                    supermercado.delete(index);
                    break;
                case 3:
                    supermercado.list();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção informada é inválida. Escolha novamente.");
            }
        }while(opcao != 4);
        scan.close();
    }
}
