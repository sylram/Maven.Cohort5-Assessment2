package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    HashMap<Integer,String> calendar;
    Collection<String> calendar2;

    public MonthConversion(){
        calendar = new HashMap<>();
    }
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    public void add(Integer monthNumber, String monthName) {
//        calendar = new HashMap<>();
//            if (calendar.isEmpty()){
//                calendar = new HashMap<>();
//                calendar.put(monthNumber, monthName);
//            }else{
                calendar.put(monthNumber, monthName);
            }
//        for (int i = 0; i <12 ; i++) {
//            calendar.put(i,"");
//        }
//
//        for (Integer n : calendar.keySet()) {
//            if (calendar.get(n) == null) {
//
//            }
//


    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String month = calendar.get(monthNumber);
        return month;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        int number = 0;
        for (Integer s : calendar.keySet()) {
            if (calendar.get(s).equals(monthName)) {
                number = s;


            }

        }return number;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return calendar.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        for (Integer s : calendar.keySet()) {
            if (calendar.get(s).equals(monthName)) {
           return true; }

        }return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calendar.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calendar.put(monthNumber,monthName);

    }
}
