<%@ page import="dao.NewsTitleDao" %>
<%@ page import="java.io.IOException" %>
<%@ page import="entity.NewsTitle" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新闻后台管理</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="jumbotron bg-info">
        <h1 class="display-4 font-weight-bold text-white">新闻发布后台管理系统</h1>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-4">
            	<h3>新闻分类</h3>
            	<nav class="nav flex-column">
                    <%
                        for (NewsTitle nt : new NewsTitleDao().findAll()) {
                    %>
                    <li class="nav-item">
                        <a class="nav-link active" href="#"><%=nt.getTitlename()%>></a>
                    </li>
                    <%
                        }
                    %>

                </nav>
            </div>
            <div class="col-8">
            </div>
        </div>
    </div>

    
</body>
</html>