package admission.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class FinalList extends JFrame implements ActionListener
{
   JLabel l1;
   JTable t1;
   JTextField t2;
   String x[] = {"Rollno", "Name", "Class XII(%)", "Phone-No", "Email-ID"};
   String y[][] = new String[20][13];
    int i=0, j=0;
    FinalList(){
        super("Merit List");
        setSize(1290,500);
        setLocation(200,200);
        setLayout(null);
        
        l1 = new JLabel("The Counselling  is conducted in offline mode. The seats will be allotted to candidates on the basis of their class XII merit and availability of seats in the programme ");
        l1.setBounds(50,360,4000,50);
        l1.setFont(new Font("serif",Font.BOLD,15));
        add(l1);
            
      
     
          try{
            conn c1  = new conn();
            String s1 = "select * from student order by class_xii DESC";
             ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("rollno");
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("class_xii");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
          
         JScrollPane sp = new JScrollPane(t1);
         sp.setBounds(20,20,1200,330);
         add(sp);
        
         getContentPane().setBackground(Color.WHITE);
        
  }
      public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
       }
    public static void main(String[] args){
        new FinalList().setVisible(true);
    }
    
}
















