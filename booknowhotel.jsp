<%@page import="java.sql.Date"%>
<jsp:include page="userheader.jsp"></jsp:include>

<div class="fh5co-cover"
	style="background-image: url(images/cover_bg_1.jpg);">

	<%
		Integer hotelid = (Integer) session.getAttribute("hotelid");
		String hname = (String) session.getAttribute("hname");
		String htype = (String) session.getAttribute("htype");
		Integer rent = (Integer) session.getAttribute("rent");
		String hinfo = (String) session.getAttribute("hinfo");
		String address = (String) session.getAttribute("address");

		String fname = (String) session.getAttribute("fname");
		String lname = (String) session.getAttribute("lname");
		String email = (String) session.getAttribute("email");
	%>

	<div class="container">

		<div class=" form-grids row form-grids-right">
			<div class="widget-shadow " data-example-id="basic-forms">
				<hr>
				<div class="form-title">
					<h4><b>Hotel Booking Details:</b></h4>
				</div>
				<div class="form-body">
					<form action="ConfirmBookingOTP1" method="post" class="form-horizontal">


						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Hotel
								Name</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="hname"
									value="${hname}" readonly="readonly">
							</div>


						</div>
						<br>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Hotel Type</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="htype"
									value="${htype}" readonly="readonly">
							</div>


							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Hotel Rent</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="rent"
										value="${rent}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="form-group"></div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Hotel Info
								</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="hinfo"
									value="${hinfo}" readonly="readonly">
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Hotel Address</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="address"
										value="${address}" readonly="readonly">
								</div>
							</div>
						</div>
						
						
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Choose Date
								</label>
							<div class="col-sm-4">
								<input type="date" class="form-control" name="hdate" required="required">
							</div>
							<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Select People</label>
							<div class="col-sm-4">
								<select name="noofpeople" >
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
							</div>
						</div>
						</div>
						
						
						<hr>
						<div class="form-title">
							<h3><b>Yours Details Below:</b></h3>
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