<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-heart"></i> Hobbi <a class="edit-block" href="${pageContext.request.contextPath}/edit/hobbies">Edit</a>
		</h3>
	</div>
	<div class="panel-body">

		<p>${profile.hobbies[0].name}</p>

	</div>
</div>