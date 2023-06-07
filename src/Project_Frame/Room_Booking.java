/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Frame;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.management.timer.Timer.ONE_HOUR;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranil
 */
public class Room_Booking extends javax.swing.JFrame {

    /**
     * Creates new form Room_Booking
     */
    public Room_Booking() {
        initComponents();
        JT1.getTableHeader().setFont(new Font("Andalus",Font.PLAIN,20));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBL2 = new javax.swing.JLabel();
        JDC1 = new com.toedter.calendar.JDateChooser();
        LBL3 = new javax.swing.JLabel();
        JDC2 = new com.toedter.calendar.JDateChooser();
        LBL4 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();
        JSP1 = new javax.swing.JScrollPane();
        JT1 = new javax.swing.JTable();
        LBL6 = new javax.swing.JLabel();
        LBL7 = new javax.swing.JLabel();
        LBL1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Booking");
        setMinimumSize(new java.awt.Dimension(1440, 855));
        setSize(new java.awt.Dimension(1440, 855));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        LBL2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        LBL2.setText("Arrival Date");
        LBL2.setToolTipText("");
        getContentPane().add(LBL2);
        LBL2.setBounds(200, 50, 133, 28);
        getContentPane().add(JDC1);
        JDC1.setBounds(390, 50, 210, 38);

        LBL3.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        LBL3.setText("Departure Date");
        LBL3.setToolTipText("");
        getContentPane().add(LBL3);
        LBL3.setBounds(830, 50, 168, 28);
        getContentPane().add(JDC2);
        JDC2.setBounds(1040, 50, 210, 38);

        LBL4.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        LBL4.setText("No. of Days of Stay");
        LBL4.setToolTipText("");
        getContentPane().add(LBL4);
        LBL4.setBounds(500, 150, 202, 28);

        TF1.setEditable(false);
        TF1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        getContentPane().add(TF1);
        TF1.setBounds(790, 150, 150, 38);

        JB1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        JB1.setText("Check Rooms");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });
        getContentPane().add(JB1);
        JB1.setBounds(330, 590, 190, 40);

        JB2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        JB2.setText("Reserve Room");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });
        getContentPane().add(JB2);
        JB2.setBounds(950, 590, 200, 40);

        JSP1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N

        JT1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        JT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "AC / Non AC", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT1.setRowHeight(30);
        JT1.setRowMargin(2);
        JSP1.setViewportView(JT1);

        getContentPane().add(JSP1);
        JSP1.setBounds(70, 250, 1290, 270);

        LBL6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Logout.jpg"))); // NOI18N
        LBL6.setToolTipText("CLICK TO LOGOUT");
        LBL6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL6MouseClicked(evt);
            }
        });
        getContentPane().add(LBL6);
        LBL6.setBounds(10, 10, 60, 60);
        getContentPane().add(LBL7);
        LBL7.setBounds(1264, 20, 160, 50);

        LBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/BOOKBG.png"))); // NOI18N
        LBL1.setToolTipText("");
        LBL1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(LBL1);
        LBL1.setBounds(0, 0, 1440, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd"); 
        Date Dt1 = JDC1.getDate();
        Date Dt2 = JDC2.getDate();
        String StrDt1 = (String) sdf.format(Dt1);
        String StrDt2 = (String) sdf.format(Dt2);
        long diff = ((Dt2.getTime() - Dt1.getTime() + ONE_HOUR) / (ONE_HOUR*24));
        String No_Days;
        No_Days=Long.toString(diff);
        TF1.setText(No_Days+"  day(s)");
        
        DefaultTableModel M = (DefaultTableModel)(JT1.getModel());
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Management_System","root","admin");
            Statement STM = CON.createStatement();
            String QUE = "SELECT * FROM Room_Details where RoomNo NOT IN (SELECT RoomNo FROM Booked_Rooms WHERE CheckOutDate >='"+ StrDt1+"' AND CheckInDate <= '" +StrDt2+ "');";
            ResultSet RS = STM.executeQuery(QUE);
            while(RS.next())
           {
                String RN = RS.getString("RoomNo");
                String RT = RS.getString("RoomType");
                String AC = RS.getString("AC_NonAC");
                int PR = RS.getInt("Price");

                M.addRow(new Object[]{RN,RT,AC,PR});
                
           }
               JT1.setModel(M);    
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_JB1ActionPerformed

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd"); 
        Date Dt1 = JDC1.getDate();
        Date Dt2 = JDC2.getDate();
        String StrDt1 = (String) sdf.format(Dt1);
        String StrDt2 = (String) sdf.format(Dt2);
        int diff = (int) ((Dt2.getTime() - Dt1.getTime() + ONE_HOUR) / (ONE_HOUR*24));
        String No_Days;
        No_Days=Long.toString(diff);
        
        Room_M_201_209 R1 = new Room_M_201_209();
        R1.setVisible(true);
        R1.LBL1.setText("" + JT1.getModel().getValueAt(JT1.getSelectedRow(),0));
        R1.LBL7.setText("" + JT1.getModel().getValueAt(JT1.getSelectedRow(),1));
        R1.LBL25.setText("" + JT1.getModel().getValueAt(JT1.getSelectedRow(),2));
        R1.LBL23.setText("" + JT1.getModel().getValueAt(JT1.getSelectedRow(),3));
        R1.LBL2.setText(StrDt1);
        R1.LBL3.setText(StrDt2);
        R1.LBL4.setText(""+diff);
        this.dispose();
        
        String M201 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M202 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M203 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M204 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M205 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M206 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M207 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M208 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        String M209 = (String) JT1.getModel().getValueAt(JT1.getSelectedRow(),0);
        if("M201".equals(M201))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M201 Sea View.jpg")));
            R1.TA1.setText(" These rooms (33 Sq. m) in the Palace Wing (2nd- 4th Floor) exude an aura of the old-world charm and elegance. These rooms are adorned with delicate Rajput bay-windows encompassing spectacular views of the poolside or the bustling Mumbai city. Complimentary standard wi-fi for upto 4 devices.");
        }
        else if("M202".equals(M202))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M202 City View.jpg")));
            R1.TA1.setText(" These rooms (33 Sq. m) in the Palace Wing (2nd- 4th Floor) exude an aura of the old-world charm and elegance. These rooms are adorned with delicate Rajput bay-windows encompassing spectacular views of the bustling Mumbai city Sea. Complimentary standard wi-fi for upto 5 devices.");
        }
        else if("M203".equals(M203))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M203 City View.jpg")));
            R1.TA1.setText("These immaculately planned rooms (37 Sq. m) in the Palace Wing are designed to pamper and indulge your senses with an exclusive host of amenities that are perfectly suited for both the Business and Leisure traveller.The Taj Club Rooms offer breath-taking views of the city or the pool. These rooms offer butler service, airport pickup and club facilities.Complimentary standard wi-fi upto 4 devices.");
        }
        else if("M204".equals(M204))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M204 Sea View.jpg")));
            R1.TA1.setText(" These rooms (34 Sq. m) in the Palace Wing (3nd- 4th Floor) exude an aura of the old-world charm and elegance. These rooms are adorned with delicate Rajput bay-windows encompassing spectacular views of the bustling Mumbai city Sea. Complimentary standard wi-fi for upto 5 devices.");
        }
        else if("M205".equals(M205))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M205 City View.jpg")));
            R1.TA1.setText("The Executive Suite (70 Sq. m) in the Palace wing, overlooking the city offers a spacious bedroom, living room and a large bathroom. Bright, airy and lavishly styled, these Suites are aimed at pampering and creating a truly unforgettable experience for the guest. This suite provides butler service, airport pickup and club facilities. Complimentary standard wi-fi for upto 4 devices.");
        }
        else if("M206".equals(M206))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M205 City View.jpg")));
            R1.TA1.setText("The Executive Suite (70 Sq. m) in the Palace wing, overlooking the city offers a spacious bedroom, living room and a large bathroom. Bright, airy and lavishly styled, these Suites are aimed at pampering and creating a truly unforgettable experience for the guest. This suite provides butler service, airport pickup and club facilities. Complimentary standard wi-fi for upto 4 devices.");            
        }
        else if("M207".equals(M207))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M207 CityView.jpg")));
            R1.TA1.setText("The picturesque Luxury Suites (92 Sq. m) in the Palace wing are designed around a central theme, offers a spacious living room and a bedroom. Each of the suites is carefully designed around unique themes completely imbibing the essence of each of the themes.This Suite provides Airport pick up and club services.Complimentary standard wi-fi for 4 devices");
        }
        else if("M208".equals(M208))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M208 City View.jpg")));
            R1.TA1.setText("The picturesque Grand Luxury Suites (121 Sq. m) in the Palace wing are designed around a central theme, offers a spacious living room and a bedroom. Each of the suites is carefully designed around unique themes completely imbibing the essence of each of the themes.This Suite provides Airport pick up and club services.Complimentary standard wi-fi for 4 devices");
        }
        else if("M209".equals(M209))
        {
            R1.LBL5.setIcon(new ImageIcon(getClass().getResource("/Project_Images/M209 Sea View.jpg")));
            R1.TA1.setText("Transcending time these picturesque suites (121 Sq. m) are designed around a central theme. The artwork and antiques recreate old world charm with a blend of modern amenities and gracious personalized service. The suites offer stunning views of the Arabian Sea and The Gateway of India. This Suite provides Airport pick up and club services. Complimentary standard wi-fi for upto 4 devices");
        }
    }//GEN-LAST:event_JB2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void LBL6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL6MouseClicked
        Login_Page LP = new Login_Page();
        LP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LBL6MouseClicked

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
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    public com.toedter.calendar.JDateChooser JDC1;
    public com.toedter.calendar.JDateChooser JDC2;
    private javax.swing.JScrollPane JSP1;
    public javax.swing.JTable JT1;
    private javax.swing.JLabel LBL1;
    private javax.swing.JLabel LBL2;
    private javax.swing.JLabel LBL3;
    private javax.swing.JLabel LBL4;
    private javax.swing.JLabel LBL6;
    public javax.swing.JLabel LBL7;
    public javax.swing.JTextField TF1;
    // End of variables declaration//GEN-END:variables
}
