
public class Alpha {

	private String id;
	
	public Alpha() {
		id = "Sweg";
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return id;
	}
	
	public class Beta {
		
		private String id;
		
		public Beta(String id) {
			this.id = id;
		}
		
		public String getId() {
			return id;
		}
	}
}
