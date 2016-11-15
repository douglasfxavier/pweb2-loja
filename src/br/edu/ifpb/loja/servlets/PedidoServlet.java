package br.edu.ifpb.loja.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import br.edu.ifpb.loja.model.*;

/**
 * Servlet implementation class PedidoServlet
 */
@WebServlet("/pedido")
public class PedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item = request.getParameter("itemID");
		int qtditens = Integer.parseInt(request.getParameter("qtd-itens"));
		HttpSession session = request.getSession();
		
		Carrinho c = (Carrinho) session.getAttribute("carrinho");
		
		if (c  == null){
			c = new Carrinho();
			c.adicioneItem(item);
			c.setQtdeItens(item, qtditens);
			session.setAttribute("carrinho", c);
		}else{
			c.adicioneItem(item);
			c.setQtdeItens(item, qtditens);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("pedido/consulta.jsp");
		rd.forward(request, response);
	}

}
