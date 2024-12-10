<html>
<body>
<h1>Passport Form</h1>
<form action="pass" method="post">
<pre>
Given Name <input type="text" name="givenName"> <br>
Surname <input type="text" name="surname"> <br>
Date of Birth <input type="date" name="dob"><br>
E-mail Id <input type="email" name="emailId"><br>

Do you want your Login Id <input type="radio" name="yesOrNo">Yes <input type="radio" name="yesOrNo">No <br>
to be same as E-mail Id?

Login Id <input type="text" name="loginID"> <br>
Password <input type="password" name="password"><br>
Confirm Password <input type="password" name="confirmPassword"><br>
Hint Question <select name="select"><br>
<option>--Select--</option>
<option>Birth City</option>
<option>Favourite Color</option>
<option>Favourite Cricket</option>
<option>Favourite Food</option>
<option>First School</option>
<option>Make of First car Owned</option>
<option>Mothers maiden Name</option>
</select> <br>
Hint Answer <input type="text" name="hintAnswer"><br>
<input type="submit" value="Register"/> <input type="submit" value="Clear">
</pre>
</form>
</body>
</html>