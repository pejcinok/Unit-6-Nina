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
                System.out.println("Your album has been added!");
                return true;

            }
        }
        return false;
    }

    public boolean remove(int index){

        for (int i=0; i<albumList.length; i++){
            if (index>=0 && index < albumList.length && albumList[index] !=null){

                albumList[index]= null;
                System.out.println("Your album has been removed");
                return true;

            }
        }
        return false;
    }


    public double totalPlayTime() {
        double totalTime = 0;

        for (int i = 0; i < albumList.length; i++) {
            if (albumList[i] != null) {
                totalTime += albumList[i].getPlayTime();
            }

        }
        return totalTime;
    }

    public int albumNumber(){
        int count = 0;
        for (Album n : albumList){
            if ( n != null){
                count++;
            }
        }
        return count;
    }

    public int findTitle(String Title ){
        for (int i=0; i<albumList.length;i++){

            if (albumList[i] != null && albumList[i].getTitle().equals(Title))
                return i;
        }
        return -1;
    }


    public int findArtist(String Artist ) {
        for (int i = 0; i < albumList.length; i++) {

            if (albumList[i].getArtist().equals(Artist)){
                return i;
            }
        }
        return -1;
    }

    public Album getAlbum(int index) {
        if (index >= 0 && index < albumList.length) {
            return albumList[index];
        }
        System.out.println("index out of bounds :(");
        return null;
    }

    public void sortByTitle(){
        Album temp;
        int min;
        for (int i = 0; i < albumList.length - 1; i++) {
            min = i;
            for(int scan = i + 1; scan < albumList.length; scan++){
                if (albumList[scan] != null){
                    if(albumList[scan].getTitle().compareTo(albumList[min].getTitle()) < 0){
                        min = scan;
                    }
                }
            }
            temp = albumList[min];
            albumList[min] = albumList[i];
            albumList[i] = temp;
        }
    }

    public void sortByArtist(){
        for (int i = 1; i < albumList.length; i++){
            Album key = albumList[i];
            int pos = i;

            if (albumList[pos] != null){
                while (pos > 0 && albumList[pos - 1].getArtist().compareTo(key.getArtist()) > 0){
                    albumList[pos] = albumList[pos - 1];
                    pos--;
                }
            }
            albumList[pos] = key;
        }
    }

    public String toString(){
        String result = "";
        for(Album a : albumList) {
            if (a != null)
            result += a.toString() + "\n";
        }
        result += "total runtime: " + totalPlayTime() + "\nnumber of albums: " + albumNumber();
        return result;
    }
}
