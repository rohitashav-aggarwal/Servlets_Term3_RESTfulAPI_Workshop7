package DBAccess;

import Entities.CustomersEntity;
import Entities.UsersEntity;
import com.google.gson.Gson;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class RegistrationRestService {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Travel");


    @GET
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
        if(list.isEmpty()){
            return Response.status(404).build();
        }else{
            return Response.ok().build();
        }
    }

    @PUT
    @Path("/registeragent")
    public void putCustomer(String jsonString) {

//        CustomersEntity customersEntity =  new CustomersEntity();
//        customersEntity.setCustFirstName("first1");
//        customersEntity.setCustLastName("last2");
//        customersEntity.setCustAddress("address");
//        customersEntity.setCustCity("city");
//        customersEntity.setCustProv("AB");
//        customersEntity.setCustPostal("postal");
//        customersEntity.setCustCountry("country");
//        customersEntity.setCustHomePhone("4035555555");
//        customersEntity.setCustBusPhone("4035555555");
//        customersEntity.setCustEmail("email@gmail.com");
//        UsersEntity usersEntity = new UsersEntity();
//        usersEntity.setUsername("user1");
//        usersEntity.setPassword("password1");
//        customersEntity.setUsersEntity(usersEntity);
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(customersEntity);
//        em.getTransaction().commit();
//        em.close();
//        factory.close();
    }

}
