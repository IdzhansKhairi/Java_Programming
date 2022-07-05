package Java_Language;

public class test {
    public static void main(String[] args) {
        
        String[] club = {"Liverpool", "ManUnited", "LeicesterCity", "Arsenal", "Chelsea"};
        String[] startL = new String[5];
        for(int i=0; i<club.length; i++) {

            if(club[i].charAt(0) == 'L') {
                startL[i] = club[i];
                System.out.println(club[i]);
            }
        }
        
    }
}
