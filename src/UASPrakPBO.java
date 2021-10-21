import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class UASPrakPBO {
    private JRadioButton Radio1;
    private JRadioButton Radio3;
    private JRadioButton Radio2;
    private JTextField tfHargaBarang1;
    private JTextField tfHargaBarang2;
    private JTextField tfHargaBarang3;
    private JTextField tfJumlahBarang1;
    private JTextField tfJumlahBarang2;
    private JTextField tfJumlahBarang3;
    private JTextField tfHBD3;
    private JTextField tfHBD2;
    private JTextField tfHBD1;
    private JTextField tfTH1;
    private JTextField tfTH2;
    private JTextField tfTH3;
    private JTextField tfTotalByr;
    private JTextField tfDiskUp;
    private JTextField tfHbsDisk;
    private JButton totalButton;
    private JTextField tfByr;
    private JTextField tfUangAkhir;
    private JButton uangAkhirButton;
    private JButton hapusSemuaButton;
    private JButton keluarButton;

    private JPanel UAS;

    public UASPrakPBO() {
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tfJumlahBarang1=0, tfJumlahBarang2=0, tfJumlahBarang3=0, tfByr=0 ,varHargaBarang1=25000, varHargaBarang2=50000, varHargaBarang3=75, disk1Pers=0.01, hargaTot;
                try{
                    tfJumlahBarang1 = Double.parseDouble(tfHargaBarang1.getText());
                    tfJumlahBarang2 = Double.parseDouble(tfHargaBarang2.getText());
                    tfJumlahBarang3 = Double.parseDouble(tfHargaBarang3.getText());
                    tfByr = Double.parseDouble(tfUangAkhir.getText());
                }
                catch (Exception err){
                    JOptionPane.showMessageDialog(null, "HARAP ISI YANG KOSONG");
                }
                if(tfJumlahBarang1>=50){
                    tfByr = varHargaBarang1 * tfJumlahBarang1 - disk1Pers;
                    disk1Pers = varHargaBarang1 * disk1Pers;
                    tfHargaBarang1.setText(String.valueOf(tfByr));
                    tfHBD1.setText(String.valueOf(disk1Pers));
                }
                else {
                    tfByr = varHargaBarang1 * tfJumlahBarang1;
                    tfHargaBarang1.setText(String.valueOf(tfByr));
                }
                if (tfJumlahBarang2>=50){
                    hargaTot = varHargaBarang2 * tfJumlahBarang2 - disk1Pers;
                    disk1Pers = varHargaBarang2 * disk1Pers;
                }
                double totHarga1, totHarga2, totHarga3, totPembayaran, totDisk5Pers = 0, disk5Pers = 0.05, hasil;
                totHarga1 = Double.parseDouble(tfTH1.getText());
                totHarga2 = Double.parseDouble(tfTH2.getText());
                totHarga3 = Double.parseDouble(tfTH3.getText());
                totPembayaran = totHarga1 + totHarga2 + totHarga3;
                tfTotalByr.setText(String.valueOf(totDisk5Pers));
            }
        });
        uangAkhirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        hapusSemuaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Radio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Radio1.isSelected()){
                    tfHargaBarang1.setText("25000");
                }
                else {
                    tfHargaBarang1.setText("0");
                }
            }
        });
        Radio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Radio2.isSelected()){
                    tfHargaBarang2.setText("50000");
                }
                else {
                    tfHargaBarang2.setText("0");
                }
            }
        });
        Radio3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Radio3.isSelected()){
                    tfHargaBarang3.setText("75000");
                }
                else {
                    tfHargaBarang3.setText("0");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UASPrakPBO");
        frame.setContentPane(new UASPrakPBO().UAS);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
