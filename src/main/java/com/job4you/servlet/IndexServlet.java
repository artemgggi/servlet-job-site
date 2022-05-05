package com.job4you.servlet;

import com.job4you.store.DbStore;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("postsLastDay", DbStore.instOf().findLastPosts());
        req.setAttribute("candidatesLastDay", DbStore.instOf().findLastCandidates());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
