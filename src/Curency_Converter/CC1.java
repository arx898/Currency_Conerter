
package Curency_Converter;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class CC1 extends javax.swing.JFrame {

    String[] currencyUnits = {
"Unit",
"Argentine Peso",
"Australian Dollar",
"Afgan Afgani",
"Armenian Dram",
"Bangladeshi Taka",
"Brazilian Real",
"Bhutan currency",
"Bahraini Dinar",
"Canadian Dollar",
"Cambodian Riel",
"Chinese Yuan",
"Egyptian Pound",
"Ethiopian Birr",
"Indian Rupee",
"Indonesian Rupiah",
"Japanese Yen",
"Jordanian Dinar",
"Kenyan Shilling",
"Kuwaiti Dinar",
"Malaysian Ringgit",
"Mexican Peso",
"Nepalese Rupee",
"Netherlands Antillear Guilder",
"New Zealand Dollar",
"Naigerian Naira",
"Omani Rial",
"Pakistani Rupee",
"Philippine Peso",
"Poland Zloty",
"Qatari Rial",
"Russian Ruble",
"Romanian Leu",
"Saudi Riyal",
"South African Rand",
"Singapore Dollar",
"Sudanese Pound",
"Sri Lankan Rupee",
"South Korean Won",
"Swedish Krona",
"Thai Baht",
"Turkish Lira",
"United State Dollar",
"United Arab Emirates Dirham"
};
    
double Argentine_Peso = 128.34;
double Australian_Dollar = 1.78;
double Afgan_Afgani = 107.29;
double Armenian_Dram = 721.41;
double Bangladeshi_Taka = 116.85;
double Brazilian_Real = 7.77;
double Bhutan_currency = 102.77;
double Bahraini_Dinar = 0.52;
double Canadian_Dollar = 1.73;
double Cambodian_Riel = 5581.37;
double Chinese_Yuan = 9.02;
double Egyptian_Pound = 21.69;
double Ethiopian_Birr = 57.60;
double Indian_Rupee = 103.12;
double Indonesian_Rupiah = 20095.77;
double Japanese_Yen = 150.49;
double Jordanian_Dinar = 0.98;
double Kenyan_Shilling =148.79;
double Kuwaiti_Dinar = 0.42;
double Malaysian_Ringgit = 5.71;
double Mexican_Peso = 27.55;
double Nepalese_Rupee = 163.81;
double Netherlands_Antillear_Guilder = 2.48;
double New_Zealand_Dollar = 1.94;
double Naigerian_Naira = 526.36;
double Omani_Rial = 0.53;
double Pakistani_Rupee = 212.12;
double Philippine_Peso = 66.62;
double Poland_Zloty = 5.24;
double Qatari_Rial = 5.04;
double Russian_Ruble = 104.59;
double Romanian_Leu = 5.69;
double Saudi_Riyal = 5.17;
double South_African_Rand = 19.80;
double Singapore_Dollar = 1.85;
double Sudanese_Pound = 527.75;
double Sri_Lankan_Rupee = 266.11;
double South_Korean_Won = 1544.72;
double Swedish_Krona = 11.67;
double Thai_Baht = 43.15;
double Turkish_Lira = 11.17;
double United_State_Dollar = 1.38;
double United_Arab_Emirates_Dirham = 5.08;
    private int C;
    
    public CC1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Country1 = new javax.swing.JComboBox<>();
        Country2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        CcUnit1 = new javax.swing.JLabel();
        CcUnit2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Georgia", 2, 19)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Currency Converter");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Country1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One.......", "Argentina", "Australia", "Afganistan", "Armenia", "Bangladesh", "Brazil", "Bhutan", "Bahrain", "Canada", "Combodia", "Chine", "Egypt", "Ethiopia", "India", "Indonesia", "Japan", "Jordan", "Kenya", "Kuwait", "Malaysia", "Mexico", "Nepal", "Netherland", "New Zealand", "Naigeria", "Oman", "Pakistan", "Philippine", "Poland", "Qatar", "Russia", "Romania", "Saudi Arab", "South Africa", "Singapur", "Sudan", "Sri Lanka", "South Korea", "Sweden", "ThaiLand", "Turki", "United State America", "United Arab Emirates" }));
        Country1.setToolTipText("Choose your country");
        Country1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Country1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Country1ItemStateChanged(evt);
            }
        });
        Country1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Country1ActionPerformed(evt);
            }
        });

        Country2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One.......", "Argentina", "Australia", "Afganistan", "Armenia", "Bangladesh", "Brazil", "Bhutan", "Bahrain", "Canada", "Combodia", "Chine", "Egypt", "Ethiopia", "India", "Indonesia", "Japan", "Jordan", "Kenya", "Kuwait", "Malaysia", "Mexico", "Nepal", "Netherland", "New Zealand", "Naigeria", "Oman", "Pakistan", "Philippine", "Poland", "Qatar", "Russia", "Romania", "Saudi Arab", "South Africa", "Singapur", "Sudan", "Sri Lanka", "South Korea", "Sweden", "ThaiLand", "Turki", "United State America", "United Arab Emirates" }));
        Country2.setToolTipText("Choose your country");
        Country2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Country2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Country2ItemStateChanged(evt);
            }
        });
        Country2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Country2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("From");

        T1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        T1.setToolTipText("Input Your Amount ");
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        T1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T1KeyTyped(evt);
            }
        });

        CcUnit1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CcUnit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CcUnit1.setText("Unit");
        CcUnit1.setToolTipText("currency Name");

        CcUnit2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CcUnit2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CcUnit2.setText("Unit");
        CcUnit2.setToolTipText("currency Name");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("To");

        T2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        T2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        T2.setToolTipText("Final Amount");
        T2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        T2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T2KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Convert");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(T1)
                            .addComponent(CcUnit1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Country1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Country2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CcUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Country1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Country2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CcUnit1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CcUnit2)))))
                .addGap(76, 76, 76)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(Country1.getSelectedIndex()==0 || Country2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"YOU MUST SELECT THE COUNTRY YOU WANT TO CONVERT ","ERROR Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else if(T1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"YOU MUST ENTER THE AMOUNT","ERROR MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        

        double aTc;
        aTc = Double.parseDouble(T1.getText());

        double aIp = 0.0;
        double ac = 0.0;
        switch(Country1.getSelectedItem().toString()){
            case "Argentina": aIp = aTc/Argentine_Peso;break;
            case "Australia": aIp = aTc/Australian_Dollar;break;
            case "Afganistan": aIp = aTc/Afgan_Afgani;break;
            case "Armenia": aIp = aTc/Armenian_Dram;break;
            case "Bangladesh": aIp = aTc/Bangladeshi_Taka;break;
            case "Brazil": aIp = aTc/Brazilian_Real;break;
            case "Bhutan": aIp = aTc/Bhutan_currency;break;
            case "Bahrain": aIp = aTc/Bahraini_Dinar;break;
            case "Canada": aIp = aTc/Canadian_Dollar;break;
            case "Combodia": aIp = aTc/Cambodian_Riel;break;
            case "Chine": aIp = aTc/Chinese_Yuan;break;
            case "Egypt": aIp = aTc/Egyptian_Pound;break;
            case "Ethiopia": aIp = aTc/Ethiopian_Birr;break;
            case "India": aIp = aTc/Indian_Rupee;break;
            case "Indonesia": aIp = aTc/Indonesian_Rupiah;break;
            case "Japan": aIp = aTc/Japanese_Yen;break;
            case "Jordan": aIp = aTc/Jordanian_Dinar;break;
            case "Kenya": aIp = aTc/Kenyan_Shilling;break;
            case "Kuwait": aIp = aTc/Kuwaiti_Dinar;break;
            case "Malaysia": aIp = aTc/Malaysian_Ringgit;break;
            case "Mexico": aIp = aTc/Mexican_Peso;break;
            case "Nepal": aIp = aTc/Nepalese_Rupee;break;
            case "Netherland": aIp = aTc/Netherlands_Antillear_Guilder;break;
            case "New Zealand": aIp = aTc/New_Zealand_Dollar;break;
            case "Naigeria": aIp = aTc/Naigerian_Naira;break;
            case "Oman": aIp = aTc/Omani_Rial;break;
            case "Pakistan": aIp = aTc/Pakistani_Rupee;break;
            case "Philippine": aIp = aTc/Philippine_Peso;break;
            case "Poland": aIp = aTc/Poland_Zloty;break;
            case "Qatar": aIp = aTc/Qatari_Rial;break;
            case "Russia": aIp = aTc/Russian_Ruble;break;
            case "Romania": aIp = aTc/Romanian_Leu;break;
            case "Saudi Arab": aIp = aTc/Saudi_Riyal;break;
            case "South Africa": aIp = aTc/South_African_Rand;break;
            case "Singapur": aIp = aTc/Singapore_Dollar;break;
            case "Sudan": aIp = aTc/Sudanese_Pound;break;
            case "Sri Lanka": aIp = aTc/Sri_Lankan_Rupee;break;
            case "South Korea": aIp = aTc/South_Korean_Won;break;
            case "Sweden": aIp = aTc/Swedish_Krona;break;
            case "ThaiLand": aIp = aTc/Thai_Baht;break;
            case "Turki": aIp = aTc/Turkish_Lira;break;
            case "United State America": aIp = aTc/United_State_Dollar;break;
            case "United Arab Emirates": aIp = aTc/United_Arab_Emirates_Dirham;break;
            default:aIp = 0.0;
        }
        switch(Country2.getSelectedItem().toString()){
            case "Argentina": ac = aIp*Argentine_Peso;break;
            case "Australia": ac = aIp*Australian_Dollar;break;
            case "Afganistan": ac = aIp*Afgan_Afgani;break;
            case "Armenia": ac = aIp*Armenian_Dram;break;
            case "Bangladesh": ac = aIp*Bangladeshi_Taka;break;
            case "Brazil": ac = aIp*Brazilian_Real;break;
            case "Bhutan": ac = aIp*Bhutan_currency;break;
            case "Bahrain": ac = aIp*Bahraini_Dinar;break;
            case "Canada": ac = aIp*Canadian_Dollar;break;
            case "Combodia": ac = aIp*Cambodian_Riel;break;
            case "Chine": ac = aIp*Chinese_Yuan;break;
            case "Egypt": ac = aIp*Egyptian_Pound;break;
            case "Ethiopia": ac = aIp*Ethiopian_Birr;break;
            case "India": ac = aIp*Indian_Rupee;break;
            case "Indonesia": ac = aIp*Indonesian_Rupiah;break;
            case "Japan": ac = aIp*Japanese_Yen;break;
            case "Jordan": ac = aIp*Jordanian_Dinar;break;
            case "Kenya": ac = aIp*Kenyan_Shilling;break;
            case "Kuwait": ac = aIp*Kuwaiti_Dinar;break;
            case "Malaysia": ac = aIp*Malaysian_Ringgit;break;
            case "Mexico": ac = aIp*Mexican_Peso;break;
            case "Nepal": ac = aIp*Nepalese_Rupee;break;
            case "Netherland": ac = aIp*Netherlands_Antillear_Guilder;break;
            case "New Zealand": ac = aIp*New_Zealand_Dollar;break;
            case "Naigeria": ac = aIp*Naigerian_Naira;break;
            case "Oman": ac = aIp*Omani_Rial;break;
            case "Pakistan": ac = aIp*Pakistani_Rupee;break;
            case "Philippine": ac = aIp*Philippine_Peso;break;
            case "Poland": ac = aIp*Poland_Zloty;break;
            case "Qatar": ac = aIp*Qatari_Rial;break;
            case "Russia": ac = aIp*Russian_Ruble;break;
            case "Romania": ac = aIp*Romanian_Leu;break;
            case "Saudi Arab": ac = aIp*Saudi_Riyal;break;
            case "South Africa": ac = aIp*South_African_Rand;break;
            case "Singapur": ac = aIp*Singapore_Dollar;break;
            case "Sudan": ac = aIp*Sudanese_Pound;break;
            case "Sri Lanka": ac = aIp*Sri_Lankan_Rupee;break;
            case "South Korea": ac = aIp*South_Korean_Won;break;
            case "Sweden": ac = aIp*Swedish_Krona;break;
            case "ThaiLand": ac = aIp*Thai_Baht;break;
            case "Turki": ac = aIp*Turkish_Lira;break;
            case "United State America": ac = aIp*United_State_Dollar;break;
            case "United Arab Emirates": ac = aIp*United_Arab_Emirates_Dirham;break;
            default:ac = aIp*0.0;
        }
        String value;
        value = String.format("%.2f", ac);

        T2.setText(value);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Country1.setSelectedIndex(0);
        Country2.setSelectedIndex(0);

        T1.setText(null);
        T2.setText(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
                     
            
    }//GEN-LAST:event_T2ActionPerformed

    private void T1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T1KeyTyped
        char c = evt.getKeyChar();
        if((Character.isLetter(c) /*|| (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)*/)){
            T1.setEditable(false);
            JOptionPane.showMessageDialog(null,"\t\t\t! 'INPUT NUMBERS ONLY' ! \n***Text or any kind of character are not allowed.","ERROR!",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            T1.setEditable(true);
        }
    }//GEN-LAST:event_T1KeyTyped

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed

    }//GEN-LAST:event_T1ActionPerformed

    private void Country2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Country2ActionPerformed

    }//GEN-LAST:event_Country2ActionPerformed

    private void Country2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Country2ItemStateChanged
        int position = Country2.getSelectedIndex();
        CcUnit2.setText(currencyUnits[position]);
    }//GEN-LAST:event_Country2ItemStateChanged

    private void Country1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Country1ActionPerformed
        
    }//GEN-LAST:event_Country1ActionPerformed

    private void Country1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Country1ItemStateChanged

        int position = Country1.getSelectedIndex();
        CcUnit1.setText(currencyUnits[position]);
    }//GEN-LAST:event_Country1ItemStateChanged

    private void T2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T2KeyTyped
       
    }//GEN-LAST:event_T2KeyTyped

    private void T2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T2KeyPressed
        char c2 = evt.getKeyChar();
        if((Character.isDigit(c2)) || (Character.isLetter(c2))){
            T2.setEditable(false);
        }
        else{
            T2.setEditable(true);
        }
    }//GEN-LAST:event_T2KeyPressed
    
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
            java.util.logging.Logger.getLogger(CC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CC1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CcUnit1;
    private javax.swing.JLabel CcUnit2;
    private javax.swing.JComboBox<String> Country1;
    private javax.swing.JComboBox<String> Country2;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
