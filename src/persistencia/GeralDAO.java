package persistencia;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;

public class GeralDAO {

	// Operacoes generalizadas
	protected static final int INSERIR = 1;
	protected static final int ATUALIZAR = 2;
	protected static final int REMOVER = 3;

	// Sessao com o hibernate
	private Session session;
	
	private org.hibernate.Transaction tx;
	
	public GeralDAO() {
		session = Database.getInstance().getSession();
	}

	public GeralDAO(Session sessao) {
		session = sessao;
	}
	
	public void beginTransaction() {
		tx = session.beginTransaction();
	}
	
	public void commitTransaction() {
		tx.commit();
	}

	// ...
	// ...

	// Retorna sessao
	protected Session getSession() {
		if (session == null) {
			session = Database.getInstance().getSession();
		}
		return session;
	}

	// Fecha sessao
	public void closeSession() {

		if (session != null)
			session.close();
	}

	// ...
	// ...

	public void change(Object obj, int operacao) {
		if ( tx == null)
			tx = session.beginTransaction();
		switch (operacao) {
		case INSERIR:
		case ATUALIZAR:
			session.saveOrUpdate(obj);
			break;

		case REMOVER:
			session.delete(obj);
			break;
		}
		tx.commit();
	}

	// ...
	// ...
	// Persiste objeto
	public void create(Object obj) {
		change(obj, INSERIR);
	}

	// Atualiza objeto
	public void update(Object obj) {
		change(obj, ATUALIZAR);
	}

	// Remove objeto
	public void delete(Object obj) {
		change(obj, REMOVER);
	}

	// Busca pela chave prim�ria
	public Object findByPrimaryKey(Class classe, int id) {
		return session.get(classe, id);
	}
	
	public Object findByPrimaryKeyLock(Class classe, int id) {
		return session.get(classe, id, LockMode.UPGRADE);
	}
        
        public List findAll(Class classe) {
            Criteria c = session.createCriteria(classe);
            return c.list();
        }
        
}