/*
Author - Rohit
Servlets + Android Rest Services
 */

package DBAccess;

import Entities.CustomersEntity;
import Entities.PackagesEntity;
import Entities.UsersEntity;
import com.google.gson.Gson;
import sun.misc.BASE64Decoder;

import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

@Path("/api")
public class RegistrationRestService {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Servlets_Term3_RESTfulAPI_Workshop7");

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

    @GET
    @Path("/getCustomer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getCustomer(@HeaderParam("username") String username){
        EntityManager em = factory.createEntityManager();
        Query query = em.createQuery("SELECT DISTINCT c FROM CustomersEntity c INNER JOIN c.usersEntity u where u.username = ?1");
        query.setParameter(1, username);
        List<CustomersEntity> list = query.getResultList();
        Gson gson = new Gson();
        return gson.toJson(list.get(0));
    }

    @POST
    @Path("/updateCustomer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateCustomer(@HeaderParam("id") int id,
                                   @HeaderParam("firstName") String firstname,
                                   @HeaderParam("email") String email,
                                   @HeaderParam("username") String username,
                                   @HeaderParam("password") String password){

        EntityManager em = factory.createEntityManager();
        CustomersEntity customersEntity = em.find(CustomersEntity.class, id);

        em.getTransaction().begin();
        customersEntity.setCustFirstName(firstname);
        customersEntity.setCustEmail(email);
        customersEntity.getUsersEntity().setUsername(username);
        customersEntity.getUsersEntity().setPassword(password);
        em.persist(customersEntity);
        em.getTransaction().commit();
    }

    @GET
    @Path("/getPackages")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getPackages(){
        EntityManager em = factory.createEntityManager();
        Query query = em.createQuery("SELECT p FROM PackagesEntity p", PackagesEntity.class);
        List<PackagesEntity> results = query.getResultList();
        Gson gson = new Gson();
        return gson.toJson(results);
    }

}
