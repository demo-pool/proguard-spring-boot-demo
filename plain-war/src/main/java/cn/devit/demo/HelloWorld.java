package cn.devit.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.springframework.util.MimeTypeUtils;

import cn.devit.demo.api.User;
import cn.devit.demo.biz.DummyService;

@WebServlet(name = "hello world servlet", urlPatterns = { "/hello", "/make" })
public class HelloWorld extends HttpServlet {

    /*
     * (non-Javadoc)
     *
     * @see javax.servlet.GenericServlet#init()
     */
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println(getClass().getName() + " inited.");
    }

    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // request uri contains application context path,/contextPaht/hello
        resp.setContentType(MimeTypeUtils.TEXT_PLAIN.toString());
        if (req.getRequestURI().endsWith("hello")) {
            DummyService bean = new DummyService();
            System.out.println(bean.getUsername("1"));

            resp.getWriter().write("world.");
        } else if (req.getRequestURI().endsWith("make")) {
            resp.getWriter().write("love.");
        }
    }

    public static String some() {
        DummyService bean = new DummyService();
        return bean.getUsername("1") + "<br/>" + DummyService.class;
    }
    
    public static String some2() {
        return User.class.toString();
    }

    @Override
    public String getServletInfo() {
        return "Hello world servlet 1.0";
    }

}
