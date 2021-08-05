import javax.swing.*;
public class snake extends JFrame{
    snake()
    {
        board b=new board();
        add(b);
        pack();

     setLocationRelativeTo(null);
     setTitle("Snake Game");
     setResizable(false);
    }
        public static void main(String[] args) {
            new snake().setVisible(true);

        }
    }
