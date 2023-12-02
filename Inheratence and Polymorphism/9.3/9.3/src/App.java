import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<MedicalProvider> dong = new ArrayList<MedicalProvider>();
        OfficeLocation ol = new OfficeLocation("Nathaniel's Hospital", "3330 Farley", "San Antonio", "Texas", "78253", "2105136795");
        dong.add(new Doctor("Nathaniel", "Bucknor", "D69420", ol, "Prostate", "644257", "121",40000));
        dong.add(new Doctor("Zachary", "Smartt", "D24978", ol, "Feet", "2146568", "729",80000));
        dong.add(new Nurse("Madison", "Hernandez", "D85672", ol, "Traveling", 12, 25));
        dong.add(new Nurse("Bella", "Muniz", "D18372", ol, "Stationary", 10.50, 32));

        int count = 0;
        while(count < dong.size()){
            dong.get(count).PrintInfo();
            dong.get(count).writeToFile(dong);
            count++;
        }

    }
}
