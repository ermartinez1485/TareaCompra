/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareacompra;

/**
 *
 * @author Eric
 */
public class ManejaRegistros {
    
    TareaCompra[] losRegistros;
    
    public ManejaRegistros() {

        this.losRegistros = new TareaCompra[3];
    }
    
    public ManejaRegistros(int x) {
        this.losRegistros = new TareaCompra[x];
    }
    
    
    public boolean agregaRegistro(TareaCompra regi){
        for (int i = 0; i < this.losRegistros.length; i++) {
            if(this.losRegistros[i] == null){
                this.losRegistros[i] = regi;
                return true;
            }   
        }
        return false;
    }
    
    public TareaCompra buscarRegistro(int cedula){
        for (int i = 0; i < this.losRegistros.length; i++) {
            TareaCompra reg = this.losRegistros[i];
            
            if(reg != null){
                if(reg.getCedula() == cedula){
                    return reg;
                }
            }else{
                return reg;
            }
        }
        return null;
    }

    public TareaCompra[] getLosRegistros() {
        return losRegistros;
    }

    public void setLosRegistros(TareaCompra[] losRegistros) {
        this.losRegistros = losRegistros;
    }
    
    
}
