package test04.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 所有自定义Serlvet的父类 - 通过反射机制，在程序运行时调用action参数指定的方法
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 第一：获取 类 的Class对象 - clazz对象运行时动态决定
        Class clazz = this.getClass();

        // 获取action参数值
        String methodName = req.getParameter("action");

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        try {
            // 1.获取要调用的方法对象
            Method method = clazz
                    .getDeclaredMethod(methodName
                            ,HttpServletRequest.class
                            ,HttpServletResponse.class);

            // 2.开启访问权限
            method.setAccessible(true);

            // 3.调用方法
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            do405(req,resp) ;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    protected void do405(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("request error...");
    }
}
