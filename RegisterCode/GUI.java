import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    GUI() {
        //Create and set up the window.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

        JButton button = new JButton("Enter Barcode");
        button.addActionListener(this);

        JTextField barCode = new JTextField();
        barCode.setPreferredSize(new Dimension(250,50));

        this.add(button);
        this.add(barCode);

        JButton addButton = new JButton("Add Item");
        addButton.addActionListener(this);

        this.add(addButton);

        JButton rButton = new JButton("Remove Item");
        rButton.addActionListener(this);

        this.add(rButton);

        JButton tButton = new JButton("Generate Ticket");
        tButton.addActionListener(this);

        this.add(tButton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

