import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
class DateClass{
    int date;
    int month;
    int year;
    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateClass)) return false;
        DateClass dateClass = (DateClass) o;
        return date == dateClass.date && month == dateClass.month || year == dateClass.year;
    }
    @Override
    public int hashCode() {
        return Objects.hash(date, month, year);
    }

    @Override
    public String toString() {
        return "Date = "+this.date+"  Month = "+this.month+"  Year = "+this.year;
    }
}

public class AssignmentC2Q4{
    public static void main(String[] args) {
        Map<DateClass,String> map = new HashMap<>();
        DateClass d1 = new DateClass(23,5,1999);
        DateClass d2 = new DateClass(11,5,2002);
        DateClass d3 = new DateClass(18,12,2000);

        map.putIfAbsent(d1,"Mohnish Bhonde");
        map.putIfAbsent(d2,"Vinit Yadav");
        map.putIfAbsent(d3,"Yash Borkar");

        System.out.println("Key-value pair in HashMap: ");

        for(Map.Entry<DateClass,String> m:map.entrySet()){
            DateClass key = m.getKey();
            String value = m.getValue();

            System.out.println(key+" : "+value);

        }
    }
}
