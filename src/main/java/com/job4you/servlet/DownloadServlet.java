package com.job4you.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        File users = null;
        for (File file : Objects.requireNonNull(new File("c:\\images\\").listFiles())) {
            if ("users".equals(file.getName())) {
                users = file;
                break;
            }
        }
        resp.setContentType("application/octet-stream");
        assert users != null;
        resp.setHeader("Content-Disposition", "attachment; filename=\"" + users.getName() + "\"");
    }
}
