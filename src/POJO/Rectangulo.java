/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Windows 10
 */
public class Rectangulo {
//   Atributos

   private double lado1;
   private double lado2;

//   Constructores
   public Rectangulo() {
      super();
   }

   public Rectangulo(double lado1, double lado2) {
      super();
      this.lado1 = lado1;
      this.lado2 = lado2;
   }
   
//   Metodos
   public double calcularArea(){
      return lado1*lado2;
   }

}
