<%@page import="com.pojo.Cabbooking"%>
<%@page import="com.model.BLManager"%>
<%@page import="com.pojo.Bookedticket"%>
<%@page import="java.util.List"%>
<jsp:include page="userheader.jsp"></jsp:include>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="background-color: white;">

<%
    BLManager bl=new BLManager();
	String email=(String)session.getAttribute("email");
	List<Cabbooking> bk=bl.serachbookcablist(email);
	session.setAttribute("book",bk);

%>

	<div class="container">
		<br>
		
		<div class="bs-example widget-shadow"
			data-example-id="contextual-table">
			<h3>
				<b>Your Booking Flight</b>
			</h3>
			<table class="table">
				<thead>
					<tr>
						<th>Logo</th>
						<th>Cab Name</th>
						<th>Cabs type</th>
						<th>Package</th>
						<th>Cab No</th>
						<th>Driver Name</th>
						<th>Mobile No</th>
						<th>Booking date</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${sessionScope.book}" var="l">
						<tr class="active">
							<td><img alt="" src="img/cabs/${l.cabs.cabimg}"
								style="width: 80px; height: 80px;"></td>
							<td>${l.cabs.cabname}</td>
							<td>${l.cabs.cabtype}</td>
							<td>${l.cabs.package_}</td>
							<td>${l.cabs.cabno}</td>
							<td>${l.cabs.drivername}</td>
							<td>${l.cabs.phoneno}</td>
							<td>${l.bookingdate}</td>
							

						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>

	</div>
</div>



<jsp:include page="footer.jsp"></jsp:include>