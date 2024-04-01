public class PremiereLeagueService04 {
    PremiereLeague04[] leagues04;
    int size;

    public PremiereLeagueService04(int capacity){
        leagues04 = new PremiereLeague04[capacity];
        size=0;
    }

    public void add(PremiereLeague04 p){
        if(size < leagues04.length){
            leagues04[size++] = p;

        }else{
            System.out.println("Premier league service already full");
        }
    }

    public void displayAll(){
        for (PremiereLeague04 pl : leagues04){
            if(pl != null){
                System.out.println("Team: " +pl.team +"Played : " +pl.play+"Goals : " +pl.goal+"Points :" + pl.points);
            }
        }
    }

    public void insertionSort(boolean asc){
        for (int i=1; i <size; i++){
            PremiereLeague04 key = leagues04[i];
            int j = i-1;

            if(asc){
                while(j>=0 && leagues04[j].points < key.points){
                    leagues04[j+1] = leagues04[j];
                    j = j-1;
                }
            }
            leagues04[j+1] = key;
        }
    }
}
