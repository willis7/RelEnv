package relenv

class Version {
	
	String appName
	String tag
	Date createdDate	
	Release partOf

	static belongsTo = [Release]
	
    static constraints = {
		appName(blank:false)
		tag(blank:false)
		createdDate(blank:false)		
    }
	
	String toString(){
		"$appName:$tag"
	}
}
