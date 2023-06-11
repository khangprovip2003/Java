package view;

import controller.QLSVController;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import model.QLSVModel;
import model.Student;

public class QLSVView extends JFrame {

    private JPanel contentPane;
    public QLSVModel model;
    public JTextField textField;
    public JTable table;
    public JTextField textField_1;
    public JTextField textField_2;
    public JTextField textField_3;
    public JTextField textField_5;
    public JTextField textField_6;
    public JTextField textField_7;
    public JTextField textField_8;
    public ButtonGroup btg;
    public JRadioButton rdbtnNewRadioButton;
    public JRadioButton rdbtnNewRadioButton_1;

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    QLSVView frame = new QLSVView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public QLSVView() {
        setBackground(new Color(0, 0, 255));
        setFont(new Font("Dialog", Font.PLAIN, 20));
        setTitle("Phần mềm quản lí sinh viên ");
        this.model = new QLSVModel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 981, 554);
        ActionListener action = new QLSVController(this);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        menuBar.add(menuFile);

        JMenuItem menuOpen = new JMenuItem("Open");
        menuOpen.addActionListener(action);
        menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        menuFile.add(menuOpen);

        JMenuItem menuSave = new JMenuItem("Save");
        menuSave.addActionListener(action);
        menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        menuFile.add(menuSave);

        JSeparator separator = new JSeparator();
        menuFile.add(separator);

        JMenuItem menuExit = new JMenuItem("Exit");
        menuExit.addActionListener(action);
        menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        menuFile.add(menuExit);

        JMenu menuAbout = new JMenu("About");
        menuAbout.addActionListener(action);
        menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        menuBar.add(menuAbout);

