package Entity;

import Main.GamePanel;
import Main.UltilityTool;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Entity {

    GamePanel gp;
    
    public int speed;

    public BufferedImage up1, up2 , down1 , down2 , right1, right2, left1, left2 ; 
    public BufferedImage attackUp1 , attackUp2, attackDown1, attackDown2, attackLeft1, attackLeft2, attackRight1,attackRight2;
    public int spriteCounter = 0;
    
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public Rectangle attackArea = new Rectangle(0,0,0,0);
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collisionOn = false;
    public int actionLockCounter = 0;
   
    String dialogues[] = new String[20];
    
    public BufferedImage image, image2, image3;
    public String name;
