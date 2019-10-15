import java.util.Stack;

class Baby{
	String name;
	int birthWeight;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthWeight;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	public void printData(Stack e){
		while(e.isEmpty()){
			System.out.println(e.pop());
		}

	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baby other = (Baby) obj;
		if (birthWeight != other.birthWeight)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}