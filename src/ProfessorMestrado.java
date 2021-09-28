public class ProfessorMestrado extends Professor{
    public int matricula;
    public String nome;
    public double salarioBruto;
    public int qutdeDiciplinas;
    public int anoDoutorado;
    public int qtdeArtigos;

    public ProfessorMestrado(){}

    public ProfessorMestrado(int matricuala, String nome, double salarioBruto, int qutdeDiciplinas, int anoDoutorado, int qtdeArtigos){
        this.matricula = matricuala;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.qutdeDiciplinas = qutdeDiciplinas;
        this.anoDoutorado = anoDoutorado;
        this.qtdeArtigos = qtdeArtigos;
    }

    @Override
    public double salario() {
        double base = salarioBruto - (salarioBruto * 0.2) + qutdeDiciplinas * 50;
        return base + qtdeArtigos * 150;
    }
    
}
