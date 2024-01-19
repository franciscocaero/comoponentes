import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class form1 {
    public JPanel menuPrincipal;
    private JButton button1;
    private JButton button2;
    private JLabel iplabel;
    private JTextArea textoEjemploTextArea;
    private JTextArea textArea1;
    private JButton button3;
    private JButton button4;
    private JButton cargarCambiosButton;
    private JTextArea textoparc;

    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String ip;
                    ip=java.net.InetAddress.getLocalHost().getHostName();
                    //iplabel.setText(ip);

                    InetAddress localhost =InetAddress.getLocalHost();
                    System.out.println(localhost.getHostAddress());
                    String tex=(ip+"\n"+localhost.getHostAddress()+"\nFrancisco Caero");
                    textoEjemploTextArea.setText(tex);


                }catch (Exception ex){
                    System.out.println(ex);
                }

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String ip;
                    ip = java.net.InetAddress.getLocalHost().getHostName();
                    InetAddress localhost = InetAddress.getLocalHost();
                    System.out.println(localhost.getHostAddress());
                    String tex = (ip + "\n" + localhost.getHostAddress() + "\nFrancisco Caero");
                    File arc1 = new File("C:/poo2023b/ejemplo1/ip.txt");
                    FileWriter fw = new FileWriter(arc1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(tex);
                    bw.close();

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try  {
                    FileReader fr=new FileReader("C:/poo2023b/ejemplo1/ip.txt");
                    BufferedReader br = new BufferedReader(fr);
                    StringBuilder contenido_=new StringBuilder();
                    String line;
                    while((line=br.readLine())!=null){
                        contenido_.append(line).append("\n");
                    }
                    textArea1.setText(contenido_.toString());
                    br.close();
                }

                catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Scanner mivariable=new Scanner(System.in);
                    String ip;
                    ip = java.net.InetAddress.getLocalHost().getHostName();
                    InetAddress localhost = InetAddress.getLocalHost();
                    System.out.println(localhost.getHostAddress());

                    String tex = textoparc.getText();
                    File arc1 = new File("C:/poo2023b/ejemplo1/ej.txt");
                    FileWriter fw = new FileWriter(arc1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(tex);
                    bw.close();

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        cargarCambiosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try  {
                        FileReader fr=new FileReader("C:/poo2023b/ejemplo1/ej.txt");
                        BufferedReader br = new BufferedReader(fr);
                        StringBuilder contenido=new StringBuilder();
                        String line;
                        while((line=br.readLine())!=null){
                            contenido.append(line).append("\n");
                        }
                        textArea1.setText(contenido.toString());
                        br.close();
                    }

                    catch(Exception ex){
                        System.out.println(ex);
                    }
            }
        });
    }
}

