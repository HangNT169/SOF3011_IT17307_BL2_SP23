package com.poly.hangnt169.B3_CRUDListFixCung.controller;
/**
 * @author hangnt169
 */

import com.poly.hangnt169.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_CRUDListFixCung.service.SinhVienService;
import com.poly.hangnt169.B3_CRUDListFixCung.service.impl.SinhVienServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SinhVienController", value = {
        "/sinh-vien/hien-thi", // GET
        "/sinh-vien/search", // GET
        "/sinh-vien/remove", // GET
        "/sinh-vien/detail", // GET
        "/sinh-vien/view-update", // GET
        "/sinh-vien/update",  // POST
        "/sinh-vien/add",    // POST
        "/sinh-vien/view-add"  // GET
})
public class SinhVienController extends HttpServlet {

    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    private List<SinhVien> sinhViens = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI(); // Lay duoc gia tri o tren duong dan
        if (uri.contains("hien-thi")) {
            // hien thi du lieu
            this.hienThiSinhVien(request, response);
        } else if (uri.contains("search")) {
            // search du lieu
            this.searchSinhVien(request, response);
        } else if (uri.contains("remove")) {
            // Remove du lieu
            this.removeSinhVien(request, response);
        } else if (uri.contains("detail")) {
            // detail du lieu
            this.detailSinhVien(request, response);
        } else if (uri.contains("view-add")) {
            // hien thi form add
            this.viewAddSinhVien(request, response);
        } else if (uri.contains("view-update")) {
            // hien thi form update
            this.viewUpdateSinhVien(request, response);
        } else {
            // neu khong vao cac case tren thi quay lai trang hien thi
            this.hienThiSinhVien(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI(); // Lay duoc gia tri o tren duong dan
        if (uri.contains("add")) {
            // add sinh vien
            this.addSinhVien(request, response);
        } else {
            // update sinh vien
            this.updateSinhVien(request, response);
        }
    }

    private void updateSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void addSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void detailSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void searchSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void hienThiSinhVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sinhViens.add(new SinhVien("HangNT169", "Nguyễn Thuý Hằng", 10, "Hà Nội", false));
        sinhViens.add(new SinhVien("PhongTT35", "Trần Tuấn Phong", 11, "Hà Nội1", true));
        sinhViens.add(new SinhVien("NguyenVV4", "Vũ Văn Nguyên", 12, "Hà Nội2", true));
        sinhViens.add(new SinhVien("KhanhPG", "Phạm Gia Khánh", 13, "Hà Nội", true));
        sinhViens.add(new SinhVien("TienNH21", "Nguyễn Hoàng Tiến", 14, "Hà Nội3", true));
        sinhViens.add(new SinhVien("DungNA29", "Nguyễn Anh Dũng", 15, "Hà Nội4", true));
        request.setAttribute("list",sinhViens);
        request.getRequestDispatcher("/buoi3/sinhviens.jsp").forward(request,response);
    }
}
