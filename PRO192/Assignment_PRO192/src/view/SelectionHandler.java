
package view;

import java.awt.*;
import javax.swing.*;

public class SelectionHandler {

    public static void selectionIllegal(String nameString) {
        String nameHandler1 = nameString;

            JPanel panel = new JPanel(new GridBagLayout());
            JLabel label = new JLabel("Lỗi không chọn đầu vào ở " + nameHandler1 + ", mời chọn lại!");

            GridBagConstraints gbc = new GridBagConstraints();

            gbc.anchor = GridBagConstraints.CENTER;

            panel.add(label, gbc);

            panel.setPreferredSize(new Dimension(400, 200));

            JFrame frame = new JFrame("Error Message Panel");
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);
           
        
    }
  
}