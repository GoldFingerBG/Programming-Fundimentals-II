public class ContactList {
    private String[] firstName = {"Nathaniel", "Jacob", "Claude", "Madison", "Isabella"};
    private String[] lastName = {"Bucknor-Smartt", "Jones", "Van-Dam", "Skarda", "Ringly Muniz"};
    private String[] email = {"nathaniel@gmail.com", "JacobJones@gmail.com", "Claude@gmail.com", "Madison@gmail.com", "Isabella@gmail.com"};
    private String[] phoneNumber = {"2108443214", "2107843214", "2109998888", "2105678906", "2109871234"};

    public void showAllContacts(){
        System.out.println("*************Contacts*************");
        for(int i = 0; i < firstName.length; i++){
            System.out.println((i + 1) + ". " + firstName[i] + " " + lastName[i] + " | " + email[i] + " | " + phoneNumber[i]);
        }
    }

    public void searchByLastName(String name){

        for(int i = 0; i<firstName.length; i++){
            if(lastName[i].equalsIgnoreCase(name)){
                System.out.println(firstName[i] + " " + lastName[i] + " | " + email[i] + " | " + phoneNumber[i]);
            }
        }
        
    }
    public void searchByFirstName(String name){

        for(int i = 0; i<firstName.length; i++){
            if(firstName[i].equalsIgnoreCase(name)){
                System.out.println(firstName[i] + " " + lastName[i] + " | " + email[i] + " | " + phoneNumber[i]);
            }
        }

    }
    public void quit(){
        System.out.println("Thank You For Using My Program :D");
    }
}
