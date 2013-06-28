package relenv

import grails.converters.JSON

class EventController {

    def index() {
		
	}
	
	def list = {
		def eventList = []
		 Release.each { release ->
			 //println toJson(release.startDate)
			 println release.name
			 eventList << [
					 //id: release.id,
					 title: release.name,
					 start: toJson(release.startDate),
					 end: toJson(release.endDate)
				 ]
		 }

		 f = new File('myfile.txt')
		 f.write(eventList)
		 render eventList as JSON
	}

}
