package com.company.practice.generics;

public class Main {
    public static void main(String[] args) {
//
        Team<BasketballPlayer> kings = new Team("Kings");
        BasketballPlayer lebron = new BasketballPlayer("Lebron James");
        BasketballPlayer kyrie = new BasketballPlayer("Kyrie Irvin");
        BasketballPlayer AD = new BasketballPlayer("Adeni Donel ");
        BasketballPlayer adebayo = new BasketballPlayer("Heat's Adebayo");
        BasketballPlayer KD = new BasketballPlayer("Kelvin Durant");

        kings.addPlayer(lebron);
        kings.addPlayer(kyrie);
        kings.addPlayer(AD);
        kings.addPlayer(adebayo);
        kings.addPlayer(KD);


        //
        Team<SoccerPlayer> chelsea = new Team<>("chelsea FC");
        SoccerPlayer messi = new SoccerPlayer("Lionel Messi");
        SoccerPlayer neymah = new SoccerPlayer("Neymah");
        SoccerPlayer lukaku = new SoccerPlayer("Alfa Lukaku");
        SoccerPlayer lampard = new SoccerPlayer("Lampard");
        SoccerPlayer mbappe = new SoccerPlayer("Mbappe");

        chelsea.addPlayer(messi);
        chelsea.addPlayer(neymah);
        chelsea.addPlayer(lukaku);
        chelsea.addPlayer(lampard);
        chelsea.addPlayer(mbappe);

        Team<SoccerPlayer> manU = new Team<>("Manchester United");
        SoccerPlayer ronaldo = new SoccerPlayer("Christiano Ronaldo");
        SoccerPlayer sane = new SoccerPlayer("Insane Sane");
        SoccerPlayer maguire = new SoccerPlayer("Captain Maguire");
        SoccerPlayer brown = new SoccerPlayer("Raren Brown");
        SoccerPlayer lingard = new SoccerPlayer("Jessie Lingard");

        manU.addPlayer(ronaldo);
        manU.addPlayer(sane);
        manU.addPlayer(maguire);
        manU.addPlayer(brown);
        manU.addPlayer(lingard);
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool FC");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal FC");
        Team<SoccerPlayer> stoke = new Team<>("Stoke City");
        Team<SoccerPlayer> manC = new Team<>("Manchester City");

        chelsea.playMatch(manU, 2, 4);
        arsenal.playMatch(stoke, 10, 2);
        manC.playMatch(manU, 4, 1);
        liverpool.playMatch(manC, 2, 1);
        liverpool.playMatch(manU, 3, 0);

        //
        Team<FootballPlayer> chicat = new Team("Chicago Cubs");
        FootballPlayer jamal = new FootballPlayer("Kareem Jamal");
        FootballPlayer john = new FootballPlayer("John Frost");
        FootballPlayer rouns = new FootballPlayer("Rouns Dekciy");
        FootballPlayer ibrahim = new FootballPlayer("Ibrahim Abib");
        FootballPlayer ishaq = new FootballPlayer("Ishaq Nuuman");

        chicat.addPlayer(jamal);
        chicat.addPlayer(john);
        chicat.addPlayer(rouns);
        chicat.addPlayer(ibrahim);
        chicat.addPlayer(ishaq);

        League<Team<SoccerPlayer>> englishLeague = new League("English League");
        englishLeague.addTeam(chelsea);
        englishLeague.addTeam(manU);
        englishLeague.addTeam(manC);
        englishLeague.addTeam(liverpool);
        englishLeague.addTeam(stoke);
        englishLeague.addTeam(arsenal);

        englishLeague.printLeague();


    }
}
