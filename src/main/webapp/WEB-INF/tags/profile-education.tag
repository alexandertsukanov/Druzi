<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-graduation-cap"></i> Education <a class="edit-block" href="${pageContext.request.contextPath}/edit/practics">Edit</a>
		</h3>
	</div>
	<div class="panel-body">
		<c:forEach var="education" items="${education}">
		<ul class="timeline">

				<li>
					<div class="timeline-badge success ">
						<i class="fa fa-graduation-cap"></i>
					</div>
					<div class="timeline-panel">
						<div class="timeline-heading">
							<h4 class="timeline-title">Studying at ${education.university} </h4>
							<p>
								<small class="dates"><i class="fa fa-calendar"></i> ${education.beginYear} - ${education.finishYear}  </small>
							<h6>${education.summary}</h6>
							</p>
						</div>
						<div class="timeline-body">





						</div>
					</div>
				</li>

		</ul>
		</c:forEach>
	</div>
</div>