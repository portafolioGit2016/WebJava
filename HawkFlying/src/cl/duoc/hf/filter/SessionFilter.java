package cl.duoc.hf.filter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Check that a session exists and redirect to the login page if it doesn't.
 */
@WebFilter(filterName = "SessionFilter", urlPatterns = { "/*" })
public class SessionFilter implements Filter {
    private static final Logger log = Logger.getLogger(SessionFilter.class.getName());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.log(Level.INFO,"Initializing session filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, 
                         FilterChain filterChain) throws IOException, ServletException {
        String path = ((HttpServletRequest) request).getServletPath();
        if (path!=null && !path.contains("css")){
	        HttpSession session = ((HttpServletRequest) request).getSession(false);
	        if ((session != null && session.getAttribute("usuarioLogeado") != null) 
	             || path.endsWith("login")) {
	            filterChain.doFilter(request, response);
	        }
	        else {
	        	log.log(Level.INFO,"Session has expired requesting url");
	            ((HttpServletResponse) response).sendRedirect("/HawkFlying/login");;
	        }
        }else{
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }

}