package testPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/** Simple servlet for testing. Generates HTML instead of plain
 *  text as with the HelloWorld servlet.
 */

@WebServlet("/test1")
public class TestServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println
      ("<!DOCTYPE html>\n" +
       "<html>\n" +
       "<head><title>A Test Servlet</title></head>\n" +
       "<body bgcolor=\"#fdf5e6\">\n" +
       "<h1>Test</h1>\n" +
       "<p>Simple servlet for testing.</p>\n" +
       "<p>This is TestServlet.java, outputtinng text in an HTML doc.</p>\n" +
       "<p>This is servlet uses an @WebServlet('/test1') annotation.</p>\n" +
       "</body></html>");
    out.println ("This is a println not in an HTML doc.");
    out.println
    ("<!DOCTYPE html>\n" +
     "<html>\n" +
     "<head><title>A Test Servlet</title></head>\n" +
     "<body bgcolor=\"#fdf5e6\">\n" +
     "<h1>Test</h1>\n" +
     "<p>This is another HTML doc.</p>\n" +
     "</body></html>");
  }
}
