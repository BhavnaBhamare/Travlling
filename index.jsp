
<!DOCTYPE html>

<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Travelling &mdash;</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
<meta name="author" content="FREEHTML5.CO" />

<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- Superfish -->
<link rel="stylesheet" href="css/superfish.css">
<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">
<!-- Date Picker -->
<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
<!-- CS Select -->
<link rel="stylesheet" href="css/cs-select.css">
<link rel="stylesheet" href="css/cs-skin-border.css">

<link rel="stylesheet" href="css/style.css">

<script src="js/modernizr-2.6.2.min.js"></script>

</head>
<body>
	<%
		String fname = (String) session.getAttribute("fname");
	%>
	<div id="fh5co-wrapper">
		<div id="fh5co-page">

			<header id="fh5co-header-section" class="sticky-banner">
				<div class="container">
					<div class="nav-header">
						<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>

						<img alt="" src="images/tour.png" width="180" height="100">

						<!-- START #fh5co-menu-wrap -->
						<nav id="fh5co-menu-wrap" role="navigation">
							<ul class="sf-menu" id="fh5co-primary-menu">
								<li class="active"><a href="index.jsp">Home</a></li>


								<li><a href="flight.jsp">Flights</a></li>
								<li><a href="hotel.jsp">Hotel</a></li>
								<li><a href="cabs.jsp">Cabs</a></li>
								<li><a href="package.jsp">Package</a></li>
								<li><a href="tourguide.jsp">Tour Guide</a></li>
								<li><a href="" class="fh5co-sub-ddown"><b>${fname}</b></a>
									<ul class="fh5co-sub-menu">
										<li><a href="">Your Booking Details</a>
											<ul class="fh5co-sub-menu">
												<li><a href="bookingdetails.jsp">Flight</a></li>
												<li><a href="cabdetails.jsp">Cab</a></li>
												<li><a href="hoteldetails.jsp">Hotel</a></li>
												<li><a href="tourguidedetails.jsp">Tour Guide</a></li>
											</ul></li>
										<li><a href="profileUser.jsp">Profile</a></li>
										<li><a href="logoutServlet">Logout</a></li>
									</ul></li>


								<li><a href="registration.jsp">Registration</a></li>
								<li><a href="login.jsp">Login</a></li>

							</ul>
						</nav>
					</div>
				</div>
			</header>

			<!-- end:header-top -->

			<div class="fh5co-hero">
				<div class="fh5co-overlay"></div>
				<div class="fh5co-cover" data-stellar-background-ratio="0.5"
					style="background-image: url(images/cover_bg_1.jpg);">
					<div class="desc">
						<div class="container">
							<div class="row" align="center">
								<h1>Welcome to Online Booking, Flight, Cabs & Hotel</h1>
								<h2>for</h2>
								<h1>
									<b>Max-Travel Book </b>
								</h1>
							</div>
						</div>
					</div>

				</div>

				<div id="fh5co-tours" class="fh5co-section-gray">
					<div class="container">
						<div class="row">
							<div
								class="col-md-8 col-md-offset-2 text-center heading-section animate-box">
								<h3>Hot Tours</h3>
								<p>Far far away, behind the word mountains, far from the
									countries Vokalia and Consonantia, there live the blind texts.</p>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4 col-sm-6 fh5co-tours animate-box"
								data-animate-effect="fadeIn">
								<div href="#">
									<img src="images/place-1.jpg"
										alt="Free HTML5 Website Template by FreeHTML5.co"
										class="img-responsive">
									<div class="desc">
										<span></span>
										<h3>New York</h3>
										<span>3 nights + Flight 5*Hotel</span> <span class="price">$1,000</span>
										<a class="btn btn-primary btn-outline" href="#">Book Now <i
											class="icon-arrow-right22"></i></a>
									</div>
								</div>
							</div>
							<div class="col-md-4 col-sm-6 fh5co-tours animate-box"
								data-animate-effect="fadeIn">
								<div href="#">
									<img src="images/place-2.jpg"
										alt="Free HTML5 Website Template by FreeHTML5.co"
										class="img-responsive">
									<div class="desc">
										<span></span>
										<h3>Philippines</h3>
										<span>4 nights + Flight 5*Hotel</span> <span class="price">$1,000</span>
										<a class="btn btn-primary btn-outline" href="#">Book Now <i
											class="icon-arrow-right22"></i></a>
									</div>
								</div>
							</div>
							<div class="col-md-4 col-sm-6 fh5co-tours animate-box"
								data-animate-effect="fadeIn">
								<div href="#">
									<img src="images/place-3.jpg"
										alt="Free HTML5 Website Template by FreeHTML5.co"
										class="img-responsive">
									<div class="desc">
										<span></span>
										<h3>Hongkong</h3>
										<span>2 nights + Flight 4*Hotel</span> <span class="price">$1,000</span>
										<a class="btn btn-primary btn-outline" href="#">Book Now <i
											class="icon-arrow-right22"></i></a>
									</div>
								</div>
							</div>
							<div class="col-md-12 text-center animate-box">
								<p>
									<a class="btn btn-primary btn-outline btn-lg" href="#">See
										All Offers <i class="icon-arrow-right22"></i>
									</a>
								</p>
							</div>
						</div>
					</div>
				</div>

				<div id="fh5co-features">
					<div class="container">
						<div class="row">
							<div class="col-md-4 animate-box">

								<div class="feature-left">
									<span class="icon"> <i class="icon-hotairballoon"></i>
									</span>
									<div class="feature-copy">
										<h3>Family Travel</h3>
										<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
											mollitia reprehenderit.</p>
										<p>
											<a href="#">Learn More</a>
										</p>
									</div>
								</div>

							</div>

							<div class="col-md-4 animate-box">
								<div class="feature-left">
									<span class="icon"> <i class="icon-search"></i>
									</span>
									<div class="feature-copy">
										<h3>Travel Plans</h3>
										<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
											mollitia reprehenderit.</p>
										<p>
											<a href="#">Learn More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-4 animate-box">
								<div class="feature-left">
									<span class="icon"> <i class="icon-wallet"></i>
									</span>
									<div class="feature-copy">
										<h3>Honeymoon</h3>
										<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
											mollitia reprehenderit.</p>
										<p>
											<a href="#">Learn More</a>
										</p>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4 animate-box">

								<div class="feature-left">
									<span class="icon"> <i class="icon-wine"></i>
									</span>
									<div class="feature-copy">
										<h3>Business Travel</h3>
										<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
											mollitia reprehenderit.</p>
										<p>
											<a href="#">Learn More</a>
										</p>
									</div>
								</div>

							</div>

							<div class="col-md-4 animate-box">
								<div class="feature-left">
									<span class="icon"> <i class="icon-genius"></i>
									</span>
									<div class="feature-copy">
										<h3>Solo Travel</h3>
										<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
											mollitia reprehenderit.</p>
										<p>
											<a href="#">Learn More</a>
										</p>
									</div>
								</div>

							</div>
							<div class="col-md-4 animate-box">
								<div class="feature-left">
									<span class="icon"> <i class="icon-chat"></i>
									</span>
									<div class="feature-copy">
										<h3>Explorer</h3>
										<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
											mollitia reprehenderit.</p>
										<p>
											<a href="#">Learn More</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>


				<div id="fh5co-destination">
					<div class="tour-fluid">
						<div class="row">
							<div class="col-md-12">
								<ul id="fh5co-destination-list" class="animate-box">
									<li class="one-forth text-center"
										style="background-image: url(images/place-1.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Los Angeles</h2>
											</div>
									</a></li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-2.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Hongkong</h2>
											</div>
									</a></li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-3.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Italy</h2>
											</div>
									</a></li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-4.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Philippines</h2>
											</div>
									</a></li>

									<li class="one-forth text-center"
										style="background-image: url(images/place-5.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Japan</h2>
											</div>
									</a></li>
									<li class="one-half text-center">
										<div class="title-bg">
											<div class="case-studies-summary">
												<h2>Most Popular Destinations</h2>
												<span><a href="#">View All Destinations</a></span>
											</div>
										</div>
									</li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-6.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Paris</h2>
											</div>
									</a></li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-7.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Singapore</h2>
											</div>
									</a></li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-8.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Madagascar</h2>
											</div>
									</a></li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-9.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Egypt</h2>
											</div>
									</a></li>
									<li class="one-forth text-center"
										style="background-image: url(images/place-10.jpg);"><a
										href="#">
											<div class="case-studies-summary">
												<h2>Indonesia</h2>
											</div>
									</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>


				<div id="fh5co-testimonial"
					style="background-image: url(images/img_bg_1.jpg);">
					<div class="container">
						<div class="row animate-box">
							<div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
								<h2>Happy Clients</h2>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4">
								<div class="box-testimony animate-box">
									<blockquote>
										<span class="quote"><span><i
												class="icon-quotes-right"></i></span></span>
										<p>&ldquo;Far far away, behind the word mountains, far
											from the countries Vokalia and Consonantia, there live the
											blind texts. Separated they live in Bookmarksgrove right at
											the coast of the Semantics, a large language ocean.&rdquo;</p>
									</blockquote>
									<p class="author">
										Avi <a href="http://freehtml5.co/" target="_blank">maxgen
											tech</a> <span class="subtext">Creative Director</span>
									</p>
								</div>

							</div>
							<div class="col-md-4">
								<div class="box-testimony animate-box">
									<blockquote>
										<span class="quote"><span><i
												class="icon-quotes-right"></i></span></span>
										<p>&ldquo;Far far away, behind the word mountains, far
											from the countries Vokalia and Consonantia, there live the
											blind texts.&rdquo;</p>
									</blockquote>
									<p class="author">
										Kabir <a href="http://freehtml5.co/" target="_blank"></a> <span
											class="subtext">Creative Director</span>
									</p>
								</div>


							</div>
							<div class="col-md-4">
								<div class="box-testimony animate-box">
									<blockquote>
										<span class="quote"><span><i
												class="icon-quotes-right"></i></span></span>
										<p>&ldquo;Far far away, behind the word mountains, far
											from the countries Vokalia and Consonantia, there live the
											blind texts. Separated they live in Bookmarksgrove right at
											the coast of the Semantics, a large language ocean.&rdquo;</p>
									</blockquote>
									<p class="author">
										Mahejabeen <a href="#">maxtech</a> <span class="subtext">Creative
											Director</span>
									</p>
								</div>

							</div>
						</div>
					</div>
				</div>
				<footer>
					<div id="footer">
						<div class="container">
							<div class="row row-bottom-padded-md">
								<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
									<h3>About Travel</h3>
									<p>Far far away, behind the word mountains, far from the
										countries Vokalia and Consonantia, there live the blind texts.</p>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
									<h3>Top Flights Routes</h3>
									<ul>
										<li><a href="#">Manila flights</a></li>
										<li><a href="#">Dubai flights</a></li>
										<li><a href="#">Bangkok flights</a></li>
										<li><a href="#">Tokyo Flight</a></li>
										<li><a href="#">New York Flights</a></li>
									</ul>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
									<h3>Top Hotels</h3>
									<ul>
										<li><a href="#">Boracay Hotel</a></li>
										<li><a href="#">Dubai Hotel</a></li>
										<li><a href="#">Singapore Hotel</a></li>
										<li><a href="#">Manila Hotel</a></li>
									</ul>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
									<h3>Interest</h3>
									<ul>
										<li><a href="#">Beaches</a></li>
										<li><a href="#">Family Travel</a></li>
										<li><a href="#">Budget Travel</a></li>
										<li><a href="#">Food &amp; Drink</a></li>
										<li><a href="#">Honeymoon and Romance</a></li>
									</ul>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
									<h3>Best Places</h3>
									<ul>
										<li><a href="#">Boracay Beach</a></li>
										<li><a href="#">Dubai</a></li>
										<li><a href="#">Singapore</a></li>
										<li><a href="#">Hongkong</a></li>
									</ul>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
									<h3>Affordable</h3>
									<ul>
										<li><a href="#">Food &amp; Drink</a></li>
										<li><a href="#">Fare Flights</a></li>
									</ul>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 col-md-offset-3 text-center">
									<p class="fh5co-social-icons">
										<a href="#"><i class="icon-twitter2"></i></a> <a href="#"><i
											class="icon-facebook2"></i></a> <a href="#"><i
											class="icon-instagram"></i></a> <a href="#"><i
											class="icon-dribbble2"></i></a> <a href="#"><i
											class="icon-youtube"></i></a>
									</p>
									<p>
										Copyright 2019 Maxgen Technology pvt ltd <a href="#">Module</a>.
										All Rights Reserved. <br>Made with <i class="icon-heart3"></i>
										by <a href="http://freehtml5.co/" target="_blank">maxgen-tech.co</a>
										/ Demo Images: <a href="https://unsplash.com/" target="_blank">Avinash</a>
									</p>
								</div>
							</div>
						</div>
					</div>
				</footer>



			</div>
			<!-- END fh5co-page -->

		</div>
		<!-- END fh5co-wrapper -->

		<!-- jQuery -->


		<script src="js/jquery.min.js"></script>
		<!-- jQuery Easing -->
		<script src="js/jquery.easing.1.3.js"></script>
		<!-- Bootstrap -->
		<script src="js/bootstrap.min.js"></script>
		<!-- Waypoints -->
		<script src="js/jquery.waypoints.min.js"></script>
		<script src="js/sticky.js"></script>

		<!-- Stellar -->
		<script src="js/jquery.stellar.min.js"></script>
		<!-- Superfish -->
		<script src="js/hoverIntent.js"></script>
		<script src="js/superfish.js"></script>
		<!-- Magnific Popup -->
		<script src="js/jquery.magnific-popup.min.js"></script>
		<script src="js/magnific-popup-options.js"></script>
		<!-- Date Picker -->
		<script src="js/bootstrap-datepicker.min.js"></script>
		<!-- CS Select -->
		<script src="js/classie.js"></script>
		<script src="js/selectFx.js"></script>

		<!-- Main JS -->
		<script src="js/main.js"></script>
</body>
</html>

