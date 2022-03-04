package fiksturOlusturucu;

import java.util.*;

public class FiksturOlusturucu {

    List<String> teams = new ArrayList<>();
    List<Fikstur> fiks = new ArrayList<>();
    List<Fikstur> fiksturArranged = new ArrayList<>();
    List<Integer> selectedIndexes = new ArrayList<>();



    public void run(){


        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen Takımları Girin: (çıkmak için 'exit' yazın)");
        while(true){
            String takım = scan.nextLine();
            if(takım.equals("exit"))
                break;
            else teams.add(takım);
        }
        System.out.println("eklemeden sonra teams: "+ teams);

        generateFixtureList(teams);
        System.out.println("fiks.size(): "+fiks.size());

//        for (int i = 0; i < fiksturArranged.size(); i+=teams.size()/2)

        for(Fikstur w : fiks){

            System.out.println(w.getHome() + " vs "+ w.getAway());

        }

        System.out.println("******************************");

        for(Fikstur w : fiksturArranged){

            System.out.println(w.getHome() + " vs "+ w.getAway());

        }
    }




    public void generateFixtureList(List<String> teams) {

        if (teams.size() % 2 == 1) teams.add("Bay");
        int round = ((teams.size() - 1) * 2);
        int match = teams.size();

        for (int i = 0; i < match; i++) {

            for (int j = 0; j < match; j++) {

                if (teams.get(i).equals(teams.get(j))) {
                    continue;
                } else {
                    fiks.add(new Fikstur(teams.get(i), teams.get(j)));
                }

            }

        }


        for (int i = 0; i < fiks.size(); i++) {

            for (int j = 0; j < fiks.size(); j++) {

                fiksturArranged.add(fiks.get(i));

                if(i==j) continue;

                if(!fiksturArranged.get(i).getHome().equals(fiks.get(j).getAway())){
                    fiksturArranged.add(fiks.get(j));
                     break;

                }
            }


        }


    }

    public void generateFixture(List<Fikstur> fiks, List<String> teams){

        int start = 0;
        int finish=teams.size()-1; // 5

        while(true){
            int index = getRandomIndex(start,finish);
            if(selectedIndexes.contains(index)){
                continue;
            }
            selectedIndexes.add(index);
            fiksturArranged.add(fiks.get(index));
            if(start==25){
                start=0;
                finish=teams.size()-1; // 5
            }
            start =finish;
            finish= start + teams.size()-1;

            if(selectedIndexes.size()==fiks.size()){
                break;
            }
        }



//        Collections.shuffle(fiks);

    }

    public int getRandomIndex(int min, int max){
        Random rand = new Random();
        int a = rand.nextInt(max-min);
        while(true){
            if(selectedIndexes.contains(a+min)){

                a=rand.nextInt(max-min);

            }else{
                break;
            }
        }

        return a+min;

    }


}
