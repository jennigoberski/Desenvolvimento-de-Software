public class CadastraAluno {
    // Atributos

    // Métodos

    // Rotina principal
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];

        alunos[0] = new Aluno(56951343, "Cleber", 2002);
        alunos[1] = new Aluno(75662315, "Michael Wazowski", 2007);
        alunos[2] = new Aluno(15664549, "Wallace Robinho", 2019);

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Aluno %d\n%s\n", i + 1, alunos[i].toString());

            System.out.println(" ");
        }
    }
}
