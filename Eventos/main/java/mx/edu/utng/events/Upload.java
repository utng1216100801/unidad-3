package mx.edu.utng.events;

import com.google.firebase.database.Exclude;

/**
 * Created by Diana Manzano on 06/03/2018.
 */

public class Upload {

    private String commentary;
    private String imageUrl;

    private String mKey;

    public Upload(){

    }

    public Upload(String commentary, String imageUrl){
        if(commentary.trim().equals("")){
            commentary = "No hay comentario";
        }
        this.commentary = commentary;
        this.imageUrl = imageUrl;
    }

    public  String getCommentary(){
        return commentary;
    }
    public  void setCommentary(){
        this.commentary = commentary;
    }

    public  String getImageUrl(){
        return  imageUrl;
    }
    public  void setImageUrl(){
        this.imageUrl = imageUrl;
    }

    @Exclude
    public String getKey(){
        return mKey;
    }
    @Exclude
    public  void setKey(String key){
        this.mKey = key;
    }
}
