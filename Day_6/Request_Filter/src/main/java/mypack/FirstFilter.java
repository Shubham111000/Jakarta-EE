package mypack;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class FirstFilter
 */
public class FirstFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FirstFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try
		{
		String name=request.getParameter("nm");
		String age=request.getParameter("ag");
		FileWriter fw=new FileWriter("F:\\loginfile.txt");
		fw.write(name);
		fw.write(age);
		fw.close();
PrintWriter pw=response.getWriter();
pw.println("<br>Data saved in a file<br>");	
		}
		catch(Exception e)
		{
			System.out.println("in first"+e);
		}		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
