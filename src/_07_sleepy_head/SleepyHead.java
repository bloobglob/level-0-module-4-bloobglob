package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?");
        isWeekday = weekday == 0;
        int vacation = JOptionPane.showConfirmDialog(null, "Are you on vacation?");
        isVacation = vacation == 0;
        if(isWeekday) {
        	if(!isVacation) {
        		JOptionPane.showMessageDialog(null, "Get up lazybones!");
        	}else {
        		JOptionPane.showMessageDialog(null, "Sleep in!");
        	}
        }else {
        	JOptionPane.showMessageDialog(null, "Sleep in!");
        }

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
