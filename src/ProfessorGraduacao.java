public class ProfessorGraduacao extends Professor {
    public int matricula;
    public String nome;
    public double salarioBruto;
    public int qutdeDiciplinas;

    public ProfessorGraduacao(){}

    public ProfessorGraduacao(int matricuala, String nome, double salarioBruto, int qutdeDiciplinas){
        this.matricula = matricuala;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.qutdeDiciplinas = qutdeDiciplinas;
    }

    @Override
    public double salario() {        
        return salarioBruto - (salarioBruto * 0.2) + qutdeDiciplinas * 50;
    }
    
}
