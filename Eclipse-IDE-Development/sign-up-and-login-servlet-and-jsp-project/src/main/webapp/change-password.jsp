<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password</title>
</head>
<body>
    <h2>Change Password</h2>
    <form action="updatePassword" method="post">
        <input type="hidden" name="email" value="<%= request.getParameter("email") %>">
        <label for="newPassword">Enter your new password:</label><br>
        <input type="password" id="newPassword" name="newPassword" required><br>
        <input type="submit" value="Change Password">
    </form>
</body>
</html>
