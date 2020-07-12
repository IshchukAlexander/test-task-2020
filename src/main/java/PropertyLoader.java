import lombok.Getter;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

@Getter
public class PropertyLoader {
    private Properties properties = new Properties();
    private FileInputStream inputStream;

    private String basicURL;
    private String userLoginForAutoGen;
    private String emailDomainForAutoGen;
    private String userAuthName;
    private String userAuthEmail;
    private String userAuthPassword;
    private String randomUserPassword;

    private String companyName;
    private String companyType;
    private String companyUsers;
    private String companyOwner;

    private String taskTitle;
    private String taskDescription;

    public PropertyLoader() {
        try {
            inputStream = new FileInputStream("src\\main\\resources\\config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("Something wrong with property file");
        }

        basicURL = properties.getProperty("basicURL");

        userLoginForAutoGen = properties.getProperty("userLoginForAutoGen");
        emailDomainForAutoGen = properties.getProperty("emailDomainForAutoGen");
        randomUserPassword = properties.getProperty("randomUserPassword");

        userAuthName = properties.getProperty("userAuthName");
        userAuthEmail = properties.getProperty("userAuthEmail");
        userAuthPassword = properties.getProperty("userAuthPassword");

        companyName = properties.getProperty("companyName");
        companyType = properties.getProperty("companyType");
        companyUsers = properties.getProperty("companyUsers");
        companyOwner = properties.getProperty("companyOwner");

        taskTitle = properties.getProperty("taskTitle");
        taskDescription = properties.getProperty("taskDescription");
    }

    public String generateRandomEmail() {
        String randomString = new RandomStringGenerator.Builder()
                .withinRange('0', 'z')
                .filteredBy(CharacterPredicates.LETTERS, CharacterPredicates.DIGITS)
                .build()
                .generate(15);
        return userLoginForAutoGen + randomString + emailDomainForAutoGen;
    }

    public String generateRandomUserName() {
        return new RandomStringGenerator.Builder()
                .withinRange('a', 'z')
                .filteredBy(CharacterPredicates.LETTERS)
                .build()
                .generate(15);
    }

    public String generateRandomCompanyName() {
        return companyName + " " + new RandomStringGenerator.Builder()
                .withinRange('a', 'z')
                .filteredBy(CharacterPredicates.LETTERS)
                .build()
                .generate(15);
    }

    public String getCompanyType() {
        try {
            return new String(companyType.getBytes("Cp1252"), "Cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getRandomTaskTitle() {
        return taskTitle + new RandomStringGenerator.Builder()
                .withinRange('a', 'z')
                .filteredBy(CharacterPredicates.LETTERS)
                .build()
                .generate(5);
    }

    public String getRandomTaskDescription() {
        return taskDescription + new RandomStringGenerator.Builder()
                .withinRange('a', 'z')
                .filteredBy(CharacterPredicates.LETTERS)
                .build()
                .generate(5);
    }

}
