package relenv

class Release {
	
	String name
	String note
	Date startDate
	Date endDate
	String status
	
	static hasMany = [versions: Version, environments: Environment]

    static constraints = {
		name(blank:false, unique: true)
		startDate()
		status(inList: ["Active", "Complete", "Dropped"], blank:false)
		note(maxSize:1000, nullable:true)
		endDate(nullable:true)
    }
	
	String toString(){
		name
	}
}
