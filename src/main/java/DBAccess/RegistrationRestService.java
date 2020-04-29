package DBAccess;

import Entities.CustomersEntity;
import Entities.UsersEntity;
import com.google.gson.Gson;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class RegistrationRestService {

    EntityManagerFactory factory
            = Persistence.createEntityManagerFactory("Travel");


    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return "Hello World";
    }

    @GET
    @Path("/getusers")
    @Produces("Application/json")
    public String Users() {
        EntityManager em = factory.createEntityManager();
        Query query = em.createQuery("select u from UsersEntity u");
        List<UsersEntity> list = query.getResultList();
        Gson gson = new Gson();
        return gson.toJson(list);
    }

}
