
<script>
    $('#main').addClass('active');
</script>


<div class="container">
<div class="panel panel-default">
    <div class="panel-body">
    <h4 class="text-center">Main</h4>
    <hr>


<div class="row">
  <div class="col-md-4 "><img class="img-responsive photo" src="${profile.largePhoto}" alt="photo"></div>

</div>

        <hr>

<div class="row">
  <div class="col-md-2">
    <h5>Upload new photo</h5>
  </div>
    <label class="btn btn-primary btn-file">
        Browse <input type="file" style="display: none;">
    </label>



</div>
     <hr>

      <div class="row">

          <div class="col-xs-6 col-sm-2"><h5>Birth Date</h5></div>
          <div  class="col-xs-6 col-sm-4"><input class="form-control" id="date" type="text"></div>

          <script>
              $( function() {
                  $( "#date" ).datepicker();
              } );
          </script>



      </div>

      <hr>

      <div class="row">

          <div class="col-xs-6 col-sm-2"><h5>Country</h5></div>
          <div class="col-xs-6 col-sm-4"><select  class="form-control" id="country" name="country">
          </select></div>
          <script>
              populateCountries("country", "${profile.country}");
          </script>

      </div>

      <hr>

      <div class="row">

          <div class="col-xs-6 col-sm-2"><h5>City</h5></div>
          <div class="col-xs-6 col-sm-4"><textarea class="form-control">${profile.city}</textarea></div>


      </div>

      <hr>

      <div class="row">

          <div class="col-xs-6 col-sm-2"><h5>E-mail</h5></div>
          <div class="col-xs-6 col-sm-4"><textarea class="form-control">${profile.email}</textarea></div>


      </div>

      <hr>

      <div class="row">

          <div class="col-xs-6 col-sm-2"><h5>Phone</h5></div>
          <div class="col-xs-6 col-sm-4"><textarea class="form-control">${profile.phone}</textarea></div>


      </div>

      <hr>

      <div class="row">

          <div class="col-xs-6 col-sm-2"><h5>Position</h5></div>
          <div class="col-xs-6 col-sm-4"><textarea class="form-control"></textarea></div>


      </div>

      <hr>

      <div class="row">

          <div class="col-xs-6 col-sm-2"><h5>Qualification</h5></div>
          <div class="col-xs-6 col-sm-4"><textarea class="form-control"></textarea></div>


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
