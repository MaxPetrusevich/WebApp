package by.it.web.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "HelloServlet", urlPatterns = {"/sayhello"})
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws SecurityException, IOException {
        String value =  req.getParameter("key");
        resp.setContentType("text/html; charset = UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: blue;'>Hello, world! get" + value + "</span></p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value =  req.getParameter("key");
        resp.setContentType("text/html; charset = UTF-8");
        resp.sendRedirect("view.jsp");
        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: blue;'>Hello, world! post" + value + "</span></p>");
    }
}
