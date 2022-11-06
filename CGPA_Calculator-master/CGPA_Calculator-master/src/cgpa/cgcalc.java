
package cgpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class cgcalc extends javax.swing.JFrame {
String na=new String();
  
    public cgcalc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        wllbl = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s1g = new javax.swing.JTextField();
        s2g = new javax.swing.JTextField();
        s4g = new javax.swing.JTextField();
        s3g = new javax.swing.JTextField();
        l3g = new javax.swing.JTextField();
        l2g = new javax.swing.JTextField();
        s5g = new javax.swing.JTextField();
        l1g = new javax.swing.JTextField();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                act(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        wllbl.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        wllbl.setText("Enter your Expected Grade Points");

        s2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s2.setText("Subject 2");

        s1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s1.setText("Subject 1");

        s4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s4.setText("Subject 4");

        s3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s3.setText("Subject 3");

        l3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        l3.setText("Lab 3");

        l2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        l2.setText("Lab 2");

        l1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        l1.setText("Lab 1");

        s5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s5.setText("Subject 5");

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel1.setText("Subjects");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel3.setText("Expected Grade Point ");

        s1g.setBackground(new java.awt.Color(51, 51, 51));
        s1g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        s1g.setForeground(new java.awt.Color(51, 255, 51));
        s1g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1gActionPerformed(evt);
            }
        });

        s2g.setBackground(new java.awt.Color(51, 51, 51));
        s2g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        s2g.setForeground(new java.awt.Color(51, 255, 51));
        s2g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2gActionPerformed(evt);
            }
        });

        s4g.setBackground(new java.awt.Color(51, 51, 51));
        s4g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        s4g.setForeground(new java.awt.Color(51, 255, 51));

        s3g.setBackground(new java.awt.Color(51, 51, 51));
        s3g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        s3g.setForeground(new java.awt.Color(51, 255, 51));

        l3g.setBackground(new java.awt.Color(51, 51, 51));
        l3g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        l3g.setForeground(new java.awt.Color(51, 255, 51));

        l2g.setBackground(new java.awt.Color(51, 51, 51));
        l2g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        l2g.setForeground(new java.awt.Color(51, 255, 51));

        s5g.setBackground(new java.awt.Color(51, 51, 51));
        s5g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        s5g.setForeground(new java.awt.Color(51, 255, 51));

        l1g.setBackground(new java.awt.Color(51, 51, 51));
        l1g.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        l1g.setForeground(new java.awt.Color(51, 255, 51));

        submit.setFont(new java.awt.Font("AR BONNIE", 0, 24)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(wllbl, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submit)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s2g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s4g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(wllbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s4g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3g, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void s1gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1gActionPerformed

    private void s2gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2gActionPerformed
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        double ans=((Double.parseDouble(s1g.getText())*3)+(Double.parseDouble(s2g.getText())*3)+(Double.parseDouble(s3g.getText())*3)+(Double.parseDouble(s4g.getText())*3)+(Double.parseDouble(s5g.getText())*3)+(Double.parseDouble(l1g.getText())*2)+(Double.parseDouble(l2g.getText())*1)+(Double.parseDouble(l3g.getText())*2))/17;
    
        try    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cgpa","root","root");
    Statement stmt=conn.createStatement();
    String qry="Update cursub SET cg="+ans+" where name=\""+na+"\";";
    stmt.executeUpdate(qry);
    stmt.close();
    conn.close();
}
catch(Exception e){
	
    JOptionPane.showMessageDialog(null,"Error in connectivity");
}
        finalcg a=new finalcg();
        a.setVisible(true);
        dispose();     
  
    }

    private void act(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_act
try{
   Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cgpa","root","root");
    Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    String qry="Select * from cursub;";
    ResultSet rs=stmt.executeQuery(qry);
    String epwd=new String();
    int dept=0;
    rs.last();
    epwd=rs.getString("name");
    dept=rs.getInt("subInd");
    rs.close();
    stmt.close();
    
    
    Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    String Dep=new String();
    switch(dept)
    {
        case 1:Dep="BT";break;
        case 2:Dep="Chem";break;
        case 3:Dep="Civil";break;
        case 4:Dep="Cse";break;
        case 5:Dep="Ele";break;
        case 6:Dep="Ece";break;
        case 7:Dep="IT";break;
        case 8:Dep="Mech";break;
        case 9:Dep="Meta";break;
        default :break;
    }
    String qr="Select * from subject where Dept=\""+Dep+"\";";
    ResultSet ak=st.executeQuery(qr);
    ak.first();
    s1.setText(ak.getString("Sub1"));
    s2.setText(ak.getString("Sub2"));
    s3.setText(ak.getString("Sub3"));
    s4.setText(ak.getString("Sub4"));
    s5.setText(ak.getString("Sub5"));
    l1.setText(ak.getString("Lab1"));
    l2.setText(ak.getString("Lab2"));
    l3.setText(ak.getString("Lab3"));
    wllbl.setText("Welcome "+epwd+"!! Enter your Expected Grade Points");
    na=epwd;
    ak.close();
    st.close();
    conn.close();
    
    
}
catch(Exception e){
	System.out.print(e);
    JOptionPane.showMessageDialog(null,"Error in connectivity");
}   
    }//GEN-LAST:event_act

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cgcalc().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField l1g;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField l2g;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField l3g;
    private javax.swing.JLabel s1;
    private javax.swing.JTextField s1g;
    private javax.swing.JLabel s2;
    private javax.swing.JTextField s2g;
    private javax.swing.JLabel s3;
    private javax.swing.JTextField s3g;
    private javax.swing.JLabel s4;
    private javax.swing.JTextField s4g;
    private javax.swing.JLabel s5;
    private javax.swing.JTextField s5g;
    private javax.swing.JButton submit;
    private javax.swing.JLabel wllbl;
}
