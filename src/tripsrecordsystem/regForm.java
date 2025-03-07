
package tripsrecordsystem;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class regForm extends javax.swing.JFrame {

   
    public regForm() {
        initComponents(); 
    }
    
    public static String dbemail, dbusername;
    
    
    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        
        try{
            String query="SELECT*FROM tbl_user  WHERE u_username ='"+uname.getText()+"'OR u_email = '"+email.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                dbemail = resultSet.getString("u_email");
                if(dbemail.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already Used!");
                    email.setText("");
                }
                
               
                dbusername = resultSet.getString("u_username");
                if(dbusername.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already Used!");
                    uname.setText("");
                    
                 }  
                return true;  
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRegister = new javax.swing.JButton();
        jUserType = new javax.swing.JComboBox<>();
        pword = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        cnumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        CompleteName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(148, 22, 22));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 29, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" TRUCKING CORP...");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 10));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SHOOK ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rdm3_1.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Complete Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 10));

        jRegister.setBackground(new java.awt.Color(255, 51, 51));
        jRegister.setForeground(new java.awt.Color(255, 255, 255));
        jRegister.setText("REGISTER");
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(jRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 90, -1));

        jUserType.setBackground(new java.awt.Color(255, 51, 51));
        jUserType.setForeground(new java.awt.Color(255, 255, 255));
        jUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER", "ADMIN", " ", " " }));
        jUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserTypeActionPerformed(evt);
            }
        });
        jPanel2.add(jUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, -1));

        pword.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 30));

        uname.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 30));

        cnumber.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(cnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 140, 30));

        email.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 30));

        CompleteName.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(CompleteName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 30, 10));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Contact Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 90, 10));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("User Type");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 10));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Password");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, 10));

        jLabel8.setBackground(new java.awt.Color(255, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/123.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 60, 40));

        jLabel9.setBackground(new java.awt.Color(115, 5, 5));
        jLabel9.setFont(new java.awt.Font("Stencil", 3, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(128, 0, 0));
        jLabel9.setText("SHOOK TRUCKING");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SHOOK TRUCKING");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 200, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 370, 250));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATION FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserTypeActionPerformed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
    
        
        

        if(CompleteName.getText().isEmpty()||email.getText().isEmpty()||cnumber.getText().isEmpty()
            ||uname.getText().isEmpty()||pword.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(null, "Fill apa ang wa na fill apan duh!");
        }else if(pword.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above");
            pword.setText("");

        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");

        }

        else{

            dbConnector dbc=new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user(u_name, u_email, u_number, u_username, u_password, u_status, u_type) "
                + "VALUES('"+CompleteName.getText()+"','"+email.getText()+"','"+cnumber.getText()+"','"+uname.getText()+"','"+pword.getText()+"','PENDING','"+jUserType.getSelectedItem()+"')"))
        {
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            loginForm lfr=new loginForm();
            lfr.setVisible(true);
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");

        }

        }

    }//GEN-LAST:event_jRegisterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginForm lgf = new loginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new regForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompleteName;
    private javax.swing.JTextField cnumber;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRegister;
    private javax.swing.JComboBox<String> jUserType;
    private javax.swing.JTextField pword;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
