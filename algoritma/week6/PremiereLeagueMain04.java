public class PremiereLeagueMain04 {
    public static void main(String[] args) {
        PremiereLeagueService04 premiereLeagueService04 = new PremiereLeagueService04(20);
        premiereLeagueService04.add(new PremiereLeague04("Liverpool", 29, 45, 82));
        premiereLeagueService04.add(new PremiereLeague04("Manchaster City ", 27, 30, 57));
        premiereLeagueService04.add(new PremiereLeague04("Leicester City ", 28, 25, 50));
        premiereLeagueService04.add(new PremiereLeague04("Chealsea", 29, 48, 50));
        premiereLeagueService04.add(new PremiereLeague04("Wolveshampton Wanderers", 29, 7, 43));
        premiereLeagueService04.add(new PremiereLeague04("Sheffield United", 29, 0, 43));
        premiereLeagueService04.add(new PremiereLeague04("Manchaster United", 29, 7, 43));
        premiereLeagueService04.add(new PremiereLeague04("Tottenham Hotspur", 29, 7, 41));
        premiereLeagueService04.add(new PremiereLeague04("Arsenal", 28, 0, 40));
        premiereLeagueService04.add(new PremiereLeague04("Burnley", 29, -8, 30));
        premiereLeagueService04.add(new PremiereLeague04("Cryystal Palace", 29, -8, 39));
        premiereLeagueService04.add(new PremiereLeague04("Everton", 29, -37, 37));
        premiereLeagueService04.add(new PremiereLeague04("Newcastle United", 29, -6, 35));
        premiereLeagueService04.add(new PremiereLeague04("Southampton", 29, -17, 34));
        premiereLeagueService04.add(new PremiereLeague04("Brighton & Hove Albion", 29, -8,29 ));
        premiereLeagueService04.add(new PremiereLeague04("West Ham United", 29, -15, 27));
        premiereLeagueService04.add(new PremiereLeague04("Watford", 29, -17, 27));
        premiereLeagueService04.add(new PremiereLeague04("AFC Bournemouth", 29, -17, 27));
        premiereLeagueService04.add(new PremiereLeague04("Aston Villa ", 27, -18, 25));
        premiereLeagueService04.add(new PremiereLeague04("Norwich City", 29, -27, 25));
        
        System.out.println("Unsorted Premier League Standings :");
        premiereLeagueService04.displayAll();
        System.out.println("===========================================================================");

        System.out.println("Premiere League Standing sorted by Points in Decending Order ");
        premiereLeagueService04.insertionSort(true);
        premiereLeagueService04.displayAll();
    }
}
