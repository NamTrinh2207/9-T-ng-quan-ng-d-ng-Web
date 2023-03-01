package com.example.discountcalculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator", value = "/DiscountCalculator")
public class DiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float Price = Float.parseFloat(request.getParameter("Price"));
        float Percent = Float.parseFloat(request.getParameter("Percent"));
        float DiscountAmount = (float) (Price * Percent * 0.01);
        float DiscountPrice = (Price - DiscountAmount);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>DiscountAmount: " + DiscountAmount + "</h1>");
        writer.println("<h1>DiscountPrice: " + DiscountPrice + "</h1>");
        writer.println("</html>");

    }
}
