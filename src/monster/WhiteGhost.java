package monster;

import Entity.Entity;
import Main.GamePanel;
import Object.OBJ_Chest;
import Object.OBJ_Rock;
import java.util.Random;

public class WhiteGhost extends Entity {
    GamePanel gp;
    public WhiteGhost ( GamePanel gp){
        super(gp);
        this.gp=gp;
        type =type_monster;
        name = "White Ghost";
        speed = 2;
        maxLife = 20;
        life = maxLife;
        attack = 1;
        defense = 0;
        // exp = 2;
        projectile = new OBJ_Rock(gp);
        int size = gp.tileSize*5;
        solidArea.x =48;
        solidArea.y = 48;
        solidArea.width = size - 48*2;
        solidArea.height= size - 48;
        solidAreaDefaultX= solidArea.x;
        solidAreaDefaultY = solidArea.y;
        getImage();
    }
    public void getImage(){
        up1 = setup("/monster/whiteghost1",gp.tileSize*4,gp.tileSize*4);
        down1 = setup("/monster/whiteghost2",gp.tileSize*4,gp.tileSize*4);
        left1 = setup("/monster/whiteghost3",gp.tileSize*4,gp.tileSize*4);
        right1 = setup("/monster/whiteghost3",gp.tileSize*4,gp.tileSize*4);
    }
    
    public void setAction()
    {

        actionLockCounter++;
        if(actionLockCounter == 120)
        {
            Random random = new Random();
            int i = random.nextInt(100) + 1;//pick a random no from 1 -> 100
    
            if(i <= 25)
            {
                direction = "up";
            }
            if(i > 25 && i <= 50)
            {
                direction = "down";
            }
            if(i > 50 && i <= 75)
            {
                direction = "left";
            }
            if(i > 75 && i <= 100)
            {
                direction = "right";
            }

            actionLockCounter = 0;
        }
        int i = new Random().nextInt(100)+1;
        if(i > 99 && projectile.alive == false && shotAvailableCounter ==30) {
            projectile.set(worldX, worldY, direction, true, this);
            gp.projectileList.add(projectile);
            shotAvailableCounter = 0;
        }
    }

    public void damageReaction()
    {
        actionLockCounter = 0;
        direction = gp.player.direction;
    }
    public void checkDrop() {
        dropItem(new OBJ_Chest(gp));
    }
}
