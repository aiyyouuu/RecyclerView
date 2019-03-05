package com.example.user.projectrecyclerview;

import java.util.ArrayList;

public class DisneyData {
    private static String[] title = new String[] {"Princess (10)","Prince (5)","Baby Disney (15)","Winni and the Pooh (4)", "Moana(3)","Mickey Mouse (4)"};

    private static int[] thumbnail = new int[] {R.drawable.princess,R.drawable.prince,R.drawable.baby,R.drawable.pooh,R.drawable.moana,R.drawable.mickey};

    public static ArrayList<DisneyModel> getListData(){
        DisneyModel disneymodel = null;
        ArrayList<DisneyModel> list = new ArrayList<>();
        for (int i=0;i<title.length;i++){
            disneymodel = new DisneyModel();
            disneymodel.setNamaPrincess(title[i]);
            disneymodel.setFotoPrincess(thumbnail[i]);
            list.add(disneymodel);
        }
        return list;
    }
}
