    package Array;


    import java.util.*;

    public class Song {

    private Album a;
    private String songName;
    public Song(String s) {
            this.songName = songName;
            }

    public Album getAlbum() {
            return a;
            }
    public void setAlbum(Album albumName) {
            a = albumName;
            }

    public String getSongName() {
            return songName;
            }

            public String toString() {
                return this.getAlbum().getName()+":"+this.getSongName();
            }

 static public String[][] shuffle(String [][] songs) {
     Map<String,List<String>> albums = new HashMap<>();
     List<String> albumSongs=null;
           int j=1;
             for(int i=0;i<songs.length;i++)
            {albumSongs = new ArrayList<>();
            for(j=1;j<songs[i].length ; j++) {

                albumSongs.add(songs[j][i]);
            }
                Collections.shuffle(albumSongs);
                albums.put(songs[0][i],albumSongs);

            }

     String [][]array=new String[10][10];
     int i=0;
     for(String map:albums.keySet())
     {
      array[0][i] =map;
      i++;
     }
     for( i=0;i<songs.length;i++) {
         ArrayList list= (ArrayList) albums.get(songs[0][i]);
         int m=0;
         for (j = 1; j < songs[i].length ;j++) {
         array[j][i]= (String) list.get(m);
         m++;
         }
     }
     return array;
 }


    public static void main(String args[]) {
            Album a1 = new Album("The Joshua Tree");
            Song s1 = new Song("With or Without You");
            Song s2 = new Song("Where the Streets have No Name");
            s1.setAlbum(a1);
            s2.setAlbum(a1);
            String [][] data={{"AlbumA","AlbumB","AlbumC"},{"Song2", "Song3","Song1"},{"Song1","Song2"} };

          for(int i=0;i<data.length;i++)
          {
              for(int j=0;j<data[i].length;j++)
              {
                  System.out.print(i+" "+data[i][j] + " "+j);
              }
              System.out.println("\n");
          }
        shuffle(data);

            }

    }
