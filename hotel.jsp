
<%@page import="com.pojo.Hotel"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManager"%>

<jsp:include page="userheader.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	BLManager bl = new BLManager();
	List<Hotel> h = bl.serachlisthotel();
	session.setAttribute("list", h);
%>

<div class="container">



	<div class="bs-example widget-shadow"
		data-example-id="contextual-table">
		<h3>
			<br> <b>Hotel Details</b> <br>
			<br>
		</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Hotel Image</th>
					<th>Hotel Name</th>
					<th>Price per Day</th>
					<th>Info</th>
					<th>Address</th>
					<th>Book</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${sessionScope.list}" var="l">
					<tr class="active">
						<td><img alt="" src="img/hotel/${l.hotelimage}"
							style="width: 80px; height: 80px;"></td>
						<td>${l.hotelname}</td>
						<td>${l.rent}</td>
						<td>${l.hotelinfo}</td>
						<td>${l.hoteladdress}</td>

						<td><a href="BookHotel?hid=${l.hid}">Book Hotel Now</a></td>

					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>

</div>


<jsp:include page="footer.jsp"></jsp:include>