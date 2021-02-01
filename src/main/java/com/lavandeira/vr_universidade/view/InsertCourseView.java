package com.lavandeira.vr_universidade.view;

import com.lavandeira.vr_universidade.model.Course;
import com.lavandeira.vr_universidade.model.Discipline;
import com.lavandeira.vr_universidade.model.enumerated.Period;
import com.lavandeira.vr_universidade.view.controllers.CoursesViewController;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author felipelavandeira
 */
public class InsertCourseView extends javax.swing.JFrame {

    private CoursesViewController controller;
    
    public InsertCourseView(CoursesViewController controller) {
        initComponents();
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        descriptionLbl = new javax.swing.JLabel();
        descriptionText = new javax.swing.JTextField();
        durationLbl = new javax.swing.JLabel();
        durationText = new javax.swing.JTextField();
        periodLbl = new javax.swing.JLabel();
        periodCB = new javax.swing.JComboBox<>();
        qtyStudentsLbl = new javax.swing.JLabel();
        studentsQtyText = new javax.swing.JTextField();
        qtyStudentsLbl1 = new javax.swing.JLabel();
        hoursQtyText = new javax.swing.JTextField();
        insertBtn = new javax.swing.JButton();
        cleanBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserção - Curso");
        setPreferredSize(new java.awt.Dimension(400, 500));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(400, 32767));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 32767));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        descriptionLbl.setText("Descrição");
        descriptionLbl.setName("descriptionLabel"); // NOI18N

        descriptionText.setToolTipText("");
        descriptionText.setMaximumSize(new java.awt.Dimension(400, 2147483647));
        descriptionText.setPreferredSize(new java.awt.Dimension(300, 25));

        durationLbl.setText("Duração");

        durationText.setMaximumSize(new java.awt.Dimension(400, 2147483647));
        durationText.setPreferredSize(new java.awt.Dimension(300, 25));

        periodLbl.setText("Período");

        periodCB.setModel(new DefaultComboBoxModel<Period>(Period.values()));
        periodCB.setMaximumSize(new java.awt.Dimension(400, 32767));
        periodCB.setPreferredSize(new java.awt.Dimension(300, 25));

        qtyStudentsLbl.setText("Quantidade de Alunos");

        studentsQtyText.setMaximumSize(new java.awt.Dimension(400, 2147483647));
        studentsQtyText.setPreferredSize(new java.awt.Dimension(300, 25));

        qtyStudentsLbl1.setText("Carga Horária");

        hoursQtyText.setMaximumSize(new java.awt.Dimension(400, 2147483647));
        hoursQtyText.setPreferredSize(new java.awt.Dimension(300, 25));

        insertBtn.setText("Inserir");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        cleanBtn.setText("Limpar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cleanBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insertBtn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descriptionLbl)
                        .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(durationLbl)
                        .addComponent(durationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodLbl)
                        .addComponent(periodCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtyStudentsLbl)
                        .addComponent(studentsQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtyStudentsLbl1)
                        .addComponent(hoursQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(durationLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(durationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(periodLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(periodCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtyStudentsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentsQtyText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtyStudentsLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hoursQtyText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn)
                    .addComponent(cleanBtn))
                .addGap(0, 127, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        Course course = new Course();
        course.setDescription(descriptionText.getText());
        course.setDuration(Integer.parseInt(durationText.getText()));
        course.setHoursQty(Integer.parseInt(hoursQtyText.getText()));
        course.setPeriod((Period) periodCB.getSelectedItem());
        course.setStudentsQty(Integer.parseInt(studentsQtyText.getText()));
        course.setDisciplines(new ArrayList<Discipline>());
        controller.createCourse(course);
        this.dispose();
    }//GEN-LAST:event_insertBtnActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertCourseView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JLabel durationLbl;
    private javax.swing.JTextField durationText;
    private javax.swing.JTextField hoursQtyText;
    private javax.swing.JButton insertBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Period> periodCB;
    private javax.swing.JLabel periodLbl;
    private javax.swing.JLabel qtyStudentsLbl;
    private javax.swing.JLabel qtyStudentsLbl1;
    private javax.swing.JTextField studentsQtyText;
    // End of variables declaration//GEN-END:variables
}
