 
package prolab2;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ekran  implements ActionListener{
              JFrame pencere =new JFrame();
              JLabel label1 = new JLabel();
              JPanel panel1 =new JPanel();
              
             Pikachu pikachu1 = new Pikachu("Pikachu","Elektrik");
             Pokemon pikachu2 = new Pikachu();
             Bulbasaur bulbasaur1 = new Bulbasaur("Bulbasaur","Çim");
             Charmander charmander1 = new Charmander("Charmander","Ateş");
             Squirtle squirtle1 = new Squirtle("Squirtle","Su");
             Zubat zubat1= new Zubat("Zubat","Hava");
             Psyduck pysduck1 = new Psyduck("Pysduck","Su");
             Snorlax snorlax1 = new Snorlax("Snorlax","Normal");
             Butterfree butterfree1 = new Butterfree("Butterfree","Hava");
             Jigglypuff jigglypuff1 = new Jigglypuff("Jigglypuff","Ses");
             Meowth meowth1 = new Meowth("Meowth","Normal");
        
             ArrayList<Pokemon> deste = new ArrayList<>();

             Bilgisayar bilg1 =new Bilgisayar(15,"bilgi",0);
             Kullanici kul1 = new Kullanici(14,"erdem",0);

             Random random = new Random();
             int n;
             
             JButton buton1 = new JButton();
             JButton buton2 = new JButton();
             JButton bbuton1 = new JButton();JButton kbuton1 = new JButton();
             JButton bbuton2 = new JButton();JButton kbuton2 = new JButton();
             JButton bbuton3 = new JButton();JButton kbuton3 = new JButton();
             JButton bbuton4 = new JButton();JButton kbuton4 = new JButton();
             JButton bbuton5 = new JButton();JButton kbuton5 = new JButton();
             JButton bbuton6 = new JButton();JButton kbuton6 = new JButton();
             JButton bbuton7 = new JButton();JButton kbuton7 = new JButton();
             JButton bbuton8 = new JButton();JButton kbuton8 = new JButton();
             JButton bbuton9 = new JButton();JButton kbuton9 = new JButton();
             JButton bbuton10 = new JButton();JButton kbuton10 = new JButton();
             JButton oyuncualani = new JButton(); JButton bilgalani = new JButton();
             JButton cizgi1 = new JButton(); JButton cizgi2 = new JButton(); 
             JButton d1 = new JButton(); JButton d2 = new JButton(); 
             JButton randbuton= new JButton();
             JTextField oyuncutext = new JTextField();
             JTextField bilgisayartext =new JTextField();
             
             int opuan=0;
             int bpuan=0;
             Pokemon bilgsecimi;
             Pokemon bilg2secimi;
             
    public Ekran(){
         pencere.setDefaultCloseOperation(EXIT_ON_CLOSE);
         pencere.setTitle("POKEMON");
         pencere.setResizable(false);
         pencere.setVisible(true);
         pencere.setSize(851, 511);
         pencere.add(label1);
         label1.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\sam-56-1.jpg")); 
        
         
        
         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel1);
         panel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
         .addContainerGap()
         .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, Short.MAX_VALUE)
         .addGap(978, 978, 978)));
         jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
         pencere.getContentPane().add(panel1);
         panel1.setBounds(0, 0, 850, 510);
              
          deste.add(meowth1);
          deste.add(jigglypuff1);
          deste.add(butterfree1);
          deste.add(snorlax1);
          deste.add(pysduck1);
          deste.add(zubat1);
          deste.add(squirtle1);
          deste.add(charmander1);
          deste.add(bulbasaur1);
          deste.add(pikachu1);
          
           for(int i=0; i<3 ;i++){
              n=random.nextInt(10-i);
              bilg1.setkartlistesi(deste.get(n));
              deste.remove(n);
          }
          
          for(int i=0; i<3 ;i++){
              n=random.nextInt(7-i);
              kul1.setkartlistesi(deste.get(n));
              deste.remove(n);
          }
          
          
        buton1.setBackground(new java.awt.Color(255, 153, 51));
        buton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        buton1.setForeground(new java.awt.Color(0, 255, 0));
        buton1.setText("*  Bilgisayar VS Oyuncu  *");
        buton1.addActionListener(new java.awt.event.ActionListener() {
          
         
         
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton1ActionPerformed(evt);
            }

             private void buton1ActionPerformed(ActionEvent evt) { ///////////buton 1 e basarsa *****************
                 d1.setVisible(true);
                 d2.setVisible(true);
                 buton1.setVisible(false);
                 buton2.setVisible(false);
                 cizgi1.setVisible(true);
                  cizgi2.setVisible(true);
                 oyuncutext.setVisible(true);
                 bilgisayartext.setVisible(true);
                 int b=0;
                while(b<3){
                    
                 if(bilg1.getkartlistesi(b)==bulbasaur1){
                     bbuton8.setVisible(true);
                 }
                 if(bilg1.getkartlistesi(b)==charmander1 ){
                     bbuton10.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==squirtle1 ){
                     bbuton3.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==zubat1 ){
                     bbuton9.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==pysduck1 ){
                     bbuton1.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==snorlax1 ){
                     bbuton7.setVisible(true);
                 }
                 if(bilg1.getkartlistesi(b)==butterfree1 ){
                     bbuton6.setVisible(true);
                 }
                  if(bilg1.getkartlistesi(b)==jigglypuff1 ){
                     bbuton2.setVisible(true);
                 }
                   if(bilg1.getkartlistesi(b)==meowth1 ){
                     bbuton4.setVisible(true);
                 }
                   if(bilg1.getkartlistesi(b)==pikachu1 ){
                     bbuton5 .setVisible(true);
                 }
                   
                 b++;
                }
                 int a=0;
                while(a<3){
                    
                 if(kul1.getkartlistesi(a)==bulbasaur1){
                     kbuton8.setVisible(true);
                 }
                 if(kul1.getkartlistesi(a)==charmander1 ){
                     kbuton10.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==squirtle1 ){
                     kbuton3.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==zubat1 ){
                     kbuton9.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==pysduck1 ){
                     kbuton1.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==snorlax1 ){
                     kbuton7.setVisible(true);
                 }
                 if(kul1.getkartlistesi(a)==butterfree1 ){
                     kbuton6.setVisible(true);
                 }
                  if(kul1.getkartlistesi(a)==jigglypuff1 ){
                     kbuton2.setVisible(true);
                 }
                   if(kul1.getkartlistesi(a)==meowth1 ){
                     kbuton4.setVisible(true);
                 }
                   if(kul1.getkartlistesi(a)==pikachu1 ){
                     kbuton5 .setVisible(true);
                 }
                   
                 a++;
                }
             }
        });
       label1.add(buton1);
        buton1.setBounds(230, 113, 360, 130);

        buton2.setBackground(new java.awt.Color(255, 153, 0));
        buton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        buton2.setForeground(new java.awt.Color(51, 255, 0));
        buton2.setText("*  Bilgisayar VS Bilgisayar  *");
        buton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }

             private void jButton2ActionPerformed(ActionEvent evt) {
                 d1.setText("Bilgisayar V2'nin Destesi");
                 d1.setVisible(true);
                 d2.setVisible(true);
                  buton1.setVisible(false);
                  buton2.setVisible(false);
                  cizgi1.setVisible(true);
                  cizgi2.setVisible(true);
                  oyuncutext.setVisible(true);
                  oyuncutext.setText("Bilgisayar.v2 Puanı="+opuan);
                  bilgisayartext.setVisible(true);
                  randbuton.setVisible(true);
                   int b=0;
                while(b<3){
                    
                 if(bilg1.getkartlistesi(b)==bulbasaur1){
                     bbuton8.setVisible(true);
                 }
                 if(bilg1.getkartlistesi(b)==charmander1 ){
                     bbuton10.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==squirtle1 ){
                     bbuton3.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==zubat1 ){
                     bbuton9.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==pysduck1 ){
                     bbuton1.setVisible(true);
                 }
                if(bilg1.getkartlistesi(b)==snorlax1 ){
                     bbuton7.setVisible(true);
                 }
                 if(bilg1.getkartlistesi(b)==butterfree1 ){
                     bbuton6.setVisible(true);
                 }
                  if(bilg1.getkartlistesi(b)==jigglypuff1 ){
                     bbuton2.setVisible(true);
                 }
                   if(bilg1.getkartlistesi(b)==meowth1 ){
                     bbuton4.setVisible(true);
                 }
                   if(bilg1.getkartlistesi(b)==pikachu1 ){
                     bbuton5 .setVisible(true);
                 }
                   
                 b++;
                }
                   int a=0;
                while(a<3){
                    
                 if(kul1.getkartlistesi(a)==bulbasaur1){
                     kbuton8.setVisible(true);
                 }
                 if(kul1.getkartlistesi(a)==charmander1 ){
                     kbuton10.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==squirtle1 ){
                     kbuton3.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==zubat1 ){
                     kbuton9.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==pysduck1 ){
                     kbuton1.setVisible(true);
                 }
                if(kul1.getkartlistesi(a)==snorlax1 ){
                     kbuton7.setVisible(true);
                 }
                 if(kul1.getkartlistesi(a)==butterfree1 ){
                     kbuton6.setVisible(true);
                 }
                  if(kul1.getkartlistesi(a)==jigglypuff1 ){
                     kbuton2.setVisible(true);
                 }
                   if(kul1.getkartlistesi(a)==meowth1 ){
                     kbuton4.setVisible(true);
                 }
                   if(kul1.getkartlistesi(a)==pikachu1 ){
                     kbuton5 .setVisible(true);
                 }
                   
                 a++;
                }
             }
        });
          label1.add(buton2);
          buton2.setBounds(230, 260, 360, 120);
          
          
        kbuton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png")); // NOI18N
        kbuton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton1ActionPerformed(evt);
            }

             private void kbuton1ActionPerformed(ActionEvent evt) {//**************************************************************
               if(pysduck1.kartKullanildiMi==false){
                   
                 kbuton1.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(pysduck1);
                pysduck1.kartKullanildiMi=true;
                
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
                bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>pysduck1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<pysduck1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
              if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
              }
                  if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }
                  if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }
                  if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }
                   if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }
                    if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }
                   if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }
                    if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  } if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  } if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                 
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
               } }  
        });                    
        label1.add(kbuton1);
        kbuton1.setBounds(30, 390, 70, 95);
        kbuton1.setVisible(false);
        
        
        kbuton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png")); // NOI18N
        kbuton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton2ActionPerformed(evt);
            }

             private void kbuton2ActionPerformed(ActionEvent evt) { //**************************************************************************************************
                if(jigglypuff1.kartKullanildiMi==false){
                    
               
                 kbuton2.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(jigglypuff1);
                 jigglypuff1.kartKullanildiMi=true;
                 
                 
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ////////////ifler değisir 
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>jigglypuff1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<jigglypuff1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////değismez
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////           
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                  
                  
                  
                } }
        });
        label1.add(kbuton2);
        kbuton2.setBounds(110, 390, 70, 95);
        kbuton2.setVisible(false);
        
        kbuton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png")); // NOI18N
        kbuton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton3ActionPerformed(evt);
            }

             private void kbuton3ActionPerformed(ActionEvent evt) {//*******************************************************************************
                
                 if(squirtle1.kartKullanildiMi==false){
                     
                 
                  kbuton3.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(squirtle1);
                  squirtle1.kartKullanildiMi=true;
                
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ////////////ifler değisir 
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>squirtle1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<squirtle1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////değismez
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 
                 
                 }}
        });
        label1.add(kbuton3);
        kbuton3.setBounds(190, 390, 70, 95);
        kbuton3.getAccessibleContext().setAccessibleName("");
        kbuton3.setVisible(false);
         
        kbuton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png")); // NOI18N
        kbuton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton4ActionPerformed(evt);
            }

             private void kbuton4ActionPerformed(ActionEvent evt) {//************************************************************************
                 
                 if(meowth1.kartKullanildiMi==false){
                     
                
                  kbuton4.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(meowth1);
                meowth1.kartKullanildiMi=true;
                
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ////////////ifler değisir 
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster() > meowth1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster() < meowth1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////değismez
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 
            } }
        });
        label1.add(kbuton4);
        kbuton4.setBounds(270, 390, 70, 95);
        kbuton4.setVisible(false);
        
        kbuton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png")); // NOI18N
         kbuton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton5ActionPerformed(evt);
            }

             private void kbuton5ActionPerformed(ActionEvent evt) {///******************************************************************
                
                 if(pikachu1.kartKullanildiMi==false){
                     
                 
                  kbuton5.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(pikachu1);
                pikachu1.kartKullanildiMi=true;
                
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ////////////ifler değisir 
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>pikachu1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<pikachu1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////değismez
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 }}
        });
        label1.add(kbuton5);
        kbuton5.setBounds(350, 390, 70, 95);
        kbuton5.setVisible(false);
        
        kbuton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png")); // NOI18N
        kbuton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton6ActionPerformed(evt);
            }

             private void kbuton6ActionPerformed(ActionEvent evt) {//*****************************************************************
                
                 if(butterfree1.kartKullanildiMi==false){
                     
                 
                  kbuton6.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(butterfree1);
               butterfree1.kartKullanildiMi=true;
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar ///////////Degismez             
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ////////////
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>butterfree1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<butterfree1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("CC:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////            
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 
             }}
        });
        label1.add(kbuton6);
        kbuton6.setBounds(430, 390, 70, 95);
        kbuton6.setVisible(false);

        kbuton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png")); // NOI18N
        kbuton7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton7ActionPerformed(evt);
            }

             private void kbuton7ActionPerformed(ActionEvent evt) {//*****************************************************************
                
                 
                 if( snorlax1.kartKullanildiMi==false){
                     
                 
                         
                     
                  kbuton7.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(snorlax1);
                snorlax1.kartKullanildiMi=true;
                
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar ///////////            
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ///////////
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>snorlax1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<snorlax1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster//////////////
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////            
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 
             }}
        });
        label1.add(kbuton7);
        kbuton7.setBounds(510, 390, 70, 95);
        kbuton7.setVisible(false);

        kbuton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png")); // NOI18N
        kbuton8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton8ActionPerformed(evt);
            }

             private void kbuton8ActionPerformed(ActionEvent evt) {//****************************************************************************
                
                 if(bulbasaur1.kartKullanildiMi==false){
                     
                 
                 
                  kbuton8.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(bulbasaur1);
                 bulbasaur1.kartKullanildiMi=true;
                 
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar //////////             
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ////////////
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>bulbasaur1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<bulbasaur1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////           
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 
                 
                 
             }}
        });
        label1.add(kbuton8);
        kbuton8.setBounds(590, 390, 70, 95);
        kbuton8.setVisible(false);

        kbuton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png")); // NOI18N
        kbuton9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton9ActionPerformed(evt);
            }

             private void kbuton9ActionPerformed(ActionEvent evt) {//**************************************************************
                
                 
                 if(zubat1.kartKullanildiMi==false){
                     
               
                  kbuton9.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(zubat1);
                zubat1.kartKullanildiMi=true;
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar ///////////            
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar //////////// 
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>zubat1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<zubat1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////           
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 
                 
             }}
        });
        label1.add(kbuton9);
        kbuton9.setBounds(670, 390, 70, 95);
        kbuton9.setVisible(false);

        kbuton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png")); // NOI18N
        kbuton10.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbuton10ActionPerformed(evt);
            }

             private void kbuton10ActionPerformed(ActionEvent evt) {//****************************************************************************
                
                 if(charmander1.kartKullanildiMi==false){
                     
                 
                 
                  kbuton10.setVisible(false);
                oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                oyuncualani.setVisible(true);
                kul1.silkartlistesi(charmander1);
                charmander1.kartKullanildiMi=true;
   ////////////destede kart varsa kullanıcının destesine yeni kart koyar ve o kartı kullanıma acar //////////            
                if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
   ////////////////////// Bilg rasgele secim yapar ve o secime göre kazanana +5 puan yazar ////////////
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                if(bilgsecimi.hasarpuanigoster()>charmander1.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<charmander1.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Oyuncu Puanı="+opuan);
                }else{
                    
                }
     //////////////////////Bilg secimi ne ise ona gore butonu ac ve secimi bilgialanında goster///////////////
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
     //////////////destede kart varsa bilgisayarın destesine yeni kart koyar ve o kartı kullanıma acar ///////////             
                  if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                  
                  
                 
                 
                 
                 
                 
                 }}
        });
        label1.add(kbuton10);
        kbuton10.setBounds(750, 390, 70, 95);
        kbuton10.setVisible(false);

        bbuton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png")); // NOI18N
         bbuton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton1ActionPerformed(evt);
            }

             private void bbuton1ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton1);
        bbuton1.setBounds(20, 10, 70, 95);
        bbuton1.setVisible(false);

        bbuton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png")); // NOI18N
         bbuton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton2ActionPerformed(evt);
            }

             private void bbuton2ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton2);
        bbuton2.setBounds(100, 10, 70, 95);
        bbuton2.setVisible(false);

        bbuton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png")); // NOI18N
        bbuton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton3ActionPerformed(evt);
            }

             private void bbuton3ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton3);
        bbuton3.setBounds(179, 10, 70, 95);
        bbuton3.setVisible(false);

        bbuton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png")); // NOI18N
        bbuton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton4ActionPerformed(evt);
            }

             private void bbuton4ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton4);
        bbuton4.setBounds(260, 10, 70, 95);
        bbuton4.setVisible(false);

        bbuton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png")); // NOI18N
        bbuton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton5ActionPerformed(evt);
            }

             private void bbuton5ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton5);
        bbuton5.setBounds(340, 10, 70, 95);
        bbuton5.setVisible(false);

        bbuton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png")); // NOI18N
        bbuton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton6ActionPerformed(evt);
            }

             private void bbuton6ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton6);
        bbuton6.setBounds(420, 10, 70, 95);
        bbuton6.setVisible(false);

        bbuton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png")); // NOI18N
        bbuton7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton7ActionPerformed(evt);
            }

             private void bbuton7ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton7);
        bbuton7.setBounds(500, 10, 70, 95);
        bbuton7.setVisible(false);

        bbuton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png")); // NOI18N
        bbuton8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton8ActionPerformed(evt);
            }

             private void bbuton8ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton8);
        bbuton8.setBounds(580, 10, 70, 95);
        bbuton8.setVisible(false);

        bbuton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png")); // NOI18N
        bbuton9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton9ActionPerformed(evt);
            }

             private void bbuton9ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton9);
        bbuton9.setBounds(667, 10, 70, 95);
        bbuton9.setVisible(false);

        bbuton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png")); // NOI18N
        bbuton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuton5ActionPerformed(evt);
            }

             private void bbuton5ActionPerformed(ActionEvent evt) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        });
        label1.add(bbuton10);
        bbuton10.setBounds(757, 10, 70, 95);
        bbuton10.setVisible(false);
        
         randbuton.setBackground(new java.awt.Color(255, 204, 255));
        randbuton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        randbuton.setForeground(new java.awt.Color(102, 0, 0));
        randbuton.setText("Random Kart At");
        randbuton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randbutonActionPerformed(evt);
            }

             private void randbutonActionPerformed(ActionEvent evt) {
                 bilgsecimi= bilg1.kartsec(bilg1.kartlistesi.size());
                 bilg2secimi= kul1.kartsec(kul1.kartlistesi.size());
                 
                 if(bilgsecimi.hasarpuanigoster()>bilg2secimi.hasarpuanigoster()){
                    bpuan=bpuan+5;
                    bilgisayartext.setText("Bilgisayar Puanı="+bpuan);
                }else if(bilgsecimi.hasarpuanigoster()<bilg2secimi.hasarpuanigoster()){
                    opuan=opuan+5;
                    oyuncutext.setText("Bilgisayar.v2 Puanı="+opuan);
                }else{
                    
                }
                 
                 
                 if(bilgsecimi==pysduck1){
                  bbuton1.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pysduck1); 
                  }if(bilgsecimi==jigglypuff1){
                  bbuton2.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(jigglypuff1);
                  }if(bilgsecimi==squirtle1){
                  bbuton3.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(squirtle1);
                  }if(bilgsecimi==meowth1){
                  bbuton4.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(meowth1);
                  }if(bilgsecimi==pikachu1){
                  bbuton5.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(pikachu1);
                  }if(bilgsecimi==butterfree1){
                  bbuton6.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(butterfree1);
                  }if(bilgsecimi==snorlax1){
                  bbuton7.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(snorlax1);
                  }if(bilgsecimi==bulbasaur1){
                  bbuton8.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(bulbasaur1);
                  }if(bilgsecimi==zubat1){
                  bbuton9.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(zubat1);
                  }if(bilgsecimi==charmander1){
                  bbuton10.setVisible(false);
                  bilgalani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  bilgalani.setVisible(true);
                  bilg1.silkartlistesi(charmander1);
                  }
                
                 
                 if(bilg2secimi==pysduck1){
                  kbuton1.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\duck.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(pysduck1); 
                  }if(bilg2secimi==jigglypuff1){
                 kbuton2.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\puf.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(jigglypuff1);
                  }if(bilg2secimi==squirtle1){
                 kbuton3.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kurba.png"));
                  oyuncualani.setVisible(true);
                 kul1.silkartlistesi(squirtle1);
                  }if(bilg2secimi==meowth1){
                 kbuton4.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\meow.png"));
                  oyuncualani.setVisible(true);
                 kul1.silkartlistesi(meowth1);
                  }if(bilg2secimi==pikachu1){
                  kbuton5.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\pika.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(pikachu1);
                  }if(bilg2secimi==butterfree1){
                  kbuton6.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\kelebek.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(butterfree1);
                  }if(bilg2secimi==snorlax1){
                 kbuton7.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\snorlax.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(snorlax1);
                  }if(bilg2secimi==bulbasaur1){
                 kbuton8.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\bulbasar.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(bulbasaur1);
                  }if(bilg2secimi==zubat1){
                  kbuton9.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\zubat.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(zubat1);
                  }if(bilg2secimi==charmander1){
                  kbuton10.setVisible(false);
                  oyuncualani.setIcon(new javax.swing.ImageIcon("C:\\Users\\erdem\\OneDrive\\Belgeler\\NetBeansProjects\\prolab2\\charmander.png"));
                  oyuncualani.setVisible(true);
                  kul1.silkartlistesi(charmander1);
                  }
                
                 if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    bilg1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         bbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         bbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         bbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         bbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         bbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         bbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         bbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         bbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         bbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         bbuton10.setVisible(true);
                     }
                    deste.remove(n);
                
                  }
                 
                 if(deste.size() > 0){
                    n=random.nextInt(deste.size());
                    kul1.setkartlistesi(deste.get(n));
                      if(deste.get(n)==pysduck1){
                         kbuton1.setVisible(true);
                     }if(deste.get(n)==jigglypuff1){
                         kbuton2.setVisible(true);
                     }if(deste.get(n)==squirtle1){
                         kbuton3.setVisible(true);
                     }if(deste.get(n)==meowth1){
                         kbuton4.setVisible(true);
                     }if(deste.get(n)==pikachu1){
                         kbuton5.setVisible(true);
                     }if(deste.get(n)==butterfree1){
                         kbuton6.setVisible(true);
                     }if(deste.get(n)==snorlax1){
                         kbuton7.setVisible(true);
                     }if(deste.get(n)==bulbasaur1){
                         kbuton8.setVisible(true);
                     }if(deste.get(n)==zubat1){
                         kbuton9.setVisible(true);
                     }if(deste.get(n)==charmander1){
                         kbuton10.setVisible(true);
                     }
                    deste.remove(n);
                }
                 
             }
        });
        label1.add(randbuton);
        randbuton.setBounds(623, 230, 160, 30);
        randbuton.setVisible(false);
          
          oyuncutext.setBackground(new java.awt.Color(255, 153, 0));
        oyuncutext.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        oyuncutext.setForeground(new java.awt.Color(255, 0, 0));
        oyuncutext.setText("Oyuncu Puan="+opuan);
        label1.add(oyuncutext);
        oyuncutext.setBounds(40, 310, 180, 60);
        oyuncutext.setVisible(false);
        
        bilgisayartext.setBackground(new java.awt.Color(255, 153, 0));
        bilgisayartext.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        bilgisayartext.setForeground(new java.awt.Color(255, 0, 0));
        bilgisayartext.setText("Bilgisayar Puanı="+ bpuan);
        label1.add(bilgisayartext);
        bilgisayartext.setBounds(40, 120, 180, 60);
        bilgisayartext.setVisible(false);
        
        label1.add(bilgalani);
        bilgalani.setBounds(750, 130, 70, 95);
        bilgalani.setVisible(false);
        label1.add(oyuncualani);
        oyuncualani.setBounds(750, 270, 70, 95);
        oyuncualani.setVisible(false);
        
        d1.setBackground(new java.awt.Color(153, 153, 255));
          d1.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        d1.setText("Hadi Destenden Bir Kart Oyna");
        label1.add(d1);
        d1.setBounds(270, 355, 310, 23);
        d1.setVisible(false);
        
        d2.setBackground(new java.awt.Color(153, 153, 255));
          d2.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        d2.setText("Bilgisayarın Destesi");
        label1.add(d2);
        d2.setBounds(270, 110, 310, 23);
        d2.setVisible(false);
        
        cizgi1.setBackground(new java.awt.Color(153, 153, 255));
        label1.add(cizgi1);
        cizgi1.setBounds(20, 373, 810, 5);
        cizgi1.setVisible(false);
        
        cizgi2.setBackground(new java.awt.Color(153, 153, 255));
        label1.add(cizgi2);
        cizgi2.setBounds(20, 110, 810, 5);
        cizgi2.setVisible(false);
        
      
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}   
