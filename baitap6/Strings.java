/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author sonlvhde130095
 */
public class Strings {
    public static void main(String[] args) {
        String str = "I want to to go to the the the zoo";
        System.out.println("Before : " + str);
        str = str.replace("to to"  , "REPEAT");
        str = str.replace("the the the" , "REPEAT");
        System.out.println("After : " + str);
    }
}
