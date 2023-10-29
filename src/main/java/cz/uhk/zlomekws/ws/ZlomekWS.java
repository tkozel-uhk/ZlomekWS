package cz.uhk.zlomekws.ws;

import cz.uhk.zlomekws.model.Zlomek;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ZlomekWS {

    @WebMethod
    Zlomek add(@WebParam(name = "a") Zlomek a, @WebParam(name = "b") Zlomek b);
}
