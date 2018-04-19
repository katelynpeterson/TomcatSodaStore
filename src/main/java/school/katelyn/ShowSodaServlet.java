package school.katelyn;

import school.katelyn.tomcatdemo.SodaSelect;
import school.katelyn.tomcatdemo.SodaType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


@WebServlet(
name = "showsodaservlet",
urlPatterns =""
)

public class ShowSodaServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException{


SodaType [] sodatype = SodaType.values();
List sodas = new ArrayList();

for(int i =0; i<sodatype.length; i++){
	sodas.add(sodatype[i].name());
}

 req.setAttribute("companybrand", sodas);
RequestDispatcher view = req.getRequestDispatcher("indexLanding.jsp");
view.forward(req, resp);

}
}
