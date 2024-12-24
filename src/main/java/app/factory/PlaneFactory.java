package app.factory;

import app.model.Plane;
import app.model.Transport;

public class PlaneFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Plane("787 Dreamliner", "Boeing");
    }
}
