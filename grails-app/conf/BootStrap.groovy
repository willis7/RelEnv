import relenv.LoadDbService

class BootStrap {

    def init = { servletContext ->
		
		environments {
			development {
				def dbs = new LoadDbService('grails-app/resources/test_data/test_records.xml')
				dbs.load()
			}
		}		
    }
	
    def destroy = {
    }
}
