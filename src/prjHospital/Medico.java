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
public class Medico extends Funcionario{
   private String crm;
   private String especialidade;
   private double valorhora;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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
       bonus = salario + (salario *(30/100));
       return bonus;
   }
}
