package xogaming;


import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class AllProject extends javax.swing.JFrame {

    GamePlayer user = new GamePlayer(); 
    public static CardLayout crd;
     

    public AllProject() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cards = new javax.swing.JPanel();
        StartPage = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        panelSIgnUP = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSignUp1 = new javax.swing.JButton();
        backfromS = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtPassword = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        backFromL = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        GameModes = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        playingwithComputer = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbutton1 = new javax.swing.JButton();
        jbutton2 = new javax.swing.JButton();
        jbutton3 = new javax.swing.JButton();
        jbutton4 = new javax.swing.JButton();
        jbutton5 = new javax.swing.JButton();
        jbutton6 = new javax.swing.JButton();
        jbutton7 = new javax.swing.JButton();
        jbutton8 = new javax.swing.JButton();
        jbutton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        ResetButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        RecordingButton = new javax.swing.JButton();
        ViewRecords = new javax.swing.JButton();
        PlayMusicButton = new javax.swing.JButton();
        playingwithfriend = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        Button10 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        Button12 = new javax.swing.JButton();
        Button13 = new javax.swing.JButton();
        Button14 = new javax.swing.JButton();
        Button15 = new javax.swing.JButton();
        Button16 = new javax.swing.JButton();
        Button17 = new javax.swing.JButton();
        Button18 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        ResetButton1 = new javax.swing.JButton();
        ExitButton1 = new javax.swing.JButton();
        RecordingButton1 = new javax.swing.JButton();
        teamIcon = new javax.swing.JButton();
        ViewRecords1 = new javax.swing.JButton();
        ShowPlayerTwoName = new javax.swing.JLabel();
        ShowPlayerOneName = new javax.swing.JLabel();
        PlayMusicButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cards.setLayout(new java.awt.CardLayout());

        StartPage.setBackground(new java.awt.Color(0, 204, 204));
        StartPage.setForeground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("XO Game");

        btnLogin1.setBackground(new java.awt.Color(204, 255, 255));
        btnLogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(204, 255, 255));
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSignUp.setText("Sign Up ");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/images.jpg"))); // NOI18N

        javax.swing.GroupLayout StartPageLayout = new javax.swing.GroupLayout(StartPage);
        StartPage.setLayout(StartPageLayout);
        StartPageLayout.setHorizontalGroup(
            StartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartPageLayout.createSequentialGroup()
                .addGroup(StartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StartPageLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(StartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(jLabel8))
                    .addGroup(StartPageLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel4)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        StartPageLayout.setVerticalGroup(
            StartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartPageLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(StartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartPageLayout.createSequentialGroup()
                        .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartPageLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );

        Cards.add(StartPage, "card1");

        panelSIgnUP.setBackground(new java.awt.Color(0, 204, 204));
        panelSIgnUP.setForeground(new java.awt.Color(0, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("XO Game - Sign Up");

        btnSignUp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUp1.setText("Sign Up");
        btnSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp1ActionPerformed(evt);
            }
        });

        backfromS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backfromS.setText("Back ");
        backfromS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backfromSActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Password");

        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSIgnUPLayout = new javax.swing.GroupLayout(panelSIgnUP);
        panelSIgnUP.setLayout(panelSIgnUPLayout);
        panelSIgnUPLayout.setHorizontalGroup(
            panelSIgnUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSIgnUPLayout.createSequentialGroup()
                .addGroup(panelSIgnUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSIgnUPLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel6))
                    .addComponent(backfromS, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSIgnUPLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelSIgnUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelSIgnUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSignUp1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(TxtPassword)
                            .addComponent(jTextField1))))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        panelSIgnUPLayout.setVerticalGroup(
            panelSIgnUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSIgnUPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(panelSIgnUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelSIgnUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(btnSignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(backfromS))
        );

        Cards.add(panelSIgnUP, "Card 2");

        Login.setBackground(new java.awt.Color(0, 204, 204));
        Login.setForeground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("XO Game - Login");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username ");

        btnUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        btnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasswordActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        backFromL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backFromL.setText("Back ");
        backFromL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFromLActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/images.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(backFromL, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)
                            .addComponent(btnUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(370, 370, 370))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(backFromL))
        );

        Cards.add(Login, "card 3");

        GameModes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Play with computer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Play with Friends");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("play online");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        GameModes.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -30, 330, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/images (1).jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 38, 300, 430));

        GameModes.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -40, -1, -1));

        Cards.add(GameModes, "card4");

        playingwithComputer.setBackground(new java.awt.Color(0, 204, 204));
        playingwithComputer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jbutton1.setBackground(new java.awt.Color(0, 204, 204));
        jbutton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jbutton1.setForeground(new java.awt.Color(0, 204, 204));
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton1ActionPerformed(evt);
            }
        });

        jbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton2ActionPerformed(evt);
            }
        });

        jbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton3ActionPerformed(evt);
            }
        });

        jbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton4ActionPerformed(evt);
            }
        });

        jbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton5ActionPerformed(evt);
            }
        });

        jbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton6ActionPerformed(evt);
            }
        });

        jbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton7ActionPerformed(evt);
            }
        });

        jbutton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton8ActionPerformed(evt);
            }
        });

        jbutton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton9ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

        jLabel12.setBackground(new java.awt.Color(255, 0, 0));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbutton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbutton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbutton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jbutton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        playingwithComputer.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 380, 250));

        ResetButton.setBackground(new java.awt.Color(255, 102, 204));
        ResetButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Reset ");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        playingwithComputer.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 145, -1));

        ExitButton.setBackground(new java.awt.Color(102, 153, 255));
        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/exit.png"))); // NOI18N
        ExitButton.setToolTipText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        playingwithComputer.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, 50));

        RecordingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/record.png"))); // NOI18N
        RecordingButton.setToolTipText("Record");
        RecordingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingButtonActionPerformed(evt);
            }
        });
        playingwithComputer.add(RecordingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 50));

        ViewRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/viewrecords.png"))); // NOI18N
        ViewRecords.setToolTipText("View Records");
        ViewRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecordsActionPerformed(evt);
            }
        });
        playingwithComputer.add(ViewRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 60, 50));

        PlayMusicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/pauseMusic.png"))); // NOI18N
        PlayMusicButton.setToolTipText("Play and Enjoy");
        PlayMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayMusicButtonActionPerformed(evt);
            }
        });
        playingwithComputer.add(PlayMusicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 60, 60));

        Cards.add(playingwithComputer, "card6");

        playingwithfriend.setBackground(new java.awt.Color(0, 204, 204));
        playingwithfriend.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));

        Button10.setBackground(new java.awt.Color(0, 204, 204));
        Button10.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Button10.setForeground(new java.awt.Color(0, 204, 204));
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });

        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });

        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });

        Button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });

        Button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });

        Button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });

        Button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });

        Button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });

        Button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(Button16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(Button13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(Button11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Button13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
        );

        playingwithfriend.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 380, 250));

        ResetButton1.setBackground(new java.awt.Color(255, 102, 204));
        ResetButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResetButton1.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/resetButton.png"))); // NOI18N
        ResetButton1.setToolTipText("Reset");
        ResetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton1ActionPerformed(evt);
            }
        });
        playingwithfriend.add(ResetButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 70, 70));

        ExitButton1.setBackground(new java.awt.Color(102, 153, 255));
        ExitButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExitButton1.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/exit.png"))); // NOI18N
        ExitButton1.setToolTipText("Exit");
        ExitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton1ActionPerformed(evt);
            }
        });
        playingwithfriend.add(ExitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 70, 50));

        RecordingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/record.png"))); // NOI18N
        RecordingButton1.setToolTipText("Record");
        RecordingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingButton1ActionPerformed(evt);
            }
        });
        playingwithfriend.add(RecordingButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 50));

        teamIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/teamicon.png"))); // NOI18N
        teamIcon.setToolTipText("Add Team Info");
        teamIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamIconActionPerformed(evt);
            }
        });
        playingwithfriend.add(teamIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 60, 50));

        ViewRecords1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/viewrecords.png"))); // NOI18N
        ViewRecords1.setToolTipText("View Records");
        ViewRecords1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecords1ActionPerformed(evt);
            }
        });
        playingwithfriend.add(ViewRecords1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 60, 50));

        ShowPlayerTwoName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowPlayerTwoName.setForeground(new java.awt.Color(255, 255, 255));
        ShowPlayerTwoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playingwithfriend.add(ShowPlayerTwoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 130, 50));

        ShowPlayerOneName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowPlayerOneName.setForeground(new java.awt.Color(255, 255, 255));
        ShowPlayerOneName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playingwithfriend.add(ShowPlayerOneName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 50));

        PlayMusicButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xogaming/icons/pauseMusic.png"))); // NOI18N
        PlayMusicButton1.setToolTipText("Play and Enjoy");
        PlayMusicButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayMusicButton1ActionPerformed(evt);
            }
        });
        playingwithfriend.add(PlayMusicButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 60, 60));

        Cards.add(playingwithfriend, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cards, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp1ActionPerformed
        String msg=("Signup"+","+btnUsername.getText()+","+TxtPassword.getText());
         user.sendToServer(msg);
          crd = (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"card4");
         
         
    }//GEN-LAST:event_btnSignUp1ActionPerformed

    private void backfromSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backfromSActionPerformed
    crd = (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"card1");
    }//GEN-LAST:event_backfromSActionPerformed

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordActionPerformed

    private void btnUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsernameActionPerformed

    private void btnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     String msg=("Login"+","+btnUsername.getText()+","+btnPassword.getText());
      user.sendToServer(msg);
       crd = (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"card4");

    }//GEN-LAST:event_btnLoginActionPerformed

    private void backFromLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFromLActionPerformed
        crd = (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"card1");
    }//GEN-LAST:event_backFromLActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
       crd = (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"card 3");
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
       crd = (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"Card 2");
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton1ActionPerformed
      
    }//GEN-LAST:event_jbutton1ActionPerformed

    private void jbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton2ActionPerformed

    }//GEN-LAST:event_jbutton2ActionPerformed

    private void jbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton3ActionPerformed
       
    }//GEN-LAST:event_jbutton3ActionPerformed

    private void jbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton4ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jbutton4ActionPerformed

    private void jbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton5ActionPerformed
       
        //   Button5.setEnabled(false);
    }//GEN-LAST:event_jbutton5ActionPerformed

    private void jbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton6ActionPerformed
       
        // Button6.setEnabled(false);
    }//GEN-LAST:event_jbutton6ActionPerformed

    private void jbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton7ActionPerformed
       
        //  Button7.setEnabled(false);
    }//GEN-LAST:event_jbutton7ActionPerformed

    private void jbutton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton8ActionPerformed
        
    }//GEN-LAST:event_jbutton8ActionPerformed

    private void jbutton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton9ActionPerformed
       
    }//GEN-LAST:event_jbutton9ActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
      
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        crd= (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"card1");
        

    }//GEN-LAST:event_ExitButtonActionPerformed

    private void RecordingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingButtonActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want record?", "Recording Message", dialogButton);
        if(dialogResult == 0) {
            System.out.println("Yes");
        }
    }//GEN-LAST:event_RecordingButtonActionPerformed

    private void ViewRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRecordsActionPerformed
       
       

    }//GEN-LAST:event_ViewRecordsActionPerformed

    private void PlayMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayMusicButtonActionPerformed
       
    }//GEN-LAST:event_PlayMusicButtonActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
      
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed

       
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
      
        //   Button3.setEnabled(false);
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button13ActionPerformed
      
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button14ActionPerformed
      
        //   Button5.setEnabled(false);
    }//GEN-LAST:event_Button14ActionPerformed

    private void Button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15ActionPerformed
       
        // Button6.setEnabled(false);
    }//GEN-LAST:event_Button15ActionPerformed

    private void Button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button16ActionPerformed
       
        //  Button7.setEnabled(false);
    }//GEN-LAST:event_Button16ActionPerformed

    private void Button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button17ActionPerformed
     

         
        //   Button8.setEnabled(false);
    }//GEN-LAST:event_Button17ActionPerformed

    private void Button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button18ActionPerformed
      
    }//GEN-LAST:event_Button18ActionPerformed

    private void ResetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton1ActionPerformed
      
    }//GEN-LAST:event_ResetButton1ActionPerformed

    private void ExitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButton1ActionPerformed

    private void RecordingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingButton1ActionPerformed
      
  
    }//GEN-LAST:event_RecordingButton1ActionPerformed

    private void teamIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamIconActionPerformed
     

    }//GEN-LAST:event_teamIconActionPerformed

    private void ViewRecords1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRecords1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewRecords1ActionPerformed

    private void PlayMusicButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayMusicButton1ActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_PlayMusicButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //  crd = (CardLayout) Cards.getLayout();
