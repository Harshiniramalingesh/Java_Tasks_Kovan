package stringsandregex;

import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);

        String[] validEmails = {
            "john.doe@gmail.com",
            "user123@yahoo.in",
            "admin@company.org",
            "test_mail@domain.co",
            "hello.world@site.net",
            "java.dev@oracle.com",
            "student99@college.edu",
            "support@service.io",
            "abc_xyz@my-domain.com",
            "mailbox@host.in"
        };

        String[] invalidEmails = {
            "john@gmail",
            "@gmail.com",
            "user@.com",
            "test@domain",
            "abc.com",
            "user name@gmail.com",
            "user@domain..com",
            "user@domain,com",
            "user@domain@com",
            "user@domain.c"
        };

        System.out.println("VALID EMAILS");
        for (String email : validEmails) {
            System.out.println(email + " → " + pattern.matcher(email).matches());
        }

        System.out.println("\nINVALID EMAILS");
        for (String email : invalidEmails) {
            System.out.println(email + " → " + pattern.matcher(email).matches());
        }
    

	}
}
