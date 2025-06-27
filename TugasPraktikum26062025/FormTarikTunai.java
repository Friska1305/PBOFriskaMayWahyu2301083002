package TugasPraktikum26062025;

import javax.swing.*;

public class FormTarikTunai extends JFrame {
    public FormTarikTunai() {
        setTitle("Tarik Tunai");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lbl = new JLabel("Masukkan jumlah penarikan:");
        JTextField tfJumlah = new JTextField(10);
        JButton btnTarik = new JButton("Tarik");
        JButton btnBack = new JButton("Kembali");

        btnTarik.addActionListener(e -> {
            double jumlah = Double.parseDouble(tfJumlah.getText());
            if (!DataUser.cekSaldoCukup(jumlah)) {
                JOptionPane.showMessageDialog(this, "Saldo tidak mencukupi!", "Gagal", JOptionPane.ERROR_MESSAGE);
            } else {
                DataUser.saldo -= jumlah;
                JOptionPane.showMessageDialog(this, "Penarikan berhasil. Sisa saldo: Rp " + DataUser.saldo);
            }
        });

        btnBack.addActionListener(e -> {
            new FormMenuUtama().setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(lbl);
        panel.add(tfJumlah);
        panel.add(btnTarik);
        panel.add(btnBack);
        add(panel);
    }
}
