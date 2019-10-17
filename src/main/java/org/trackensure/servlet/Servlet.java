package org.trackensure.servlet;

import java.io.OutputStream;
import com.google.gson.Gson;
import org.trackensure.entity.Garage;
import org.trackensure.service.GarageService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            GarageService garageService = new GarageService();
            List<Garage> garageList = garageService.getAll();
            resp.setContentType("application/json");
            OutputStream outputStream = resp.getOutputStream();
            Gson gson = new Gson();
            outputStream.write(gson.toJson(garageList).getBytes());
            outputStream.flush();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}