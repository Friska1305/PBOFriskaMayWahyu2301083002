package TugasPraktikum26062025;

import javax.swing.*;

public class FormCekSaldo extends JFrame {
    public FormCekSaldo() {
        setTitle("Cek Saldo");
        setSize(250, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Saldo Anda: Rp " + DataUser.saldo);
        JButton btnBack = new JButton("Kembali");

        btnBack.addActionListener(e -> {
            new FormMenuUtama().setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(btnBack);
        add(panel);
    }
}
