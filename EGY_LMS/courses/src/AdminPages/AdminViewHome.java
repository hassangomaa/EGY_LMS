 
package AdminPages;

 
import GlobalControllers.PageController;
import HomePages.*;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
public class AdminViewHome extends javax.swing.JFrame {

    private static GlobalControllers.Student st = new GlobalControllers.Student();
    private static PageController f = new PageController() ;
    
    
    public AdminViewHome() {
        initComponents();        
 try{
            Image img = ImageIO.read(HomeUser.class.getResource("icon1.png"));
            this.setIconImage(img);
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminBackground = new javax.swing.JPanel();
        welcomeForAdmin = new javax.swing.JLabel();
        doExit = new javax.swing.JButton();
        doShowCourseView = new javax.swing.JButton();
        doShowAccountView = new javax.swing.JButton();
        doShowStudentView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminBackground.setBackground(new java.awt.Color(74, 31, 61));

        welcomeForAdmin.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        welcomeForAdmin.setForeground(new java.awt.Color(186, 79, 84));
        welcomeForAdmin.setText("ADMIN Home View");

        doExit.setText("Logout");
        doExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doExitActionPerformed(evt);
            }
        });

        doShowCourseView.setText("Course");
        doShowCourseView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doShowCourseViewActionPerformed(evt);
            }
        });

        doShowAccountView.setText("Account");
        doShowAccountView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doShowAccountViewActionPerformed(evt);
            }
        });

        doShowStudentView.setText("Student");
        doShowStudentView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doShowStudentViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminBackgroundLayout = new javax.swing.GroupLayout(adminBackground);
        adminBackground.setLayout(adminBackgroundLayout);
        adminBackgroundLayout.setHorizontalGroup(
            adminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(doExit)
                .addGap(20, 20, 20))
            .addGroup(adminBackgroundLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(adminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(welcomeForAdmin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doShowAccountView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doShowCourseView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doShowStudentView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        adminBackgroundLayout.setVerticalGroup(
            adminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminBackgroundLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(welcomeForAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doShowStudentView)
                .addGap(18, 18, 18)
                .addComponent(doShowCourseView)
                .addGap(18, 18, 18)
                .addComponent(doShowAccountView)
                .addGap(81, 81, 81)
                .addComponent(doExit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doShowStudentViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doShowStudentViewActionPerformed
        AdminViewStudentEdit frm = new AdminViewStudentEdit();
        f.showBackView(frm, this);
    }//GEN-LAST:event_doShowStudentViewActionPerformed

    private void doExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doExitActionPerformed
//        System.exit(0);
        LoginUser LP = new LoginUser();
        LP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doExitActionPerformed

    private void doShowCourseViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doShowCourseViewActionPerformed
         AdminViewForCourseEdit frm = new AdminViewForCourseEdit();
        f.showBackView(frm, this);
    }//GEN-LAST:event_doShowCourseViewActionPerformed

    private void doShowAccountViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doShowAccountViewActionPerformed
       
        AdminViewCreateAccount frm = new AdminViewCreateAccount();
        f.showBackView(frm, this);
    }//GEN-LAST:event_doShowAccountViewActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminBackground;
    private javax.swing.JButton doExit;
    private javax.swing.JButton doShowAccountView;
    private javax.swing.JButton doShowCourseView;
    private javax.swing.JButton doShowStudentView;
    private javax.swing.JLabel welcomeForAdmin;
    // End of variables declaration//GEN-END:variables
}
