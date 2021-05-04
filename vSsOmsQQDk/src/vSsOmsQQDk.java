
import java.util.ArrayList;
import java.util.Collections;

public class vSsOmsQQDk extends javax.swing.JFrame {

    ArrayList<Integer> mainList = new ArrayList<>();
    ArrayList<Double> sinifAltArr = new ArrayList<>();
    ArrayList<Double> sinifUstArr = new ArrayList<>();
    ArrayList<Double> sinifFrekansArr = new ArrayList<>();
    ArrayList<Double> limitAltArr = new ArrayList<>();
    ArrayList<Double> limitUstArr = new ArrayList<>();

    public vSsOmsQQDk() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Varyans - Standart Sapma - Ortalama Mutlak Sapma - Q1 - Q3");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ekle = new javax.swing.JButton();
        hesapla = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sayiAdedi = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        veri = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        sinifFrekansı13 = new javax.swing.JLabel();
        sinifFrekansı14 = new javax.swing.JLabel();
        sinifFrekansı1 = new javax.swing.JLabel();
        sinifFrekansı = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        sinirAlt = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        sinirUst = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sinifFrekansi = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        varyansText = new javax.swing.JTextField();
        omsText = new javax.swing.JTextField();
        q1Text = new javax.swing.JTextField();
        q3Text = new javax.swing.JTextField();
        ssText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        ekle.setBackground(new java.awt.Color(255, 153, 0));
        ekle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ekle.setForeground(new java.awt.Color(0, 0, 255));
        ekle.setText("Ekle");
        ekle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        hesapla.setBackground(new java.awt.Color(0, 0, 255));
        hesapla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hesapla.setForeground(new java.awt.Color(255, 153, 0));
        hesapla.setText("Hesapla");
        hesapla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("n          :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Veri      :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sınıf Sınırları");

        sinifFrekansı13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sinifFrekansı13.setForeground(new java.awt.Color(255, 255, 255));
        sinifFrekansı13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinifFrekansı13.setText("Alt");

        sinifFrekansı14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sinifFrekansı14.setForeground(new java.awt.Color(255, 255, 255));
        sinifFrekansı14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinifFrekansı14.setText("Üst");

        sinifFrekansı1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sinifFrekansı1.setForeground(new java.awt.Color(255, 255, 255));
        sinifFrekansı1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinifFrekansı1.setText("Sınıf");

        sinifFrekansı.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sinifFrekansı.setForeground(new java.awt.Color(255, 255, 255));
        sinifFrekansı.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinifFrekansı.setText("Frekansı");

        sinirAlt.setColumns(20);
        sinirAlt.setRows(5);
        sinirAlt.setFocusable(false);
        jScrollPane4.setViewportView(sinirAlt);

        sinirUst.setColumns(20);
        sinirUst.setRows(5);
        sinirUst.setFocusable(false);
        jScrollPane5.setViewportView(sinirUst);

