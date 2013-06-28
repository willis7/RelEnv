package relenv

class Stack {
	
	String number
	
	static hasMany = [environments: Environment]

    static constraints = {
		number(blank: false)
    }
	
	String toString(){
		"Stack: $number"
	}
}
