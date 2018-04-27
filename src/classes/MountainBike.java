package classes;

public class MountainBike extends Bicycle {
	 // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MountainBike [seatHeight=");
		builder.append(seatHeight);
		builder.append(", cadence=");
		builder.append(cadence);
		builder.append(", gear=");
		builder.append(gear);
		builder.append(", speed=");
		builder.append(speed);
		builder.append("]");
		return builder.toString();
	}   
}
