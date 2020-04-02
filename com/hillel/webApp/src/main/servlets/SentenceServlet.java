package com.hillel.HWs.webApp;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SentenceServlet extends HttpServlet{
    public SentenceServlet() {}

    Utils ut = new Utils();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("word");
        resp.getWriter().append((ut.wordFinder(text)));
    }
}
