<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Connexion Administrateur</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f4f4;
        }
        .container {
            text-align: center;
            background-color: #fff;
            border-radius: 5px;
            padding: 20px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #333;
        }
        form {
            margin-top: 20px;
        }
        input[type="text"],
        input[type="password"] {
            width: 300px;
            padding: 10px;
            margin: 5px;
            border-radius: 3px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        button[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 3px;
            transition: background-color 0.3s;
        }
        button[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Connexion Administrateur</h2>
        <form action="login" method="post">
            <table>			
                <tr><td>Login</td><td><input class="input100" type="text" name="login" placeholder="Login"></td></tr>
                <tr><td>Mot de passe</td><td><input class="input100" type="password" name="password" placeholder="Mot de passe"></td></tr>
                <tr><td></td><td><button type="submit">Se Connecter</button></td></tr>
            </table>
        </form>
    </div>
</body>
</html>

