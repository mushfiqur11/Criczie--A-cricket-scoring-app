/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadprojectcrickzie;
/**
 *
 * @author User
 */


public class SADProjectCrickzie {
    public static String CurrentName="guest";
    public static String CurrentUsername="";
    public static String CurrentPassword="";
    public static int CurrentType=0;
    public static int CurrentMatchID =1;
    public static Menu menu = new Menu();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menu.setVisible(true);
        LoginWindow lw = new LoginWindow();
        lw.setVisible(true);
    }
    
}
