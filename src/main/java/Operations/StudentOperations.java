
package Operations;

import com.mypack.mavenhibernate.Student;
import javax.servlet.ServletContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentOperations {

    ServletContext ctx;
    SessionFactory sfobj;
    Session session;  
    Transaction tx = null;
    
    
    public StudentOperations(ServletContext ctx) {
        this.ctx = ctx;
    }

    public String insertStudent(Student s) {

        System.out.println("ctx---"+ctx);
        String msg = "";
        try {
            System.out.println("sfobj---"+sfobj);
            sfobj = (SessionFactory) ctx.getAttribute("sf");
            System.out.println("sfobj---"+sfobj);
            if (sfobj!= null) {
                session = sfobj.openSession();
                System.out.println("session----"+session);
                if (session!= null) { 
                     tx = session.beginTransaction();
                   session.save(s);    
                   tx.commit();
                    msg = "success";

                } else {
                    msg = "error";
                }
            } else {
                msg = "error";
            }
            session.close();

        } catch (Exception e) {
            msg = "error-";
            System.out.println("error-----------------------------"+e.getMessage());
        }

        return msg;
    }
               
}
