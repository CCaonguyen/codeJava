/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package date.date;





/**
 * The Date class models a calendar date with day, month and year.
 * This class does not perform input validation for day, month and year.
 */
public class Date {
   // The private instance variables
   private int year, month, day;

  
   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   
   public int getYear() {
      return this.year;
   }
  
   public int getMonth() {
      return this.month;
   }
   
   public int getDay() {
      return this.day;
   }
   
   public void setYear(int year) {
      this.year = year;
   }
 
   public void setMonth(int month) {
      this.month = month;
   }
   
   public void setDay(int day) {
      this.day = day;
   }

 
   @Override
   public String toString() {
    
        return String.format("%02d/%02d/%4d", month, day, year);

   }

   
   public void setDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
}