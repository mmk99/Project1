<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style> 
   
    .navbar{
	    background-color:#228B22;
	}  
    .nav.navbar-nav li a{
	     color:#fff;
		 font-size:20px;
	}
    .navbar-brand img{
	    margin-top:-20px;
	}
	 .carousel-inner > .item > img,
     .carousel-inner > .item > a > img {
         width: 100%;
	     margin:auto;
	     height:400px;
	 }
     p.thumbnail{
	    font-weight:bold;
	    text-align:center;
	}
    
  </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand"  href="/"><img src="C:\Users\Mrunalini\Desktop\Project\Images\baglogo.png" alt="BagsOnline"></a>
	   
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
		 <li><a href="C:\Users\Mrunalini\Desktop\Project\home.html">Home</a></li>
         <li><a href="C:\Users\Mrunalini\Desktop\Project\allproduct.html">Products</a></li>
      </ul> 
        <ul class="nav navbar-nav navbar-right">
	    <li><a href="C:\Users\Mrunalini\Desktop\Project\login.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="C:\Users\Mrunalini\Desktop\Project\reg.html"><span class="glyphicon glyphicon-user"></span> Register</a></li> 
      </ul>
    </div>
  </div>
</nav>
<div class="container">
    
   <div id="myCarousel" class="carousel slide" data-ride="carousel">
    
    <ol class="carousel-indicators">
	  <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	  <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
	  <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="C:\Users\Mrunalini\Desktop\Project\Images\7-types-bags-every-woman-should-own.jpg" alt="Purses" width="800" height="400">
      </div>
      <div class="item">
        <img src="C:\Users\Mrunalini\Desktop\Project\Images\542a73c0-eec3-4281-a58e-4e04c228bd58.jpg" alt="Slings" width="800" height="400">
      </div>
      <div class="item">
	     <img src="C:\Users\Mrunalini\Desktop\Project\Images\bagsss1.png" alt="Clutches"width="800" height="400">
     </div>
     <div class="item">
	     <img src="C:\Users\Mrunalini\Desktop\Project\Images\smart-leather-cell-phone-wallets-credit-card-wallet-for-women-PW01_original.jpg" alt="Wallets" width="800" height="400">
     </div>
     <div class="item">
	     <img src="C:\Users\Mrunalini\Desktop\Project\Images\Casual-wildcraft-backpacks-at-amazon.jpg" alt="Backpacks" width="800" height="400">
     </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </div>
 </div><br>
  <div class="container">
  
  <div class="row">
    <div class="col-md-3">
      <a href="C:\Users\Mrunalini\Desktop\Project\cart.html" class="thumbnail">
        <img src="C:\Users\Mrunalini\Desktop\Project\Images\quality-women-handbag-438143.jpg" alt="Orange women's Handbag" style="width:300px;height:300px">
		<p class="caption"><b> Orange Women's Handbag</b> </p>
		</a>
    </div>
   
    <div class="col-md-3">
      <a href="C:\Users\Mrunalini\Desktop\Project\cart.html" class="thumbnail">
        <img src="C:\Users\Mrunalini\Desktop\Project\Images\5611ebab-7bf1-47de-96db-f41aa6639d75.jpg" alt="Red sling" style="width:300px;height:300px">
         <p class="caption"><b>Red Sling Bag</b></p>
	  </a>
    </div>
	 <div class="col-md-3">
      <a href="C:\Users\Mrunalini\Desktop\Project\cart.html" class="thumbnail">
        <img src="C:\Users\Mrunalini\Desktop\Project\Images\Hopping-Street-Golden-Fabric-Clutch-4859-2464932-1-catalog_s.jpg" alt="Party clutch" style="width:300px;height:300px">
        <p class="caption"><b>Party Clutch </b></p>
	  </a>
	  </div>
	   <div class="col-md-3">
        <a href="C:\Users\Mrunalini\Desktop\Project\cart.html" class="thumbnail">
        <img src="C:\Users\Mrunalini\Desktop\Project\Images\s-l1600.jpg" alt="light blue wallet" style="width:200px;height:300px">
        <p class="caption"><b>Light Blue Wallet</b></p>
	  </a>
    </div>
    
  </div>
</div>
<div class="container" style="padding-bottom:10px" >
<a href="C:\Users\Mrunalini\Desktop\Project\allproduct.html"
 class="btn btn-primary pull-right" role="button">View All Products</a>
</div>
<footer> 
   	<div class="row" style="background-color:#D6DBDF  ;border-top:1px solid gray">
		    <div class="col-sm-3">
                <ul class="unstyle" style="list-style:none">
				    <li><a href="C:\Users\Mrunalini\Desktop\Project\contact.html">Contact</a></li>
				</ul>
			</div>	
            <div class="col-sm-7" style="text-align:centre">				
 				<p><center>@Copyright 2016 All Rights Reserved</center></p>
            </div>
</div>
</div>		
</footer>

</body>
</html>

