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
public class ScoreCard extends javax.swing.JFrame {
    int PID1;
    int PID2;
    int PID3;
    int PID4;
    int PID5;
    int PID6;
    int PID7;
    int PID8;
    int PID9;
    int PID10;
    int PID11;
    int PID12;
    int PID13;
    int PID14;
    int PID15;
    int PID16;
    int PID17;
    int PID18;
    int PID19;
    int PID20;
    int PID21;
    int PID22;
    int MID;
    
    /**
     * Creates new form ScoreCard
     * @param p1
     * @param p2
     * @param p3
     * @param p4
     * @param p5
     * @param p6
     * @param p7
     * @param p8
     * @param p19
     * @param p21
     * @param p9
     * @param p10
     * @param p14
     * @param p12
     * @param p11
     * @param p15
     * @param p13
     * @param p16
     * @param p18
     * @param p17
     * @param p20
     * @param p22
     * @param mid
     */
    public ScoreCard(int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,int p9,int p10,int p11,int p12,int p13,int p14,int p15,int p16,int p17,int p18,int p19,int p20,int p21,int p22,int mid) {
        initComponents();
        PID1=p1;
        PID2=p2;
        PID3=p3;
        PID4=p4;
        PID5=p5;
        PID6=p6;
        PID7=p7;
        PID8=p8;
        PID9=p9;
        PID10=p10;
        PID11=p11;
        PID12=p12;
        PID13=p13;
        PID14=p14;
        PID15=p15;
        PID16=p16;
        PID17=p17;
        PID18=p18;
        PID19=p19;
        PID20=p20;
        PID21=p21;
        PID22=p22;
        MID=mid;
        
        this.Player1.setText(JDBConnection.JDBCGetPlayer(PID1));
        this.Player2.setText(JDBConnection.JDBCGetPlayer(PID2));
        this.Player3.setText(JDBConnection.JDBCGetPlayer(PID3));
        this.Player4.setText(JDBConnection.JDBCGetPlayer(PID4));
        this.Player5.setText(JDBConnection.JDBCGetPlayer(PID5));
        this.Player6.setText(JDBConnection.JDBCGetPlayer(PID6));
        this.Player7.setText(JDBConnection.JDBCGetPlayer(PID7));
        this.Player8.setText(JDBConnection.JDBCGetPlayer(PID8));
        this.Player9.setText(JDBConnection.JDBCGetPlayer(PID9));
        this.Player10.setText(JDBConnection.JDBCGetPlayer(PID10));
        this.Player11.setText(JDBConnection.JDBCGetPlayer(PID11));
        /*
        this.Player12.setText(JDBConnection.JDBCGetPlayer(PID12));
        this.Player13.setText(JDBConnection.JDBCGetPlayer(PID13));
        this.Player14.setText(JDBConnection.JDBCGetPlayer(PID14));
        this.Player15.setText(JDBConnection.JDBCGetPlayer(PID15));
        this.Player16.setText(JDBConnection.JDBCGetPlayer(PID16));
        this.Player17.setText(JDBConnection.JDBCGetPlayer(PID17));
        this.Player18.setText(JDBConnection.JDBCGetPlayer(PID18));
        this.Player19.setText(JDBConnection.JDBCGetPlayer(PID19));
        this.Player20.setText(JDBConnection.JDBCGetPlayer(PID10));
        */
        
        
    }
   
