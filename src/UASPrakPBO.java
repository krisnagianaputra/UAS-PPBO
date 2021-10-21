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
    private JTextField tfTH1;
    private JPanel UAS;

    public UASPrakPBO() {
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tfJumlahBarang1=0, tfJumlahBarang2=0, tfJumlahBarang3=0, tfByr=0;
                try{
                    tfJumlahBarang1 = Double.parseDouble(tfHargaBarang1.getText());
                    tfJumlahBarang2 = Double.parseDouble(tfHargaBarang2.getText());
                    tfJumlahBarang3 = Double.parseDouble(tfHargaBarang3.getText());
                    tfByr = Double.parseDouble(tfUangAkhir.getText());
                }
                catch (Exception err){
                    JOptionPane.showMessageDialog(null, "HARAP ISI YANG KOSONG");
                }
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

            }
        });
        Radio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Radio3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
