import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = {"/s1", "/s2", "/s3"})
public class CustomFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("CustomFilter::doFilter");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
            chain.doFilter(request, response);
        } else {
            response.getWriter().println("invalid credentials");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CustomFilter::init");
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilter::destroy");
    }
}
