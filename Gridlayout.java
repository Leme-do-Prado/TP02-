import java.awt.*;
import java.awt.event.*;


class Gridlayout extends Frame implements WindowListener
{
Gridlayout(String titulo, int largura, int altura, int colinic, int
lininic)
{
super(titulo);
setSize(largura,altura);
setLocation(colinic,lininic);
}

public static void main(String[] args)
{
Gridlayout f = new Gridlayout("Meu Primeiro Form",300,150,50,50);

f.addWindowListener(f); 

Label l1=new Label("Nome: ");
f.add(l1);
f.add(new TextField());
Label l2=new Label("Idade: ");
f.add(l2);
f.add(new TextField());
Label l3=new Label("Endereço: ");
f.add(l3);
f.add(new TextField());
f.setTitle("TP2");



f.add(new Button("Ok"));
f.add(new Button("Limpar"));
f.add(new Button("Mostrar"));
f.add(new Button("Sair"));


f.setSize(400,200);
f.setLocation(100,100);
f.setLayout(new FlowLayout());
f.setVisible(true);
}

public void windowClosing(WindowEvent e)
{
System.exit(0);
}
public void windowOpened(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
public void windowActivated(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}

}
