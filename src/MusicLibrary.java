public class MusicLibrary {
    Album[] albumList;

    public MusicLibrary(){
        Album[] albumList = new Album[10];
    }

    public void doubleSize(){
        albumList = new Album[20];
    }

    public void add(Album album){
        albumList = new Album[getAlbumNumber() +1];
        albumList[getAlbumNumber()] = album;
    }

    public void remove(Album album){
        albumList = new Album[getAlbumNumber()-1];

    }

    public int getAlbumNumber(){
        return albumList.length;
    }

    public int totalPlaytime(){
            int totalTime=0;
        for (Album a : albumList){
            totalTime+= ;
        }
    }


    public String toString(){
        String result = "";
        result +="Number of albums" + getAlbumNumber() +"\n";
         result +="total playtime:" + totalPlaytime() + "\n";
        result += albumList;
        return result;
    }
}
