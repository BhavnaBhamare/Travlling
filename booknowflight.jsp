<%@page import="java.sql.Date"%>
<jsp:include page="userheader.jsp"></jsp:include>

<div class="fh5co-cover"
	style="background-image: url(images/cover_bg_1.jpg);">

	<%
		Integer flightid = (Integer) session.getAttribute("flighid");
		String flightname = (String) session.getAttribute("flightname");
		String source = (String) session.getAttribute("source");
		String destination = (String) session.getAttribute("destination");
		String duration = (String) session.getAttribute("duration");
		Date fdate = (Date) session.getAttribute("fdate");
		String time = (String) session.getAttribute("time");

		String fname = (String) session.getAttribute("fname");
		String lname = (String) session.getAttribute("lname");
		String email = (String) session.getAttribute("email");
	%>

	<div class="container">

		<div class=" form-grids row form-grids-right">
			<div class="widget-shadow " data-example-id="basic-forms">
				<hr>
				<div class="form-title">
					<h4><b>Ticket Details:</b></h4>
				</div>
				<div class="form-body">
					<form action="ConfirmBookingOTP" method="post" class="form-horizontal">


						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Flight
								Name</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="fname"
									value="${flightname}" readonly="readonly">
							</div>


						</div>
						<br>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Duration</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="duration"
									value="${duration}" readonly="readonly">
							</div>


							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Source</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="source"
										value="${source}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="form-group"></div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Flight
								date</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="fdate"
									value="${fdate}" readonly="readonly">
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Destination</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="destination"
										value="${destination}" readonly="readonly">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Time</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="ftime"
									value="${ftime}" readonly="readonly">
							</div>

						</div>
						<hr>
						<div class="form-title">
							<h3><b>User Details :</b></h3>
						</div>
						<br><br>
						
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">First
								Name </label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="fdate"
									value="${fname}" readonly="readonly">
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Last
									Name</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="lname"
										value="${lname}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="email"
									value="${email}" readonly="readonly">
							</div>

						</div>

						<div class="col-sm-offset-5" style="color: red;">
							<input type="submit" class="btn btn-default" value="BOOK">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>




</div>



<jsp:include page="footer.jsp"></jsp:include>