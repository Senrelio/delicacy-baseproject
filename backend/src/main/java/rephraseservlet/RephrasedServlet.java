package rephraseservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "RephrasedServlet", loadOnStartup = 1, urlPatterns = "/RephrasedServlet")
public class RephrasedServlet extends HttpServlet {
}
