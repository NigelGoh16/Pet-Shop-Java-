package Joen;


public class CheckIn extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public CheckIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")   
    private void initComponents() {

        HappyPawsTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PasswordBox = new javax.swing.JPasswordField();
        UserLoginText = new javax.swing.JLabel();
        UsernameText = new javax.swing.JLabel();
        PasswordText = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Address = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        EnterButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        UserNameBox = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HappyPawsTitle.setFont(new java.awt.Font("SignPainter", 1, 36)); // NOI18N
        HappyPawsTitle.setText("Happy Paws Pet Shop");

        PasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBoxActionPerformed(evt);
            }
        });

        UserLoginText.setFont(new java.awt.Font("Lao MN", 1, 14)); // NOI18N
        UserLoginText.setText("User Login");

        UsernameText.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        UsernameText.setText("Username: ");

        PasswordText.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        PasswordText.setText("Password:");

        Address.setFont(new java.awt.Font("Khmer MN", 1, 14)); // NOI18N
        Address.setText("Address: Lot 5-1, Sunnyside Road 10, Labuan, Malaysia. ");

        Phone.setFont(new java.awt.Font("Lao MN", 1, 12)); // NOI18N
        Phone.setText("Phone: 012-3456789");

        EnterButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        UserNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(UsernameText)
                                        .addComponent(PasswordText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EnterButton)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(ResetButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PasswordBox, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(UserNameBox)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(201, 201, 201)
                                    .addComponent(UserLoginText))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(Address))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(HappyPawsTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(Phone)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(HappyPawsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Address)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Phone)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserLoginText)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsernameText)
                            .addComponent(UserNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordText))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterButton)
                    .addComponent(ResetButton))
                .addGap(73, 73, 73))
        );

        pack();
    }              

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	new GUI().setVisible(true);
    }                                           

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        UserNameBox.setText("");
        PasswordBox.setText("");
    }                                           

    private void UserNameBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void PasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           
                    
    private javax.swing.JLabel Address;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel HappyPawsTitle;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JLabel Phone;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel UserLoginText;
    private javax.swing.JFormattedTextField UserNameBox;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;                  
}