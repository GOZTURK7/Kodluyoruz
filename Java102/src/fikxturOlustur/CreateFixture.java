package fikxturOlustur;

import fikxturOlustur.Fixture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CreateFixture{

    public static ArrayList<Fixture> getFixture(List<String> playersList) {
        ArrayList<Fixture> fixture = new ArrayList<Fixture>();
        ArrayList<String> tempList = new ArrayList<String>();

        int toplamRaunt = playersList.size() - 1;
        int birRaunttakiMacSayisi = playersList.size() / 2;

        //Yeni bir fikstür oluşturulacağı zaman.
        //Hep aynı sırayla takip etmemesi için oyuncuları karıştır.
        //Bir nevi Süperlig'deki joker takımın seçilmesi gibi.
//        Collections.shuffle(playersList);

        for (int i = 0; i < toplamRaunt; i++) {
            for (int j = 0; j < birRaunttakiMacSayisi; j++) {

                int oyuncu = j;
                int rakip = (playersList.size() - 1) - j;

                fixture.add(new Fixture(playersList.get(oyuncu), playersList.get(rakip)));
            }

            tempList.clear();

            tempList.add(playersList.get(0));
            tempList.add(playersList.get(playersList.size() - 1));

            for (int k = 1; k < playersList.size() - 1; k++) {
                tempList.add(playersList.get(k));
            }

            playersList = tempList;
        }

        return fixture;
        //Örneğin 70 oyuncu için Süper Lig tarzı, 1. maçlar, 2.maçlar 3.maçlar ... gibi 2415 adet toplam karşılaşma oluşturuldu.
    }
}