    /**
     * Create new ScoreCard
     */
    public ScoreCard(){
        initComponents();
        MID=SADProjectCrickzie.CurrentMatchID;
        if(Innings.getValue()==1){
            TeamName.setText(JDBConnection.JDBCGetTeam(JDBConnection.JDBCGetTeamID(MID, 1)));
            Player1.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 1)));
            Player2.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 2)));
            Player3.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 3)));
            Player4.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 4)));
            Player5.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 5)));
            Player6.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 6)));
            Player7.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 7)));
            Player8.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 8)));
            Player9.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 9)));
            Player10.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 10)));
            Player11.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 11)));
        }
        else{
            TeamName.setText(JDBConnection.JDBCGetTeam(JDBConnection.JDBCGetTeamID(MID, 2)));
            Player1.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 12)));
            Player2.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 13)));
            Player3.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 14)));
            Player4.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 15)));
            Player5.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 16)));
            Player6.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 17)));
            Player7.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 18)));
            Player8.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 19)));
            Player9.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 20)));
            Player10.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 21)));
            Player11.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 22)));
        }
        
    }
    public void UpdateScore(){
        if(Innings.getValue()==1){
            TeamName.setText(JDBConnection.JDBCGetTeam(JDBConnection.JDBCGetTeamID(MID, 1)));
            Player1.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 1)));
            Player2.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 2)));
            Player3.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 3)));
            Player4.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 4)));
            Player5.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 5)));
            Player6.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 6)));
            Player7.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 7)));
            Player8.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 8)));
            Player9.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 9)));
            Player10.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 10)));
            Player11.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 11)));
            Run1.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 1)));
            Run2.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 2)));
            Run3.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 3)));
            Run4.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 4)));
            Run5.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 5)));
            Run6.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 6)));
            Run7.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 7)));
            Run8.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 8)));
            Run9.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 9)));
            Run10.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 10)));
            Run11.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 11)));
            Ball1.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 1)));
            Ball2.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 2)));
            Ball3.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 3)));
            Ball4.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 4)));
            Ball5.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 5)));
            Ball6.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 6)));
            Ball7.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 7)));
            Ball8.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 8)));
            Ball9.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 9)));
            Ball10.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 10)));
            Ball11.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 11)));
            Sixes1.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 1)));
            Sixes2.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 2)));
            Sixes3.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 3)));
            Sixes4.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 4)));
            Sixes5.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 5)));
            Sixes6.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 6)));
            Sixes7.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 7)));
            Sixes8.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 8)));
            Sixes9.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 9)));
            Sixes10.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 10)));
            Sixes11.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 11)));
            Fours1.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 1)));
            Fours2.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 2)));
            Fours3.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 3)));
            Fours4.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 4)));
            Fours5.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 5)));
            Fours6.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 6)));
            Fours7.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 7)));
            Fours8.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 8)));
            Fours9.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 9)));
            Fours10.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 10)));
            Fours11.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 11)));
        }
        else{
            TeamName.setText(JDBConnection.JDBCGetTeam(JDBConnection.JDBCGetTeamID(MID, 2)));
            Player1.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 12)));
            Player2.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 13)));
            Player3.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 14)));
            Player4.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 15)));
            Player5.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 16)));
            Player6.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 17)));
            Player7.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 18)));
            Player8.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 19)));
            Player9.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 20)));
            Player10.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 21)));
            Player11.setText(JDBConnection.JDBCGetPlayer(JDBConnection.JDBCGetPlayer(MID, 22)));
            Run1.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 12)));
            Run2.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 13)));
            Run3.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 14)));
            Run4.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 15)));
            Run5.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 16)));
            Run6.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 17)));
            Run7.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 18)));
            Run8.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 19)));
            Run9.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 20)));
            Run10.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 21)));
            Run11.setText(Integer.toString(JDBConnection.JDBCGetBatRun(MID, 22)));
            Ball1.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 12)));
            Ball2.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 13)));
            Ball3.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 14)));
            Ball4.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 15)));
            Ball5.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 16)));
            Ball6.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 17)));
            Ball7.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 18)));
            Ball8.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 19)));
            Ball9.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 20)));
            Ball10.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 21)));
            Ball11.setText(Integer.toString(JDBConnection.JDBCGetBatBall(MID, 22)));
            Sixes1.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 12)));
            Sixes2.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 13)));
            Sixes3.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 14)));
            Sixes4.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 15)));
            Sixes5.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 16)));
            Sixes6.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 17)));
            Sixes7.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 18)));
            Sixes8.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 19)));
            Sixes9.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 20)));
            Sixes10.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 21)));
            Sixes11.setText(Integer.toString(JDBConnection.JDBCGetBatSixes(MID, 22)));
            Fours1.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 12)));
            Fours2.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 13)));
            Fours3.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 14)));
            Fours4.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 15)));
            Fours5.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 16)));
            Fours6.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 17)));
            Fours7.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 18)));
            Fours8.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 19)));
            Fours9.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 20)));
            Fours10.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 21)));
            Fours11.setText(Integer.toString(JDBConnection.JDBCGetBatFours(MID, 22)));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Player1 = new javax.swing.JLabel();
        Run1 = new javax.swing.JLabel();
        Ball1 = new javax.swing.JLabel();
        Sixes1 = new javax.swing.JLabel();
        Fours1 = new javax.swing.JLabel();
        Player2 = new javax.swing.JLabel();
        Run2 = new javax.swing.JLabel();
        Ball2 = new javax.swing.JLabel();
        Sixes2 = new javax.swing.JLabel();
        Fours2 = new javax.swing.JLabel();
        Player3 = new javax.swing.JLabel();
        Sixes3 = new javax.swing.JLabel();
        Fours3 = new javax.swing.JLabel();
        Run3 = new javax.swing.JLabel();
        Ball3 = new javax.swing.JLabel();
        Ball4 = new javax.swing.JLabel();
        Player4 = new javax.swing.JLabel();
        Fours4 = new javax.swing.JLabel();
        Run4 = new javax.swing.JLabel();
        Sixes4 = new javax.swing.JLabel();
        Run5 = new javax.swing.JLabel();
        Ball5 = new javax.swing.JLabel();
        Player5 = new javax.swing.JLabel();
        Fours5 = new javax.swing.JLabel();
        Sixes5 = new javax.swing.JLabel();
        Fours6 = new javax.swing.JLabel();
        Ball6 = new javax.swing.JLabel();
        Run6 = new javax.swing.JLabel();
        Sixes6 = new javax.swing.JLabel();
        Player6 = new javax.swing.JLabel();
        Run7 = new javax.swing.JLabel();
        Ball7 = new javax.swing.JLabel();
        Fours7 = new javax.swing.JLabel();
        Sixes7 = new javax.swing.JLabel();
        Player7 = new javax.swing.JLabel();
        Sixes8 = new javax.swing.JLabel();
        Ball8 = new javax.swing.JLabel();
        Player8 = new javax.swing.JLabel();
        Run8 = new javax.swing.JLabel();
        Fours8 = new javax.swing.JLabel();
        Run9 = new javax.swing.JLabel();
        Sixes9 = new javax.swing.JLabel();
        Ball9 = new javax.swing.JLabel();
        Player9 = new javax.swing.JLabel();
        Fours9 = new javax.swing.JLabel();
        Player10 = new javax.swing.JLabel();
        Fours10 = new javax.swing.JLabel();
        Sixes10 = new javax.swing.JLabel();
        Ball10 = new javax.swing.JLabel();
        Run10 = new javax.swing.JLabel();
        Ball11 = new javax.swing.JLabel();
        Fours11 = new javax.swing.JLabel();
        Sixes11 = new javax.swing.JLabel();
        Player11 = new javax.swing.JLabel();
        Run11 = new javax.swing.JLabel();
        TeamName = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        Innings = new javax.swing.JSlider();
        InningsLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setTitle("Score Card");

        Player1.setText("Player 1");

        Run1.setText("0");

        Ball1.setText("0");

        Sixes1.setText("0");

        Fours1.setText("0");

        Player2.setText("Player 2");

        Run2.setText("0");

        Ball2.setText("0");

        Sixes2.setText("0");

        Fours2.setText("0");

        Player3.setText("Player 3");

        Sixes3.setText("0");

        Fours3.setText("0");

        Run3.setText("0");

        Ball3.setText("0");

        Ball4.setText("0");

        Player4.setText("Player 4");

        Fours4.setText("0");

        Run4.setText("0");

        Sixes4.setText("0");

        Run5.setText("0");

        Ball5.setText("0");

        Player5.setText("Player 5");

        Fours5.setText("0");

        Sixes5.setText("0");

        Fours6.setText("0");

        Ball6.setText("0");

        Run6.setText("0");

        Sixes6.setText("0");

        Player6.setText("Player 6");

        Run7.setText("0");

        Ball7.setText("0");

        Fours7.setText("0");

        Sixes7.setText("0");

        Player7.setText("Player 7");

        Sixes8.setText("0");

        Ball8.setText("0");

        Player8.setText("Player 8");

        Run8.setText("0");

        Fours8.setText("0");

        Run9.setText("0");

        Sixes9.setText("0");

        Ball9.setText("0");

        Player9.setText("Player 9");

        Fours9.setText("0");

        Player10.setText("Player 10");

        Fours10.setText("0");

        Sixes10.setText("0");

        Ball10.setText("0");

        Run10.setText("0");

        Ball11.setText("0");

        Fours11.setText("0");

        Sixes11.setText("0");

        Player11.setText("Player 11");

        Run11.setText("0");

        TeamName.setText("Team1");

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Innings.setMaximum(2);
        Innings.setMinimum(1);
        Innings.setValue(1);
        Innings.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                InningsStateChanged(evt);
            }
        });
        Innings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InningsMouseClicked(evt);
            }
        });

        InningsLabel.setText("Innings: ");

        jLabel5.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel5.setText("Crickzie");
        jLabel5.setToolTipText("");

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icon.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TeamName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Refresh))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)
                            .addComponent(Run1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ball1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Sixes1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Fours1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(InningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(Innings, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Innings, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InningsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1)
                    .addComponent(Run1)
                    .addComponent(Ball1)
                    .addComponent(Sixes1)
                    .addComponent(Fours1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player2)
                    .addComponent(Run2)
                    .addComponent(Ball2)
                    .addComponent(Sixes2)
                    .addComponent(Fours2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player3)
                    .addComponent(Run3)
                    .addComponent(Ball3)
                    .addComponent(Sixes3)
                    .addComponent(Fours3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player4)
                    .addComponent(Run4)
                    .addComponent(Ball4)
                    .addComponent(Sixes4)
                    .addComponent(Fours4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player5)
                    .addComponent(Run5)
                    .addComponent(Ball5)
                    .addComponent(Sixes5)
                    .addComponent(Fours5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player6)
                    .addComponent(Run6)
                    .addComponent(Ball6)
                    .addComponent(Sixes6)
                    .addComponent(Fours6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player7)
                    .addComponent(Run7)
                    .addComponent(Ball7)
                    .addComponent(Sixes7)
                    .addComponent(Fours7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player8)
                    .addComponent(Run8)
                    .addComponent(Ball8)
                    .addComponent(Sixes8)
                    .addComponent(Fours8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player9)
                    .addComponent(Run9)
                    .addComponent(Ball9)
                    .addComponent(Sixes9)
                    .addComponent(Fours9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player10)
                    .addComponent(Run10)
                    .addComponent(Ball10)
                    .addComponent(Sixes10)
                    .addComponent(Fours10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player11)
                    .addComponent(Run11)
                    .addComponent(Ball11)
                    .addComponent(Sixes11)
                    .addComponent(Fours11)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        UpdateScore();
    }//GEN-LAST:event_RefreshActionPerformed

    private void InningsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InningsMouseClicked
        // TODO add your handling code here:
        UpdateScore();
    }//GEN-LAST:event_InningsMouseClicked

    private void InningsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_InningsStateChanged
        // TODO add your handling code here:
        UpdateScore();
    }//GEN-LAST:event_InningsStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScoreCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ScoreCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ball1;
    private javax.swing.JLabel Ball10;
    private javax.swing.JLabel Ball11;
    private javax.swing.JLabel Ball2;
    private javax.swing.JLabel Ball3;
    private javax.swing.JLabel Ball4;
    private javax.swing.JLabel Ball5;
    private javax.swing.JLabel Ball6;
    private javax.swing.JLabel Ball7;
    private javax.swing.JLabel Ball8;
    private javax.swing.JLabel Ball9;
    private javax.swing.JLabel Fours1;
    private javax.swing.JLabel Fours10;
    private javax.swing.JLabel Fours11;
    private javax.swing.JLabel Fours2;
    private javax.swing.JLabel Fours3;
    private javax.swing.JLabel Fours4;
    private javax.swing.JLabel Fours5;
    private javax.swing.JLabel Fours6;
    private javax.swing.JLabel Fours7;
    private javax.swing.JLabel Fours8;
    private javax.swing.JLabel Fours9;
    private javax.swing.JSlider Innings;
    private javax.swing.JLabel InningsLabel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player10;
    private javax.swing.JLabel Player11;
    private javax.swing.JLabel Player2;
    private javax.swing.JLabel Player3;
    private javax.swing.JLabel Player4;
    private javax.swing.JLabel Player5;
    private javax.swing.JLabel Player6;
    private javax.swing.JLabel Player7;
    private javax.swing.JLabel Player8;
    private javax.swing.JLabel Player9;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel Run1;
    private javax.swing.JLabel Run10;
    private javax.swing.JLabel Run11;
    private javax.swing.JLabel Run2;
    private javax.swing.JLabel Run3;
    private javax.swing.JLabel Run4;
    private javax.swing.JLabel Run5;
    private javax.swing.JLabel Run6;
    private javax.swing.JLabel Run7;
    private javax.swing.JLabel Run8;
    private javax.swing.JLabel Run9;
    private javax.swing.JLabel Sixes1;
    private javax.swing.JLabel Sixes10;
    private javax.swing.JLabel Sixes11;
    private javax.swing.JLabel Sixes2;
    private javax.swing.JLabel Sixes3;
    private javax.swing.JLabel Sixes4;
    private javax.swing.JLabel Sixes5;
    private javax.swing.JLabel Sixes6;
    private javax.swing.JLabel Sixes7;
    private javax.swing.JLabel Sixes8;
    private javax.swing.JLabel Sixes9;
    private javax.swing.JLabel TeamName;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
