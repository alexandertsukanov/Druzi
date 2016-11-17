<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="druzi" 	tagdir="/WEB-INF/tags"%>


<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-code"></i> Technical Skills <a class="edit-block" href="${pageContext.request.contextPath}/edit/skills">Edit</a>
		</h3>
	</div>
	<div class="panel-body">
		<c:forEach var="skills" items="${skills}" varStatus="status">
		<table class="table table-striped table-bordered">
			<thead>
			<tr>
				<th>
						${skills.category}
			</th>
			</tr>
			</thead>

			<tbody>
			<td>${skills.value}</td>
			</tbody>

		</table>
		</c:forEach>
	</div>
</div>