//        crd.show(Cards,"card4");

            JFrame p = new PlayingWithComputer();
            p.setVisible(true);
            AllProject.this.setVisible(false);

            p.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    super.windowClosed(e);
                    AllProject.this.setVisible(true);
                }
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//         crd = (CardLayout) Cards.getLayout(); 
//         
//        crd.show(Cards,"card4");
        
        
        try {
            JFrame p = new Player1andPlayer2();
            p.setVisible(true);
            AllProject.this.setVisible(false);

            p.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    super.windowClosed(e);
                    AllProject.this.setVisible(true);
                }
            });
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllProject.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        try {
            JFrame p = new xogaming.Online.PlayingOnlineNew();
            p.setVisible(true);
            AllProject.this.setVisible(false);

            p.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    super.windowClosed(e);
                    AllProject.this.setVisible(true);
                }
            });
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AllProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button13;
    private javax.swing.JButton Button14;
    private javax.swing.JButton Button15;
    private javax.swing.JButton Button16;
    private javax.swing.JButton Button17;
    private javax.swing.JButton Button18;
    private javax.swing.JPanel Cards;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ExitButton1;
    private javax.swing.JPanel GameModes;
    private javax.swing.JPanel Login;
    private javax.swing.JButton PlayMusicButton;
    private javax.swing.JButton PlayMusicButton1;
    private javax.swing.JButton RecordingButton;
    private javax.swing.JButton RecordingButton1;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton ResetButton1;
    public static javax.swing.JLabel ShowPlayerOneName;
    public static javax.swing.JLabel ShowPlayerTwoName;
    private javax.swing.JPanel StartPage;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JButton ViewRecords;
    private javax.swing.JButton ViewRecords1;
    private javax.swing.JButton backFromL;
    private javax.swing.JButton backfromS;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JPasswordField btnPassword;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnSignUp1;
    private javax.swing.JTextField btnUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbutton1;
    private javax.swing.JButton jbutton2;
    private javax.swing.JButton jbutton3;
    private javax.swing.JButton jbutton4;
    private javax.swing.JButton jbutton5;
    private javax.swing.JButton jbutton6;
    private javax.swing.JButton jbutton7;
    private javax.swing.JButton jbutton8;
    private javax.swing.JButton jbutton9;
    private javax.swing.JPanel panelSIgnUP;
    private javax.swing.JPanel playingwithComputer;
    private javax.swing.JPanel playingwithfriend;
    private javax.swing.JButton teamIcon;
    // End of variables declaration//GEN-END:variables
 public void SignUp(){
    JOptionPane.showMessageDialog(this,"Saved data","Congratulations",1);
                crd = (CardLayout) Cards.getLayout();
                crd.show(Cards,"card4");          
               
}
 public void Signin(){
        crd = (CardLayout) Cards.getLayout(); 
        crd.show(Cards,"card1");
        
        
  }
}
