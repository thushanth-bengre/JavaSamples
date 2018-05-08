
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bengre
 */
public class RequestHeader extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<HTML>\n" +
            "<HEAD><TITLE>" + "Header Example using Servlet" + "</TITLE></HEAD>\n" +
            "<BODY BGCOLOR=\"#FDF5E6\">\n" +
            "<H1 ALIGN=\"CENTER\">" + "Header Example using Servlet" + "</H1>\n" +
            "<B>Request Method: </B>" +
            request.getMethod() + "<BR>\n" +
            "<B>Request URI: </B>" +
            request.getRequestURI() + "<BR>\n" +
            "<B>Request Protocol: </B>" + request.getProtocol() + "<BR><BR>\n" +
            "<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Header Name<TH>Header Value");
        Enumeration names = request.getHeaderNames();
        
        while(names.hasMoreElements()){
            String name = (String) names.nextElement();
            Enumeration values = request.getHeaders(name);
            
            if(values != null){
                while(values.hasMoreElements()){
                    String value = (String) values.nextElement();
                    out.println("<TR><TD>" + name);
                    out.println(" <TD>" + value);
                }
                out.println("</TABLE>\n</BODY></HTML>");
            }
        }
        
    }
    
}
