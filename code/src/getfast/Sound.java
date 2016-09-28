/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getfast;
 
import java.applet.AudioClip;
import java.applet.Applet;
/**
 *
 * @author Jimin Wen
 * Manage the sound used in the game. All the processed sound can be played in the game
 */
public class Sound {
    public static final Sound Sound1=new Sound("res/bgm.wav");
    public static final Sound Sound2=new Sound("res/Fighting.wav");
    public static final Sound Sound3=new Sound("res/Powerup2.wav");
    public static final Sound Sound4=new Sound("res/human.wav");
    public static final Sound Sound5=new Sound("res/audio.wav");
    private int a=1;
    private AudioClip clip;
    public Sound(String filename)
    {
        try{
            clip=Applet.newAudioClip(Sound.class.getResource(filename));
            
        }
        catch(Exception e){e.printStackTrace();}
    }
    public void play()
    {
        try{
             clip.play();
             
           }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void loop()
    {
        try{
            clip.loop();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
  public void stop()
    {
        try{
             clip.stop();
           }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
