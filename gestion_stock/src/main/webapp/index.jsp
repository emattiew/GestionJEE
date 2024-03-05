<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Page de Connexion</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: radial-gradient(circle at 84.6% 77.8%, rgb(86, 89, 218) 0%, rgb(95, 208, 248) 90%);;
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
        p {
            margin-bottom: 20px;
            color: #666;
        }
        form {
            display: inline-block;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 3px;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Bienvenue sur le Système de Gestion des Stocks</h2>
        <p>Veuillez sélectionner votre rôle pour vous connecter :</p>
        
       
        <form action="admin-login.jsp">
            <input type="submit" value="Se connecter en tant qu'Administrateur">
        </form>

       
        <form action="manager-login.jsp">
            <input type="submit" value="Se connecter en tant que Directeur Général">
        </form>
    </div>
</body>
</html>
