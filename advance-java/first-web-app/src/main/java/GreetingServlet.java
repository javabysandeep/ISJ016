import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/greet") // url - servlet mapping
public class GreetingServlet implements Servlet {

    public GreetingServlet() {
        System.out.println("GreetingServlet - constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method");
        res.getWriter().println("good morning : " + LocalDateTime.now());


    }

    @Override
    public void destroy() {
        System.out.println("destroy method");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return "";
    }
}
