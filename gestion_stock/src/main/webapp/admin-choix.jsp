<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bienvenue Administrateur</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 80%;
            margin: 50px auto;
            text-align: center;
        }
        h1 {
            color: #333;
        }
        .button {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Bienvenue Administrateur</h1>
        <div>
            <a href="directeurservlet" class="button">Ajouter des Directeurs</a>
            <a href="magasinservlet" class="button">Ajouter des Magasins</a>
          <a href="produitservlet" class="button">Ajouter un Produit</a>
   <a href="modifyquantity" class="button">modifier quantite</a>
        </div>
    </div>
</body>
</html>
