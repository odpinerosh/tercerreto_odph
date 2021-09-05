package tercerreto_odph.Classes;

import java.util.Date;

/**
 *
 * @author odpinerosh
 */
public class Tarjeta extends Cuenta {
    private Date fecha_vence;
    private Double cupo_usado, VI;
    
    public void setFechaVence(Date fechavence) {
        this.fecha_vence = fechavence;
    } 
    
    public Date getFechaVence() {
        return this.fecha_vence;
    }
    
    public void setCupoUsado(Double cupusado) {
        this.cupo_usado = cupusado;
    } 
    
    public Double getCupoUsado() {
        return this.cupo_usado;
    }
    
    
    @Override
    public double calcInteres() {
                
        this.VI = getIntCuenta() * getCupoUsado() / 100; 
        return this.VI;
        
    }
}