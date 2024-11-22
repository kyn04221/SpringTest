package com.busanit501.helloword2.food.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "foodListController", urlPatterns = "/food/list")
public class FoodListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/food/foodList.jsp");
        rd.forward(req, resp);

          // req.getRequestDispatcher("/WEB-INF/food/foodList.jsp") .forward(req, resp);
    }
}