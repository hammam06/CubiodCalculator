package main;

import bangun.Balok;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {
        GUI g = new GUI();
    }

}

class GUI implements ActionListener {

    JFrame frame;
    JLabel titleLabel;
    JLabel lengthLabel;
    JTextField lengthText;
    JLabel widthLabel;
    JTextField widthText;
    JLabel heightLabel;
    JTextField heightText;
    JLabel resultLabel;
    JTextArea resultText;
    JButton submitButton;
    JButton resetButton;

    GUI() {
        frame = new JFrame("tes");
        frame.setTitle("Cuboid Calculator");
        frame.setSize(500, 500);
        frame.setLayout(null);

        titleLabel = new JLabel("Cuboid Calculator");
        titleLabel.setBounds(180, 0, 150, 20);
        frame.add(titleLabel);

        lengthLabel = new JLabel("Panjang");
        lengthText = new JTextField(10);
        JPanel inputLength = new JPanel();
        inputLength.setLayout(new FlowLayout(10, 20, 0));
        inputLength.add(lengthLabel);
        inputLength.add(lengthText);
        frame.add(inputLength);
        inputLength.setBounds(10, 50, 250, 50);

        widthLabel = new JLabel("Lebar");
        widthText = new JTextField(10);
        JPanel inputWidth = new JPanel();
        inputWidth.setLayout(new FlowLayout(10, 20, 0));

        inputWidth.add(widthLabel);
        inputWidth.add(widthText);
        frame.add(inputWidth);
        inputWidth.setBounds(23, 100, 200, 50);

        heightLabel = new JLabel("Tinggi");
        heightText = new JTextField(10);
        JPanel inputHeight = new JPanel();
        inputHeight.setLayout(new FlowLayout(10, 20, 0));

        inputHeight.add(heightLabel);
        inputHeight.add(heightText);
        frame.add(inputHeight);
        inputHeight.setBounds(22, 150, 200, 50);

        resultLabel = new JLabel("Hasil");
        resultLabel.setBounds(200, 200, 150, 20);
        frame.add(resultLabel);

        resultText = new JTextArea(10, 10);
        resultText.setBounds(100, 225, 250, 100);
        frame.add(resultText);

        JPanel buttonContainer = new JPanel();
        submitButton = new JButton("Hitung");
        submitButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonContainer.add(submitButton);
        buttonContainer.add(resetButton);
        buttonContainer.setBounds(125, 400, 200, 50);
        frame.add(buttonContainer);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submitButton)) {
            try {
                int p = parseInt(lengthText.getText());
                int l = parseInt(widthText.getText());
                int t = parseInt(heightText.getText());

                Balok hitungBalok = new Balok(p, l, t);
                String dataResult = "Square : " + hitungBalok.hitungLuas() + "\n"
                        + "Square Circumference : " + hitungBalok.hitungKeliling() + "\n"
                        + "Cuboid Volume : " + hitungBalok.hitungVolume() + "\n"
                        + "Cuboid Surface Area : " + hitungBalok.hitungLuaspermukaan();

                resultText.setText(dataResult);
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(frame, "Masukkan Sesuai Format!",
                        "Warning!", JOptionPane.WARNING_MESSAGE);
            }

        } else if (e.getSource().equals(resetButton)) {
            lengthText.setText("");
            widthText.setText("");
            heightText.setText("");
            resultText.setText("");
        }
    }

}
