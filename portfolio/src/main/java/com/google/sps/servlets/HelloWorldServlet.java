package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
  private ArrayList<String> facts = new ArrayList<String>();
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    if (facts.size() < 3) {
      facts.add("My name is Tyler.");
      facts.add("I play guitar.");
      facts.add("I go to Georgia Tech.");
    }
    Gson gson = new Gson();
    String json = gson.toJson(facts);
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}
