package csd.bookonline;

import java.util.ArrayList;
import java.util.List;

public class BookOnline {

    private static List<String> placeInfos;

    public BookOnline(){
        placeInfos = new ArrayList<>();
        placeInfos.add("place one");
        placeInfos.add("place two");
        placeInfos.add("place three");

    }

    public String book(String placeNo){
        for(String placeInfo : placeInfos){
            if(placeInfo.equals(placeNo)){
                placeInfos.remove(placeInfo);
                return "book success";
            }
        }

        return "have no place";
   }
    public List<String> queryPlace(){
        return placeInfos;
    }

}
