import okhttp3.*;

import java.io.IOException;

public class BaseTest {
    protected OkHttpClient client = new OkHttpClient();
    protected String basicURL = new PropertyLoader().getBasicURL();

    public Response sendMessageToCreateUser(String jsonBody) throws IOException {
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),jsonBody);

        Request request = new Request.Builder()
                .url(basicURL + "tasks/rest/createuser")
                .post(body)
                .build();

        Call call = client.newCall(request);

        return call.execute();
    }

    public Response sendMessageToCreateCompany(String jsonBody) throws IOException {
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),jsonBody);

        Request request = new Request.Builder()
                .url(basicURL + "tasks/rest/createcompany")
                .post(body)
                .build();

        Call call = client.newCall(request);

        return call.execute();
    }

    public Response sendMessageToCreateUserWithTasks(String jsonBody) throws IOException {
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),jsonBody);

        Request request = new Request.Builder()
                .url(basicURL + "tasks/rest/createuserwithtasks")
                .post(body)
                .build();

        Call call = client.newCall(request);

        return call.execute();
    }

}
