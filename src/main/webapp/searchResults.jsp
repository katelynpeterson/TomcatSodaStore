<%@ page import = "java.util.*"%>
<!DOCTYPE html>
<html>

<style>
	td{
		padding: 10px;
	}
</style>
	<body>
		<center>
			<h1>Search Results</h1>
			<table>
				<tr>
					<th>Vender and Drink</th>
				</tr>
			<%
			SodaSelect ss = new SodaSelect();
			List result = (List)request.getAttribute("result");
			Iterator vp = result.iterator();
			while(vp.hasNext()){
				out.println("<tr><td>" + vp.next().toString() +"</td></tr>");
			}
			%>
			</table>
		</center>
	</body>
</html>
