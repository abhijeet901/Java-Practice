
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	String name=request.getParameter("name");
		String contactnumber=request.getParameter("contactnumber");
		String pwd=request.getParameter("pwd");
		
		System.out.println("name is" +name);
		System.out.println("contactnumber is" +contactnumber);
		System.out.println("pwd is" +pwd);
		
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("contactnumber", contactnumber);
		request.getSession().setAttribute("pwd", pwd);
		
		response.sendRedirect("userdetails.html");
    }
 
}
