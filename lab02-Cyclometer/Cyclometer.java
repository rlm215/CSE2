//Rachel Mahoney
//lab02
//Cyclometer
//Learning arithmetic on java

//define a class
public class Cyclometer {
    
//Add the method
    public static void main(String [] args) {

//input data
int secsTrip1=480; //the time for trip 1 in seconds
int secsTrip2=3220; //the time for trip 2 in seconds
int countsTrip1=1561; // front wheel rotations trip 1
int countsTrip2=9037; // front wheel rotations trip 2
double wheelDiameter=27.0; // the diameter of the wheel
double PI = 3.14159; // the value of pi
int feetPerMile=5280; // the number of feet per one mile
int inchesPerFoot=12; // the number of inches in a foot
int secondsPerminute=60; // the number of seconds in a minute
double distanceTrip1, distanceTrip2, totalDistance; //values I want to solve for

System.out.println ("Trip 1 took " +
    (secsTrip1/secondsPerminute)+ " minutes and had " +
    countsTrip1+ " counts.");
System.out.println ("Trip 2 took " +
    (secsTrip2/secondsPerminute)+ " minutes and had " +
    countsTrip2+ " counts.");
distanceTrip1=countsTrip1*wheelDiameter*PI;
// The equation above represents the distance in inches
// The distance one rotation of the wheel travels
    // is the diameter multiplied by PI
distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // distance is now in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
System.out.println ("Trip 1 was " +distanceTrip1+ " miles ");
System.out.println ("Trip 2 was " +distanceTrip2+ " miles ");
System.out.println ("The total distance was " +totalDistance+ " miles");
    }
}   