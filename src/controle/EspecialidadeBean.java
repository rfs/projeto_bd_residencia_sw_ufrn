package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import persistencia.GeralDAO;
import dominio.Especialidade;

public class EspecialidadeBean {
	
	private Especialidade obj = new Especialidade();
	
	private List all;
	
	private String valueBotaoCadastro = "Cadastrar";
	
	public EspecialidadeBean() {
		
	}
	
	public String cadastrar() {
		
		GeralDAO dao = new GeralDAO();
		dao.create(obj);
		dao.closeSession();
		return "listaEspecialidade";
		
	}
	
	public void remover(ActionEvent evt) {
		
		String id = FacesUtil.getRequest().getParameter("id");
		Especialidade c = new Especialidade();
		c.setId(Integer.parseInt(id));
		GeralDAO dao = new GeralDAO();
		dao.delete(c);
		dao.closeSession();
	}
	
	 public String getValueBotaoCadastro() {
	        return valueBotaoCadastro;
	 }
	 
	 public void setValueBotaoCadastro(String valueBotaoCadastro) {
	        this.valueBotaoCadastro = valueBotaoCadastro;
	 }
	 
	 public String alterar() {
	        String id = FacesUtil.getRequest().getParameter("id");
	        GeralDAO dao = new GeralDAO();
	        obj = (Especialidade) dao.findByPrimaryKey(Especialidade.class, Integer.parseInt(id));
	        dao.closeSession();
	        valueBotaoCadastro = "Alterar";
	        return "cadEspecialidade";
	 }
	 
	 public List<Especialidade> getAll() {
	        if ( all == null ) {
	            GeralDAO dao = new GeralDAO();
	            all =  dao.findAll(Especialidade.class);
	            dao.closeSession();
	        }
	        return all;
	       
	 }
	 
	 public List<SelectItem> getAllCombo() {
		    
	        List<Especialidade> todos = getAll();
	        ArrayList<SelectItem> listaCombo = new ArrayList<SelectItem>();
	        for ( Especialidade e : todos ) {
	            SelectItem item = new SelectItem(e.getId(), e.getNome());
	            listaCombo.add(item);
	        }
	        return listaCombo;
	        
	 }
	 
	 public String listarEspecialidades() {
	       
	        return "listaEspecialidade";
	 }
	 
	 public Especialidade getObj() {
	        
		 return obj;
	 }
	 
	 public void setObj(Especialidade obj) {
	        
		 this.obj = obj;
	 }


	    

}
