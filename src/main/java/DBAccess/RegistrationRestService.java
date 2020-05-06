package DBAccess;

import Entities.CustomersEntity;
import Entities.UsersEntity;
import sun.misc.BASE64Decoder;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

@Path("/api")
public class RegistrationRestService {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Travel");

    @GET
    @Path("/testapi")
    @Produces(MediaType.TEXT_PLAIN)
    public String getusers() {
        return "From rest service to android.";
    }

    @POST
    @Path("/loginuser")
    @Produces("Application/json")
    public Response authenticateUser(@HeaderParam("authorization") String authString) {
        String decodedAuth = "";
        String[] authParts = authString.split("\\s+");
        String authInfo = authParts[1];
        byte[] bytes = null;
        try {
            bytes = new BASE64Decoder().decodeBuffer(authInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        decodedAuth = new String(bytes);
        System.out.println(decodedAuth);
        String[] arrOfStr = decodedAuth.split(":", 2);
        String username = arrOfStr[0];
        String password = arrOfStr[1];
        EntityManager em = factory.createEntityManager();
        Query query = em.createQuery("select u from UsersEntity u where u.username = ?1 and u.password = ?2");
        query.setParameter(1, username);
        query.setParameter(2, password);
        List<UsersEntity> list = query.getResultList();
        if (list.isEmpty()) {
            return Response.status(404).build();
        } else {
            return Response.ok().build();
        }
    }


    @POST
    @Path("/registeruser")
    public Response putCustomer(@HeaderParam("firstName") String firstname,
                            @HeaderParam("lastName") String lastname,
                            @HeaderParam("address") String address,
                            @HeaderParam("city") String city,
                            @HeaderParam("province") String province,
                            @HeaderParam("postal") String postal,
                            @HeaderParam("country") String country,
                            @HeaderParam("homephone") String homephone,
                            @HeaderParam("busphone") String busphone,
                            @HeaderParam("email") String email,
                            @HeaderParam("username") String username,
                            @HeaderParam("password") String password
    ) {
        EntityManager em = factory.createEntityManager();
        try {
            CustomersEntity customersEntity = new CustomersEntity();
            customersEntity.setCustFirstName(firstname);
            customersEntity.setCustLastName(lastname);
            customersEntity.setCustAddress(address);
            customersEntity.setCustCity(city);
            customersEntity.setCustProv(province);
            customersEntity.setCustPostal(postal);
            customersEntity.setCustCountry(country);
            customersEntity.setCustHomePhone(homephone);
            customersEntity.setCustBusPhone(busphone);
            customersEntity.setCustEmail(email);
            UsersEntity usersEntity = new UsersEntity();
            usersEntity.setUsername(username);
            usersEntity.setPassword(password);
            customersEntity.setUsersEntity(usersEntity);
            em.getTransaction().begin();
            em.persist(customersEntity);
            em.getTransaction().commit();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return Response.status(404).build();
        }
        finally {
            em.close();
            factory.close();
        }
        return Response.ok().build();
    }
}
