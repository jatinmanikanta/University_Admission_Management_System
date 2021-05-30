package admission.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Instructions extends JFrame
{ 
  JTextArea jta1;
  Font f;
  Instructions()
          
  {
     setBounds(50, 50, 700, 500);
     f=new Font("Arial",Font.BOLD,15);
     
      String s1="\n" +"   1.All the candidates  are required to fill the admission form."+"\n";
      String s2="   2.All the fields in the admission form are compulsory."+"\n";
      String s3="   3.The preferences of streams once filled can't be changed."+"\n";
      String s4="   4.Only after submitting the application form,the candidate is eligible for admission process."+"\n";
      String s5="   5.The admission is strictly on the basis of merit."+"\n";
      String s6="   6.Candidates are requested to continuously check their email accounts for the merit list."+"\n";
      String s7="   7.After the generation of merit list and allotment of seat,the candidate can pay the fee through this portal itself"+"\n";
      jta1=new JTextArea();
     jta1.append(s1+"\n");
     jta1.append(s2+"\n");
     jta1.append(s3+"\n");
     jta1.append(s4+"\n");
     jta1.append(s5+"\n");
     jta1.append(s6+"\n");
     jta1.append(s7+"\n");
     add(jta1);
     jta1.setEditable(false);
     jta1.setFont(f);
     jta1.setForeground(Color.blue);
     jta1.setBackground(Color.yellow);
  }
 public static void main(String[] args)
    {
      Instructions obj=new Instructions();  
        
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
         
}