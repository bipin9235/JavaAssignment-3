package ArrayAndClassObjects;

public class OuterClass {

	// Inner Class 
	class Measurement{
		// Inner class variable
		float kg; 
		float grms;
		// Inner class parametrized constructor
		public Measurement(float kg, float grms) {
			this.kg = kg;
			this.grms = grms;
		}
		// Inner class no arg constructor
		public Measurement() {
			
		}
		public float getKg() {
			return kg;
		}
		public void setKg(float kg) {
			this.kg = kg;
		}
		public float getGrms() {
			return grms;
		}
		public void setGrms(float grms) {
			this.grms = grms;
		}
		}
	// Method to add kg and grms value of 2 objects and assign them in third object
	public static void add(Measurement m1,Measurement m2,Measurement m3) {
		m3.setKg(m1.kg+m2.kg);
		m3.setGrms(m1.grms+m2.grms);
	}
	
	
	public static void main(String[] args) {
		
		OuterClass ic=new OuterClass();// Outer class object
		OuterClass.Measurement m1=ic.new Measurement(5,500);// Inner class Object m1 with parametrized constructor
		OuterClass.Measurement m2=ic.new Measurement(13,300);
		OuterClass.Measurement m3=ic.new Measurement();// Inner class Object m1 with no arg constructor
		OuterClass.add(m1,m2,m3);// static method add()
		System.out.println("Object m1\nkg : "+m1.getKg()+"\ngrms : "+m1.getGrms());
		System.out.println("\nObject m2\nkg : "+m2.getKg()+"\ngrms : "+m2.getGrms());
		System.out.println("\nObject m3\nkg : "+m3.getKg()+"\ngrms : "+m3.getGrms());

	}

}
