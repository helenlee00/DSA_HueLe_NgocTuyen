package Environment;

import Main.GamePanel;
import java.awt.Graphics2D;

public class EnvironmentManage {
    GamePanel gp;
    Lighting lighting;
    public EnvironmentManage(GamePanel gp){
        this.gp=gp;
    }
    public void setup(){
        lighting = new Lighting(gp, 500);
    }
    public void draw(Graphics2D g2){
        lighting.draw(g2);

    }

}
