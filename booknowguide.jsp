<%@page import="java.sql.Date"%>
<jsp:include page="userheader.jsp"></jsp:include>

<div class="fh5co-cover"
	style="background-image: url(images/cover_bg_1.jpg);">

	<%
		Integer tourid = (Integer) session.getAttribute("tourid");
		String tname = (String) session.getAttribute("tname");
		String gender = (String) session.getAttribute("gender");
		Integer cost = (Integer) session.getAttribute("cost");
		String phno = (String) session.getAttribute("phno");
		
		String fname = (String) session.getAttribute("fname");
		String lname = (String) session.getAttribute("lname");
		String email = (String) session.getAttribute("email");
	%>

	<div class="container">

		<div class=" form-grids row form-grids-right">
			<div class="widget-shadow " data-example-id="basic-forms">
				<hr>
				<div class="form-title">
					<h4><b>Tour Guide Booking Details:</b></h4>
				</div>
				<div class="form-body">
					<form action="ConfirmBookingOTP3" method="post" class="form-horizontal">


						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Tour Guide
								Name</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="tname"
									value="${tname}" readonly="readonly">
							</div>


						</div>
						<br>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Gender</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="cabtype"
									value="${gender}" readonly="readonly">
							</div>


							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Cost Per Day</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="pack"
										value="${cost}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="form-group"></div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Phone Number
								</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="phno"
									value="${phno}" readonly="readonly">
							</div>
						</div>
						
						
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Choose Date
								</label>
							<div class="col-sm-4">
								<input type="date" class="form-control" name="hdate" required="required">
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