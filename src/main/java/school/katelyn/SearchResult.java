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
import java.util.*;
import java.lang.String;

@WebServlet(
	name = "searchresultsservlet",
	urlPatterns ="/searchResult"
)


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		String searchString = req.getParameter("search");
		SodaSelect sodaSelect = new SodaSelect();
		List sodaBrands = sodaSelect.getVendorProducts();
			
	
		Iterator ss = sodaBrands.iterator();
		List results;
		while(ss.hasNext()){
			if(ss.next() == searchString.contains(sodaSelect.getVen() || sodaSelect.getProd())){
				results.add(ss.next());	
			}
		}


		req.setAttribute("result", results);
		RequestDispatcher view = req.getRequestDispatcher("searchResults.jsp");
		view.forward(req, resp);
	}
}

