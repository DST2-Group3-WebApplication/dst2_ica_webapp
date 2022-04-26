package com.example.dst2_ica.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "displayServlet", urlPatterns = "/display")
public class displayServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String search = req.getParameter("search");
        String db = req.getParameter("db");
        req.setAttribute("search", search);
        req.setAttribute("db", db);
        // using dao
        switch (db) {
            case "Gene":
            case "Variant":
            case "Drug":
            case "Disease":
        }
        req.getRequestDispatcher("/display.jsp").forward(req, res);
    }
}
