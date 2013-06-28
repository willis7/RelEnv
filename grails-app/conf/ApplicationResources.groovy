modules = {
    application {
        resource url:'js/application.js'
    }
	
	core {
		resource url:'/js/jquery/jquery-1.9.1.min.js', disposition: 'head'
	}
 
	fullCalendar {
		dependsOn 'core'
		resource url:'/js/fullcalendar/fullcalendar.min.js'
		resource url:'/css/fullcalendar/fullcalendar.css'
	}
	
	calendar {
		dependsOn 'fullCalendar'
 
		resource url: '/js/calendar.js'
		resource url: '/css/calendar.css'
 
	}
}