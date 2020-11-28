package week05d05;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;

    /* User constructor*/
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        {
            String[] needsInEmail = new String[]{"@", "."};
            int right = 0;
            String missing = "";
            for (String item : needsInEmail) {
                if (email.contains(item)) right++;
                else missing = missing.concat(item);
            }
            if (right <= 1) System.out.println("Hibás email cím. Hiányzó karakter(ek): " + missing);
        }
    }

    /* getter for User Firstname */
    public String getFirstName() {
        return firstName;
    }

    /* getter for User Lastname */
    public String getLastName() {
        return lastName;
    }

    /* getter for User Fullname */
    public String getFullName() {
        return getFirstName() + " " + getLastName() ;
    }
    /* getter for User e-mail */
    public String getEmail() {
        return email;
    }

    /* main */
    public static void main(String[] args) {
        User user = new User("Anna", "Mária", "annamarianetcom");
        System.out.println(user.getFullName() + " e-mail címe: " + user.getEmail());
    }
}
