package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Controlador extends JFrame {

    public Controlador(Disciplinas disciplinas) {
        setTitle("UFPR integrada");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Selecionar perfil: ");
        JButton alunoButton = new JButton("Aluno");
        JButton professorButton = new JButton("Professor");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(label);
        panel.add(alunoButton);
        panel.add(professorButton);

        add(panel);

        alunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = {"Encontre sua sala"};
                int n = JOptionPane.showOptionDialog(null,
                        "Escolha uma opção:",
                        "",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if (n == 0) {
                    // código para o caso de uso de encontrar sala
                }
            }
        });

        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = {"Lançar notas", "Enviar notificação"};
                int n = JOptionPane.showOptionDialog(null,
                        "Escolha uma opção:",
                        "",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if (n == 0) {
                    // código para o caso de uso de lançar notas
                } else if (n == 1) {
                    String[] lista = new String[disciplinas.getDisciplinas().length];
                    for (int i = 0; i < disciplinas.getDisciplinas().length; i++) {
                        lista[i] = disciplinas.getDisciplinas()[i].getNome();
                    }

                    String selecionada = (String) JOptionPane.showInputDialog(
                            null,
                            "Escolha a disciplina:",
                            "Selecionar Disciplina",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            lista,
                            lista[0]);

                    if (selecionada != null) {
                        // solicitando a mensagem do usuário
                        String mensagem = JOptionPane.showInputDialog(
                                null,
                                "Digite a mensagem a ser enviada:",
                                "Enviar Notificação",
                                JOptionPane.PLAIN_MESSAGE);
                        
                        if (mensagem != null && !mensagem.trim().isEmpty()) {
                            Disciplina disciplina = disciplinas.getDisciplinaPorNome(disciplinas, selecionada);
                            disciplina.mandarNotificacao(mensagem, disciplina);
                            JOptionPane.showMessageDialog(null, "Notificação enviada para a disciplina: " + selecionada);
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhuma mensagem foi inserida.", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {

        // criando algumas instâncias para usar como exemplo
        Documento doc1 = new Documento("João Silva", "123.456.789-00", "MG-12.345.678", "joao@exemplo.com");
        Documento doc2 = new Documento("Maria Oliveira", "987.654.321-00", "SP-87.654.321", "maria@exemplo.com");

        Aluno aluno1 = new Aluno("João Silva", "GRR20201234", doc1, 8.5f, null);
        Aluno aluno2 = new Aluno("Maria Oliveira", "GRR20205678", doc2, 9.0f, null);

        Aluno[] alunos = {aluno1, aluno2};

        float[] notas1 = {7.5f, 8.0f};
        float[] notas2 = {8.5f, 9.6f};
        float[] notas3 = {7.1f, 8.5f};

        Disciplina disciplina1 = new Disciplina("Circuitos Digitais", new Date(), "Sala 101", alunos, "Prof. Carlos Souza", notas1);
        Disciplina disciplina2 = new Disciplina("Software Básico", new Date(), "Sala 102", alunos, "Prof. Mario Souza", notas2);
        Disciplina disciplina3 = new Disciplina("Sistemas Operacionais", new Date(), "Sala 103", alunos, "Prof. Jose Souza", notas3);

        Disciplinas disciplinas = new Disciplinas(new Disciplina[]{disciplina1, disciplina2, disciplina3});
        aluno1.setMatriculas(disciplinas);
        aluno2.setMatriculas(disciplinas);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Controlador(disciplinas).setVisible(true);
            }
        });
    }
}
