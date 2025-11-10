import jakarta.servlet.http.*;
import java.io.*;

public class PRP_CSE extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		//int i=req.getParameter("num1");
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		//System.out.println("Result : "+k);
		
		PrintWriter out=res.getWriter();
		out.println("Result: "+k);
		}
}
