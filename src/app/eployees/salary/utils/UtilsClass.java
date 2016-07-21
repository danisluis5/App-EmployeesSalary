package app.eployees.salary.utils;

import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JFrame;

public class UtilsClass {
    public void setCenterJFrame(JFrame frame,String title){
        frame.setFont(new Font("Arial",Font.PLAIN,13));
        FontMetrics fm = frame.getFontMetrics(frame.getFont());
        int x = fm.stringWidth("VinaENTER - Calculator");
        int z = frame.getWidth()/2 - x/2;
        int y = fm.stringWidth(" ");
        frame.setTitle(String.format("%"+z/y+"s","")+title);
    }
    public String changeCurrencyVND(String temp){
        String outString = "";
        int j = 0;
        int dot = temp.length()/3;
        if(temp.length()%3==0){
            dot = dot-1;
        }
        for(int i = temp.length()-1;i >= 0; i--){
            outString += temp.charAt(i);
            j++;
            if(j==3 && dot!=0){
               outString += ".";
               j = 0;
               dot--;
            }
        }
        return new StringBuilder(outString).reverse().toString();
    }
}
