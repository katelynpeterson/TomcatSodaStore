package school.katelyn;

import school.katelyn.tomcatdemo.SodaSelect;
import school.katelyn.tomcatdemo.SodaType;
import school.katelyn.tomcatdemo.VendorNProduct;

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

public class SearchResult extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		String searchString = (String)req.getParameter("search");
		SodaSelect sodaSelect = new SodaSelect();
		List sodaBrands = sodaSelect.getVendorProducts();
			
	
		Iterator ss = sodaBrands.iterator();
		List results = new ArrayList<VendorNProduct>();

		while(ss.hasNext()){
			VendorNProduct cur = (VendorNProduct) ss.next();
			System.out.println(searchString + " is my search string\n");
			System.out.println("Vendor " + cur.getVendor() + " Product " + cur.getProduct());
			if(searchString.contains(cur.getVendor()) ||searchString.contains(cur.getProduct())){
				results.add(cur);	
				System.out.print(results.size()+ "result size");
				
			}
		}


		req.setAttribute("result", results);
		RequestDispatcher view = req.getRequestDispatcher("searchResults.jsp");
		view.forward(req, resp);
	}
}


