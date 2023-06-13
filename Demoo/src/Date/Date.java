/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

/**
 *
 * @author admin
 */
public class Date {
  
   // The private instance variables
   private int year, month, day;

   /** *  Constructs a Date instance with the given year, month and day.No input validation
     * @param year
     * @param month
     * @param day */
   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   // The public getters/setters for the private variables
   /** Returns the year
     * @return  */
   public int getYear() {
      return this.year;
   }
   /** Returns the month
     * @return  */
   public int getMonth() {
      return this.month;
   }
   /** Returns the day
     * @return  */
   public int getDay() {
      return this.day;
   }
   /** *  Sets the year.No input validation
     * @param year */
   public void setYear(int year) {
      this.year = year;
   }
   /** *  Sets the month.No input validation
     * @param month */
   public void setMonth(int month) {
      this.month = month;
   }
   /** *  Sets the day.No input validation
     * @param day */
   public void setDay(int day) {
      this.day = day;
   }

   /* Returns a descriptive String in the form "MM/DD/YYYY" with leading zero */
   @Override
   public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d/%02d/%4d", month, day, year);
              // Specifier "0" to print leading zeros
   }

   /** *  Sets year, month and day.No input validation
     * @param year
     * @param month
     * @param day */
   public void setDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
}
