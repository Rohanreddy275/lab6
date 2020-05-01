/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author srohan
 */

public class MonthProgram
{
    private int monthNumber;
    

        public MonthProgram()
        {
        monthNumber = 1;
        }

        
        public MonthProgram(int month_num)
        {
        if(month_num < 1 || month_num > 12) monthNumber = 1;
        else monthNumber = month_num;
        }

        public MonthProgram(String month_name)
        {
            if(month_name.equalsIgnoreCase("January")) monthNumber = 1;
            else if(month_name.equalsIgnoreCase("February")) monthNumber = 2;
            else if(month_name.equalsIgnoreCase("March")) monthNumber = 3;
            else if(month_name.equalsIgnoreCase("April")) monthNumber = 4;
            else if(month_name.equalsIgnoreCase("May")) monthNumber = 5;
            else if(month_name.equalsIgnoreCase("June")) monthNumber = 6;
            else if(month_name.equalsIgnoreCase("July")) monthNumber = 7;
            else if(month_name.equalsIgnoreCase("August")) monthNumber = 8;
            else if(month_name.equalsIgnoreCase("September")) monthNumber = 9;
            else if(month_name.equalsIgnoreCase("October")) monthNumber = 10;
            else if(month_name.equalsIgnoreCase("November")) monthNumber = 11;
            else if(month_name.equalsIgnoreCase("December")) monthNumber = 12;
        }
        
    public void setMonthNumber(int month_num)
    {
        if(month_num < 1 || month_num > 12) monthNumber = 1;
        else monthNumber = month_num;
    }
    
    public int getmonthNumber()
    {
    return monthNumber;
    }
    
    public String getMonthName()
    {
    if(monthNumber==1) return "January";
    else if(monthNumber==2) return "February";
    else if(monthNumber==3) return "March";
    else if(monthNumber==4) return "April";
    else if(monthNumber==5) return "May";
    else if(monthNumber==6) return "June";
    else if(monthNumber==7) return "July";
    else if(monthNumber==8) return "August";
    else if(monthNumber==9) return "September";
    else if(monthNumber==10) return "October";
    else if(monthNumber==11) return "November";
    else if(monthNumber==12) return "December";
    return "January";
    }
    
    public String toString()
    {
    return getMonthName();
    }
    
    public boolean equals(MonthProgram M)
    {
    return monthNumber==M.monthNumber;
    }
    public boolean greaterThan(MonthProgram M)
    {
    return monthNumber>M.monthNumber;
    }
    public boolean lessThan(MonthProgram M)
    {
    return monthNumber<M.monthNumber;
    }
    
    public static void main(String[] args)
    {
        MonthProgram mp1 = new MonthProgram(-1);
        MonthProgram mp2 = new MonthProgram(14);
        System.out.println("Month name is " + mp1);
        System.out.println("Month name is " + mp2);
        System.out.println("is m1 equal to m2 ? " + mp1.equals(mp2));
    }
}
