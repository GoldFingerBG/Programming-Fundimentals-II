import java.text.NumberFormat;
public class Benefits {
    private String type, provider;
    private float cost;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public Benefits(String type, String provider, float cost) {
        this.type = type;
        this.provider = provider;
        this.cost = cost;
    }

    public Benefits(Benefits b){
        this.type = b.type;
        this.provider = b.provider;
        this.cost = b.cost;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void PrintBenefitInfo(){
        System.out.println("***********Benefits************");
        System.out.println("Type: " + type);
        System.out.println("Cost: " + nf.format(cost));
        System.out.println("Provider: " + provider);
    }
}
