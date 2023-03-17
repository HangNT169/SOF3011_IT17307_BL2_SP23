package com.poly.hangnt169.B5_Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

/**
 * @author hangnt169
 */

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // Goi session ra
        HttpSession session = request.getSession();
        // Lay gia tri session mong muon
        String ketQua1 = (String) session.getAttribute("name1");
        request.setAttribute("kq",ketQua1);
        request.getRequestDispatcher("/trang-chu.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
