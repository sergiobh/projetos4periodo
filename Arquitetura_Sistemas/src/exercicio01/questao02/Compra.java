package exercicio01.questao02;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Compra {

    private ITipoDePagamento tipoDePagamento;
    private List<ItemDeCompra> itensDeCompra;

    public Compra(ITipoDePagamento tipoDePagamento) {
        this.itensDeCompra = new LinkedList<ItemDeCompra>();
        this.tipoDePagamento = tipoDePagamento;
    }

    public boolean AdicionarItemNaCompra(ItemDeCompra novoItem) {
        return this.itensDeCompra.add(novoItem);
    }

    public double ValorDoDesconto() {
        double valorDoDesconto = 0;
        ListIterator litr = this.itensDeCompra.listIterator();
        while (litr.hasNext()) {
            ItemDeCompra  itemDeCompra = (ItemDeCompra) litr.next();

            valorDoDesconto =+ this.tipoDePagamento.valorDoDesconto() * (itemDeCompra.getQuantidade() * itemDeCompra.getValorUnitario());
        }
        return valorDoDesconto;
    }

    public void setTipoDePagamento(ITipoDePagamento tipoDePagamento){
        this.tipoDePagamento = tipoDePagamento;
    }
}
