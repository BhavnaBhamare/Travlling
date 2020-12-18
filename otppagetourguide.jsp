<%@page import="java.sql.Date"%>
<jsp:include page="userheader.jsp"></jsp:include>

<div class="fh5co-cover"
	style="background-image: url(images/cover_bg_1.jpg);">

	<div class="container">

		<div class=" form-grids row form-grids-right">
			<div class="widget-shadow " data-example-id="basic-forms">
				<hr>
				<div class="form-title">
					<h4><b>OTP Details:</b></h4>
				</div>
				<div class="form-body">
					<form action="ConfirmBookingTourGuide" method="post" class="form-horizontal">

					
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="email"
									value="${email}" readonly="readonly">
							</div>
							
						</div>
						<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">OTP</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" name="otp">
							</div>
						</div>

						<div class="col-sm-offset-2" style="color: red;">
							<input type="submit" class="btn btn-default" value="Submit">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>




</div>



<jsp:include page="footer.jsp"></jsp:include>