public class Bullet implements Interface{
    private static final int r = 6;
    private int bulletColorR;
    private int bulletColorG;
    private int bulletColorB;
    private int bulletX;
    private int bulletY;

    public Bullet(int bulletColorR, int bulletColorG, int bulletColorB, int bulletX, int bulletY) {
        this.bulletColorR = bulletColorR;
        this.bulletColorG = bulletColorG;
        this.bulletColorB = bulletColorB;
        this.bulletX = bulletX;
        this.bulletY = bulletY;
    }

    public static int getR() {
        return r;
    }

    public int getBulletX() {
        return bulletX;
    }

    public void setBulletX(int bulletX) {
        this.bulletX = bulletX;
    }

    public int getBulletY() {
        return bulletY;
    }

    public void setBulletY(int bulletY) {
        this.bulletY = bulletY;
    }
    public int getBulletColorR() {
        return bulletColorR;
    }
    public void setBulletColorR(int bulletColorR) {
        this.bulletColorR = bulletColorR;
    }
    public int getBulletColorG() {
        return bulletColorG;
    }
    public void setBulletColorG(int bulletColorG) {
        this.bulletColorG = bulletColorG;
    }
    public int getBulletColorB() {
        return bulletColorB;
    }
    public void setBulletColorB(int bulletColorB) {
        this.bulletColorB = bulletColorB;
    }

    @Override
    public void makeAndShow() {
        Main.p.fill(bulletColorR, bulletColorG, bulletColorB);
        Main.p.noStroke();
        Main.p.circle(bulletX, bulletY, r);
    }

}
