
package API_WorkingOnDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Apis {

    public static void main(String[] args) {
       
        LocalDate date1= LocalDate.of(2017, Month.FEBRUARY, 28);    //first method
        LocalDate date2=LocalDate.of(17, 3, 23);            //second method
        LocalDate now=LocalDate.now();
        
        Period p=Period.ofDays(2);
        Period p1=Period.ofMonths(1);
        Period p2=Period.ofWeeks(1);
        date2=date2.plus(p1).plus(p).plus(p2);
        
//        date2=date2.plusDays(27);
        date1=date1.plusDays(3);
        
        System.out.println(date1);          
        System.out.println(date2);
        System.out.println(now);
        
        
        System.out.println("---------------------------------------------------------------------");
        LocalTime time1=LocalTime.of(23, 23);               //first method of time
        LocalTime time2=LocalTime.of(22, 23, 56);           //Second method of time
        LocalTime time3=LocalTime.of(23, 22, 33, 33);       //third method of time
        
        // Period is not implemented on Time.
        time1=time1.plusHours(2);
        time2=time2.plusHours(2).plusMinutes(12).plusSeconds(2);
        
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println("---------------------------------------------------------------------");
        
        Period p4=Period.ofMonths(2);
        LocalDateTime ldt=LocalDateTime.of(17, 8, 24, 23, 59, 33, 555);
        ldt=ldt.plus(p4);
        System.out.println(ldt);
        System.out.println("---------------------------------------------------------------------");
        //Formatting Date and time.
        LocalDate date11=LocalDate.of(17, Month.MARCH, 22);
        System.out.println(date11.getMonthValue());
        System.out.println(date11.getDayOfYear());
        System.out.println(date11.getDayOfWeek());
        System.out.println("---------------------------------------------------------------------");
        LocalDate date22=LocalDate.of(18, 3, 12);
        LocalTime time22=LocalTime.of(23, 33, 44);
        LocalDateTime dt=LocalDateTime.of(date22, time22);
        System.out.println(date22.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time22.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("---------------------------------------------------------------------");
        
        
        DateTimeFormatter shortDate=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter sh=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
          
        LocalDate date23=LocalDate.of(18, 3, 12);
        LocalTime time24=LocalTime.of(23, 3, 44);
        LocalDateTime dt1=LocalDateTime.of(date22, time24);
        
        
        System.out.println(shortDate.format(date23));
        //System.out.println(shortDate.format(time22));
        System.out.println(shortDate.format(dt1));
        
      
        
        System.out.println(sh.format(time24));
        //System.out.println(sh.format(date23));    //will give error ,its localized time.date cant be formatted.
        System.out.println(sh.format(dt1));
        
        
        LocalDate bunny=LocalDate.of(18, Month.MARCH, 12);
        LocalTime bunnytime=LocalTime.of(11, 22, 22);
        LocalDateTime bun=LocalDateTime.of(bunny, bunnytime);
        
        DateTimeFormatter bb1=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(bb1.format(bunny));
        System.out.println(bb1.format(bun));
        
        DateTimeFormatter med=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(med.format(bunny));
        System.out.println(med.format(bun));
        
        DateTimeFormatter boo=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(boo.format(bun));
        //System.out.println(boo.format(bunnytime));
        
        DateTimeFormatter f=DateTimeFormatter.ofPattern("MMM dd,yy,hh:mm");
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("MMMM,dd");
        System.out.println(f1.format(bunny));
        System.out.println(f.format(bun));
        //Date formatter usnig Parse.
        DateTimeFormatter ff=DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate px=LocalDate.parse("03 12 2015", ff);
        System.out.println(px);
        System.out.println("-------------------------------------");
       
    }
    
}
