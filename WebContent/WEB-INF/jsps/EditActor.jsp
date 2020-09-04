<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="resources/login.css">
<title>Update Actor</title>
</head>
<body>
	<div class="rlform">
  <div class="rlform rlform-wrapper">
   <div class="rlform-box">
    <div class="rlform-box-inner">
     <h1>Update Actor</h1>
      <sf:form action="updateActor" modelAttribute="act">
           <sf:hidden path="sl"/>
		<br />

           <div class="rlform-group">
               <label>Enter name</label>
               <sf:input path="uname" />
		<sf:errors path="uname" />
		<br />
          </div>

          <div class="rlform-group password-group">
           <label>Enter famous character name</label>
           <sf:input path="fname" />
		<sf:errors path="fname" />
		<br />
          </div>
		
	 <div class="rlform-group password-group">
           <label>Upload Pic</label>
          <input type="file" name="pic"/>
         </div>

    <button type="submit" class="rlform rlform-box rlform-btn" >Update
    </button>

   </sf:form>
  </div>
   </div>
     </div>
 </div>
</body>
</html>