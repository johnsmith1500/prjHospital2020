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
public class Funcionario extends Pessoa{
    private int matricula;
    private String senha;
    private double valorhora;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double calcularSalario(){
        double salario;
        salario = valorhora * 30;
        return salario;
    }
   public double calcularSalario(double desconto){
       double salario;
       double descontar;
       salario = valorhora * 30;
       descontar = salario - (salario *(desconto/100));
       return descontar;
   }
   public double gerarBonus(){
       double salario;
       double bonus;
       salario = valorhora * 30;
       bonus = salario + (salario *(10/100));
       return bonus;
   }
}
