import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ola
 */
@WebServlet("/Ola")
public class Ola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ola() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long inicio = System.nanoTime();
		String nome = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String endereco = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String genero = request.getParameter("genero");
		int idade = Integer.valueOf(request.getParameter("idade"));
		String linguagens = "";
		if(request.getParameter("linguagem")!=null) {
			linguagens = linguagens + request.getParameter("linguagem") + " ";
		}
		if(request.getParameter("linguagem2")!=null) {
			linguagens = linguagens + request.getParameter("linguagem2") + " ";
		}
		if(request.getParameter("linguagem3")!=null) {
			linguagens = linguagens + request.getParameter("linguagem3") + " ";
		}
		if(linguagens.equals("")) {
			linguagens = "Nenhuma Linguagem";
		}
		String comentario = request.getParameter("comentarios");
		
		if(nome.equals("") || senha.equals("")) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<center><h1>Error</h1><h3><br /><br />"+"Formulario foi preenchido incorretamente</h3></center>");
			out.close();
		}else {
			switch(idade) {
				case 1:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						long termino = System.nanoTime();
						double fim = (termino - inicio)/0.000000001;
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"<br /><br /> Execução: " +fim+ " segundos</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 10:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 20:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 30:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 40:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 50:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 60:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 70:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 80:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
				case 90:
					if(genero.equals("m")) {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero masculino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}else {
						response.setContentType("text/html;charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<center><h1>Bem Vindo</h1><h3>"+nome+" com a senha "+senha+", <br />"
								+ "que mora no endereço "+endereco+", na cidade "+cidade+ ", <br />"
								+ "estado "+estado+", do gênero feminino, tem entre 1 a 10 anos, sabe as seguintes linguagens:"
								+ "<br /><br />"+linguagens+"<br /><br /> Sua Descrição é a seguinte: "+comentario+"</h3></center>");
						out.close();
					}
					break;
			}
			
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
