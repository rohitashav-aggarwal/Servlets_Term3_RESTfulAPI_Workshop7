/*
Author - Rohit
Servlets + Android Rest Services
 */

package DBAccess;

import Entities.PackagesEntity;
import com.google.gson.Gson;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class PackageRestService {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Servlets_Term3_RESTfulAPI_Workshop7");

    @GET
    @Path("/getPackages")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getPackages() {
        EntityManager em = factory.createEntityManager();
        Query query = em.createQuery("SELECT p FROM PackagesEntity p", PackagesEntity.class);
        List<PackagesEntity> results = query.getResultList();
        Gson gson = new Gson();
        return gson.toJson(results);
    }

}
