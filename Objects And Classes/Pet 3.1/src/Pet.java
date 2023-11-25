public class Pet {
    String name = "";
    String petType = "";
    String sound = "";

    public Pet(String name, String petType, String sound){
        this.name = name;
        this. petType = petType;
        this.sound = sound;
    }
    
    public Pet(){
        name = "";
        petType = "";
        sound = "";
    }

    public String getName(){
        return name;
    }

    public String getPetType(){
        return petType;
    }

    public String getSound(){
        return sound;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setPetType(String newPetType){
        petType = newPetType;
    }

    public void setSound(String newSound){
        sound = newSound;
    }

}
