import java.applet.*;
import java.awt.*;

public class First extends Applet{
Image picture;
public void init() {  
    picture =Toolkit.getDefaultToolkit().getImage("cart.jpg");  
  }  
    
  public void paint(Graphics g) {  
    for(int i=0;i<500;i++){  
      g.drawImage(picture,i,3,this);  
  
      try{
          Thread.sleep(10);
      }catch(Exception e){
      }  
    }  
  }  
}

  