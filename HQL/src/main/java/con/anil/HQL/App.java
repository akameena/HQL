package con.anil.HQL;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Student stu = new Student();
        
        Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf = conf.buildSessionFactory(sr);
        Session session =  sf.openSession();
        session.beginTransaction();
        Random rand = new Random();
        for(int i =1;i<=50;i++)
        {
        	Student stu = new Student();
        	stu.setId(i);
        	stu.setRoll_no(rand.nextInt(100));
        	stu.setName("anil"+i);
        	session.save(stu);
        }
       
        session.getTransaction().commit();
    }
    
    
}
