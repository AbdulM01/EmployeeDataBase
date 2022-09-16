$("#btnAllEmployees").click(function (){
    $.ajax({
        url: '/home/ajaxcall',
        type: 'GET',
        dataType: 'json',
        data: {}
    })
})

/*$('#btnAllStudents').click(function() {
    $.ajax({
       url: 'http://localhost:8089/Students',
       data: {
          format: 'json'
       },
       error: function() {
          $('#info').html('<p>An error has occurred</p>');
       },
       dataType: 'jsonp',
       success: function(data) {
          var $title = $('<h1>').text(data.talks[0].talk_title);
          var $description = $('<p>').text(data.talks[0].talk_description);
          $('#info')
             .append($title)
             .append($description);
       },
       type: 'GET'
    });
 });*/