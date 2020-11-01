<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>Account Transactions Enquiry Page</h1>

<h4>Account Number is ${id}</h4>

<ul>
<c:forEach items="${acctTransactions}" var="acctTransactions">
   <li>${acctTransactions}</li>
</c:forEach>
</ul>