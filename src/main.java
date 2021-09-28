import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os dados do professorde graduação:");
        System.out.print("Número de matricula: ");
        int matricula = Integer.parseInt(scan.nextLine());
        System.out.print("Nome do professor: ");
        String nome = scan.nextLine();
        System.out.print("Sálario bruto: ");
        double salario = Double.parseDouble(scan.nextLine());
        System.out.print("Quantidade de matérias: ");
        int qdtM = Integer.parseInt(scan.nextLine());

        ProfessorGraduacao graduado = new ProfessorGraduacao(matricula, nome, salario, qdtM);

        System.out.println("Agora os dados do professor de mestrado: ");
        System.out.print("Número de matricula: ");
        int matricula2 = Integer.parseInt(scan.nextLine());
        System.out.print("Nome do professor: ");
        String nome2 = scan.nextLine();
        System.out.print("Sálario bruto: ");
        double salario2 = Double.parseDouble(scan.nextLine());
        System.out.print("Quantidade de matérias: ");
        int qdtM2= Integer.parseInt(scan.nextLine());
        System.out.print("Ano de término do doutorado: ");
        int ano = Integer.parseInt(scan.nextLine());
        System.out.print("Quantidade de artigos científicos: ");
        int qtdeArtigos = Integer.parseInt(scan.nextLine());

        ProfessorMestrado mestre = new ProfessorMestrado(matricula2, nome2, salario2, qdtM2, ano, qtdeArtigos);

        System.out.println("Salário do professor de graduação: R$" + graduado.salario());
        System.out.println("Salário do professor de mestrado: R$" + mestre.salario());

        scan.close();
    }
}