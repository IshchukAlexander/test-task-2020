import com.sun.org.glassfish.gmbal.Description;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class UserWithTasksTest extends BaseTest{

    @Test
    @Description("Creating new Random User with Random Task")
    public void createNewUserWithTask() throws IOException {
        String json = new BodyJsonGenerator().getRandomUserWithRandomTaskJSONBody();
        System.out.println("New Random User with Random Task:\n" + json);

        Response response = sendMessageToCreateUserWithTasks(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(!body.contains("error"));
    }

    @Test
    @Description("Creating Random User with Task without Email")
    public void createNewUserWithoutEmail() throws IOException {
        String json = new BodyJsonGenerator().getUserWithTaskWithoutEmailJSONBody();
        System.out.println("New Random User without Email:\n" + json);

        Response response = sendMessageToCreateUserWithTasks(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Random User with Task without Name")
    public void createNewUserWithoutName() throws IOException {
        String json = new BodyJsonGenerator().getUserWithTaskWithoutNameJSONBody();
        System.out.println("New Random User without Name:\n" + json);

        Response response = sendMessageToCreateUserWithTasks(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Random User with Task without Task")
    public void createNewUserWithoutTask() throws IOException {
        String json = new BodyJsonGenerator().getUserWithTaskWithoutTaskJSONBody();
        System.out.println("New Random User without Task:\n" + json);

        Response response = sendMessageToCreateUserWithTasks(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Random User with Task with Empty Fields")
    public void createNewUserWithEmptyFields() throws IOException {
        String json = new BodyJsonGenerator().getUserWithTaskWithEmptyFieldsJSONBody();
        System.out.println("New Random User with Empty Fields:\n" + json);

        Response response = sendMessageToCreateUserWithTasks(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Random User with Task with Already existing Email")
    public void createNewUserWithWithExistingEmail() throws IOException {
        String json = new BodyJsonGenerator().getUserWithTaskWithExistingEmailJSONBody();
        System.out.println("New Random User with Already Existing Email:\n" + json);

        Response response = sendMessageToCreateUserWithTasks(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }

    @Test
    @Description("Creating Random User with Task with Already existing Name")
    public void createNewUserWithWithExistingName() throws IOException {
        String json = new BodyJsonGenerator().getUserWithTaskWithExistingNameJSONBody();
        System.out.println("New Random User with Already Existing Name:\n" + json);

        Response response = sendMessageToCreateUserWithTasks(json);
        String body = response.body().string();
        System.out.println("Response Body:\n" + body);

        assertTrue(body.contains("error"));
    }
}
