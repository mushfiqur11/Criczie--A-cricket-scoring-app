/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadprojectcrickzie;
import java.sql.*; 
/**
 *
 * @author User
 */
public class JDBConnection {
    JDBConnection(){
    }
    
    public static int JDBConnect(String username,String password){
        SADProjectCrickzie.CurrentType=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select * from AllUsers where username = ? and password = ?"); 
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                SADProjectCrickzie.CurrentName = rs.getString(1);
                SADProjectCrickzie.CurrentUsername = rs.getString(2);
                SADProjectCrickzie.CurrentType = rs.getInt(3);
                SADProjectCrickzie.CurrentPassword = rs.getString(4);
                con.close();
            }
            else{
                System.out.println("Invalid username/password");
            }
             
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        } 
        return SADProjectCrickzie.CurrentType;
    }
    public static void JDBCCreateUser(String Name,String username,String password,int usertype){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  
            
            PreparedStatement stmt = con.prepareStatement("select * from AllUsers where username = ?"); 
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                System.out.println("Username already exists");
                
            }
            else{
                PreparedStatement stmt2=con.prepareStatement("insert into AllUsers values(?,?,?,?)"); 
                stmt2.setString(1, Name);
                stmt2.setString(2, username);           
                stmt2.setInt(3, usertype);
                stmt2.setString(4,password);


                stmt2.executeUpdate();  
                //while(rs.next())
                //    System.out.println(rs.getInt(1)+"  "+rs.getInt(2));  

                
            }
            con.close();
            JDBConnection.JDBConnect(username,password);
        }
        catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }
    }
    public static int JDBCCreateTeam(String Name,String Location){
        int returnInt=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("insert into Teams values(seq_team.nextval,?,?)"); 
            stmt.setString(1, Name);
            stmt.setString(2, Location);

            stmt.executeUpdate();
            con.close();
            returnInt=1;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return returnInt;
    }
    public static int JDBCCreateTournament(String Name,int year, int numberOfTeams,int format){
        int returnInt=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("insert into Tournament values(seq_tourney.nextval,?,?,?,?)"); 
            stmt.setString(1, Name);
            stmt.setInt(2, year);
            stmt.setInt(3, numberOfTeams);
            stmt.setInt(4, format);

            stmt.executeUpdate();
            
            PreparedStatement stmt2 = con.prepareStatement("select max(tournamentID) as t from tournament");
            ResultSet rs = stmt2.executeQuery();
            if(rs.next()){
                returnInt = rs.getInt("t");
            }
            con.close();
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return returnInt;
    }
    public static int JDBCCreateTournamentTeams(int TournamentID){
        int returnInt=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("insert into TourStanding values(?,?,0,0)"); 
            stmt.setInt(1, TournamentID);
            stmt.setInt(2, 1);
            stmt.executeUpdate();
            stmt.setInt(2, 2);
            stmt.executeUpdate();
            stmt.setInt(2, 3);
            stmt.executeUpdate();
            stmt.setInt(2, 4);
            stmt.executeUpdate();
            stmt.setInt(2, 5);
            stmt.executeUpdate();
            stmt.setInt(2, 6);
            stmt.executeUpdate();
            
            con.close();
            returnInt=1;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return returnInt;
    }
    public static int JDBCCreatePlayer(String Name, int Age, int TeamID){
        int returnInt=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("insert into Player values(seq_player.nextval,?,?,?)"); 
            stmt.setString(1, Name);
            stmt.setInt(2, Age);
            stmt.setInt(3,TeamID);

            stmt.executeUpdate();
            con.close();
            returnInt=1;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return returnInt;
    }
    public static int JDBCCreateMatch(int Team1, int Team2, int Toss,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,int p9,int p10,int p11,int p12,int p13,int p14,int p15,int p16,int p17,int p18,int p19,int p20,int p21,int p22,int Overs){
        int matchID=1;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("insert into Match values(seq_match.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,0,0,0,0)"); 
            stmt.setInt(1, Team1);
            stmt.setInt(2, Team2);
            stmt.setInt(3, Toss);
            stmt.setInt(4, p1);
            stmt.setInt(5, p2);
            stmt.setInt(6, p3);
            stmt.setInt(7, p4);
            stmt.setInt(8, p5);
            stmt.setInt(9, p6);
            stmt.setInt(10, p7);
            stmt.setInt(11, p8);
            stmt.setInt(12, p9);
            stmt.setInt(13, p10);
            stmt.setInt(14, p11);
            stmt.setInt(15, p12);
            stmt.setInt(16, p13);
            stmt.setInt(17, p14);
            stmt.setInt(18, p15);
            stmt.setInt(19, p16);
            stmt.setInt(20, p17);
            stmt.setInt(21, p18);
            stmt.setInt(22, p19);
            stmt.setInt(23, p20);
            stmt.setInt(24, p21);
            stmt.setInt(25, p22);
            stmt.setInt(26, Overs);
            stmt.executeUpdate(); 
            Statement stmt2 = con.createStatement();
            ResultSet rs = stmt2.executeQuery("select MAX(MatchID) as m from Match");
            if(rs.next()){
                matchID = rs.getInt("m");
                System.out.println(matchID);
            }
            PreparedStatement stmt3 = con.prepareStatement("insert into matchBatting values(? ,?, 0,0,0,0,null,null)");
            stmt3.setInt(1, matchID);
            for(int i =1;i<=22;i++){
                stmt3.setInt(2, i);
                stmt3.executeUpdate();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        } 
        return matchID;
    }
    public static String JDBCGetTeam(int TeamID){
        String TeamName="";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select TeamName from Teams where TeamID = ?"); 
            stmt.setInt(1, TeamID);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                TeamName= rs.getString("TEAMNAME");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            TeamName = "Error";
        } 
        return TeamName;
    }
    public static String JDBCGetTeam(String Team){
        String TeamName="";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt2 = con.prepareStatement("select TeamName from Teams where TeamName = ?"); 
            
            stmt2.setString(1, Team);
            ResultSet rs = stmt2.executeQuery();
            if(rs.next()) {
                    TeamName= rs.getString("TEAMNAME");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            
            
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select TEAMNAME from Player where TEAMNAME like ?");
                stmt.setString(1, Team+"%");
                rs = stmt.executeQuery();
                if(rs.next()) {
                    TeamName= rs.getString("TEAMNAME");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            }
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select TEAMNAME from Player where TEAMNAME like ?");
                stmt.setString(1, "%"+Team);
                rs = stmt.executeQuery();
                if(rs.next()) {
                    TeamName= rs.getString("TEAMNAME");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            }
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select TEAMNAME from Player where TEAMNAME like ?");
                stmt.setString(1, "%"+Team+"%");
                rs = stmt.executeQuery();
                if(rs.next()) {
                    TeamName= rs.getString("TEAMNAME");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            }
        }
        
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            TeamName = "Error";
        } 
        return TeamName;
    }
    public static int JDBCGetTeamID(int MatchID,int TeamSL){
        int TeamID=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select Team"+TeamSL+" as T from Match where MatchID = ?"); 
            stmt.setInt(1, MatchID);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                TeamID= rs.getInt("T");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            TeamID = 0;
        } 
        return TeamID;
    }
    public static int JDBCGetTeamID(String Team){
        int TeamName=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt2 = con.prepareStatement("select TeamName from Teams where TeamName = ?"); 
            
            stmt2.setString(1, Team);
            ResultSet rs = stmt2.executeQuery();
            if(rs.next()) {
                    TeamName= rs.getInt("TEAMID");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            
            
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select TEAMNAME from Player where TEAMNAME like ?");
                stmt.setString(1, Team+"%");
                rs = stmt.executeQuery();
                if(rs.next()) {
                    TeamName= rs.getInt("TEAMID");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            }
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select TEAMNAME from Player where TEAMNAME like ?");
                stmt.setString(1, "%"+Team);
                rs = stmt.executeQuery();
                if(rs.next()) {
                    TeamName= rs.getInt("TEAMID");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            }
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select TEAMNAME from Player where TEAMNAME like ?");
                stmt.setString(1, "%"+Team+"%");
                rs = stmt.executeQuery();
                if(rs.next()) {
                    TeamName= rs.getInt("TEAMID");
                }
                if(!"".equals(TeamName)){
                    con.close();
                }
            }
        }
        
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        } 
        return TeamName;
    }
    public static String JDBCGetPlayer(int PlayerID){
        String PlayerName="";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select PlayerName from Player where PlayerID = ?"); 
            stmt.setInt(1, PlayerID);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                PlayerName= rs.getString("PLAYERNAME");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            PlayerName = "Error";
        } 
        return PlayerName;
    }
    public static String JDBCGetPlayer(String Player){
        String PlayerName="";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt2 = con.prepareStatement("select PlayerName from Player where PlayerName = ?"); 
            
            stmt2.setString(1, Player);
            ResultSet rs = stmt2.executeQuery();
            if(rs.next()) {
                    PlayerName= rs.getString("PLAYERNAME");
                }
                if(!"".equals(PlayerName)){
                    con.close();
                }
            
            
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select PlayerName from Player where PlayerName like ?");
                stmt.setString(1, Player+"%");
                rs = stmt.executeQuery();
                if(rs.next()) {
                    PlayerName= rs.getString("PLAYERNAME");
                }
                if(!"".equals(PlayerName)){
                    con.close();
                }
            }
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select PlayerName from Player where PlayerName like ?");
                stmt.setString(1, "%"+Player);
                rs = stmt.executeQuery();
                if(rs.next()) {
                    PlayerName= rs.getString("PLAYERNAME");
                }
                if(!"".equals(PlayerName)){
                    con.close();
                }
            }
            if(!con.isClosed()){
                PreparedStatement stmt = con.prepareStatement("select PlayerName from Player where PlayerName like ?");
                stmt.setString(1, "%"+Player+"%");
                rs = stmt.executeQuery();
                if(rs.next()) {
                    PlayerName= rs.getString("PLAYERNAME");
                }
                if(!"".equals(PlayerName)){
                    con.close();
                }
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            PlayerName = "Error";
        } 
        return PlayerName;
    }
    public static int JDBCGetPlayer(int MatchID,int PlayerSL){
        int PlayerSLNo=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select Player"+PlayerSL+"ID as p from Match where MatchID = ?"); 
            
            stmt.setInt(1, MatchID);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                PlayerSLNo= rs.getInt("p");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
        } 
        
        return PlayerSLNo;
    }
    public static int JDBCGetBatRun(int MatchID,int PlayerSL){
        int PlayerRun=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select run from matchBatting where MatchID = ? and PlayerSL = ?"); 
            
            stmt.setInt(1, MatchID);
            stmt.setInt(2, PlayerSL);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                PlayerRun= rs.getInt("run");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
        } 
        
        return PlayerRun;
    }
    public static int JDBCGetBatBall(int MatchID,int PlayerSL){
        int PlayerBall=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select ball from matchBatting where MatchID = ? and PlayerSL = ?"); 
            
            stmt.setInt(1, MatchID);
            stmt.setInt(2, PlayerSL);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                PlayerBall= rs.getInt("ball");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
        } 
        
        return PlayerBall;
    }
    public static int JDBCGetBatSixes(int MatchID,int PlayerSL){
        int PlayerSixes=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select sixes from matchBatting where MatchID = ? and PlayerSL = ?"); 
            
            stmt.setInt(1, MatchID);
            stmt.setInt(2, PlayerSL);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                PlayerSixes= rs.getInt("sixes");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
        } 
        
        return PlayerSixes;
    }
    public static int JDBCGetBatFours(int MatchID,int PlayerSL){
        int PlayerFours=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  

            PreparedStatement stmt = con.prepareStatement("select fours from matchBatting where MatchID = ? and PlayerSL = ?"); 
            
            stmt.setInt(1, MatchID);
            stmt.setInt(2, PlayerSL);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                PlayerFours= rs.getInt("fours");
                con.close();
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
        } 
        
        return PlayerFours;
    }
    public static void JDBCSetNewBall(int MatchID,int BatSL, int BowlSL, int run, String wicket, int legal){
        int Runs=0,Balls=0,Fours=0,Sixes=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con;  
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");

            PreparedStatement stmt = con.prepareStatement("select * from matchBatting where MatchID = ? and PlayerSL = ?"); 
            
            stmt.setInt(1, MatchID);
            stmt.setInt(2, BatSL);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Runs= rs.getInt("run");
                Balls= rs.getInt("ball");
                Sixes= rs.getInt("sixes");
                Fours= rs.getInt("fours");
            }
            Runs=Runs + run;
            if(legal<2){
                Balls=Balls+1;
            }
            PreparedStatement stmt2 = con.prepareStatement("update matchBatting set run=?, ball=?, sixes=?, fours=? where MatchID=? and PlayerSL=?");
            stmt2.setInt(1, Runs);
            stmt2.setInt(2, Balls);
            stmt2.setInt(3, Sixes);
            stmt2.setInt(4, Fours);
            stmt2.setInt(5, MatchID);
            stmt2.setInt(6, BatSL);
            
            stmt2.executeUpdate();
            
            
            PreparedStatement stmt3 = con.prepareStatement("select * from match where MatchID = ?"); 
            
            stmt3.setInt(1, MatchID);
            
            int Score1=0,Score2=0,Wicket1=0,Wicket2=0;
            ResultSet rs2 = stmt3.executeQuery();
            if(rs2.next()) {
                Score1 = rs2.getInt("TEAM1SCORE");
                Score2 = rs2.getInt("TEAM2SCORE");
                Wicket1 = rs2.getInt("TEAM1WICKET");
                Wicket2 = rs2.getInt("TEAM2WICKET");
                
            }
            if(BatSL<=11){
                Score1 = Score1 + run;
                if(!"NotOut".equals(wicket)){
                    Wicket1++;
                }
            }
            else{
                Score2 = Score2 + run;
                if(!"NotOut".equals(wicket)){
                    Wicket2++;
                }
            }
            
            PreparedStatement stmt4 = con.prepareStatement("update match set team1score=?, team2score=?, team1wicket=?, team2wicket=? where MatchID=?");
            stmt4.setInt(1, Score1);
            stmt4.setInt(2, Score2);
            stmt4.setInt(3, Wicket1);
            stmt4.setInt(4, Wicket2);
            stmt4.setInt(5, MatchID);
            
            stmt4.executeUpdate();
            
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
        } 
    }
    public static int JDBCGetScore(int MatchID, int BatSL){
        int returnInt=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  
            
            PreparedStatement stmt = con.prepareStatement("select team1score , team2score from match where matchid=?"); 
            stmt.setInt(1, MatchID);
            

            ResultSet rs = stmt.executeQuery();
            int Score1=0,Score2=0;
            if(rs.next()) {
                Score1=rs.getInt("TEAM1SCORE");
                Score2=rs.getInt("TEAM2SCORE");
            }
            if(BatSL<=11){
                returnInt=Score1;
            }
            else{
                returnInt=Score2;
            }
            
            con.close();
            
        }
        catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }
        return returnInt;
    }
    public static int JDBCGetWicket(int MatchID, int BatSL){
        int returnInt=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ankan","ankan");  
            
            PreparedStatement stmt = con.prepareStatement("select team1wicket , team2wicket from match where matchid=?"); 
            stmt.setInt(1, MatchID);
            

            ResultSet rs = stmt.executeQuery();
            int Score1=0,Score2=0;
            if(rs.next()) {
                Score1=rs.getInt("TEAM1WICKET");
                Score2=rs.getInt("TEAM2WICKET");
            }
            if(BatSL<=11){
                returnInt=Score1;
            }
            else{
                returnInt=Score2;
            }
            
            con.close();
            
        }
        catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }
        return returnInt;
    }
    
    
}