import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

// map /hi url with this Servlet using web.xml
public class HiServlet implements Servlet {
    public HiServlet() {
        System.out.println("HiServlet::constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("HiServlet::init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    /*
            ServletRequest and ServletResponse type objects will be created by server.
            ServletRequest object will hold the data sent by client.
            ServletResponse object will be holding the data which has to be sent to the client

            send data to the client
    * */
        PrintWriter writer = res.getWriter();
        writer.println("Good morning Hi how are you!!!! " + LocalDateTime.now());
    }

    @Override
    public void destroy() {
        System.out.println("HiServlet::destroy");
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
