package TugasPraktikum26062025;

import javax.swing.*;

public class FormMenuUtama extends JFrame {
    public FormMenuUtama() {
        setTitle("Menu Utama ATM");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnSaldo = new JButton("Cek Saldo");
        JButton btnTarik = new JButton("Tarik Tunai");
        JButton btnTransfer = new JButton("Transfer");
        JButton btnLogout = new JButton("Keluar");

        btnSaldo.addActionListener(e -> {
            new FormCekSaldo().setVisible(true);
            dispose();
        });

        btnTarik.addActionListener(e -> {
            new FormTarikTunai().setVisible(true);
            dispose();
        });

        btnTransfer.addActionListener(e -> {
            new FormTransfer().setVisible(true);
            dispose();
        });

        btnLogout.addActionListener(e -> System.exit(0));

        JPanel panel = new JPanel();
        panel.add(btnSaldo);
        panel.add(btnTarik);
        panel.add(btnTransfer);
        panel.add(btnLogout);
        add(panel);
    }
}
