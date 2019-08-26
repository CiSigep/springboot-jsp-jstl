<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello ${name}!</title>
</head>
<body>
	<h1>Hello ${name}!</h1>
	
	<c:forEach items="${forEachList}" var="item">
		<div>
			${item}
		</div>
	</c:forEach>
</body>
</html>