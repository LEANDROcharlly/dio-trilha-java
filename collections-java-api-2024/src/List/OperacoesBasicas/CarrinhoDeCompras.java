package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionartItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valor = 0 ;
        double valorTotal = 0;
        for (Item i : itemList) {
            valor = i.getPreco() * i.getQuantidade();
            valorTotal += valor; 
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listaItem = new CarrinhoDeCompras();
        listaItem.exibirItens();
        listaItem.adicionartItem("caderno", 5.5, 2);
        listaItem.adicionartItem("lapiseira", 10.5, 1);
        listaItem.exibirItens();
        System.out.println("valor total " + listaItem.calcularValorTotal());
        listaItem.removerItem("caderno");
        System.out.println("valor total " + listaItem.calcularValorTotal());
        listaItem.exibirItens();
    }
}
