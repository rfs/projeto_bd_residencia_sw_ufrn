package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import dominio.Especialidade;
import dominio.Medico;

public class TestCadastro {
	
	public static void main(String args){
		
		Configuration cfg = new AnnotationConfiguration();
		
		cfg.configure("/persistencia/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory(); //Fábrica de sessões
		Session session = sf.openSession();
		
		//Cria uma transação
		org.hibernate.Transaction tx = session.beginTransaction();
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		
		Medico medico = new Medico();
		medico.setNome("Joao");
		medico.setEspecialidade(especialidade);
		
		session.save(medico);
		
		tx.commit();
		
		session.close();	
		
		
	}

}
