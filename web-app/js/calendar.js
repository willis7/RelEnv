$(document).ready(function() {
	
    $("#calendar").fullCalendar({
    	
        events: 'list.json',
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
        },
        weekends: false,
        
        eventRender: function(event, element){
        	element.qtip({
        		content: event.description
        	})
        }
    });
});