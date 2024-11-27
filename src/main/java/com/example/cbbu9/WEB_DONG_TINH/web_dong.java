package com.example.cbbu9.WEB_DONG_TINH;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


// web động vì thay đổi sau mỗi lần vào trang và có phản hồi cline gửi request, server trả response động
@WebServlet(name = "helloServlet", value = "/")
public class web_dong extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "default";
        }
        if (action.equals("default")) {
            showComputerTime(resp);
        }
    }

    private void showComputerTime(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Thời gian máy tính</title>");
        out.println("</head>");
        out.println("<body>");
        Date timeData = new Date();
        out.println("<h1>Thời gian hiện tại là: " + timeData + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
