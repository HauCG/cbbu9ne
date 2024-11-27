package com.example.cbbu9.Client_Server;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;



@WebServlet(name = "helloServlet", value = "/")
public class web_dong extends HttpServlet {



    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 1. Client gửi yêu cầu HTTP GET đến server.
        String action = req.getParameter("action");
        // server nhận xử lý yêu cầu
        if (action == null) {
            action = "default";
        }
        if (action.equals("default")) {
            showComputerTime(resp);
            // 2. Server trả về kết quả cho client qua hàm logic.
        }
    }

    private void showComputerTime(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        // 3. Trả về kết quả cho client thông qua đối tượng PrintWriter để ghi được nội dung vào phần body của phản hồi đấy

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
    //4. server gửi phản hồi đi
}
