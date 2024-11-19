package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		UserBean ub = new UserBean();
		ub.setuName(req.getParameter("uname"));
		ub.setpWord(req.getParameter("pword"));
		ub.setfName(req.getParameter("fname"));
		ub.setlName(req.getParameter("lname"));
		ub.setAddr(req.getParameter("addr"));
		ub.setAddr(req.getParameter("addr"));
		ub.setmId(req.getParameter("mid"));
		ub.setphNo(Long.parseLong(req.getParameter("phno")));
		int k = new RegisterDAO().insert(ub);
		if(k>0) {
			req.setAttribute("msg", "User register Successfully..<br>");
			RequestDispatcher rd = req.getRequestDispatcher("RegSuccess.jsp");
			rd.forward(req,res);
		}
		
	}

}
