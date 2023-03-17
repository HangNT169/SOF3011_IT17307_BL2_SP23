package com.poly.hangnt169.B5_Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @author hangnt169
 */
@WebServlet(name = "DangNhapServlet", value = "/login")
public class DangNhapServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/dang-nhap.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("psw");
        // Check rong
        if(username.isEmpty() || password.isEmpty()){
            request.setAttribute("mess","Tài khoản hoặc mật khẩu trống");
//            response.sendRedirect("/dang-nhap.jsp");
            request.getRequestDispatcher("/dang-nhap.jsp").forward(request,response);
        }
        // Check TK - MK dung
        if(username.equalsIgnoreCase("hangnt169") && password.equals("123456")){
            // B1: Goi session
            HttpSession session = request.getSession();
            // B2: Tao ra 1 bien co pham vi : session
            session.setAttribute("name1",username);
            // chuyen vao co duong dan la /home
            response.sendRedirect("/home");
        }else{
            request.setAttribute("mess","Tài khoản hoặc mật khẩu sai");
            request.getRequestDispatcher("/dang-nhap.jsp").forward(request,response);
        }
    }
}
