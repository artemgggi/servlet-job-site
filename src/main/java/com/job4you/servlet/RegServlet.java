package com.job4you.servlet;

import com.job4you.store.DbStore;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            DbStore.instOf().registerUser(
                    req.getParameter("name"),
                    req.getParameter("email"),
                    req.getParameter("password")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.sendRedirect(req.getContextPath() + "/login.jsp");
    }
//}
//        String username = req.getParameter("name");
//        String email = req.getParameter("email");
//        String password = req.getParameter("password");
//
//        try {
//            User user = DbStore.instOf().findByEmail(email);
//            if (user != null) {
//                DbStore.instOf().registerUser(username, email, password);
//                resp.sendRedirect(req.getContextPath() + "/login.jsp");
//            } else {
//                req.setAttribute("error", "message");
//            }
//            req.getRequestDispatcher("/reg.jsp").forward(req, resp);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

