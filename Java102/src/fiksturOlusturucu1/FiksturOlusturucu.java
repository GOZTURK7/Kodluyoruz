package fiksturOlusturucu1;

import java.util.*;

public class FiksturOlusturucu {

    public  List<String> teams = new ArrayList<>();
    public  List<Fikstur> fiksturArranged = new ArrayList<>();

    public void run(){


        // we are gettig teams from user and adding them into teams arraylist upside
        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen Takımları Girin: (çıkmak için 'exit' yazın)");
        while(true){
            String takım = scan.nextLine();
            if(takım.equals("exit"))
                break;
            else teams.add(takım);
        }

        // we are calling genererateFixtureList to generate the fixture randomly.
        generateFixtureList(teams); //



        // after generatin the fixture we are changing the home and away side of the list and
        // adding them into our fiksurArranged Arraylist at the class level.
        int num = fiksturArranged.size();
        for (int i = 0; i <num; i++) {
            Fikstur tmp = new Fikstur(fiksturArranged.get(i).getAway(), fiksturArranged.get(i).getHome());
            fiksturArranged.add(tmp);
        }


        // until here for example; for 6 teams we have 30 match list in fiksturArranged list now we have to group them into week
        // and for 6 team every week we have 3 unique match.
        List<List<Fikstur>> list = new ArrayList<>();

            int cycle = (teams.size()+1)/2; // due to the algorithm of fikstur in the generateFixtureList method our teams.size()=5 for six teams; so we are adding 1 here;
            int index = 0;
            while(true){
                List<Fikstur> list1 = new ArrayList<>();
                for (int i = 0; i < cycle; i++) {
                    list1.add(fiksturArranged.get(index++)); // we are adding list1 which includes 3 teams (for 6 teams)

                }
                list.add(list1); // now we are adding list1 which includes 3 teams into the list.
                if(index==(fiksturArranged.size())) break; // if the index reaches fikstureArranged.size() it will stop.
            }

        Collections.shuffle(list); // we are shuffling the list to get rondom groups/week(which includes 3 teams for 6 teams)


        printFixture(list); // print the fixture




    }



    public void printFixture(List<List<Fikstur>> list){
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
            System.out.println("round "+ count++);
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println(list.get(i).get(j).getHome() + " vs " + list.get(i).get(j).getAway());
            }
        }
    }


    public void generateFixtureList(List<String> teams) {


        if (teams.size() % 2 == 1) teams.add("Bay"); // if the user entered odd number of teams we are adding a dummy team as "Bay"


        // we are using the fixture algorithm here.

        String constantTeam = teams.get(0); // we are selecting first team of the list and pegging it into a variabel and romoving from teams.list.
        teams.remove(0); //[Bursaspor, Fenerbahçe, Beşiktaş, Başakşehir, Trabzonspor] our new teams list here without first one (Galatasaray)
        String temp = "";


        // now we will slide match the teams and shift the order.
        int round = 0;
        while(true) {

            fiksturArranged.add(new Fikstur(constantTeam, teams.get(0))); // we have added the first match between "Galatasaray vs Bursaspor"
            for (int j = 0; j < (teams.size()-1)/2; j++) {
                fiksturArranged.add(new Fikstur(teams.get(j + 1), teams.get((teams.size()-1) - j))); // here now we are matching
                // the Fenerbahçe vs Trabzonspor and Beşiktaş vs Başakşehir
            }

            // and below we are shifting the teams like this [Trabzonspor, Bursaspor, Fenerbahçe, Beşiktaş, Başakşehir]

            temp = teams.get(teams.size() - 1);
            teams.remove(teams.size() - 1);
            teams.add(0,temp);
            if(++round==teams.size()) break;

        }
    }
}
