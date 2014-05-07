package persistencia;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;



public class GeraBanco {

	public static void main(String[] args) {
		
		Configuration conf = new AnnotationConfiguration();
		conf.configure("persistencia/hibernate.cfg.xml");
		SchemaExport se = new SchemaExport(conf);
		se.create(true, true);
		
	}

}
