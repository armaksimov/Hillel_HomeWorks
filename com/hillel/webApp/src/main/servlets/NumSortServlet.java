package com.hillel.HWs.webApp;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class NumSortServlet extends HttpServlet{
    public NumSortServlet() {}

    Utils ut = new Utils();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String arr = req.getParameter("sequence");
        resp.getWriter().append(ut.sort(arr));
    }
}
