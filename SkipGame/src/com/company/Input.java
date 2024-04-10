package com.company;

import com.company.actions.*;

import java.util.Scanner;

public class Input {

    static Scanner s;

    public static Action get(){

        if(s == null){ s = new Scanner(System.in); }
        String input = s.nextLine();

        //s.close();

        if(isActionValue(input)){ return new SkipValue(); }
        if(isActionIncrement(input)){ return new SkipIncrement(); }
        if(isActionDetail(input)){ return new SkipDetail(); }
        if(isExit(input)){ return new Exit(); }


        return new NoAction();
    }

    private static boolean isActionValue(String s){
        if(s.equals("1")){ return true; }
        return false;
    }

    private static boolean isActionIncrement(String s){
        if(s.equals("2")){ return true; }
        return false;
    }

    private static boolean isActionDetail(String s){
        if(s.equals("3")){ return true; }
        return false;
    }

    private static boolean isExit(String s){
        if(s.equals("4")){ return true; }
        return false;
    }
}
