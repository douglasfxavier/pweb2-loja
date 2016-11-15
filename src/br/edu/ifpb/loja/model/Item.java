package br.edu.ifpb.loja.model;
/** Descreve um item de catálogo da livraria.
 * 
 */

public class Item {
  private String itemID;
  private String descricaoCurta;
  private String descricaoLonga;
  private double preco;

  public Item(String itemID, String curta,
              String longa, double preco) {
    setItemID(itemID);
    setDescricaoCurta(curta);
    setDescricaoLonga(longa);
    setPreco(preco);
  }
    
  public String getItemID() {
    return(itemID);
  }

  protected void setItemID(String itemID) {
    this.itemID = itemID;
  }

  public String getDescricaoCurta() {
    return(descricaoCurta);
  }

  protected void setDescricaoCurta(String descricao) {
    this.descricaoCurta = descricao;
  }

  public String getDescricaoLonga() {
    return(descricaoLonga);
  }

  protected void setDescricaoLonga(String descricao) {
    this.descricaoLonga = descricao;
  }

  public double getPreco() {
    return(preco);
  }

  protected void setPreco(double preco) {
    this.preco = preco;
  }
}
  
