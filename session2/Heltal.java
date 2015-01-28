/**
 * This class represents whole numbers.
 * @author dicander
 *
 */
public class Heltal {
	private long value;
	
	/**
	 * Create an Integer with the specified value.
	 * @param value
	 */
	public Heltal(long value) {
		this.value = value;
	}
	/**
	 * Create an Integer with default value 0.
	 */
	public Heltal() {
		this(0);
	}
	
	public static void main(String args[]) {
		System.out.println(2/3*3.0);
		Heltal a = new Heltal(2L);
		Heltal b = new Heltal(3L);
		System.out.println(a.add(b));
		System.out.println(a.mul(b));
		System.out.println(a.div(b));
		System.out.println(b.sub(a));
		System.out.println(12345+5432l);
	}
	
	/**
	 * returns 
	 */
	public String toString() {
		return ""+this.value;
	}
	
	/**
	 * returns the value of this Heltal.
	 * @return
	 */
	public long getValue() {
		return this.value;
	}
	
	/**
	 * Returns a new Heltal which is the sum of this and rhs.
	 * @param rhs
	 * @return
	 */
	public Heltal add(Heltal rhs) {
		return new Heltal(this.value + rhs.value);
	}
	
	/**
	 * Returns a new Heltal which is the difference of this and rhs.
	 * @param rhs
	 * @return
	 */
	public Heltal sub(Heltal rhs) {
		return new Heltal(this.value - rhs.value);
	}
	
	/**
	 * Returns a new Heltal which is the product of this and rhs.
	 * @param rhs
	 * @return
	 */
	public Heltal mul(Heltal rhs) {
		return new Heltal(this.value * rhs.value);
	}
	
	/**
	 * Returns a new Heltal which is the quotinent of this and rhs.
	 * @param rhs
	 * @return
	 */
	public Heltal div(Heltal rhs) {
		return new Heltal(this.value / rhs.value);
	}
	
}
