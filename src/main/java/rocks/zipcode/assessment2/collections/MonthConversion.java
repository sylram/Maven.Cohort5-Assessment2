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
        calendar.put(monthNumber, monthName);
            }




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
    public Integer getNumber(String monthName) {
        Integer number=null;
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
