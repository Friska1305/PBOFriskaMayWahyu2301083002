package TugasPraktikum26062025;

import javax.swing.*;

public class FormLogin extends JFrame {
    JTextField tfPin;

    public FormLogin() {
        setTitle("Login ATM");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Masukkan PIN:");
        tfPin = new JTextField(10);
        JButton btnLogin = new JButton("Login");

        btnLogin.addActionListener(e -> {
            String inputPin = tfPin.getText();
            if (inputPin.equals(DataUser.pin)) {
                new FormMenuUtama().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "PIN salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(tfPin);
        panel.add(btnLogin);
        add(panel);
    }

    public static void main(String[] args) {
        new FormLogin().setVisible(true);
    }
}
