
<script>
    $('#languages').addClass('active');
</script>



<div class="container">
<div class="panel panel-default">


    <div class="row"></div>

    <div class="panel-body">
        <h4 class="data-header text-center">Languages</h4>
        <hr>

        <div class="row">
            <div class="col-xs-3" >
        <label for="level" class="text-center">Level</label>
            <select id="level" class="form-control">
                <option>Beginner</option>
                <option>Pre-intermediate</option>
                <option>Intermediate</option>
                <option>Upper-intermediate</option>
                <option>Advanced</option>
            </select>
            </div>

            <div class="col-xs-2 ">
                <label for="language" class="text-center">Language</label>
                <textarea id="language" class="form-control"></textarea>
            </div>
        </div>

        <hr>
        <div class="row">

            <div class="col-xs-12">
                <a href="javascript:void(0);">+ Add language</a>
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