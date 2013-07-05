package relenv

class EndUser {
	String username
	String password
	String fullname

    static constraints = {
		username(blank: false, unique: true)
		password(blank: false)
		fullname()
    }
}
