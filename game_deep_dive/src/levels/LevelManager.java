package levels;

import java.awt.*;
import java.awt.image.BufferedImage;
import main.Game;
import utilz.LoadSave;

public class LevelManager {

    private Game game;
    private BufferedImage[] levelSprite;
    public LevelManager(Game game){
        this.game = game;
        //levelSprite = LoadSave.GetSpriteAtlas(LoadSave.LEVEL_ATLAS);
        importOutsideSprites();
    }

    private void importOutsideSprites() {
        BufferedImage img = LoadSave.GetSpriteAtlas(LoadSave.LEVEL_ATLAS);
        levelSprite = new BufferedImage[36];
        for(int j = 0; j<4; j++)
            for(int i =0; i <9; i++){
                int index = j*9 + i;
                levelSprite[index] = img.getSubimage(i *32, j*32, 32, 32);
            }

    }

    public void draw(Graphics g){
        g.drawImage(levelSprite[2], 0 ,0 ,null);
    }
    public void update(){

    }
}
