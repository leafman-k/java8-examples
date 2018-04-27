package classes;

public class BicycleDemo {

	public static void main(String[] args) {
		int startHeight = 50;
		int startCadence = 90;
        int startSpeed = 0;
        int startGear = 2;
		
		MountainBike mountainBike = new MountainBike(startHeight, startCadence,
                startSpeed, startGear);
		
		System.out.println(mountainBike.toString());
		Bicycle bike = new MountainBike(++startHeight, startCadence,
                startSpeed, startGear);
		System.out.println(bike.toString());
	}

}
