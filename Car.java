
public class Car {
		
		private String color;
		private int horsePower;
		private double engineSize;
		private String make;
		
		public Car(){
			this.color="N/A";
			this.horsePower=0;
			this.engineSize=0;
			this.make="N/A";
		}
		public Car(String color){
			this.color=color;
			this.horsePower=0;
			this.engineSize=0;
			this.make="N/A";
		}
		public Car(String color, int horsePower){
			this.color=color;
			this.horsePower=horsePower;
			this.engineSize=0;
			this.make="N/A";
		}
		public Car(String color, int horsePower, double engineSize){
			this.color=color;
			this.horsePower=horsePower;
			this.engineSize=engineSize;
			this.make="N/A";
		}
		public Car(String color, int horsePower, double engineSize, String make){
			this.color=color;
			this.horsePower=horsePower;
			this.engineSize=engineSize;
			this.make=make;
		}
		
		public String getColor(){
			return color;	
		}
		public void setColor (String color){
			this.color=color;
		}
		
		public int getHorsePower(){
			return horsePower;
		}
		public void setHorsePower(int horsePower){
			this.horsePower=horsePower;
		}
		
		public double getEngineSize(){
			return engineSize;
		}
		public void setEngineSize (double engineSize){
			this.engineSize=engineSize;
		}
		
		public String getMake(){
			return make;
		}
		public void setMake(String make){
			this.make=make;
		}
		
		public String toString(){
			return "The "+this.make+" is painted "+this.color+" and with a "+this.engineSize+" Liter engine that can produce "+this.horsePower+" horse power.";
		}
		
		
}
