package br.edu.ifpb.loja.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import br.edu.ifpb.loja.model.*;

/**
 * Servlet implementation class ResumoServlet
 */
@WebServlet("/resumo")
public class ResumoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		Carrinho c = (Carrinho) session.getAttribute("carrinho");
		
		double total = 0;
		if (c  != null){
			
			for(ItemCarrinho ic: c.getItemsCarrinho()){
				total += ic.getPrecoTotal();
			}
		}else{
			
		}
		request.setAttribute("total", total);
		RequestDispatcher rd = request.getRequestDispatcher("pedido/pgto.jsp");
		rd.forward(request, response);
	}

}
