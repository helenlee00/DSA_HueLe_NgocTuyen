package Main;

import Entity.Entity;
import Entity.Player;
import Environment.EnvironmentManage;
import Tile.TileManager;
import java.awt.Color;
import java.awt.Dimension; // Corrected the spelling from "Dimention" to "Dimension"
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JPanel;
import monster.WhiteGhost;

public class GamePanel extends JPanel  implements Runnable{
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3;

    public final int tileSize = originalTileSize * scale; // 48x48 tile
    public final int maxScreenCol = 20;//20
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize * maxScreenRow;

    // WORLD SETTINGS
    public final int maxWorldCol =50;
    public final int maxWorldRow =50;
    
    //FPS
    int FPS = 60;

    //SYSTEM
    //TileManager tileM = new TileManager(this);
    //public KeyHandler keyH = new KeyHandler(this); 
    //EnvironmentManage eManage = new EnvironmentManage(this);

    Sound music = new Sound();
    Sound se = new Sound();
    //public AssetSetter aSetter = new AssetSetter(this);
    //public CollisionChecker cChecker = new CollisionChecker(this);   
    
    
    Thread gameThread; 
    //public UI ui = new UI(this);
    //public EventHandler eHandler = new EventHandler(this);
}