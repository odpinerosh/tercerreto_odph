package tercerreto_odph.Classes;

/**
 * @author odpinerosh
 */

public class Cliente {
    private String docCliente;
    private String nomCliente;
    private String emailCliente;
    private String celCliente;
    private String dirCliente;
    
    //iniciar los Getters y los Setters de la clase Cliente
    public void setDocCliente (String auxi) {
        this.docCliente = auxi;
    }
    
    public String getDocCliente () {
        return this.docCliente;
    }
    
    public void setNomCliente (String auxi) {
        this.nomCliente = auxi;
    }
    
    public String getNomCliente () {
        return this.nomCliente;
    }
    
    public void setEmailCliente (String auxi) {
        this.emailCliente = auxi;
    }
    
    public String getEmailCliente () {
        return this.emailCliente;
    }
    
    public void setCelCliente (String auxi) {
        this.celCliente = auxi;
    }
    
    public String getCelCliente () {
        return this.celCliente;
    }
    
    public void setDirCliente (String auxi) {
        this.dirCliente = auxi;
    }
    
    public String getDirCliente () {
        return dirCliente;
    }
    
    //
    
}
