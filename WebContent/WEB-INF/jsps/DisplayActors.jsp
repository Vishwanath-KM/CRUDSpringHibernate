<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="st"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="resources/login.css">
<link rel="stylesheet" type="text/css" href="resources/main.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">

<title>Display Actors</title>
</head>
<body>
	<div class="rlform">
		<div class="rlform rlform-wrapper">
			<div class="rlform-box">
				<div class="rlform-box-inner">
					<h1>Display Actors</h1>
					<br>
					<div>
						<hr></hr>
					</div>
					<a href="openAddActorView">Click to Add Actor</a> <br />
					<br>
					<div>
						<hr></hr>
					</div>
					<h3>List of Actors</h3>
					<div class="table-responsive">
						<table id="data_table_blue"
							class="table table-striped table-bordered" style="width: 100%">
							<thead>
								<tr>
									<th align="left" width="15%"><b>Name</b></th>
									<th align="left" width="48%"><b>Famous Name</b></th>
									<th align="center" width="5%"><b>Update</b></th>
									<th align="center" width="17%"><b>Delete</b></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listActors}" var="bean">
									<tr>
										<td>${bean.uname}</td>
										<td>${bean.fname}</td>
										<td><a href="openUpdateActor?sl=${bean.sl}"> Update</a></td>
										<td><a href="deleteActor?sl=${bean.sl}">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</DIV>
				</DIV>
			</div>
		</div>
	</div>
</body>
</html>






