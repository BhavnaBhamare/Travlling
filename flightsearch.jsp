
<%@page import="com.pojo.Flight"%>
<%@page import="com.model.BLManager"%>
<jsp:include page="userheader.jsp"></jsp:include>

<div class="fh5co-cover" data-stellar-background-ratio="0.5"
	style="background-image: url(images/cover_bg_1.jpg);">

	<div class="container">

		<div class=" form-grids row form-grids-right">


			<br> <br>
			<h4>
				<b>Availability Of Flight</b>
			</h4>
			<form action="SearchFlightServ" method="get">
		    
			<br>
			<br> <br>
			<input type="hidden" name="fid" value="${fid.fid}">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">Date</label>
				<div class="col-sm-4">
					<input type="date" class="form-control" name="fdate">
				</div>

			</div>
			<br>
			<br> <br>
			<div class="col-sm-offset-3" style="color: red;">
				<input type="submit" class="btn btn-default" value="Search Flight">
			</div>
           </form>
		</div>
	</div>
</div>



<jsp:include page="footer.jsp"></jsp:include>