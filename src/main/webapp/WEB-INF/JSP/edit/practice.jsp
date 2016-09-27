
<script>
    $('#practice').addClass('active');

    $( function() {
        $( "#start" ).datepicker();
    } );
    $( function() {
        $( "#end" ).datepicker();
    } );


    $(document).ready(function () {



        $("#button").click(function () {
            if (($('.form-horizontal .control-group').length + 1) > 2) {
                alert("Only 2 control-group allowed");
                return false;
            }
            var large = '<div class="panel panel-default"><div class="row bordered"><div class="col-xs-10"> <div class="row"> <div  class="col-xs-2 "> <label>Position</label> <textarea  class="form-control"></textarea> </div> <div  class="col-xs-2"> <label>Company</label> <textarea class="form-control"></textarea> </div> </div> <div class="row"><div class="col-xs-2"> <label>Start date</label> <input type="text" class="form-control"> </div> <div class="col-xs-2"> <label>End date</label> <input type="text" class="form-control"> </div> </div><div class="row"><div class="col-xs-8"> <label>Description</label> <textarea type="text" class="form-control"></textarea> </div> </div></div></div></div>';
            var id = ($('.container').length + 1).toString();
            $('.container').append(large);
        });

    });

</script>


<div class="container">
<div class="panel panel-default">
    <div class="panel-body">


        <h4 class="data-header text-center">Practice</h4>

<div class="row bordered">
        <div class="col-xs-10">



        <div class="row">
            <div  class="col-xs-3 ">
                <label>Position</label>
                <textarea  class="form-control"></textarea>
            </div>
            <div  class="col-xs-3  ">
                <label>Company</label>
                <textarea class="form-control"></textarea>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-3">

                <label>Start date</label>
                <input id="start" type="text" class="form-control">

            </div>
            <div class="col-xs-3">

                <label>End date</label>
                <input id="end" type="text" class="form-control">


            </div>
        </div>

        <div class="row">

            <div class="col-xs-8">

                <label>Description</label>
                <textarea type="text" class="form-control"></textarea>

            </div>

            </div>



        </div>
</div>







        <div class="row">

            <div class="col-xs-12">
                <a id="button" href="javascript:void(0);">+ Add practice</a>
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


