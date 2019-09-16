import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class TestHib {

	public static void main(String args[])
	{
	Configuration config=new Configuration().configure().addAnnotatedClass(Players.class);
	
	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	SessionFactory sf=config.buildSessionFactory(reg);
	
	Session session=sf.openSession();
	
	//Players p=null;
	
	//Creating obj of embeddable class to pass values
	FullName fn=new FullName("MS","Dhoni");
	
	
	//Using Embeddable class object to pass on values
	Players players=new Players(07,fn,10,"India");
	
	Transaction tr=session.beginTransaction();
	
	
	//Using select query for retrieving record from table
	//p=(Players)session.get(Players.class,18);
	
	//For inserting data into the table
	session.save(players);
	tr.commit();
	session.close();
	//System.out.println(p);
	
	}
	
}
