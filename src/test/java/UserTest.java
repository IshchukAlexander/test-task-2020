import com.sun.org.glassfish.gmbal.Description;
import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class UserTest extends BaseTest {

    @Test
    @Description("Creating new Random User")
    public void createNewUser() throws IOException {
        String json = new BodyJsonGenerator().getRandomUserJSONBody();
        System.out.println("New Random User:\n" + json);

        Response response = sendMessageToCreateUser(json);

        //Application feature to return code 500 with success. Need to refactor application
        assertTrue(response.code() == 500);
    }

    @Test
    @Description("Creating User that already exists")
    public void createAlreadyExistingUser() throws IOException {
        String json = new BodyJsonGenerator().getAuthUserJSONBody();
        System.out.println("Already Existing User:\n" + json);

        Response response = sendMessageToCreateUser(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating User with empty body")
    public void createUserWithEmptyFields() throws IOException {
        String json = new BodyJsonGenerator().getUserWithEmptyFieldsJSONBody();
        System.out.println("User With Empty Fields:\n" + json);

        Response response = sendMessageToCreateUser(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating User without email")
    public void createUserWithoutEmail() throws IOException {
        String json = new BodyJsonGenerator().getUserWithoutEmailFieldJSONBody();
        System.out.println("User Without Email:\n" + json);

        Response response = sendMessageToCreateUser(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating User without name")
    public void createUserWithoutName() throws IOException {
        String json = new BodyJsonGenerator().getUserWithoutNameFieldJSONBody();
        System.out.println("User Without Name:\n" + json);

        Response response = sendMessageToCreateUser(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating User without tasks")
    public void createUserWithoutTasks() throws IOException {
        String json = new BodyJsonGenerator().getUserWithoutTasksFieldJSONBody();
        System.out.println("User Without Tasks:\n" + json);

        Response response = sendMessageToCreateUser(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating User without companies")
    public void createUserWithoutCompanies() throws IOException {
        String json = new BodyJsonGenerator().getUserWithoutCompaniesFieldJSONBody();
        System.out.println("User Without Companies:\n" + json);

        Response response = sendMessageToCreateUser(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

}
