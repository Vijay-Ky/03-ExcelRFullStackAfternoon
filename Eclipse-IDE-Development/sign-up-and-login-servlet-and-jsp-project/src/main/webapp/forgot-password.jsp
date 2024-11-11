<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status")%>">

    <h2>Forgot Password</h2>
    <form action="forgotPassword" method="post">
        <label for="email">Enter your email address:</label><br>
        <input type="email" id="email" name="email" required><br>
        <input type="submit" value="Submit">
    </form>	
	</script>
	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if(status === "success")
		{
			swal("Hurray!", "You are a valid user, click to change your password!", "success");
		}
		else if(status === "failed")
		{
			swal("Sorry", "Email doesnt exists", "error");
		}
	</script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
</body>
</html>
