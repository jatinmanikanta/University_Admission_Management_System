package admission.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Fee extends JFrame implements ActionListener
{
   JTable t1;
   JTextField t2;
   String x[] = {"Rollno", "Name", "Fathers name", "Course", "Branch", "Semester", "Fee_paid"};
   String y[][] = new String[20][13];
    int i=0, j=0;
    Fee(){
        super("Fee Details");
        setSize(1290,500);
        setLocation(200,200);
        setLayout(null);
        


          try{
            conn c1  = new conn();
            String s1 = "select * from fee";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("rollno");
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fathers_name");
                y[i][j++]=rs.getString("course");
                y[i][j++]=rs.getString("branch");
                y[i][j++]=rs.getString("semester");
                y[i][j++]=rs.getString("fee_paid");
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
        new Fee().setVisible(true);
    }
    
}