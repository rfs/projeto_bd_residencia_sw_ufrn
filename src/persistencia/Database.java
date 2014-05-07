package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Database {

	// �nica inst�ncia da classe Database
	private static Database singleton = new Database();

	// Int�ncia do SessionFactory
	private SessionFactory sf;

	// Construtor privado
	private Database() {
		sf = (new AnnotationConfiguration().configure("/persistencia/hibernate.cfg.xml"))
				.buildSessionFactory();
	}

	// ...
	// ...

	// M�todo que retorna inst�ncia
	// �nica da classe Database
	public static Database getInstance() {
		return singleton;
	}

	// Retorna sessao com o banco
	public Session getSession() {
		return sf.openSession();
	}
}