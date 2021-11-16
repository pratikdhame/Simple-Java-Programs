import java.awt.*;
import java.applet.*;
/*
<applet code="AddingButtons.class" width=400 height=400>
</applet>
 */
public class AddingButtons extends Applet {
 public void init(){
     setBackground(Color.DARK_GRAY);

     List city = new List(10,false);
     city.add("Pune");
     city.add("Baramati");
     city.add("akurdi");
     city.add("mumbai");
     city.add("Thane");
     city.add("Pimpri");
     city.add("Nashik");
     city.add("bandra");
     city.add("Nagpur");
     city.add("Latur");
     add(city);
     setVisible(true);
 }
}
