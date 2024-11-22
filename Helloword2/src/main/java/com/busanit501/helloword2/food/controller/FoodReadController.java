package com.busanit501.helloword2.food.controller;

import com.busanit501.helloword2.food.dto.FoodDTO;
import com.busanit501.helloword2.food.service.FoodService;
import com.busanit501.helloword2.todo.dto.TodoDTO;
import com.busanit501.helloword2.todo.service.TodoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "FoodReadController", urlPatterns = "/food/read")
public class FoodReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet:TodoListController");

        String menu = String.valueOf(req.getParameter("menu"));
//        String price = String.valueOf(req.getParameter("price"));
        FoodDTO foodDTO = FoodService.INSTANCE.getOne(menu);




        req.setAttribute("dto",foodDTO);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/food/foodRead.jsp");
        rd.forward(req, resp);
    }
}