package com.poly.hangnt169.B5_Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
/**
 * @author hangnt169
 */
@WebServlet(name = "DangXuatServlet", value = "/dang-xuat")
public class DangXuatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Xoa session
        HttpSession session = request.getSession();
        // C1: Xoa tat ca
//        session.invalidate();
        // C2: Xoa 1 session
        session.removeAttribute("name1");
        response.sendRedirect("/login");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
