<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>Account List Enquiry Page</h1>

<ul>
<c:forEach items="${accounts}" var="account">
   <li>${account}</li>
</c:forEach>
</ul>