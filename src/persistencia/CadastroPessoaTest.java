package persistencia;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import dominio.Especialidade;
import dominio.Medico;


public class CadastroPessoaTest {
	


	private static Database database;
	
	/**
	 * CRIA AS TABELAS DO BANCO APENAS UMA VEZ PARA TODOS OS METODOS DE TESTE DESSA CLASSE
	 */
	
	public static void gerarBanco() {
		Configuration conf = new AnnotationConfiguration();
		conf.configure("persistencia/hibernate.cfg.xml");
		SchemaExport se = new SchemaExport(conf);
		se.create(true, true);
		
		 database = Database.getInstance();
	}
	
	private GeralDAO getSessionHibernate() {
		GeralDAO geralDAO = new GeralDAO(database.getSession());
		return geralDAO;
	}
	
	
	public void testCadastroMedico() {
		
		GeralDAO geralDAO = getSessionHibernate();
		 
		Medico medico = new Medico();
		medico.setNome("Wagner");
		geralDAO.create(medico);
	}
	
	public void testCadastroEspecialidade() {
		
		GeralDAO geralDAO = getSessionHibernate();
		 
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Neurologia");
		geralDAO.create(especialidade);
	}

	
	public void testCadastroMedicoComEspecialidade() {
		
		GeralDAO geralDAO = getSessionHibernate();
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		
		Medico medico = new Medico();
		medico.setNome("Joao");
		medico.setEspecialidade(especialidade1);
		
	}
	
	
}