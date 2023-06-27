public class Human implements Interface{

    private int humanHight = 20;
    private int humanWidth = 6;
    private int humanColorR = 219;
    private int humanColorG = 18;
    private int humanColorB = 11;

    public int getHumanHight() {
        return humanHight;
    }
    public void setHumanHight(int humanHight) {
        this.humanHight = humanHight;
    }
    public int getHumanWidth() {
        return humanWidth;
    }
    public void setHumanWidth(int humanWidth) {
        this.humanWidth = humanWidth;
    }
    public int getHumanColorR() {
        return humanColorR;
    }
    public void setHumanColorR(int humanColorR) {
        this.humanColorR = humanColorR;
    }
    public int getHumanColorG() {
        return humanColorG;
    }
    public void setHumanColorG(int humanColorG) {
        this.humanColorG = humanColorG;
    }
    public int getHumanColorB() {
        return humanColorB;
    }
    public void setHumanColorB(int humanColorB) {
        this.humanColorB = humanColorB;
    }

    //methods

    @Override
    public void makeAndShow() {
        Main.p.fill(humanColorR, humanColorG, humanColorB);
        Main.p.noStroke();
        Main.p.rect(Main.p.mouseX - 2, 600 - humanHight , humanWidth, humanHight);
    }


}
