package app.factory;

import app.model.Car;
import app.model.Transport;

public class CarFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car("Ford", "Mustang", "Black");
    }
}
