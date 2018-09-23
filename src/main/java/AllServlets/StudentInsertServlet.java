/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





package AllServlets;


import com.mypack.mavenhibernate.Student;
import Operations.StudentOperations;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentInsertServlet extends HttpServlet {

ServletContext scx;
@Override
public void init(ServletConfig sc) throws ServletException 
     {        
         super.init(sc);
         scx = getServletContext();

        try {          
            scx = sc.getServletContext();                                 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        
        boolean check;

        System.out.println("------servlet---51");
        String  name=request.getParameter("name");
        String password=request.getParameter("password");
        Long cno=Long.parseLong(request.getParameter("cno"));
        Float cpi=Float.parseFloat(request.getParameter("cpi"));
        Double spi=Double.parseDouble(request.getParameter("spi"));
        
        String savemsg=null;
        
        StudentOperations so=new StudentOperations(scx);
        Student sobj=new Student();
        System.out.println("----------ser 62");
        sobj.setName(name);
        
        sobj.setPassword(password);
        sobj.setCno(cno);
        sobj.setCpi(cpi);
        sobj.setSpi(spi);
        
        savemsg=so.insertStudent(sobj);
        
        System.out.println("Success......");
        System.out.println("hello hitler");
        out.println(savemsg);
        response.sendRedirect("index.jsp?msg="+savemsg);
    }
}
        