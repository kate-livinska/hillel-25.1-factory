package app;

import app.factory.CarFactory;
import app.factory.PlaneFactory;
import app.model.Transport;

public class Client {
    public void run() {
        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();

        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        car.move();
        plane.move();
    }
}