package fiksturOlusturucu;

import java.util.*;

public class FiksturOlusturucu {


    public void run(){
        List<String> teams = new ArrayList<>();

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen Takımları Girin: (çıkmak için 'exit' yazın)");
        while(true){
            String takım = scan.nextLine();
            if(takım.equals("exit"))
                break;
            else teams.add(takım);
        }
        System.out.println(teams);

        if(teams.size() % 2 == 1) teams.add("Bay");


        FiksturOlusturucu fix = new FiksturOlusturucu();

        for(Fikstur w : fix.generateFixture(teams)){
//            System.out.println("Round "+round);
            System.out.println(w.getHome() + " vs "+ w.getAway());

        }
    }


    public List<Fikstur> fiks = new ArrayList<>();

    public List<Fikstur> generateFixture(List<String> teams){

        int round = ((teams.size()-1)*2);
        int match = teams.size();

        for(int i=0; i<match; i++){

            for(int j=0; j<match; j++){

                if(teams.get(i).equals(teams.get(j))){
                    continue;
                }else{
                    fiks.add(new Fikstur(teams.get(i), teams.get(j)));
                }

            }

        }
        Collections.shuffle(fiks);

        return fiks;

    }


}
