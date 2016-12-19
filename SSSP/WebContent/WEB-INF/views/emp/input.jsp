<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<!--  

-->
<script type="text/javascript">
	$(function() {
		$("#lastName")
				.change(
						function(e) {
							var val = $(this).val();
							val = $.trim(val);
							$(this).val(val);


							//If the modifying lastName is same as the last one
							var _oldLastName = $("#_oldLastName").val();
							_oldLastName = $.trim(_oldLastName);

							if(_oldLastName != null && _oldLastName != "" && _oldLastName == val){
								alert("Last Name is valiable.");
								return ;

								}
							
							var url = "${pageContext.request.contextPath}/ajaxValidateLastName";
							var args = {
								"lastName" : val,
								"date" : new Date()
							};

							$.post(url, args, function(data) {
								if (data == "0") {
									alert("Last Name is valiable.");
								} else if (data == "1") {
									alert("Last Name is Not Valiable.");

								} else {
									alert("Internet is not connected.");

								}

							});

						});

	})
</script>

</head>
<body>


	<c:set value="${pageContext.request.contextPath }/emp" var="url"></c:set>

	<c:if test="${employee.id != null }">
		
		<c:set value="${pageContext.request.contextPath }/emp/${employee.id }" var="url"></c:set>
	
	</c:if>

	<form:form action="${url }"
		method="POST" modelAttribute="employee">
		
		
	
		<c:if test="${employee.id != null }">
			<input type="hidden" id="_oldLastName" value="${employee.lastName }"/>
			<form:hidden path="id" /><!-- 如果我们使用的隐藏域要回显，而又和employee 相关，就用 form:hidden -->
			<input type="hidden" name="_method" value="PUT">
		</c:if>
		
		
		LastName: <form:input path="lastName" />
		<br>
		Email: <form:input path="email" />
		<br>
		Birth: <form:input path="birth" />
		<br>
		Department:
		<form:select path="department.id" items="${departments }"
			itemLabel="departmentName" itemValue="id"></form:select>
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>