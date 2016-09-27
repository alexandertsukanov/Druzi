<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>


<div class="panel panel-primary">
<div class="panel-heading">
	<h3 class="panel-title">
		<i class="fa fa-briefcase"></i> Practic Experience <a class="edit-block" href="${pageContext.request.contextPath}/edit/practice">Edit</a>
	</h3>
</div>
<div class="panel-body">
	<ul class="timeline">
		<c:forEach var="practic" items="${practic}">
		<li>
			<div class="timeline-badge danger">
				<i class="fa fa-briefcase"></i>
			</div>
			<div class="timeline-panel">
				<div class="timeline-heading">
					<h4 class="timeline-title">${practic.position} at ${practic.company}</h4>
					<p>
						<small class="dates"><i class="fa fa-calendar"></i> ${practic.beginDate} - ${practic.finishDate} </small>

					</p>
				</div>
				<div class="timeline-body">





				</div>
			</div>
		</li>
		</c:forEach>
	</ul>
</div>
</div>