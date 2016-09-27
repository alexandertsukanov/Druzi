
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>




<div class="container">
        <div class="list-group">
        <a href="#" class="list-group-item active">
            My Friends
        </a>
<c:forEach var="profile" items="${profiles}" end="10" >
        <a href="${profile.uid}" class="list-group-item"><img class="img-thumbnail smallimg" src="${profile.smallPhoto}"/>  ${profile.fullName}</a>
     </c:forEach>
        </div>
</div>

