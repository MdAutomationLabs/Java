package InheritanceAndPolymorphism;

public class pants extends clothing{
	//Default constructor
       public pants () {
		
	}

	/* (non-Javadoc)Format output
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return " shirt [size= " + super.getSize()
				+ ", color= " + super.getColor() + "]";
	}
       
}
