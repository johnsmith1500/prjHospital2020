/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjHospital;

/**
 *
 * @author Aluno02
 */
public class Enfermeiro extends Funcionario{
    private String coren;
    private double valorhora;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
     /**
     *
     * @return
     */
    @Override
  public double gerarBonus(){
       double salario;
       double bonus;
       salario = valorhora * 30;
       bonus = salario + (salario *(20/100));
       return bonus;
   }
}
