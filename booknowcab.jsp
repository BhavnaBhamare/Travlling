<%@page import="java.sql.Date"%>
<jsp:include page="userheader.jsp"></jsp:include>

<div class="fh5co-cover"
	style="background-image: url(images/cover_bg_1.jpg);">

	<%
		Integer cid = (Integer) session.getAttribute("cid");
		String cname = (String) session.getAttribute("cname");
		String cno = (String) session.getAttribute("cno");
		String pack = (String) session.getAttribute("pack");
		String drivername = (String) session.getAttribute("drivername");
		String cabtype = (String) session.getAttribute("cabtype");
		String mobno = (String) session.getAttribute("mobno");
		
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
					<form action="ConfirmBookingOTP2" method="post" class="form-horizontal">


						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Cab
								Name</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="cname"
									value="${cname}" readonly="readonly">
							</div>


						</div>
						<br>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Cab Type</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="cabtype"
									value="${cabtype}" readonly="readonly">
							</div>


							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Package</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="pack"
										value="${pack}" readonly="readonly">
								</div>
							</div>
						</div>
						<div class="form-group"></div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Cab Number
								</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="cno"
									value="${cno}" readonly="readonly">
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">Mobile No</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" name="mobno"
										value="${mobno}" readonly="readonly">
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