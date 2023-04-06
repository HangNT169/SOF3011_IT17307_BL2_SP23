package com.poly.hangnt169.B14_Filter.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @author hangnt169
 */
//@WebFilter(filterName = "AuthenFilter", value =
//        {"/sinh-vien/hien-thi","/sinh-vien/view-add"
//        })
@WebFilter(filterName = "AuthenFilter", value = {
        "/sinh-vien/*", "/CategoryServlet"
})
public class AuthenFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        Filter.super.init(config);
        System.out.println("Filter init ");
    }

    public void destroy() {
        Filter.super.destroy();
        System.out.println("Filter destroy ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("Filter before");
        // B1: Ep kieu
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        // B2: Check authen
        String username = (String) session.getAttribute("username");
        if (username == null) {
            // quay lai trang login
            res.sendRedirect("/Login14Servlet");
        } else {
            // Khi login thanh cong => Chuyen trang
            chain.doFilter(request, response);
        }
        System.out.println("Filter after");
    }
}
