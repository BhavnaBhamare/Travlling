<%@page import="com.pojo.Flight"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManager"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="userheader.jsp"></jsp:include>


<div style="background-color: white;">

	<%
		BLManager bl = new BLManager();
		List<Flight> f = bl.serachlistflight();
		session.setAttribute("list", f);
	%>
	
	<div class="container">
		<br>
		
		<div class="bs-example widget-shadow"
			data-example-id="contextual-table">
			<h3>
			    <br>
				<b>Flight Details</b>
				<br><br>
			</h3>
			<table class="table">
				<thead>
					<tr>
						<th>Logo</th>
						<th>Flight Name</th>
						<th>Source</th>
						<th>Destination</th>
						<th>Duration</th>
						<th>Rate</th>

						<th>Time</th>
						<th>Book</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${sessionScope.list}" var="l">
						<tr class="active">
							<td><img alt="" src="img/flight/${l.flightimg}"
								style="width: 80px; height: 80px;"></td>
							<td>${l.flightname}</td>
							<td>${l.source}</td>
							<td>${l.destination}</td>
							<td>${l.duration}</td>
							<td>${l.flightrate}</td>
							<td>${l.flighttime}</td>
							<td><a href="Flightsearch?fid=${l.fid}">Book Now</a></td>

						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>

	</div>
</div>



<jsp:include page="footer.jsp"></jsp:include>