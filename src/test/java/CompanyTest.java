import com.sun.org.glassfish.gmbal.Description;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class CompanyTest extends BaseTest {

    @Test
    @Description("Creating new Random Company")
    public void createNewCompany() throws IOException {
        String json = new BodyJsonGenerator().getRandomCompanyJSONBody();
        System.out.println("New Random Company:\n" + json);

        Response response = sendMessageToCreateCompany(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("success"));
    }

    @Test
    @Description("Creating Company Without Name")
    public void createCompanyWithoutName() throws IOException {
        String json = new BodyJsonGenerator().getCompanyWithoutNameFieldJSONBody();
        System.out.println("Company Without Name:\n" + json);

        Response response = sendMessageToCreateCompany(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Company Without Type")
    public void createCompanyWithoutType() throws IOException {
        String json = new BodyJsonGenerator().getCompanyWithoutTypeFieldJSONBody();
        System.out.println("Company Without Type:\n" + json);

        Response response = sendMessageToCreateCompany(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Company Without Users")
    public void createCompanyWithoutUsers() throws IOException {
        String json = new BodyJsonGenerator().getCompanyWithoutUsersFieldJSONBody();
        System.out.println("Company Without Users:\n" + json);

        Response response = sendMessageToCreateCompany(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Company Without Owner")
    public void createCompanyWithoutOwner() throws IOException {
        String json = new BodyJsonGenerator().getCompanyWithoutOwnerFieldJSONBody();
        System.out.println("Company Without Owner:\n" + json);

        Response response = sendMessageToCreateCompany(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Company With Empty Fields")
    public void createCompanyWitEmptyFields() throws IOException {
        String json = new BodyJsonGenerator().getCompanyWithEmptyFieldsJSONBody();
        System.out.println("Company With Empty Fields:\n" + json);

        Response response = sendMessageToCreateCompany(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

}
