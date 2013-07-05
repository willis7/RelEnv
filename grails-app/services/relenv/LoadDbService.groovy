package relenv

class LoadDbService {
	
	def fileName
	
	LoadDbService(def fileName) {
        this.fileName = fileName
    }
	
	def load (){
		
		def data = new XmlSlurper().parse(fileName)
		
		// These do not have dependencies and can therefore be generated easily
		data.Release.each {
			new Release(name: "${it.'@name'}", status: "${it.'@status'}", startDate: new Date().parseToStringDate("${it.'@startDate'}"), endDate: new Date().parseToStringDate("${it.'@endDate'}")).save(failOnError: true)
		}
		data.Stack.each {
			new Stack(number: "${it.@'number'}").save(failOnError: true)
		}
		// for these imports to work correctly they need to search for the items that they relate to using .findByName
		data.Version.each {
			new Version(appName: "${it.@'appName'}", tag: "${it.@'tag'}", createdDate: new Date().parseToStringDate("${it.'@createdDate'}"), partOf: Release.findByName("${it.@'partOf'}")).save(failOnError: true)
		}
		data.Environment.each {
			new Environment(hostname: "${it.@'hostname'}", testTier: "${it.@'testTier'}", lastRefresh: new Date().parseToStringDate("${it.'@lastRefresh'}"), ownedBy: Release.findByName("${it.@'ownedBy'}"), partOf: Stack.findByNumber("${it.@'partOf'}")).save(failOnError: true)
		}		
	}
}
