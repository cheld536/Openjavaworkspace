import javax.swing.*;
import java.awt.*;

public class StartPage extends JFrame{
    public StartPage(){
        setTitle("시작 화면");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setBackground(Color.GRAY);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel name = new JLabel("R 러 G");
        Font font1 = new Font("bauhaus 93 보통",Font.BOLD,60);
        name.setFont(font1);
        name.setBounds(200,130,200,60);
        name.setForeground(Color.green);
        c.add(name);

        RoundedButton start = new RoundedButton("시작하기");
        Font font2 = new Font("bauhaus 93 보통",Font.BOLD,20);
        start.setFont(font2);
        start.setBounds(240,280,120,40);
        c.add(start);

        RoundedButton end = new RoundedButton("종료");
        end.setBounds(270,360,60,20);
        c.add(end);

        JLabel credit1 = new JLabel("11조:");
        credit1.setBounds(230,400,300,100);
        c.add(credit1);

        JLabel credit2 = new JLabel("<html><body>2018038014 김윤희<br>2018038045 주시원<br>2020039086 최민기<br>2020039043 한지성</body></html>");
        credit2.setBounds(270,424,300,100);
        c.add(credit2);
        setVisible(true);
    }
    public static void main(String[] args) {
        StartPage frame = new StartPage();
    }
}
