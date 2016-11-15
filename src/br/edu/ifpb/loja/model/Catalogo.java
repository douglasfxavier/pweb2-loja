package br.edu.ifpb.loja.model;

import java.util.Arrays;
import java.util.List;

/** Define um catálogo on-line da livraria.
 * Num sistema real essa classe seria substituida por um SGBD.
 * @author Fred
 *
 */

public class Catalogo {

  private static Item[] items =
    { new Item("hall001",
               "<I>Core Servlets and JavaServer Pages</I> " +
                 " de Marty Hall",
               "A referência definitiva sobre servlets " +
                 "e JSP da Prentice Hall e \n" +
                 "Sun Microsystems Press. A primeira edição " +
                 "está disponível em www.coreservlets.com.",
               210.00),
      new Item("kassem001",
               "<I>Designing Enterprise Applications with J2EE</I> " +
                 "de Nicholas Kassem",
               "Aborda as principais tecnologias para  " +
                 "o desenvolvimento de aplicações em J2EE. " +
                 "Está disponível integralmente no site da Sun na " +
                 "seção Java Blue Prints.",
               100.00),
      new Item("britt001",
               "<I>Tomcat. The Definitive Guide</I> by Jason Brittain",
               "Guia vital para o administrador e programador " +
                 "que utilizam o Jakarta Tomcat.",
               19.95),
      new Item("alur001",
               "<I>J2EE Patterns</I> de Deepak Alur e outros",
               "Os autores definem um conjunto de padrões " +
                 "para a plataforma J2EE. " +
                 "Ideal para quem já programa em J2EE " +
                 "e deseja melhorar a flexibilidade, " +
                 "a reutilização e a organização estrutural " +
                 "de suas aplicações. Livro imprescindível para " +
                 "programadores mais avançados.", 
               95.00),
      new Item("geary001",
               "<I>JSP Avançado</I> de " +
                 "David Geary",
               "Livro trás dicas excelentes para programadores JSP. " +
                 "As dicas são muito práticas e realmente úteis. " +
                 "A versão traduzida é uma droga! ",
               75.00)
    };

  public static Item getItem(String itemID) {
    Item item;
    if (itemID == null) {
      return(null);
    }
    for(int i=0; i<items.length; i++) {
      item = items[i];
      if (itemID.equals(item.getItemID())) {
        return(item);
      }
    }
    return(null);
  }
  
  public static List<Item> getItems() {
	  return Arrays.asList(items);	  
  }
}
               
