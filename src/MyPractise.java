import javax.swing.*;
import java.awt.event.*;
import java.util.*;

import java.beans.PropertyChangeListener;

class MyPractise implements ActionListener{
   JButton []b;
   JButton []op;
   JFrame f;
   JTextField tf;
   public void PreparingButtons(){
      f= new JFrame("operations on two numbers");
      tf=new JTextField("0");
      f.setSize(600, 700);
      b=new JButton[10];
      for(int i=0;i<=9;i++){
         b[i]=new JButton(Integer.toString(i));
         b[i].addActionListener((ActionListener)this);
      }
      op= new JButton[6];
      op[0]=new JButton("+");
      op[1]=new JButton("-");
      op[2]=new JButton("/");
      op[3]=new JButton("*");
      op[4]=new JButton("C");
      op[5]=new JButton("=");
      for(int i=0;i<6;i++)
         op[i].addActionListener((ActionListener) this);
      tf= new JTextField();
   }
   public void AddingButtonsToCalculator(){
         int dx=60;
         int dy=105;
         int xinc=105;
         int xiny=500;
         int width=100, height=100;
         b[0].setBounds(30+dx, xiny, width, height);
         op[1].setBounds(30+xinc+dx  , xiny, width, height);
         op[0].setBounds(30+2*xinc+dx, xiny, width, height);
         op[2].setBounds(30+3*xinc+dx, xiny, width, height);

         b[1].setBounds(30+dx, xiny-dy, width, height);
         b[2].setBounds(30+xinc+dx  ,xiny-dy, width, height);
         b[3].setBounds(30+2*xinc+dx,xiny-dy, width, height);
         op[3].setBounds(30+3*xinc+dx, xiny-dy, width, height);

         b[4].setBounds(30+dx, xiny-2*dy, width, height);
         b[5].setBounds(30+xinc+dx  ,xiny-2*dy, width, height);
         b[6].setBounds(30+2*xinc+dx, xiny-2*dy, width, height);
         op[4].setBounds(30+3*xinc+dx, xiny-2*dy, width, height);

         b[7].setBounds(30+dx, xiny-3*dy, width, height);
         b[8].setBounds(30+xinc+dx  ,xiny-3*dy, width, height);
         b[9].setBounds(30+2*xinc+dx, xiny-3*dy, width, height);
         op[5].setBounds(30+3*xinc+dx, xiny-3*dy, width, height);

        tf.setBounds(30+dx, xiny-4*dy, width*4+20, height-5);
        f.add(tf);

         for(int i=0;i<=9;i++)
            f.add(b[i]);
         for(int  j=0;j<6;j++)
            f.add(op[j]);
   }

   public void Calculator(){
       PreparingButtons();
      AddingButtonsToCalculator();
      f.setLayout(null);
      f.setVisible(true);

   }

    int First=0;
    int Second=0;

    int operation=-1;
   public void actionPerformed(ActionEvent e){
         JButton ee= (JButton) e.getSource();
            int result=15;
         // loop to store numbers into the result
       if(ee==op[0]){
           First=Integer.parseInt(tf.getText());
           operation=0;
           tf.setText("");
       }else if(ee==op[1]){
           First=Integer.parseInt(tf.getText());
           operation=1;
           tf.setText("");
       }else if(ee==op[2]){
           First=Integer.parseInt(tf.getText());
           operation=2;
           tf.setText("");
       }else if(ee==op[3]){
           First=Integer.parseInt(tf.getText());
           operation=3;
           tf.setText("");
       }else if(ee==op[4]){
           First=Integer.parseInt(tf.getText());
           operation=4;
           result=0;
           tf.setText("");
       }else if(op[5]==ee) {
           Second=Integer.parseInt(tf.getText());
            if(operation==0)result=First+Second;
            else if(operation==1)result=First-Second;
            else if(operation==2)result=First/Second;
            else if(operation==3)result=First*Second;
            tf.setText(Integer.toString(result));
       }else {
           for(int i=0;i<=9;i++){
               if(b[i]==ee){
                   tf.setText(tf.getText()+ Integer.toString(i));
               }
           }
       }





   }
   public static void main(String []args){
      MyPractise p=new MyPractise();
      p.Calculator();
   }
}