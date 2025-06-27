package TugasPraktikum26062025;

import javax.swing.*;

public class FormTransfer extends JFrame {
    public FormTransfer() {
        setTitle("Transfer");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblTujuan = new JLabel("Rekening Tujuan:");
        JTextField tfTujuan = new JTextField(10);
        JLabel lblJumlah = new JLabel("Jumlah Transfer:");
        JTextField tfJumlah = new JTextField(10);

        JButton btnTransfer = new JButton("Transfer");
        JButton btnBack = new JButton("Kembali");

        btnTransfer.addActionListener(e -> {
            String tujuan = tfTujuan.getText();
            double jumlah = Double.parseDouble(tfJumlah.getText());

            if (!DataUser.cekSaldoCukup(jumlah)) {
                JOptionPane.showMessageDialog(this, "Saldo tidak mencukupi!", "Gagal", JOptionPane.ERROR_MESSAGE);
            } else {
                DataUser.saldo -= jumlah;
                JOptionPane.showMessageDialog(this, "Transfer ke " + tujuan + " berhasil. Sisa saldo: Rp " + DataUser.saldo);
            }
        });

        btnBack.addActionListener(e -> {
            new FormMenuUtama().setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(lblTujuan);
        panel.add(tfTujuan);
        panel.add(lblJumlah);
        panel.add(tfJumlah);
        panel.add(btnTransfer);
        panel.add(btnBack);
        add(panel);
    }
}
