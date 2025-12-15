
import java.util.ArrayList;
import javax.lang.model.SourceVersion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LOAN
 */
public class FenetreQuiz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreQuiz.class.getName());

    /**
     * Creates new form FenetreQuiz
     */
    public FenetreQuiz() {
        initComponents();
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuestion = new javax.swing.JLabel();
        lblFeedback = new javax.swing.JLabel();
        btnRep1 = new javax.swing.JButton();
        btnRep2 = new javax.swing.JButton();
        btnRep3 = new javax.swing.JButton();
        btnRep4 = new javax.swing.JButton();
        btnSuivant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQuestion.setText("jLabel1");

        lblFeedback.setText("jLabel2");

        btnRep1.setText("jButton1");

        btnRep2.setText("jButton2");

        btnRep3.setText("jButton3");

        btnRep4.setText("jButton4");

        btnSuivant.setText("jButton5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRep3)
                    .addComponent(btnRep4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRep2)
                    .addComponent(btnRep1))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFeedback)
                            .addComponent(lblQuestion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnSuivant)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblQuestion)
                .addGap(43, 43, 43)
                .addComponent(lblFeedback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRep1)
                    .addComponent(btnRep4))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRep2)
                    .addComponent(btnRep3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnSuivant)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FenetreQuiz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRep1;
    private javax.swing.JButton btnRep2;
    private javax.swing.JButton btnRep3;
    private javax.swing.JButton btnRep4;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JLabel lblFeedback;
    private javax.swing.JLabel lblQuestion;
    // End of variables declaration//GEN-END:variables


private ArrayList<Question> questions;
private int indexQuestionCourante = 0;
private int score = 0;
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreQuiz extends JFrame {

    private int questionIndex = 0;
    private String[][] questions = {
            {"Quelle est la capitale de la France ?", "Paris", "Londres", "Berlin", "Madrid", "Paris"},
            {"2 + 2 = ?", "3", "4", "5", "6", "4"},
            {"La Terre est-elle plate ?", "Oui", "Non", "Peut-être", "Je ne sais pas", "Non"},
            {"Java est un ?", "Fruit", "Langage de programmation", "Animal", "Ville", "Langage de programmation"}
    };

    private JLabel questionLabel;
    private JButton btn1, btn2, btn3, btn4;
    private int score = 0;

    public FenetreQuiz() {
        setTitle("Quiz Swing");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));

        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);

        setLayout(new BorderLayout(10, 10));
        add(questionLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clicked = (JButton) e.getSource();
                // Vérifie si la réponse est correcte
                if (clicked.getText().equals(questions[questionIndex][5])) {
                    score++;
                }
                questionIndex++;
                showQuestion();
            }
        };

        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn4.addActionListener(listener);

        showQuestion();
    }

    private void showQuestion() {
        if (questionIndex < questions.length) {
            questionLabel.setText(questions[questionIndex][0]);
            btn1.setText(questions[questionIndex][1]);
            btn2.setText(questions[questionIndex][2]);
            btn3.setText(questions[questionIndex][3]);
            btn4.setText(questions[questionIndex][4]);
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
        } else {
            questionLabel.setText("Quiz terminé ! Votre score : " + score + "/" + questions.length);
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn4.setVisible(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FenetreQuiz().setVisible(true));
    }
}
