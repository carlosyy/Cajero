/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private String usuario;
    private String contrasena;
    private String tipocuenta;
    private String tipotrans;
    private int SaldoInicial;
    private int vrTransaccion;
    private int SaldoDisponible;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, String tipocuenta,String tipotrans, int SaldoInicial, int vrTransaccion, int SaldoDisponible) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipocuenta = tipocuenta;
        this.SaldoInicial = SaldoInicial;
        this.vrTransaccion = vrTransaccion;
        this.SaldoDisponible = SaldoDisponible;
        this.tipotrans=tipotrans;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the tipocuenta
     */
    public String getTipocuenta() {
        return tipocuenta;
    }

    /**
     * @param tipocuenta the tipocuenta to set
     */
    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    /**
     * @return the tipotrans
     */
    public String getTipotrans() {
        return tipotrans;
    }

    /**
     * @param tipotrans the tipotrans to set
     */
    public void setTipotrans(String tipotrans) {
        this.tipotrans = tipotrans;
    }

    /**
     * @return the SaldoInicial
     */
    public int getSaldoInicial() {
        return SaldoInicial;
    }

    /**
     * @param SaldoInicial the SaldoInicial to set
     */
    public void setSaldoInicial(int SaldoInicial) {
        this.SaldoInicial = SaldoInicial;
    }

    /**
     * @return the vrTransaccion
     */
    public int getVrTransaccion() {
        return vrTransaccion;
    }

    /**
     * @param vrTransaccion the vrTransaccion to set
     */
    public void setVrTransaccion(int vrTransaccion) {
        this.vrTransaccion = vrTransaccion;
    }

    /**
     * @return the SaldoDisponible
     */
    public int getSaldoDisponible() {
        return SaldoDisponible;
    }

    /**
     * @param SaldoDisponible the SaldoDisponible to set
     */
    public void setSaldoDisponible(int SaldoDisponible) {
        this.SaldoDisponible = SaldoDisponible;
    }
    
    
    
    
}
