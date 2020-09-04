<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="st"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="resources/login.css">
<title>Add Actor</title>
</head>
<body>
	<div class="rlform">
  <div class="rlform rlform-wrapper">
   <div class="rlform-box">
    <div class="rlform-box-inner">
       <h1>Add Actor</h1>
      <sf:form action="addActor" modelAttribute="actor">
        

           <div class="rlform-group">
               <label>Enter name</label>
               <sf:input path="uname"/><sf:errors path="uname"/>
          </div>

          <div class="rlform-group password-group">
           <label>Enter famous character name</label>
           <sf:input path="fname"/><sf:errors path="fname"/>
          </div>
		
	 <div class="rlform-group password-group">
           <label>Upload Pic</label>
          <input type="file" name="pic"/>
         </div>

    <button type="submit" class="rlform rlform-box rlform-btn" >Add
    </button>

   </sf:form>
  </div>
   </div>
     </div>
 </div>


</body>
</html>







