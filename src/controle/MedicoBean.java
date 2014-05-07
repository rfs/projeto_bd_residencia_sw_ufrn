package controle;

import java.util.List;

import javax.faces.event.ActionEvent;

import persistencia.GeralDAO;
import dominio.Medico;

public class MedicoBean {
	
private Medico obj = new Medico();
    
    private List all;
    
    private String valueBotaoCadastro = "Cadastrar";
    
    /** Creates a new instance of CentroBean */
    public MedicoBean() {
    }
    
    public String cadastrar() {
        GeralDAO dao = new GeralDAO();
        dao.create(obj);
        dao.closeSession();
        return "listaMedicos";
    }
    
    public void remover(ActionEvent evt) {
        String id = FacesUtil.getRequest().getParameter("id");
        Medico m = new Medico();
        m.setId(Integer.parseInt(id));
        GeralDAO dao = new GeralDAO();
        dao.delete(m);
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
        obj = (Medico) dao.findByPrimaryKey(Medico.class, Integer.parseInt(id));
        dao.closeSession();
        valueBotaoCadastro = "Alterar";
        return "cadMedico";
    }
    
    public List getAll() {
        if ( all == null ) {
            GeralDAO dao = new GeralDAO();
            all =  dao.findAll(Medico.class);
            dao.closeSession();
        }
        return all;
    }

    public Medico getObj() {
        return obj;
    }

    public void setObj(Medico obj) {
        this.obj = obj;
    }

}
