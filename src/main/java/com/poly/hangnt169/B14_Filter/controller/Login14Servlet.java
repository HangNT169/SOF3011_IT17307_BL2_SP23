package com.poly.hangnt169.B14_Filter.controller;
/**
 * @author hangnt169
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "Login14Servlet", value = "/Login14Servlet")
public class Login14Servlet extends HttpServlet {
    // Khi chay chuong trinh => Hien thi giao dien dang nhap
    // Check dang nhap.
    // LinhTD15 , 123456
    // => Dang nhap thanh cong => ket-qua.jsp.
    // Trong trang ket-qua.jsp => Hello + ten tai khoan vua dang nhap
    // => Khi dang nhap that bai => Hien thi loi " Dang nhap thai bai" => Quay tro lai trang dang nhap
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/buoi14/dang-nhap14.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("psw");

        if (username.equalsIgnoreCase("LinhTD15") && password.equals("123456")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            request.getRequestDispatcher("/buoi14/ket-qua.jsp").forward(request, response);
        } else {
            request.setAttribute("mess", "dang nhap that bai");
            request.getRequestDispatcher("/buoi14/dang-nhap14.jsp").forward(request, response);
        }
    }
}
