import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

// url - servlet mapping
@WebServlet(value = "/hello", loadOnStartup = 2)
public class HelloServlet implements Servlet {
    /*
    *
     01. this class object will be created by Server
     02. either at first request or at the time of app deployment if load on startup is specified
     03. by default this class object will be created at first request.

        this is called as servlet life cycle
     04. init() method will be called only once when the object of this class is created.
     05. service() method will be called everytime request is made to the given url.
     06. destroy() method will be called only once when the app is stopped or undeployed.


    * */
    public HelloServlet() {
        System.out.println("HelloServlet::constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("HelloServlet::init");
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
        writer.println("Good morning hello how are you!!!! " + LocalDateTime.now());
    }

    @Override
    public void destroy() {
        System.out.println("HelloServlet::destroy");
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
