package br.edu.ifpb.loja.model;

import java.util.Arrays;
import java.util.List;

/** Define um cat�logo on-line da livraria.
 * Num sistema real essa classe seria substituida por um SGBD.
 * @author Fred
 *
 */

public class Catalogo {

  private static Item[] items =
    { new Item("hall001",
               "<I>Core Servlets and JavaServer Pages</I> " +
                 " de Marty Hall",
               "A refer�ncia definitiva sobre servlets " +
                 "e JSP da Prentice Hall e \n" +
                 "Sun Microsystems Press. A primeira edi��o " +
                 "est� dispon�vel em www.coreservlets.com.",
               210.00),
      new Item("kassem001",
               "<I>Designing Enterprise Applications with J2EE</I> " +
                 "de Nicholas Kassem",
               "Aborda as principais tecnologias para  " +
                 "o desenvolvimento de aplica��es em J2EE. " +
                 "Est� dispon�vel integralmente no site da Sun na " +
                 "se��o Java Blue Prints.",
               100.00),
      new Item("britt001",
               "<I>Tomcat. The Definitive Guide</I> by Jason Brittain",
               "Guia vital para o administrador e programador " +
                 "que utilizam o Jakarta Tomcat.",
               19.95),
      new Item("alur001",
               "<I>J2EE Patterns</I> de Deepak Alur e outros",
               "Os autores definem um conjunto de padr�es " +
                 "para a plataforma J2EE. " +
                 "Ideal para quem j� programa em J2EE " +
                 "e deseja melhorar a flexibilidade, " +
                 "a reutiliza��o e a organiza��o estrutural " +
                 "de suas aplica��es. Livro imprescind�vel para " +
                 "programadores mais avan�ados.", 
               95.00),
      new Item("geary001",
               "<I>JSP Avan�ado</I> de " +
                 "David Geary",
               "Livro tr�s dicas excelentes para programadores JSP. " +
                 "As dicas s�o muito pr�ticas e realmente �teis. " +
                 "A vers�o traduzida � uma droga! ",
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
               
