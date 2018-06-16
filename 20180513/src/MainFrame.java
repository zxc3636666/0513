import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    JButton jbt [][] = new JButton[4][4];
    JLabel jlb = new JLabel();
    private Container cp ;
    private JPanel jpnn = new JPanel(new GridLayout());
    private JPanel jpnc = new JPanel(new GridLayout(4,4,3,3));
    public MainFrame (){
        init();
    }
    private void init (){
        this.setBounds(100,100,400,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jpnn,BorderLayout.NORTH);
        cp.add(jpnc,BorderLayout.CENTER);
        jpnn.add(jlb);

        jbt[0][0] = new JButton("7");
        jbt[0][1] = new JButton("8");
        jbt[0][2] = new JButton("9");
        jbt[0][3] = new JButton("/");
        jbt[1][0] = new JButton("4");
        jbt[1][1] = new JButton("5");
        jbt[1][2] = new JButton("6");
        jbt[1][3] = new JButton("*");
        jbt[2][0] = new JButton("1");
        jbt[2][1] = new JButton("2");
        jbt[2][2] = new JButton("3");
        jbt[2][3] = new JButton("-");
        jbt[3][0] = new JButton("0");
        jbt[3][1] = new JButton(".");
        jbt[3][2] = new JButton("=");
        jbt[3][3] = new JButton("+");

        for (int i = 0 ; i<4 ; i++){
            for (int j = 0; j<4 ; j++) {
                jbt[i][j].setFont(new Font(null, Font.BOLD, 15));
                jpnc.add(jbt[i][j]);
            }
        }

        for (int i = 0 ; i<4 ; i++){
            for (int j= 0 ; j<4 ; j++){
                jbt[i][j].addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        JButton tmp = (JButton) actionEvent.getSource();
                        jlb.setText(jlb.getText()+tmp.getText());
                    }
                });
            }
        }
    }

}
