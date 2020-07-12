public class BodyJsonGenerator {
    protected PropertyLoader propertyLoader = new PropertyLoader();

    public String getAuthUserJSONBody() {
        return "{\"email\": \"" + propertyLoader.getUserAuthEmail() + "\"," +
                "\"name\": \"" + propertyLoader.getUserAuthName() + "\"," +
                "\"tasks\": [56]," +
                "\"companies\": [7,8]}";
    }

    public String getRandomUserJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "\"tasks\": [56]," +
                "\"companies\": [7,8]}";
    }

    public String getUserWithEmptyFieldsJSONBody() {
        return "{\"email\": \"\"," +
                "\"name\": \"\"," +
                "\"tasks\": []," +
                "\"companies\": []}";
    }

    public String getUserWithoutEmailFieldJSONBody() {
        return "{\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "\"tasks\": [56]," +
                "\"companies\": [7,8]}";
    }

    public String getUserWithoutNameFieldJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"tasks\": [56]," +
                "\"companies\": [7,8]}";
    }

    public String getUserWithoutTasksFieldJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "\"companies\": [7,8]}";
    }

    public String getUserWithoutCompaniesFieldJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "\"tasks\": [56]}";
    }

    public String getRandomCompanyJSONBody() {
        return "{\"company_name\": \"" + propertyLoader.generateRandomCompanyName() + "\"," +
                "\"company_type\": \"" + propertyLoader.getCompanyType() + "\"," +
                "\"company_users\": " + propertyLoader.getCompanyUsers() + "," +
                "\"email_owner\": \"" + propertyLoader.getCompanyOwner() + "\"}";
    }

    public String getCompanyWithEmptyFieldsJSONBody() {
        return "{\"company_name\": \"\"," +
                "\"company_type\": \"\"," +
                "\"company_users\": ," +
                "\"email_owner\": \"\"}";
    }

    public String getCompanyWithoutNameFieldJSONBody() {
        return "{\"company_type\": \"" + propertyLoader.getCompanyType() + "\"," +
                "\"company_users\": " + propertyLoader.getCompanyUsers() + "," +
                "\"email_owner\": \"" + propertyLoader.getCompanyOwner() + "\"}";
    }

    public String getCompanyWithoutTypeFieldJSONBody() {
        return "{\"company_name\": \"" + propertyLoader.generateRandomCompanyName() + "\"," +
                "\"company_users\": " + propertyLoader.getCompanyUsers() + "," +
                "\"email_owner\": \"" + propertyLoader.getCompanyOwner() + "\"}";
    }

    public String getCompanyWithoutUsersFieldJSONBody() {
        return "{\"company_name\": \"" + propertyLoader.getCompanyName() + "\"," +
                "\"company_type\": \"" + propertyLoader.getCompanyType() + "\"," +
                "\"email_owner\": \"" + propertyLoader.getCompanyOwner() + "\"}";
    }

    public String getCompanyWithoutOwnerFieldJSONBody() {
        return "{\"company_name\": \"" + propertyLoader.getCompanyName() + "\"," +
                "\"company_type\": \"" + propertyLoader.getCompanyType() + "\"," +
                "\"company_users\": " + propertyLoader.getCompanyUsers() + "}";
    }

    public String getRandomUserWithRandomTaskJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "\"tasks\": [{" +
                "\"title\": \"" + propertyLoader.getRandomTaskTitle() + "\"," +
                "\"description\": \"" + propertyLoader.getRandomTaskDescription() + "\"" +
                "}]}";
    }

    public String getUserWithTaskWithoutEmailJSONBody() {
        return "{\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "\"tasks\": [{" +
                "\"title\": \"" + propertyLoader.getRandomTaskTitle() + "\"," +
                "\"description\": \"" + propertyLoader.getRandomTaskDescription() + "\"" +
                "}]}";
    }


    public String getUserWithTaskWithoutNameJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"tasks\": [{" +
                "\"title\": \"" + propertyLoader.getRandomTaskTitle() + "\"," +
                "\"description\": \"" + propertyLoader.getRandomTaskDescription() + "\"" +
                "}]}";
    }

    public String getUserWithTaskWithoutTaskJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "}";
    }

    public String getUserWithTaskWithEmptyFieldsJSONBody() {
        return "{\"email\": \"\"," +
                "\"name\": \"\"," +
                "\"tasks\": [{" +
                "\"title\": \"\"," +
                "\"description\": \"\"" +
                "}]}";
    }

    public String getUserWithTaskWithExistingEmailJSONBody() {
        return "{\"email\": \"" + propertyLoader.getUserAuthEmail() + "\"," +
                "\"name\": \"" + propertyLoader.generateRandomUserName() + "\"," +
                "\"tasks\": [{" +
                "\"title\": \"" + propertyLoader.getRandomTaskTitle() + "\"," +
                "\"description\": \"" + propertyLoader.getRandomTaskDescription() + "\"" +
                "}]}";
    }

    public String getUserWithTaskWithExistingNameJSONBody() {
        return "{\"email\": \"" + propertyLoader.generateRandomEmail() + "\"," +
                "\"name\": \"" + propertyLoader.getUserAuthName() + "\"," +
                "\"tasks\": [{" +
                "\"title\": \"" + propertyLoader.getRandomTaskTitle() + "\"," +
                "\"description\": \"" + propertyLoader.getRandomTaskDescription() + "\"" +
                "}]}";
    }
}
