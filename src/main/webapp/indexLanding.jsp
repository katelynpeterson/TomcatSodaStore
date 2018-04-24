<%@ page import ="java.util.*"%>

<!DOCTYPE html>
<html lang ="en">

	<head>
		<meta charset="UTF-8">
		<title>Soda Shop</title>
	</head>
	<body>
		<div class="search">
			<form id="mySearch" method="post" action="TomcatSodaStore/searchResult" target="_blank">
			<input type="search" name="search" id="mySearch" placeholder="Search for a Soda">
			</form>
			<br><br>
			<p id ="demo"></p>
		</div>
		
		<center>
			<h1>**Select the brand of Soda**</h1>
			<form method="post" action="TomcatSodaStore/SelectSoda">

				<br>
				<select name="Type" size="1">
				<%
				List show = (List)request.getAttribute("companybrand");
				Iterator it = show.iterator();
				while(it.hasNext()){
					out.println("<option>" + it.next() + "</option>");
               			}
				%>
				</select>				
				<br><br>

				<input type="submit">
			</form>
		</center>

		<script>
                	function myFunc(){
	                        var x = document.getElementById("mySearch").elements[0].value;
                        	document.getElementById("demo").innerHTML = x;
                        }
                </script>
	</body>
</html>
