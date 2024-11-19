package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
  protected void dopost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
	  String uN = req.getParameter("uname");
	  String pw = req.getParameter("pword");
	  UserBean ub = new loginDAO().login(uN, pw);
	  if(ub==null) {
		  req.setAttribute("msg", "Invalid Login process..<br>");
		  RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
		  rd.forward(req,res);
	  }else {
		  ServletContext sct = req.getServletContext();
		  sct.setAttribute("ubean", ub);
		  Cookie ck = new Cookie("fname",ub.getfName());
		  res.addCookie(ck);
		  RequestDispatcher rd = req.getRequestDispatcher("LogSuccess.jsp");
		  rd.forward(req, res);
		  
	  }
	 
  }
}
