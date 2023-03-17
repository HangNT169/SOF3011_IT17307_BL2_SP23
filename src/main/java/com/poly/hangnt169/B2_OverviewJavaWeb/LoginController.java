package com.poly.hangnt169.B2_OverviewJavaWeb;
/**
 * @author hangnt169
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginController", value = {"/login1","/ket-qua"})
public class LoginController extends HttpServlet {
    // controller: Là tầng giao tiếp với client(view-jsp) thông qua liệu
    // phương thức HTTP
    // Ở Java 4, Java 5 chỉ làm việc với 2 phương thức :  GET, POST
    // GET : Hiển thị dữ liệu
    // POST: Xử lý dữ
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Truyền giá trị từ Servlet sang JSP
        request.setAttribute("mess1", "HangNT169");
        // Chuyển trang
        request.getRequestDispatcher("/buoi2/form-login.jsp").forward(request,response);
//        response.sendRedirect("/form-login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy giá trị từ jsp về servlet
        String username = request.getParameter("uname");
        String password = request.getParameter("psw");

        // Truyen du lieu jsp sang servlet
        request.setAttribute("u1",username);
        request.setAttribute("u2",password);

        // Chuyen trang
        request.getRequestDispatcher("/buoi2/login/hien-thi-ket-qua.jsp").forward(request,response);
    }
}
