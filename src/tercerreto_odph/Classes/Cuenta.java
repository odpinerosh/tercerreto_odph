package tercerreto_odph.Classes;

import java.util.Date;

/**
 *
 * @author odpinerosh
 */
public abstract class Cuenta {

    private String numCuenta;
    private Date fechCuenta;
    private double intCuenta;
    private double salCuenta;
    
    public void setNumCuenta(String numeroCta) {
        this.numCuenta = numeroCta;
    }
    
    public String getNumCuenta() {
        return this.numCuenta;
    }
    
    public void setFechCuenta(Date fechaCta) {
        this.fechCuenta = fechaCta;
    }
    
    public Date getFechCuenta() {
        return this.fechCuenta;
    }
    
    public void setIntCuenta(double interesCta) {
        this.intCuenta = interesCta;
    }
    
    public double getIntCuenta() {
        return this.intCuenta;
    }
    
    public void setSalCuenta(double saldoCta) {
        this.salCuenta = saldoCta;
    }
    
    public double getSalCuenta() {
        return this.salCuenta;
    }
    
    //Método abstracto
    public abstract double calcInteres();
    
    
}
