public interface OperateCar {

   // constant declarations, if any

   // method signatures
   
   int turn(String direction, double radius, double startSpeed, double endSpeed);
   int changeLanes(String direction, double startSpeed, double endSpeed);
   int signalTurn(String direction, boolean signalOn);
   int getRadarFront(double distanceToCar, double speedOfCar);
   int getRadarRear(double distanceToCar, double speedOfCar);

}

