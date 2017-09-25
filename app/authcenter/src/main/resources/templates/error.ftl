<#-- head头文件 -->
<#include "/common/header.ftl" />
<#-- ---------------------------------------------------------------------------- -->

<div class="header">
    <div class="header_top">
        <div class="container">
            <div class="logo">
                <a href="index.htm"><img src="images/logo.png" alt=""/></a>
            </div>
            <ul class="shopping_grid">
                  <a href="#"><li>Join</li></a>
                  <a href="login.htm"><li>Sign In</li></a>
                  <a href="#"><li><span class="m_1">Shopping Bag</span>&nbsp;&nbsp;(0) &nbsp;<img src="images/bag.png" alt=""/></li></a>
                  <div class="clearfix"> </div>
            </ul>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div class="h_menu4"><!-- start h_menu4 -->
        <div class="container">
                <a class="toggleMenu" href="#">Menu</a>
                <ul class="nav">
                    <li><a href="index.htm" data-hover="Home">Home</a></li>
                    <li><a href="about.htm" data-hover="About Us">About Us</a></li>
                    <li><a href="careers.htm" data-hover="Careers">Careers</a></li>
                    <li><a href="contact.htm" data-hover="Contact Us">Contact Us</a></li>
                    <li class="active"><a href="404.htm" data-hover="Company Profile">Company Profile</a></li>
                    <li><a href="register.htm" data-hover="Company Registration">Company Registration</a></li>
                    <li><a href="wishlist.htm" data-hover="Wish List">Wish List</a></li>
                 </ul>
                 <script type="text/javascript" src="js/nav.js"></script>
          </div><!-- end h_menu4 -->
     </div>
</div>
<div class="column_center">
  <div class="container">
    <div class="search">
      <div class="stay">Search Product</div>
      <div class="stay_right">
          <input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
          <input type="submit" value="">
      </div>
      <div class="clearfix"> </div>
    </div>
    <div class="clearfix"> </div>
  </div>
</div>
<div class="about">
 <div class="container">
    <div class="page-not-found">
        <h1>404</h1>
        <a href="#">Back </a>
    </div>
 </div>
</div>
<div class="footer_bg">
</div>
<div class="footer">
    <div class="container">
        <div class="col-md-3 f_grid1">
            <h3>About</h3>
            <a href="#"><img src="images/logo.png" alt=""/></a>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,</p>
        </div>
        <div class="col-md-3 f_grid1 f_grid2">
            <h3>Follow Us</h3>
            <ul class="social">
                <li><a href=""> <i class="fb"> </i><p class="m_3">Facebook</p><div class="clearfix"> </div></a></li>
                <li><a href=""><i class="tw"> </i><p class="m_3">Twittter</p><div class="clearfix"> </div></a></li>
                <li><a href=""><i class="google"> </i><p class="m_3">Google</p><div class="clearfix"> </div></a></li>
                <li><a href=""><i class="instagram"> </i><p class="m_3">Instagram</p><div class="clearfix"> </div></a></li>
            </ul>
        </div>
        <div class="col-md-6 f_grid3">
            <h3>Contact Info</h3>
            <ul class="list">
                <li><p>Phone : 1.800.254.5487</p></li>
                <li><p>Fax : 1.800.254.2548</p></li>
                <li><p>Email : <a href="mailto:info(at)fashionpress.com"> info(at)fashionpress.com</a></p></li>
            </ul>
            <ul class="list1">
                <li><p>Aliquam augue a bibendum ipsum diam, semper porttitor libero elit egestas gravida, ut quam, nunc taciti</p></li>
            </ul>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>


<#-- ---------------------------------------------------------------------------- -->
<#-- foot尾文件 -->
<#include "/common/footer.ftl" />