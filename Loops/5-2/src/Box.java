public class Box{
    private int length;
    private int width;
    private char boxCharacter;
    private String shape;


    public Box(int length, int width, char boxCharacter) {
        this.length = length;
        this.width = width;
        this.boxCharacter = boxCharacter;
    }


    public Box() {
        length = -1;
        width = -1;
        boxCharacter = '/';
    }


    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public char getBoxCharacter() {
        return this.boxCharacter;
    }

    public void setBoxCharacter(char boxCharacter) {
        this.boxCharacter = boxCharacter;
    }

    public String getShapeType(){
        return shape;
    }

    public String drawBox(Box box){
        String Box = "";
        for(int i = 0; i < box.getWidth(); i++){
            
            for(int j = 0; j < box.getLength(); j++){
                Box += "* ";
            }
            Box += "\n";
        }
        return Box;
    }
    public String getShapeType(Box box){
        if(box.getLength() != box.getWidth()){
            return "rectangle";
        }else{
            return "square";
        }
    }

    



}
