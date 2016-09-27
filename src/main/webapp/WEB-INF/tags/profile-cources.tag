<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-book"></i> Courses <a class="edit-block" href="${pageContext.request.contextPath}/edit/courses">Edit</a>
		</h3>
	</div>
	<div class="panel-body">

		<ul class="timeline">
			<c:forEach var="course" items="${course}">
				<li>
					<div class="timeline-badge info">
						<i class="fa fa-star-half-full"></i>
					</div>
					<div class="timeline-panel">
						<div class="timeline-heading">
							<h4 class="timeline-title"> ${course.school} </h4>
							<p>
								<small class="dates"><i class="fa fa-calendar"></i> ${course.finishDate} </small>

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