pakcage physics;

import math.Vector2;

public abstract class Body {

	public Vector2 position;
	public Vector2 velocity = new Vector2(0, 0);
	public Vector2 force = new Vector2(0,0);

	public double mass;

	protected Body(Vector2 pos, double mass){
		this.position = pos;
		this.mass = mass;
	}

	public void clearForces(){
		force.clear();
	}
}
