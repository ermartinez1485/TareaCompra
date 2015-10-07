package tareacompra;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class TareaCompra {

    String nombre;
    Integer cedula;
    Double precioProducto1;
    Double precioProducto2;
    Double precioProducto3;
    Double precioProducto4;

    public TareaCompra() {

    }

     public void capturaDatos(){
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite el nombre del Cliente:");
         this.nombre = teclado.nextLine();
         System.out.println("Digite la cedula del Cliente:");
         this.cedula = teclado.nextInt();
         teclado.skip("\n");    
         System.out.println("Digite el precio 1 del producto");
         this.precioProducto1 = teclado.nextDouble();
         teclado.skip("\n");
         System.out.println("Digite el precio 1 del producto");
         this.precioProducto2 = teclado.nextDouble();
         teclado.skip("\n");
         System.out.println("Digite el precio 1 del producto");
         this.precioProducto3 = teclado.nextDouble();
         teclado.skip("\n");
         System.out.println("Digite el precio 1 del producto");
         this.precioProducto4 = teclado.nextDouble();
         teclado.skip("\n");
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCedula(Integer cedula){
    
        this.cedula = cedula;
    }
    
    public void setPrecioProducto1(Double precioProducto1){
    
        this.precioProducto1=precioProducto1;
    }
    
    public void setPrecioProducto2(Double precioProducto1){
    
        this.precioProducto2=precioProducto2;
    }
    
    public void setPrecioProducto3(Double precioProducto1){
    
        this.precioProducto3=precioProducto3;
    }

    public void setPrecioProducto4(Double precioProducto1){
    
        this.precioProducto4=precioProducto4;
    }
    
    public String getNombre(String nombre){
        return nombre;  
    }

    public Integer getCedula() {
        return cedula;
    }

    public Double getPrecioProducto1() {
        return precioProducto1;
    }

    public Double getPrecioProducto2() {
        return precioProducto2;
    }

    public Double getPrecioProducto3() {
        return precioProducto3;
    }

    public Double getPrecioProducto4() {
        return precioProducto4;
    }

    public TareaCompra(String nombre, Integer cedula, Double precioProducto1, Double precioProducto2, Double precioProducto3, Double precioProducto4) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.precioProducto1 = precioProducto1;
        this.precioProducto2 = precioProducto2;
        this.precioProducto3 = precioProducto3;
        this.precioProducto4 = precioProducto4;
    }
    
    public Double getPrecioTodosProductos() {
        return precioProducto1+precioProducto2+precioProducto3+precioProducto4;
    }
}
