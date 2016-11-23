package com.myWebApp.servlets;

import com.myWebApp.servlets.model.MyData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by icarusvolans on 11/22/16.
 */
public class ControllerServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String uri = request.getRequestURI();
        System.out.println("Requested URI: "+uri);

        String jspName = uri.substring(uri.lastIndexOf('/'));
        System.out.println("JSP Name: "+jspName);

        MyData m = new MyData();
        request.setAttribute("what",m.getWhat());

        RequestDispatcher view = request.getRequestDispatcher("/"+jspName+".jsp");
        view.forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
        IOException, ServletException {
            doPost(request, response);

    }
}