        JMenuItem menuAboutMe = new JMenuItem("About Me");
        menuAboutMe.addActionListener(action);
        menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        menuAbout.add(menuAboutMe);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.setBorder(new TitledBorder(
                new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
                "Tra Cứu hoặc Xóa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        horizontalBox.setBounds(10, 378, 947, 50);
        contentPane.add(horizontalBox);

        JLabel lblNewLabel = new JLabel("            Mã Sinh Viên          ");
        horizontalBox.add(lblNewLabel);

        textField = new JTextField();
        horizontalBox.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel0 = new JLabel("                      ");
        horizontalBox.add(lblNewLabel0);

        JButton btnNewButton = new JButton("Tra cứu");
        btnNewButton.addActionListener(action);
        horizontalBox.add(btnNewButton);

        JLabel lblNewLabel1 = new JLabel("          ");
        horizontalBox.add(lblNewLabel1);

        JButton btnNewButton_1 = new JButton("Xóa");
        btnNewButton_1.addActionListener(action);
        horizontalBox.add(btnNewButton_1);

        JLabel lblNewLabel2 = new JLabel("                                                                                                                                                                      ");
        horizontalBox.add(lblNewLabel2);

        Box horizontalBox_1 = Box.createHorizontalBox();
        horizontalBox_1
                .setBorder(new TitledBorder(null, "Tùy chọn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        horizontalBox_1.setBounds(10, 439, 947, 45);
        contentPane.add(horizontalBox_1);

        JButton btnNewButton_4 = new JButton("Nhập sinh viên");
        btnNewButton_4.addActionListener(action);
        horizontalBox_1.add(btnNewButton_4);

        JLabel lblNewLabel_9_1 = new JLabel("                       ");
        horizontalBox_1.add(lblNewLabel_9_1);

        JButton btnNewButton_2 = new JButton("In danh sách sinh viên");
        btnNewButton_2.addActionListener(action);
        horizontalBox_1.add(btnNewButton_2);

        JLabel lblNewLabel_9_1_1 = new JLabel("                        ");
        horizontalBox_1.add(lblNewLabel_9_1_1);

        JButton btnNewButton_3 = new JButton("Thêm sinh viên");
        btnNewButton_3.addActionListener(action);
        horizontalBox_1.add(btnNewButton_3);

        JLabel lblNewLabel_9_1_2 = new JLabel("                          ");
        horizontalBox_1.add(lblNewLabel_9_1_2);

        JButton btnNewButton_3_1 = new JButton("Tính điểm");
        btnNewButton_3_1.addActionListener(action);
        horizontalBox_1.add(btnNewButton_3_1);

        JLabel lblNewLabel_9_1_3 = new JLabel("                        ");
        horizontalBox_1.add(lblNewLabel_9_1_3);

        JButton btnNewButton_3_2 = new JButton("Kiểm tra");
        btnNewButton_3_2.addActionListener(action);
        horizontalBox_1.add(btnNewButton_3_2);

        JLabel lblNewLabel_9_1_3_1 = new JLabel("                       ");
        horizontalBox_1.add(lblNewLabel_9_1_3_1);

        JButton btnNewButton_5 = new JButton("Xuất file");
        btnNewButton_5.addActionListener(action);
        horizontalBox_1.add(btnNewButton_5);

        Box horizontalBox_2 = Box.createHorizontalBox();
        horizontalBox_2
                .setBorder(new TitledBorder(null, "Danh sách sinh viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        horizontalBox_2.setBounds(10, 130, 947, 237);
        contentPane.add(horizontalBox_2);
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Mã Sinh Viên", "Họ và Tên", "Giới tính", "Progress Test", "Assignment", "Workshop", "Practical Exam", "Final Exam", "Điểm trung bình", "Trạng thái"
                }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(27);
        table.getColumnModel().getColumn(1).setPreferredWidth(76);
        table.getColumnModel().getColumn(2).setPreferredWidth(119);
        table.getColumnModel().getColumn(3).setPreferredWidth(32);
        table.getColumnModel().getColumn(8).setPreferredWidth(59);
        table.setRowHeight(15);
        JScrollPane scrollPane = new JScrollPane(table);
        horizontalBox_2.add(scrollPane);

        Box horizontalBox_3 = Box.createHorizontalBox();
        horizontalBox_3
                .setBorder(new TitledBorder(null, "Thông tin sinh viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        horizontalBox_3.setBounds(10, 11, 947, 113);
        contentPane.add(horizontalBox_3);

        JPanel panel = new JPanel();
        horizontalBox_3.add(panel);
        panel.setLayout(new GridLayout(4, 4));

        JLabel lblNewLabel_2 = new JLabel("             Mã sinh viên:");
        panel.add(lblNewLabel_2);

        textField_1 = new JTextField();
        panel.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("                          Assignment:");
        panel.add(lblNewLabel_5);

        textField_5 = new JTextField();
        panel.add(textField_5);
        textField_5.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("             Họ và tên:");
        panel.add(lblNewLabel_1);

        textField_2 = new JTextField();
        panel.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("                          Workshop:");
        panel.add(lblNewLabel_4);

        textField_3 = new JTextField();
        panel.add(textField_3);
        textField_3.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("             Giới tính:");
        panel.add(lblNewLabel_3);

        JPanel panel_1 = new JPanel();
        panel.add(panel_1);
        panel_1.setLayout(new GridLayout(1, 0, 0, 0));

        rdbtnNewRadioButton = new JRadioButton("Nam");
        rdbtnNewRadioButton.addActionListener(action);
        panel_1.add(rdbtnNewRadioButton);

        rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
        rdbtnNewRadioButton_1.addActionListener(action);
        panel_1.add(rdbtnNewRadioButton_1);
        btg = new ButtonGroup();
        btg.add(rdbtnNewRadioButton_1);
        btg.add(rdbtnNewRadioButton);
        JLabel lblNewLabel_7 = new JLabel("                          Practical Exam:");
        panel.add(lblNewLabel_7);

        textField_6 = new JTextField();
        panel.add(textField_6);
        textField_6.setColumns(10);

        JLabel lblNewLabel_6 = new JLabel("             Progress Test:");
        panel.add(lblNewLabel_6);

        textField_7 = new JTextField();
        panel.add(textField_7);
        textField_7.setColumns(10);

        JLabel lblNewLabel_8 = new JLabel("                          Final Exam:");
        panel.add(lblNewLabel_8);

        textField_8 = new JTextField();
        panel.add(textField_8);
        textField_8.setColumns(10);

        this.setVisible(true);
    }

    public boolean isStudentIDDuplicated(Student st, ArrayList<Student> studentList) {
        for (Student student : studentList) {
            if (student.getStudentID().equals(st.getStudentID())) {
                return true;
            }
        }
        return false;
    }

    public Student getStudent() {
        Student st = new Student();
        String studentID = "";
        String fullName = "";
        float workshop = -1, assign = -1, prac = -1, progress = -1, finalexam = -1;
        String sex = "";
        boolean hasError = false;
        if (!StringInputHandler.CheckStringLegal(textField_1.getText(), "Mã sinh viên")) {
            textField_1.setText("");
            hasError = true;
        }
        String id = textField_1.getText();
        ArrayList<Student> std = this.model.getListStudent();
        for (Student student : std) {
            if (student.getStudentID().equals(id)) {

                JOptionPane.showMessageDialog(null, "Student ID already exists!");
                textField_1.setText("");
                hasError = true;
            }
        }
        if (!StringInputHandler.CheckStringLegal(textField_2.getText(), "Họ và Tên")) {
            textField_2.setText("");
            hasError = true;
        }
        if (!NumInputHandler.CheckNumLegal(textField_3.getText(), "Workshop")) {
            textField_3.setText("");
            hasError = true;
        }
        if (!NumInputHandler.CheckNumLegal(textField_5.getText(), "Assignment")) {
            textField_5.setText("");
            hasError = true;
        }
        if (!NumInputHandler.CheckNumLegal(textField_6.getText(), "Practical Exam")) {
            textField_6.setText("");
            hasError = true;
        }
        if (!NumInputHandler.CheckNumLegal(textField_7.getText(), "Progress Test")) {
            textField_7.setText("");
            hasError = true;
        }
        if (!NumInputHandler.CheckNumLegal(textField_8.getText(), "Final Exam")) {
            textField_8.setText("");
            hasError = true;
        }
        if (this.rdbtnNewRadioButton.isSelected()) {
            sex = this.rdbtnNewRadioButton.getText();
        } else if (this.rdbtnNewRadioButton_1.isSelected()) {
            sex = this.rdbtnNewRadioButton_1.getText();
        } else {
            SelectionHandler.selectionIllegal("Giới tính");
            hasError = true;
        }
        if (!hasError) {
            studentID = this.textField_1.getText();

            fullName = this.textField_2.getText();

            workshop = Float.valueOf(this.textField_3.getText());

            assign = Float.valueOf(this.textField_5.getText());

            prac = Float.valueOf(this.textField_6.getText());

            progress = Float.valueOf(this.textField_7.getText());

            finalexam = Float.valueOf(this.textField_8.getText());
            textField_1.setText("");
            textField_2.setText("");
            textField_3.setText("");
            textField_5.setText("");
            textField_6.setText("");
            textField_7.setText("");
            textField_8.setText("");
            btg.clearSelection();

            st = new Student(studentID, fullName, sex, progress, assign, workshop, prac, finalexam);
        }

        return st;
    }

    public void themVaoDanhSach() {
        Student st = getStudent();

        if (!st.getStudentID().isEmpty() && !st.getFullName().isEmpty()
                && !st.getSex().isEmpty() && st.getWorkShop() != -1 && st.getAssignment() != -1
                && st.getPracticalExam() != -1 && st.getProgressTest() != -1 && st.getFinalExam() != -1) {
            this.model.insert(st);
            DefaultTableModel modele = (DefaultTableModel) table.getModel();
            int h = Integer.valueOf(modele.getRowCount());
            modele.addRow(new Object[]{h + 1, st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
                st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam()});
        }

    }
    int count = 0;

    public void inDanhSach() {

        int i = 0;
        DefaultTableModel modele = (DefaultTableModel) table.getModel();
        int h = modele.getRowCount();

        for (int j = 0; j < h; j++) {
            modele.removeRow(0);
        }

        ArrayList<Student> std = this.model.getListStudent();
        for (Student st : std) {
            i++;
            modele.addRow(new Object[]{i, st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
                st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam()});
        }
    }

    public void nhapSinhVien() {
        Student st = getStudent();
        if (!st.getStudentID().isEmpty() && !st.getFullName().isEmpty()
                && !st.getSex().isEmpty() && st.getWorkShop() != -1 && st.getAssignment() != -1
                && st.getPracticalExam() != -1 && st.getProgressTest() != -1 && st.getFinalExam() != -1) {
            this.model.insert(st);
        }
    }

    public void xoaSinhVien() {
        String xoaSV = this.textField.getText();
        DefaultTableModel modele = (DefaultTableModel) table.getModel();
        int h = modele.getRowCount();
        ArrayList<Student> std = this.model.getListStudent();
        for (Student s : std) {
            if (s.getStudentID().equals(xoaSV)) {
                this.model.delete(s);
                break;
            }
        }
        for (int j = 0; j < h; j++) {
            modele.removeRow(0);
        }
        int i = 0;
        for (Student st : std) {
            i++;
            modele.addRow(new Object[]{i, st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
                st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam()});
        }

    }

    public void timkiemSinhVien() {
        String timSV = this.textField.getText();
        int i = 1;
        Student st = null;
        DefaultTableModel modele = (DefaultTableModel) table.getModel();
        int h = modele.getRowCount();
        ArrayList<Student> std = this.model.getListStudent();
        for (Student s : std) {
            if (s.getStudentID().equals(timSV)) {
                st = s;
            }
        }
        for (int j = 0; j < h; j++) {
            modele.removeRow(0);
        }
        modele.addRow(new Object[]{i, st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
            st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam()});

    }

    public void result() {
        DefaultTableModel modele = (DefaultTableModel) table.getModel();
        int h = modele.getRowCount();
        for (int j = 0; j < h; j++) {
            modele.removeRow(0);
        }
        int i = 0;
        Float fn;
        ArrayList<Student> stdt = this.model.getListStudent();
        for (Student st : stdt) {
            i++;
            fn = (float) (0.1 * st.getProgressTest() + 0.1 * st.getAssignment() + 0.1 * st.getWorkShop() + 0.4 * st.getPracticalExam() + 0.3 * st.getFinalExam());
            modele.addRow(new Object[]{i, st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
                st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam(), fn});
        }
    }

    public void status() {
        DefaultTableModel modele = (DefaultTableModel) table.getModel();
        int h = modele.getRowCount();
        for (int j = 0; j < h; j++) {
            modele.removeRow(0);
        }
        int i = 0;
        Float fn;
        ArrayList<Student> stdt = this.model.getListStudent();
        for (Student st : stdt) {
            i++;
            String s = "";
            fn = (float) (0.1 * st.getProgressTest() + 0.1 * st.getAssignment() + 0.1 * st.getWorkShop() + 0.4 * st.getPracticalExam() + 0.3 * st.getFinalExam());
            if (fn >= 5 && st.getFinalExam() >= 4 && st.getProgressTest() > 0 && st.getPracticalExam() > 0 && st.getAssignment() > 0 && st.getWorkShop() > 0) {
                s = "  Completed";
            } else {
                s = "  Incompleted";
            }
            modele.addRow(new Object[]{i, st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
                st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam(), fn, s});
        }
    }

    public void refresh() {

    }

    public void hienThiAbout() {
        JOptionPane.showMessageDialog(this, "Phần mềm quản lý thí sinh 1.0!");
    }

    public void thoatKhoiChuongTrinh() {
        int luaChon = JOptionPane.showConfirmDialog(
                this,
                "Bạn có muốn thoải khỏi chương trình?",
                "Exit",
                JOptionPane.YES_NO_OPTION);
        if (luaChon == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void saveFile(String path) {
        try {
            this.model.setTenFile(path);
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ArrayList<Student> stdt1 = this.model.getListStudent();
            for (Student st : stdt1) {
                oos.writeObject(st);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void thucHienSaveFile() {
        if (this.model.getTenFile().length() > 0) {
            saveFile(this.model.getTenFile());
        } else {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                saveFile(file.getAbsolutePath());
            }
        }
    }

    public void openFile(File file) {
        ArrayList ds = new ArrayList();
        try {
            this.model.setTenFile(file.getAbsolutePath());
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student st = null;
            while ((st = (Student) ois.readObject()) != null) {
                ds.add(st);
            }
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.model.setListStudent(ds);
    }

    public void thucHienOpenFile() {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            openFile(file);
            
        }
    }
}
