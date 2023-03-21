package test04.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * StudentServlet - 定义一个 Servlet 可以处理 Student 相关的请求
 *
 * @Date 2023-03-21
 * @Author zqx
 */
@WebServlet("/stu.do")
public class StudentServlet extends BaseServlet {

    /**
     * 处理 添加学生
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("add...");
    }

    /**
     * 处理 删除学生
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void del(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("del...");
    }

    /**
     * 处理 修改学生
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("update...");
    }

    /**
     * 处理 查询学生
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("query...");
    }
}
