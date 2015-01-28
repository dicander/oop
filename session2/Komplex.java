
public class Komplex {
	private double re;
	private double im;
	
	public static void main(String[] args) {
		Komplex c = new Komplex(1,2);
		Komplex d = new Komplex(3,4);
		Komplex noll = new Komplex();
		System.out.println(c.add(d));
		System.out.println(d.sub(c));
		System.out.println(d.mul(c));
		System.out.println(c.div(d));
		System.out.println(noll.sub(c));
	}
	
	/**
	 * 
	 */
	public String toString() {
		return "" + this.re + (this.im>=0?" + ":" - ") + Math.abs(this.im) + "i";
	}
	/**
	 * Create a new Komplex object.
	 * @param re The real part of the number
	 * @param im The imaginary part of the number
	 */
	public Komplex(double re, double im){
		this.re = re;
		this.im = im;
	}
	
	/**
	 * Create an object with the specified real part
	 * @param re
	 */
	public Komplex(double re) {
		this(re, 0.0);
	}
	
	/**
	 * Creates a default Komplex with re = 0 im = 0.
	 */
	public Komplex() {
		this(0.0);
	}
	
	/**
	 * create a Komplex object from a Heltal.
	 * @param a
	 */
	public Komplex(Heltal a) {
		this((double)a.getValue());
	}
	
	/**
	 * Returns a new Komplex which is the sum of 2 Komplex.
	 * @param rhs
	 * @return
	 */
	public Komplex add(Komplex rhs) {
		return new Komplex(this.re+rhs.re, this.im+rhs.im);
		
	}
	
	/**
	 * Returns the difference between 2 Komplex.
	 * @param rhs
	 * @return
	 */
	public Komplex sub(Komplex rhs) {
		return new Komplex(this.re-rhs.re, this.im-rhs.im);
		
	}
	
	/**
	 * Multiplies two Komplex numbers.
	 * @param rhs
	 * @return
	 */
	public Komplex mul(Komplex rhs) {
		return new Komplex(this.re*rhs.re-this.im*rhs.im,
				this.re*rhs.im+this.im*rhs.re);
	}
	
	/**
	 * Divides this Komplex with denominator rhs.
	 * @param rhs
	 * @return
	 */
	public Komplex div(Komplex rhs) {
		double denominator = rhs.re*rhs.re + rhs.im*rhs.im;
		return new Komplex((this.re*rhs.re + this.im*rhs.im)/denominator,
				(this.im*rhs.re-this.re*rhs.im)/denominator);
		
	}
}
