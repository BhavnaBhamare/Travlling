<%@page import="com.pojo.Hotelbooking"%>
<%@page import="com.model.BLManager"%>
<%@page import="com.pojo.Bookedticket"%>
<%@page import="java.util.List"%>
<jsp:include page="userheader.jsp"></jsp:include>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="background-color: white;">

<%
    BLManager bl=new BLManager();
	String email=(String)session.getAttribute("email");
	List<Hotelbooking> bk=bl.serachbookhotellist(email);
	session.setAttribute("book",bk);

%>

	<div class="container">
		<br>
		
		<div class="bs-example widget-shadow"
			data-example-id="contextual-table">
			<h3>
				<b>Your Booking Hotel</b>
			</h3>
			<table class="table">
				<thead>
					<tr>
						<th>Logo</th>
						<th>Hotel Name</th>
						<th>Hotel Type</th>
						<th>Cost Per/Day</th>
						<th>Date</th>
						<th>No of People</th>
						<th>Address</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${sessionScope.book}" var="l">
						<tr class="active">
							<td><img alt="" src="img/hotel/${l.hotel.hotelimage}"
								style="width: 80px; height: 80px;"></td>
							<td>${l.hotel.hotelname}</td>
							<td>${l.hotel.hoteltype}</td>
							<td>${l.hotel.rent}</td>
							<td>${l.bookingdate}</td>
							<td>${l.noofpeople}</td>
							<td>${l.hotel.hoteladdress}</td>
							
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>

	</div>
</div>



<jsp:include page="footer.jsp"></jsp:include>