        sinifFrekansi.setColumns(20);
        sinifFrekansi.setRows(5);
        sinifFrekansi.setFocusable(false);
        jScrollPane2.setViewportView(sinifFrekansi);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Varyans :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Standart S. :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("OMS :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Q1 :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Q3 :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hesapla, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sayiAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(veri, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sinifFrekansı13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sinifFrekansı14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinifFrekansı, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addGap(298, 298, 298))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(q3Text)
                                            .addComponent(q1Text)
                                            .addComponent(omsText)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(16, 16, 16)
                                        .addComponent(varyansText))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ssText))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sinifFrekansı1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(veri, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sayiAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45)
                        .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(hesapla, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sinifFrekansı1)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sinifFrekansı13)
                            .addComponent(sinifFrekansı14)
                            .addComponent(sinifFrekansı))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(varyansText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ssText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(omsText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(q1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
        int alinanVeri = (int) veri.getValue();
        mainList.add(alinanVeri);
    }//GEN-LAST:event_ekleActionPerformed

    private void hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaActionPerformed
        int n = (Integer) sayiAdedi.getValue();

        //ortalama
        double sum = 0;
        for (int i = 0; i < mainList.size(); i++) {
            sum += mainList.get(i);
        }
        double ort = sum / mainList.size();
        System.out.println("Ortalama " + ort);

        //varyans
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += (mainList.get(i) - ort) * (mainList.get(i) - ort);
        }
        double varyans = total / (n - 1);
        System.out.println("Varyans " + varyans);

        //standart sapma
        double standartSapma = Math.sqrt(varyans);
        System.out.println("standart sapma " + standartSapma);

        //ortalama mutlak sapma
        total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.abs(mainList.get(i) - ort);
        }
        double oms = total / n;
        System.out.println("oms " + oms);

        //Değişim (varyasyon) Katsayısı Hesaplama
        double dk = standartSapma / ort;
        System.out.println("değişim katsayısı " + dk);

        // Q1 Q3 HESAPLAMA
        /*
            Q1 = L1 + J1*h / Fq1   -------  J1= n/4 - n1
            Q3 = L3 + J3*h / Fq1   -------  J3= 3n/4 - n3

            h -> sınıf genişliği    
        
            Q1 -> alt çeyrek  
            L1 -> ilk dörtte birliğin bulunduğu sınıfın alt sınıf sınırı
            n1 -> ilk dörtte birliğin bulunduğu sınıftan önceki sınıfların total frekansı
            Fq1 ->  ilk dörtte birliğin bulunduğu sınıfın frekansı    
         */
        Collections.sort(mainList);

        double L = mainList.get(mainList.size() - 1);
        double S = mainList.get(0);
        double R = L - S;
        double k = (int) Math.ceil(Math.sqrt(n));
        double h = (int) Math.ceil(R / k);

        //alt limit dizisini doldurma
        for (int i = 0; i < k; i++) {
            limitAltArr.add(mainList.get(0) + (i * h));
        }

        // üst limit dizisini doldurma
        for (int i = 0; i < k; i++) {
            limitUstArr.add(limitAltArr.get(1) - 1 + (i * h));
        }

        // alt sınıf dizisini doldurma
        for (int i = 0; i < k; i++) {
            sinifAltArr.add(mainList.get(0) + (i * h) - 0.5);
        }

        //üst sınıf dizisini doldurma
        for (int i = 0; i < k; i++) {
            sinifUstArr.add(limitUstArr.get(0) + 0.5 + (i * h));
        }

        //sinif frekans dizisini doldurma
        double rep;
        for (int i = 0; i < k; i++) {
            rep = 0;
            for (int j = 0; j < n; j++) {
                if (mainList.get(j) >= sinifAltArr.get(i) && mainList.get(j) <= sinifUstArr.get(i)) {
                    rep++;
                }
            }
            sinifFrekansArr.add(rep);
        }

        for (int i = 0; i < k; i++) {
            sinirAlt.append(sinifAltArr.get(i) + "\n");
            sinirUst.append(sinifUstArr.get(i) + "\n");
            sinifFrekansi.append(sinifFrekansArr.get(i) + "\n");
        }

        // Q1 tespiti
        double nBolu4 = n / 4.0;
        double value = 0;
        rep = 0;
        for (int i = 0; i < k; i++) {
            value += sinifFrekansArr.get(i);
            if (nBolu4 >= value) {
                rep++;
            }
        }
        System.out.println("q1 rep " + rep);

        value = 0;
        double fq1 = sinifFrekansArr.get((int) rep);
        for (int i = 0; i < rep; i++) {
            value += sinifFrekansArr.get(i);
        }
        double n1 = value;
        System.out.println("n1 " + n1);
        double j1 = nBolu4 - n1;
        System.out.println("j1 " + j1);
        double L1 = sinifAltArr.get((int) rep);
        System.out.println("L1 " + L1);
        double q1 = L1 + ((j1 * h) / fq1);
        System.out.println("q1 " + q1);

        //Q3 tespiti
        double ucNBolu4 = 3 * nBolu4;
        value = 0;
        rep = 0;
        for (int i = 0; i < k; i++) {
            value += sinifFrekansArr.get(i);
            if (ucNBolu4 >= value) {
                rep++;
            }
        }
        System.out.println("q3 rep " + rep);
        value = 0;
        double fq3 = sinifFrekansArr.get((int) rep);
        System.out.println("fq3 " + fq3);
        for (int i = 0; i < rep; i++) {
            value += sinifFrekansArr.get(i);
        }
        double n3 = value;
        System.out.println("n3 " + n3);
        double j3 = ucNBolu4 - n3;
        System.out.println("j3 " + j3);
        double L3 = sinifAltArr.get((int) rep);
        System.out.println("L3 " + L3);
        double q3 = L3 + ((j3 * h) / fq3);
        System.out.println("q3 " + q3);

        varyansText.setText(varyans + "");
        ssText.setText(standartSapma + "");
        omsText.setText(oms + "");
        q1Text.setText(q1 + "");
        q3Text.setText(q3 + "");

    }//GEN-LAST:event_hesaplaActionPerformed

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
            java.util.logging.Logger.getLogger(vSsOmsQQDk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vSsOmsQQDk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vSsOmsQQDk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vSsOmsQQDk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vSsOmsQQDk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekle;
    private javax.swing.JButton hesapla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField omsText;
    private javax.swing.JTextField q1Text;
    private javax.swing.JTextField q3Text;
    private javax.swing.JSpinner sayiAdedi;
    private javax.swing.JTextArea sinifFrekansi;
    private javax.swing.JLabel sinifFrekansı;
    private javax.swing.JLabel sinifFrekansı1;
    private javax.swing.JLabel sinifFrekansı13;
    private javax.swing.JLabel sinifFrekansı14;
    private javax.swing.JTextArea sinirAlt;
    private javax.swing.JTextArea sinirUst;
    private javax.swing.JTextField ssText;
    private javax.swing.JTextField varyansText;
    private javax.swing.JSpinner veri;
    // End of variables declaration//GEN-END:variables
}