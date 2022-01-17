package Joen;

import java.text.DecimalFormat;


public class GUI extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	
	public GUI() {
        initComponents();
    }

    private void initComponents() {

        PetShop = new javax.swing.JLabel();
        DogServices = new javax.swing.JLabel();
        DogBreed = new javax.swing.JRadioButton();
        DogVet = new javax.swing.JRadioButton();
        DogGroom = new javax.swing.JRadioButton();
        DogSection = new javax.swing.JLabel();
        DogFood = new javax.swing.JRadioButton();
        DogBowl = new javax.swing.JRadioButton();
        DogFetch = new javax.swing.JRadioButton();
        DogProduct = new javax.swing.JLabel();
        DogSizeBig = new javax.swing.JRadioButton();
        DogSizeMedium = new javax.swing.JRadioButton();
        DogSizeSmall = new javax.swing.JRadioButton();
        DogSize = new javax.swing.JLabel();
        CatSize = new javax.swing.JLabel();
        CatBreed = new javax.swing.JRadioButton();
        CatVet = new javax.swing.JRadioButton();
        CatGroom = new javax.swing.JRadioButton();
        CatSection = new javax.swing.JLabel();
        CatFood = new javax.swing.JRadioButton();
        CatBowl = new javax.swing.JRadioButton();
        CatToy = new javax.swing.JRadioButton();
        CatServices = new javax.swing.JLabel();
        CatProduct = new javax.swing.JLabel();
        CatSizeDefault = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubtotalButton = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaxButton = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TotalDisplayBox = new javax.swing.JTextPane();
        SubtotalLabel = new javax.swing.JLabel();
        TaxLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        CalculateButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PetShop.setFont(new java.awt.Font("Lao MN", 1, 18)); 
        PetShop.setText("Pet Shop");

        DogServices.setFont(new java.awt.Font("Lao MN", 1, 15)); 
        DogServices.setText("Dog Services");

        DogBreed.setText("Breeding RM50.00");
        DogBreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogBreedActionPerformed(evt);
            }
        });

        DogVet.setText("Veterinary RM30.00");
        DogVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogVetActionPerformed(evt);
            }
        });

        DogGroom.setText("Grooming RM10.00");
        DogGroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogGroomActionPerformed(evt);
            }
        });

        DogSection.setFont(new java.awt.Font("Lao MN", 1, 18)); 
        DogSection.setText("Dog Section");

        DogFood.setText("Food RM15.00");
        DogFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogFoodActionPerformed(evt);
            }
        });

        DogBowl.setText("Bowl RM20.00");
        DogBowl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogBowlActionPerformed(evt);
            }
        });

        DogFetch.setText("Fetch RM10.00");
        DogFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogFetchActionPerformed(evt);
            }
        });

        DogProduct.setFont(new java.awt.Font("Lao MN", 1, 15)); 
        DogProduct.setText("Dog Product");

        DogSizeBig.setText("Big");
        DogSizeBig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogSizeBigActionPerformed(evt);
            }
        });

        DogSizeMedium.setText("Medium");
        DogSizeMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogSizeMediumActionPerformed(evt);
            }
        });

        DogSizeSmall.setText("Small");
        DogSizeSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogSizeSmallActionPerformed(evt);
            }
        });

        DogSize.setFont(new java.awt.Font("Lao MN", 1, 15)); 
        DogSize.setText("Dog Size");

        CatSize.setFont(new java.awt.Font("Lao MN", 1, 15)); 
        CatSize.setText("Cat Size");

        CatBreed.setText("Breeding RM50.00");
        CatBreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatBreedActionPerformed(evt);
            }
        });

        CatVet.setText("Veterinary RM30.00");
        CatVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatVetActionPerformed(evt);
            }
        });

        CatGroom.setText("Grooming RM10.00");
        CatGroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatGroomActionPerformed(evt);
            }
        });

        CatSection.setFont(new java.awt.Font("Lao MN", 1, 18)); // NOI18N
        CatSection.setText("Cat Section");

        CatFood.setText("Food RM15.00");
        CatFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatFoodActionPerformed(evt);
            }
        });

        CatBowl.setText("Bowl RM20.00");
        CatBowl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatBowlActionPerformed(evt);
            }
        });

        CatToy.setText("Toy RM10.00");
        CatToy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatToyActionPerformed(evt);
            }
        });

        CatServices.setFont(new java.awt.Font("Lao MN", 1, 15)); // NOI18N
        CatServices.setText("Cat Services");

        CatProduct.setFont(new java.awt.Font("Lao MN", 1, 15)); // NOI18N
        CatProduct.setText("Cat Product");

        CatSizeDefault.setText("Default");
        CatSizeDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatSizeDefaultActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(SubtotalButton);

        jScrollPane2.setViewportView(TaxButton);

        jScrollPane3.setViewportView(TotalDisplayBox);

        SubtotalLabel.setText("Subtotal");

        TaxLabel.setText("Tax");

        TotalLabel.setText("Total");

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(PetShop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DogSection, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DogSizeSmall)
                                            .addComponent(DogSizeMedium)
                                            .addComponent(DogSizeBig)
                                            .addComponent(DogSize, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CatSize, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CatSizeDefault))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(DogServices, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DogGroom)
                                                        .addComponent(DogVet)
                                                        .addComponent(DogBreed))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CatBreed)
                                                    .addComponent(CatVet)
                                                    .addComponent(CatGroom))))
                                        .addGap(55, 55, 55)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DogFetch)
                                    .addComponent(DogBowl)
                                    .addComponent(DogFood)
                                    .addComponent(DogProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CatFood)
                                            .addComponent(CatBowl)
                                            .addComponent(CatToy)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CatSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CatServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addComponent(CatProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SubtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(TaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ClearButton)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExitButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CalculateButton)
                            .addComponent(TotalLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PetShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DogSection, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(DogProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DogFood)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DogBowl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DogFetch))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(DogServices, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DogBreed)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DogVet)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DogGroom)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DogSize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DogSizeBig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DogSizeMedium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DogSizeSmall)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CatSection, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CatProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CatServices, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CatFood)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CatBowl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CatToy))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(CatBreed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CatVet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CatGroom))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(CatSize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CatSizeDefault)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(SubtotalLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(TaxLabel))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearButton)
                            .addComponent(ExitButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CalculateButton)
                        .addGap(22, 22, 22)
                        .addComponent(TotalLabel)))
                .addGap(36, 36, 36))
        );

        pack();
    }
    
    private double subtotal=0.00;
    DecimalFormat df = new DecimalFormat("0.00");
    Service s = new Service(10, 30, 50);
    Dogg d1 = new Dogg(s,15,20,10,10);
    Catt c1 = new Catt(s,15,20,10,10);
    
    private void DogBreedActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==DogBreed) {
    		if (DogBreed.isSelected()) {
    			subtotal = subtotal + d1.getBreed();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - d1.getBreed();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }
    
    private void DogVetActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==DogVet) {
    		if (DogVet.isSelected()) {
    			subtotal = subtotal + d1.getVet();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - d1.getVet();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void DogGroomActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==DogGroom) {
    		if (DogBreed.isSelected()) {
    			subtotal = subtotal + d1.getGroom();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - d1.getGroom();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void DogFoodActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==DogFood) {
    		if (DogFood.isSelected()) {
    			subtotal = subtotal + d1.getFood();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - d1.getFood();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }
    
    private void DogBowlActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==DogBowl) {
    		if (DogBreed.isSelected()) {
    			subtotal = subtotal + d1.getBowl();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - d1.getBowl();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void DogFetchActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==DogFetch) {
    		if (DogFetch.isSelected()) {
    			subtotal = subtotal + d1.getFetch();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - d1.getFetch();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void DogSizeBigActionPerformed(java.awt.event.ActionEvent evt) {
        if (DogSizeBig.isSelected())
            DogSizeMedium.setSelected(false);
            DogSizeSmall.setSelected(false);
    }
    
    private void DogSizeMediumActionPerformed(java.awt.event.ActionEvent evt) {
        if (DogSizeMedium.isSelected())
            DogSizeBig.setSelected(false);
            DogSizeSmall.setSelected(false);
    }

    private void DogSizeSmallActionPerformed(java.awt.event.ActionEvent evt) {
        if (DogSizeSmall.isSelected())
            DogSizeMedium.setSelected(false);
            DogSizeBig.setSelected(false);  
    }

    private void CatBreedActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==CatBreed) {
    		if (CatBreed.isSelected()) {
    			subtotal = subtotal + c1.getBreed();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - c1.getBreed();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void CatVetActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==CatVet) {
    		if (CatVet.isSelected()) {
    			subtotal = subtotal + c1.getVet();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - c1.getVet();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }
    
    private void CatGroomActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==CatGroom) {
    		if (CatGroom.isSelected()) {
    			subtotal = subtotal + c1.getGroom();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - c1.getGroom();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void CatFoodActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==CatFood) {
    		if (CatFood.isSelected()) {
    			subtotal = subtotal + c1.getFood();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - c1.getFood();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }
    
    private void CatBowlActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==CatBowl) {
    		if (CatBowl.isSelected()) {
    			subtotal = subtotal + c1.getBowl();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - c1.getBowl();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void CatToyActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==CatToy) {
    		if (CatToy.isSelected()) {
    			subtotal = subtotal + c1.getToy();
    			SubtotalButton.setText(Double.toString(subtotal));
    	        SubtotalButton.setText(df.format(subtotal));
    		}
    		else {
    			subtotal = subtotal - c1.getToy();
    			SubtotalButton.setText(Double.toString(subtotal));
    		}
    	}
    }

    private void CatSizeDefaultActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double total, tax;
        final double TAXRATE = .06;

        SubtotalButton.setText(Double.toString(subtotal));
        SubtotalButton.setText(df.format(subtotal));
        
        subtotal = Double.parseDouble(SubtotalButton.getText());
        tax = subtotal * TAXRATE;
        total = subtotal + tax;
       
        TaxButton.setText(Double.toString(tax));
        TotalDisplayBox.setText(Double.toString(total));
        
        TaxButton.setText(df.format(tax));
        TotalDisplayBox.setText(df.format(total));
    }
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DogSizeBig.setSelected(false);
        DogSizeMedium.setSelected(false);
        DogSizeSmall.setSelected(false);
        
        DogBreed.setSelected(false);
        DogVet.setSelected(false);
        DogGroom.setSelected(false);
        
        DogFood.setSelected(false);
        DogFetch.setSelected(false);
        DogBowl.setSelected(false);
        
        CatSizeDefault.setSelected(false);
        
        CatBreed.setSelected(false);
        CatVet.setSelected(false);
        CatGroom.setSelected(false);
        
        CatFood.setSelected(false);
        CatToy.setSelected(false);
        CatBowl.setSelected(false);
        
        SubtotalButton.setText("");
        TotalDisplayBox.setText("");
        TaxButton.setText("");
    }

    private javax.swing.JButton CalculateButton;
    private javax.swing.JRadioButton CatBowl;
    private javax.swing.JRadioButton CatBreed;
    private javax.swing.JRadioButton CatFood;
    private javax.swing.JRadioButton CatGroom;
    private javax.swing.JLabel CatProduct;
    private javax.swing.JLabel CatSection;
    private javax.swing.JLabel CatServices;
    private javax.swing.JLabel CatSize;
    private javax.swing.JRadioButton CatSizeDefault;
    private javax.swing.JRadioButton CatToy;
    private javax.swing.JRadioButton CatVet;
    private javax.swing.JButton ClearButton;
    private javax.swing.JRadioButton DogBowl;
    private javax.swing.JRadioButton DogBreed;
    private javax.swing.JRadioButton DogFetch;
    private javax.swing.JRadioButton DogFood;
    private javax.swing.JRadioButton DogGroom;
    private javax.swing.JLabel DogProduct;
    private javax.swing.JLabel DogSection;
    private javax.swing.JLabel DogServices;
    private javax.swing.JLabel DogSize;
    private javax.swing.JRadioButton DogSizeBig;
    private javax.swing.JRadioButton DogSizeMedium;
    private javax.swing.JRadioButton DogSizeSmall;
    private javax.swing.JRadioButton DogVet;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel PetShop;
    private javax.swing.JTextPane SubtotalButton;
    private javax.swing.JLabel SubtotalLabel;
    private javax.swing.JTextPane TaxButton;
    private javax.swing.JLabel TaxLabel;
    private javax.swing.JTextPane TotalDisplayBox;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
}