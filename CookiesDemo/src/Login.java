

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		String user = request.getParameter("user");
		String pswd=request.getParameter("pswd");
		if(pswd.equals("admin")) {
			//1.store the cookie 2.print a statement
			Cookie ck = new Cookie("usersave",user);
			request.getRequestDispatcher("index.html").include(request, response);
			pw.print("Login is Done Successfull");
			response.addCookie(ck); 	
		}
		else {
			pw.print("Please Enter the Correct Login Details");
		}
	}

}
