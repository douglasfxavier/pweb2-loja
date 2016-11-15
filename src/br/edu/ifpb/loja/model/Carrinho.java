package br.edu.ifpb.loja.model;
import java.util.*;

public class Carrinho {
	private List<ItemCarrinho> itemsCarrinho;

	/** Cria um carrinho vazio. */

	public Carrinho() {
		itemsCarrinho = new ArrayList<ItemCarrinho>();
	}

	/** Retorna o vetor de itens do carrinho.
	 */

	public List<ItemCarrinho> getItemsCarrinho() {
		return (itemsCarrinho);
	}

	/** Verifica se já existe um item deste no carrinho. Se
	 * existir, aumenta a quantidade dele. Se não, cria um novo
	 * item no carrinho
	 */

	public synchronized void adicioneItem(String itemID) {
		ItemCarrinho item;
		// Procura por um item já presente e aumenta a quanidade
		for (int i = 0; i < itemsCarrinho.size(); i++) {
			item = (ItemCarrinho) itemsCarrinho.get(i);
			if (item.getItemID().equals(itemID)) {
				item.incrementeNumItens();
				return;
			}
		}
		// Cria um novo item
		ItemCarrinho novoItem = new ItemCarrinho(Catalogo.getItem(itemID));
		itemsCarrinho.add(novoItem);
	}

	/** Procure por item indicado no carrinho e define a quantidade
	 * de itens. Se quantidade for 0 ou negativo, retira do carrinho.
	 * Se for positiva, aumenta a quantidade no carrinho.
	 */

	public synchronized void setQtdeItens(String itemID, int quantidade) {
		ItemCarrinho item;
		for (int i = 0; i < itemsCarrinho.size(); i++) {
			item = (ItemCarrinho) itemsCarrinho.get(i);
			if (item.getItemID().equals(itemID)) {
				if (quantidade <= 0) {
					itemsCarrinho.remove(i);
				} else {
					item.setNumItens(quantidade);
				}
				return;
			}
		}
		ItemCarrinho novoItem = new ItemCarrinho(Catalogo.getItem(itemID));
		itemsCarrinho.add(novoItem);
	}
}
