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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PACIENTES");
        System.out.println(" ");
        
        Paciente p = new Paciente();
        p.setNome("Paulo Ricardo");
        p.setIdade(31);
        p.setCpf("529234304-42");
        p.setRg("97.932.45.5");
        p.setCodPaciente(292721);
        p.setSenha("27924k46sue");
        System.out.println("Nome: "+p.getNome());
        System.out.println("Idade: "+p.getIdade());
        System.out.println("CPF: "+p.getCpf());
        System.out.println("RG: "+p.getRg());
        System.out.println("Cód. Paciente: "+p.getCodPaciente());
        System.out.println("Senha: "+p.getCodPaciente());
        System.out.println("-------------------------");
        System.out.println(" ");
        
        System.out.println("FUNCIONÁRIOS");
        System.out.println(" ");
        
        Funcionario f = new Funcionario();
        f.setNome("Maria Aparecida");
        f.setIdade(46);
        f.setCpf("453869499-42");
        f.setRg("75.795.87.3");
        f.setMatricula(67645);
        f.setSenha("9723jfhk53");
        System.out.println("Nome: "+f.getNome());
        System.out.println("Idade: "+f.getIdade());
        System.out.println("CPF: "+f.getCpf());
        System.out.println("RG: "+f.getRg());
        System.out.println("Matrícula: "+f.getMatricula());
        System.out.println("Senha: "+f.getSenha());
        System.out.println("-------------------------");
        System.out.println(" ");
        
        System.out.println("ENFERMEIROS");
        System.out.println(" ");
        
        Enfermeiro e = new Enfermeiro();
        e.setNome("Eduardo Costa");
        e.setIdade(27);
        e.setCpf("40282044-43");
        e.setRg("32.875.55.5");
        e.setMatricula(42568);
        e.setSenha("3402dl35el45");
        e.setCoren("DF 000-ENF");
        System.out.println("Nome: "+e.getNome());
        System.out.println("Idade: "+e.getIdade());
        System.out.println("CPF: "+e.getCpf());
        System.out.println("RG: "+e.getRg());
        System.out.println("Matrícula: "+e.getMatricula());
        System.out.println("Senha: "+e.getSenha());
        System.out.println("COREN: "+e.getCoren());
        System.out.println("-------------------------");
        System.out.println(" ");
    
        System.out.println("MÉDICOS");
        System.out.println(" ");
        
        Medico m = new Medico();
        m.setNome("Marcia Garcia");
        m.setIdade(36);
        m.setCpf("49528599-34");
        m.setRg("94.245.34.2");
        m.setMatricula(27359);
        m.setSenha("4248ofj549kj");
        m.setCrm("DF 000-MED");
        m.setEspecialidade("Clínico Geral");
        System.out.println("Nome: "+m.getNome());
        System.out.println("Idade: "+m.getIdade());
        System.out.println("CPF: "+m.getCpf());
        System.out.println("RG: "+m.getRg());
        System.out.println("Matrícula: "+m.getMatricula());
        System.out.println("Senha: "+m.getSenha());
        System.out.println("CRM: "+m.getCrm());
        System.out.println("Especialidade: "+m.getEspecialidade());
        System.out.println("-------------------------");
        System.out.println(" ");
    
    }
    
}
