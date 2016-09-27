
<script>
    $('#courses').addClass('active');
</script>


<div class="container">
    <div class="panel panel-default">
        <div class="panel-body">
            <h4 class="data-header text-center">Courses</h4>



            <div class="row bordered">
                <div class="col-xs-10">



                    <div class="row">
                        <div  class="col-xs-2 ">
                            <label>Course name</label>
                            <textarea  class="form-control"></textarea>
                        </div>
                        <div  class="col-xs-2  ">
                            <label>School name</label>
                            <textarea class="form-control"></textarea>
                        </div>

                        <div class="col-xs-3">

                            <label>Description</label>
                            <textarea type="text" class="form-control"></textarea>

                        </div>

                        <div class="col-xs-2">

                            <label>Start date</label>
                            <input id="start" type="text" class="form-control">

                        </div>
                        <div class="col-xs-2">

                            <label>Finish date</label>
                            <input id="end" type="text" class="form-control">


                        </div>
                    </div>



                </div>
            </div>







            <div class="row">

                <div class="col-xs-12">
                    <a id="button" href="javascript:void(0);">+ Add course</a>
                </div>
            </div>

            <hr />
            <div class="row">
                <div class="text-center">
                    <input type="submit" class="btn btn-primary" value="Save">
                </div>
            </div>


        </div>
    </div>



</div>