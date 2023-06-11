package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import view.QLSVView;

public class QLSVController implements ActionListener {
	public QLSVView view;

	public QLSVController(QLSVView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
            switch (cm) {
                case "Thêm sinh viên":
                    this.view.themVaoDanhSach();
                    break;
                case "In danh sách sinh viên":
                    this.view.inDanhSach();
                    break;
                case "Nhập sinh viên":
                    this.view.nhapSinhVien();
                    break;
                case "Xóa":
                    this.view.xoaSinhVien();
                    break;
                case "Tra cứu":
                    this.view.timkiemSinhVien();
                    break;
                case "Tính điểm":
                    this.view.result();
                    break;
                case "Kiểm tra":
                    this.view.status();
                    break;
                case "Xuất file":
                    this.view.thucHienSaveFile();
                    break;
                case "About Me":
                    this.view.hienThiAbout();
                case "Exit":
                    this.view.thoatKhoiChuongTrinh();
                case "Save":
                    this.view.thucHienSaveFile();
                case "Open":
                    this.view.thucHienOpenFile();
                default:
                    break;
            }
	}

}