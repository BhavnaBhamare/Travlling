<jsp:include page="userheader.jsp"></jsp:include>


<%@page import="com.pojo.Cabs"%>
<%@page import="java.util.List"%>
<%@page import="com.pojo.Flight"%>
<%@page import="com.model.BLManager"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
	BLManager bl = new BLManager();
	List<Cabs> f = bl.serachlistcabs();
	session.setAttribute("list", f);
%>
<div class="container">

	<div class="bs-example widget-shadow"
		data-example-id="contextual-table">
		<h3>
			<br>
			<b>Cabs Details</b> <br>
			<br>
		</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Cabs Img</th>
					<th>Cab Name</th>
					<th>Driver Name</th>
					<th>Rate/km</th>
					<th>Cab No</th>
					<th>Cab Type</th>
					<th>Mob No</th>

					<th>Book Now</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${sessionScope.list}" var="l">
					<tr class="active">
						<td><img alt="" src="img/cabs/${l.cabimg}"
							style="width: 80px; height: 80px;"></td>
						<td>${l.cabname}</td>
						<td>${l.drivername}</td>
						<td>${l.package_}</td>
						<td>${l.cabno}</td>
						<td>${l.cabtype}</td>
						<td>${l.phoneno}</td>
						<td><a href="BookNowCab?cabid=${l.cabid}">Book Now</a></td>

					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>

</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>