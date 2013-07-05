package relenv

import grails.converters.JSON

class EventController {

    def index() {
		
	}
	
	def list = {
		def eventList = []
		 Release.list().each { release ->
			 eventList << [
					 id: release.id,
					 title: release.name,
					 start: release.startDate,
					 end: release.endDate
				 ]
		 }
		 render eventList as JSON
	}

}
