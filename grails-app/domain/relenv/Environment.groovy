package relenv

class Environment {
	
	String hostname
	String testTier
	Date lastRefresh
	Release ownedBy
	Stack partOf
	
	static belongsTo = [Release]

    static constraints = {
		hostname(blank:false)
		testTier(inList: ["Development", "System Test", "User Test", "Prod Support", "Production"], blank:false)
		lastRefresh()
    }
	
	String toString(){
		"$hostname:$testTier"
	}
}
