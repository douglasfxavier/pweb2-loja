package br.edu.ifpb.loja.model;
/** Esta classe associa um item a um carrinho de compras. O item
 * só está no carrinho se estiver contido num objeto desta classe.
 */

public class ItemCarrinho {
  private Item item;
  private int numItens;

  public ItemCarrinho(Item item) {
    setItem(item);
    setNumItens(1);
  }

  public Item getItem() {
    return(item);
  }

  protected void setItem(Item item) {
    this.item = item;
  }

  public String getItemID() {
    return(getItem().getItemID());
  }

  public String getDescricaoCurta() {
    return(getItem().getDescricaoCurta());
  }

  public String getDescricaoLonga() {
    return(getItem().getDescricaoLonga());
  }

  public double getPrecoUnitario() {
    return(getItem().getPreco());
  }
  
  public int getNumItens() {
    return(numItens);
  }

  public void setNumItens(int n) {
    this.numItens = n;
  }

  public void incrementeNumItens() {
    setNumItens(getNumItens() + 1);
  }

  public void cancelarPedido() {
    setNumItens(0);
  }

  public double getPrecoTotal() {
    return(getNumItens() * getPrecoUnitario());
  }
}
