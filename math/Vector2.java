package math;

public class Vector2 {
	/**
	 * This class is used in place of double[], which I have seen in other projects of a 
	 * similar nature, so that it is clear to read what is happening eg velocities are added
	 * or scaled.
	 *
	 * @param x,y - these are the components of the vector in a rectilinear coordinate system.
	 */
	public double x, y;

	public Vector2(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void add(Vector2 vector){
		x += vector.x;
		y += vector.y;
	}

	public Vector2 scaled(double s){
		return new Vector2(x*s, y*s);
	}

	public void clear() {
		x = 0;
		y = 0;
	}
}
