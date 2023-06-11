
package view;

import java.awt.*;

import javax.swing.*;

public class StringInputHandler {

    public static boolean CheckStringLegal(String inputString, String nameString) {
        String inputStr0 = inputString; // Đầu vào cần kiểm tra
        String nameHandler0 = nameString;

       
      

        if (inputStr0.trim().length() == 0 ){
            JPanel panel = new JPanel(new GridBagLayout());
            JLabel label = new JLabel("Lỗi nhập sai đầu vào ở " + nameHandler0 + ", mời nhập lại!");

            GridBagConstraints gbc = new GridBagConstraints();

            gbc.anchor = GridBagConstraints.CENTER;

            panel.add(label, gbc);

            panel.setPreferredSize(new Dimension(400, 200));

            JFrame frame = new JFrame("Error Message Panel");
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);
            return false;
        } else {
            return true;
        }
    }
  
}
