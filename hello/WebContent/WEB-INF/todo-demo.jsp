<html>

<body>

<form action="todo-demo.jsp">
	Add new item: <input type="text" name="theItem" />
	
	<input type="submit" value="Submit" />


</form>
Item entered: <%= request.getParameter("theItem") %>



</body>



</html>