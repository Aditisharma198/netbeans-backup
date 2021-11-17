/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.Applet;
import java.awt.*;  
import java.applet.*; 
 
public class AppletAni extends Applet {

   Image picture; 
    public void init() {
         picture =Toolkit.getDefaultToolkit().getImage("cart1.jpg");  // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g) {  
    for(int i=0;i<500;i++){  
      g.drawImage(picture, i,30, this);  
  
      try{Thread.sleep(100);}catch(Exception e){}  
    }// TODO overwrite start(), stop() and destroy() methods
}
}