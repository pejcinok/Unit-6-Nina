public class MusicLibrary {
    private Album[] albumList;


    public MusicLibrary(){
         albumList = new Album[10];
    }

    public void doubleSize(){
        albumList = new Album[20];
    }
    //looks for spot that is null, adds album there. If no null spots don't add

    public boolean add(Album album){

        for(int i =0; i<albumList.length; i++){

            if (albumList[i] == null){
                albumList[i] = album;
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index){

        for (int i=0; i<albumList.length; i++){
            if (index>=0 && index < albumList.length &&albumList[index] !=null){

                albumList[index]= null;
                return true;
            }
        }
        return false;
    }


    public int totalPlayTime() {
        int totalTime = 0;

        for (int i = 0; i < albumList.length; i++) {
            if (albumList[i] != null) {
                totalTime += albumList[i].getPlayTime();
            }

        }
        return totalTime;
    }
    public String toString(){
        String result = "";
        for(Album a : albumList) {
            if (a != null)
            result += a.toString() + "\n";
        }
        result += "total runtime:" + totalPlayTime() + "\nnumber of albums";
        return result;
    }
}
