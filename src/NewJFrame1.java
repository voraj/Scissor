import java.io.*;
import java.util.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionListener;
import java.sql.*;
import javax.swing.event.ListSelectionEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.table.JTableHeader;
import java.util.Enumeration;
import java.util.StringTokenizer;

import java.text.SimpleDateFormat;
import java.math.*;
import javax.xml.stream.events.StartDocument;
import java.lang.*;
import java.util.concurrent.Semaphore;
import hultig.sumo.*;

import java.text.BreakIterator;   //for break iterator
import java.util.Locale;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.regex.Pattern;
import javax.swing.event.ChangeEvent;


public class NewJFrame1 extends javax.swing.JFrame 
{

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() 
    {
        initComponents();
        
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmain = new javax.swing.JPanel();
        data = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        summary1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        button = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        data.setAutoscrolls(true);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        data1.setColumns(20);
        data1.setLineWrap(true);
        data1.setRows(5);
        data1.setWrapStyleWord(true);
        data1.setAutoscrolls(false);
        data1.setMargin(new java.awt.Insets(3, 3, 3, 3));
        data1.setMaximumSize(new java.awt.Dimension(200, 200));
        data1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                data1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(data1);

        javax.swing.GroupLayout dataLayout = new javax.swing.GroupLayout(data);
        data.setLayout(dataLayout);
        dataLayout.setHorizontalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1758, Short.MAX_VALUE))
        );
        dataLayout.setVerticalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        summary1.setColumns(20);
        summary1.setLineWrap(true);
        summary1.setRows(5);
        summary1.setToolTipText("");
        summary1.setWrapStyleWord(true);
        summary1.setAlignmentX(1.0F);
        summary1.setAlignmentY(1.0F);
        summary1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        summary1.setMargin(new java.awt.Insets(3, 3, 3, 3));
        summary1.setName("text"); // NOI18N
        jScrollPane4.setViewportView(summary1);

        jButton2.setText("Download");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1756, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b1.setText("Summary");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewJFrame1.this.actionPerformed(evt);
            }
        });

        jSlider1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.setName("bar"); // NOI18N
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jTextArea2.setColumns(1);
        jTextArea2.setRows(1);
        jTextArea2.setTabSize(1);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1.setText("Enter the keywords");

        jLabel2.setText("(Separated by comma)");

        javax.swing.GroupLayout buttonLayout = new javax.swing.GroupLayout(button);
        button.setLayout(buttonLayout);
        buttonLayout.setHorizontalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1766, 1766, 1766))
            .addGroup(buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1758, Short.MAX_VALUE))
        );
        buttonLayout.setVerticalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLayout.createSequentialGroup()
                .addGroup(buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addGroup(buttonLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jSlider1.getAccessibleContext().setAccessibleName("bar");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setActionCommand("Upload");
        jButton1.setLabel("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpmainLayout = new javax.swing.GroupLayout(jpmain);
        jpmain.setLayout(jpmainLayout);
        jpmainLayout.setHorizontalGroup(
            jpmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpmainLayout.createSequentialGroup()
                .addGroup(jpmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpmainLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpmainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpmainLayout.setVerticalGroup(
            jpmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpmainLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(5, 5, 5)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformed

            
        len=0;
      newline="";
        summary1.setText(""); 
        try{
         d=data1.getText();
       
         
         File file= new File("abc.txt");
         FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(d);
		bw.close();
         readFile();
             
        }
        catch(Exception w)
        {
        System.out.println("throws exception");
        }
        
         throw new UnsupportedOperationException("Not supported yet.");
    
    }//GEN-LAST:event_actionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        percentage=jSlider1.getValue();
        try {
            readFile();
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_jSlider1StateChanged

    private void data1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_data1KeyReleased
        // TODO add your handling code here:
        percentage=jSlider1.getValue();
        try {
            readFile();
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_data1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(data);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                 
                    try
                    {
                        input = new BufferedReader(
                                new InputStreamReader(
                                new FileInputStream(
                                file)));
                        data1.read(input, "READING FILE");    
                        data1KeyReleased(null);
                    }
                    catch(Exception e)
                    {       
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Operation is CANCELLED :(");
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String text = summary1.getText();
    File f=new File("output.txt");
    FileWriter fw;
        try {
            fw = new FileWriter(f);
            fw.write(text);
            fw.close();
            summary1.append("\n\n"+"Downloaded successfully..."+f.getAbsoluteFile());
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

  


public static void readFile() throws Exception
{

    len=0;
      newline="";
        summary1.setText(""); 
        try{
         d=data1.getText();

         File file= new File("abc.txt");
         FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
         d = d.replaceAll("\\[.*\\]", "");
         d = d.replaceAll("\\n", " ");
		bw.write(d);
		bw.close();
                 Scanner sc = new Scanner(System.in);
 
 
 sentence= new Vector(); 
 String line= "";
     

 sc = new Scanner(file);
        while (sc.hasNextLine())
            {
                line = sc.nextLine();
               
           
              String paragraph =line;
 
        BreakIterator iterator =
                BreakIterator.getSentenceInstance(Locale.US);
 
        int counter= count(iterator, paragraph);
      

    len+=counter;
  
}



   no=(percentage*len+50)/100; 
   
  
  extract();
             
        }
        catch(Exception w)
        {
        System.out.println("throws exception");
        }
        
         throw new UnsupportedOperationException("Not supported yet.");
   
    
   
}
   private static int count(BreakIterator bi, String source) {
        int counter = 0;
        bi.setText(source);
 
        int lastIndex = bi.first();
        while (lastIndex != BreakIterator.DONE) {
            int firstIndex = lastIndex;
            lastIndex = bi.next();
 
            if (lastIndex != BreakIterator.DONE) {
                String line = source.substring(firstIndex, lastIndex);
                sentence.add(line);
               // System.out.println("sentence = " + line);
                counter++;
            }
        }
        return counter;  
        
    }  

public static void extract() throws Exception
{ 
    words=new Vector[len];
    words1=new Vector[len];
      keywords=new Vector[len];
        for (int i=0;i<len;i++)
            words[i]=new  Vector();

       for (int i=0;i<len;i++)
            keywords[i]=new  Vector();

         for (int i=0;i<len;i++)
            words1[i]=new  Vector();
       String line="",s="";

        for (int i=0;i<len;i++)
       {

           line=sentence.elementAt(i)+"";
           StringTokenizer Token = new StringTokenizer(line);

                      while (Token.hasMoreTokens())
                       {
                                s=Token.nextToken();
                                 //System.out.println(s);
                                int l=s.length();
                                char a=s.charAt(l-1);
                                if(a=='.'||a==',')
                                {
                                s=s.substring(0,l-1);
                                
                                }
                                 //   s=s.toLowerCase();              //To implement search for proper nouns
                                    words[i].addElement(s);
                                    keywords[i].addElement(s);
                                     s=s.toLowerCase();
                                    words1[i].addElement(s);   
                                
                       }

                      
                
       /* System.out.println("words are............");
                for (int k=0;k<len;k++)
                    for(int j=0;j<words[k].size();j++)
                        System.out.println(words[k].elementAt(j));
                            System.out.println();*/
	
      }


        int p=0;
       File file1 = new File("stopwords.txt");
       Scanner sc1=new Scanner(file1);
       String comp="";
     while (sc1.hasNext())
      {
          comp=sc1.next();
         for (int j=0;j<len;j++)
          for (int k=0;k<words[j].size();k++)
        {
            
            if (comp.equalsIgnoreCase(keywords[j].elementAt(k)+""))
                    {
                        
                   keywords[j].remove(k);
                    keywords[j].add(k,"");
                    p++;
                    }
            
            String rmv_citation=keywords[j].elementAt(k)+"";
            if(rmv_citation.contains("["))
            {
            int startindex=rmv_citation.indexOf("[");
            int endindex=rmv_citation.indexOf("]");
            rmv_citation=rmv_citation.substring(0,startindex);
            keywords[j].remove(k);
            keywords[j].add(k, rmv_citation);
            }
        
       }
       }
     
     

//System.out.println("tokens after replacing keywords are: ...");
 //for (int j=0;j<len;j++)
     //   for (int k=0;k<words[j].size();k++)
      //      System.out.println(keywords[j].elementAt(k));
  
 
/* System.out.println("keywords are............");
              for (int k=0;k<len;k++)
              {for(int j=0;j<keywords[k].size();j++)
              {summary1.append(keywords[k].elementAt(j)+"        ");
                        summary1.removeAll();}
                    summary1.append("\n");
              }  */     

		    //System.out.println(keywords[k].elementAt(j));

   createGraph();
}

static void createGraph()
{
//System.out.println("button hua");

match=new double[len][len];


             /* for (int k=0;k<len;k++)
                  for(int j=0;j<len;j++)
		    match[k][j]=false;*/
  double counter[][]= new double[len][2];
  for(int i=0;i<len;i++)
    {
      counter [i][0]=i;
       counter [i][1]=0;
    }
   
   matchedSentences=new Vector[len];
  for (int j=0;j<len;j++)
    matchedSentences[j] = new Vector();  
  
  double total=0;
int cnt=0,p=1;
while(cnt<len)
{ 
    for (int j=cnt+1;j<len;j++)
    {
        p=1;
        for (int k=0;k<keywords[cnt].size();k++)
                {
                    Word a= new Word(keywords[cnt].elementAt(k)+"");
                        if (!(keywords[cnt].elementAt(k)+"").equals(""))
                          
                        {
                            for(int l=0;l<keywords[j].size();l++)
                             {
  
                                 Word b=new Word(keywords[j].elementAt(l)+"");
                                  if (!(keywords[j].elementAt(l)+"").equals(""))
                                  {
                                      double y=a.dnormEditDistance(b);
                               
                                if(y>0.6)
                             {
                                 
                                   counter[cnt][1]+=y;
                                  counter[j][1]+=y;
                               //   if(!matchedSentences[cnt].elementAt(j-1).equals(j))
                                        if(p==1)
                                       {
                                         matchedSentences[cnt].add(j);
                                         matchedSentences[j].add(cnt);
                                         p=0;
                                        }

                                 
                             } 
                         
                       //if ((keywords[cnt].elementAt(k)+"").equalsIgnoreCase(keywords[j].elementAt(l)+"") && !keywords[j].elementAt(l).equals("____"))
                                  }    
                             }
                        }
                    
              
                }
                              
                    
                               
    }
cnt++;

}





 sel_sent=new Vector();
selected=new boolean[len];
 boolean temp_sel[]=new boolean[len];
 
int i=0;

//percentage=jSlider1.getValue();
//int no=(percentage*len+50)/100;

for(int k=0;k<len;k++)
          temp_sel[k]=true;

    int c=0,v=-1;
      i=(int)counter[0][0];
      
      
//TO REMOVE SENTENCES ENDING WITH ?
   
      Vector questions=new Vector();
      for (int k=0;k<len;k++)
      {
      String questn=sentence.elementAt(k)+"";
      if((questn.contains("?")))
      {
      questions.add(k);
         //summary1.append(questions.elementAt(k)+"");
      }
      
      
      }
      
          
String lowercase="";
      String query=jTextArea2.getText();
     
      String qwords[]=query.split(",");
      if (!(query.equals("")))
      {
         // summary1.append("Query/ies is/are:  ");
    //  summary1.append(query+""+"\n");
       //   summary1.append("query hua");
          
      for (int m=0;m<qwords.length;m++)
      {
          
            qwords[m]=qwords[m].toLowerCase();
          Word a= new Word(qwords[m]);
          for (int k=0;k<len;k++)
            {
              
             for(int j=1;j<keywords[k].size();j++)
                    {
                       
                    lowercase=(keywords[k].elementAt(j)+"").toLowerCase();
                        Word b= new Word(lowercase);
                        double y=a.dnormEditDistance(b);
                        boolean qflag=true;
                        for(int l=0;l<questions.size();l++)
                                        {
                      //                     System.out.println("questions present       \n");
                                         if((Integer.parseInt(questions.elementAt(l)+""))==k)
                                             qflag=false;
                                        }

                           if((y>=0.8)&&!selected[k]&&qflag)
                           {
                               //summary1.append("y is:         "+y+"  "+keywords[k].elementAt(j)+""+"\n");
                           sel_sent.add(k);                          
                           selected[k]=true;
                           }
                           
                    }
            }
      }
     
 
      boolean f=true;
      Vector key=new Vector();
      for(int m=0;m<sel_sent.size();m++)
      {
          int e=Integer.parseInt(sel_sent.elementAt(m)+"");
     //  String tp=(String)sentence.elementAt(Integer.parseInt(sel_sent.elementAt(m)+""))+"";
       f=true;
         for(int k=0;k<qwords.length;k++)
           {
            qwords[k]=qwords[k].toLowerCase();

          if(!words1[e].contains(qwords[k]))
           f=false;

           }


       
       if(f)
           key.add(sel_sent.elementAt(m));
      }
      
       if(qwords.length>1&& !key.isEmpty())
          
      {
      summary1.append("IMP sentence/s which contain/s all the query words is/are:  "+"\n");
      for(int k=0;k<key.size();k++)
      {
          summary1.append(sentence.elementAt(Integer.parseInt(key.elementAt(k)+""))+"\n");
             summary1.append("\n");
      }
     }
       
      summary1.append("Summary based on the query------------"+"\n\n");
      
}

else
      {
          
//System.out.println("ELSE HUA");
      //PROPER NOUNS................
      
Boolean qflag=true;
boolean propernoun[]=new boolean[len]; 


int invalid=0;
for(int j=0;j<len;j++)
    if(words[j].size()<=4)invalid++;

invalid+=questions.size();

for(int l=0;l<questions.size();l++)

{
int m=Integer.parseInt(questions.elementAt(l)+"");
if( words[m].size()<=4)
    invalid--;
 }
int valid=len-invalid;
if(valid<no)
{
int z=no-valid;
no=no-z;
}

//THIS LOOP KEEPS TRACK OF SENTENCES WITH PROPER NOUN

for (int k=0;k<len;k++)
{
    for(int j=1;j<words[k].size()&& no>0;j++)
     {
        char a=(words[k].elementAt(j)+"").charAt(0);
     //  System.out.println(a+"first char.....\n");
        if(((int)a)>=65 && ((int)a)<=90 )
                 {
                       qflag=true;
                       String mm=words[k].elementAt(j)+"";
                       if(mm.length()>1)
                       {
                           char b=(words[k].elementAt(j)+"").charAt(1);
              
                           if((((int)b)>=97&& ((int)b)<=122) )
                             {
                                  if(!selected[k])
                                  {
                                    for(int l=0;l<questions.size();l++)
                                        {
                      //                     System.out.println("questions present       \n");
                                         if((Integer.parseInt(questions.elementAt(l)+""))==k)
                                             qflag=false;
                                        }
                                    if(qflag)
                                     {
                                        
                                         propernoun[k]=true;
                                     }
                                  }
                              }    
                }
                 }
    }
    

}

double avg=0;
for(int j=0;j<counter.length;j++)
    avg+=counter[j][1];

avg=avg/counter.length;
//summary1.append("avg scoreeeeeeeeeeeeeee                       "+avg);
counter[0][1]+=avg;
//SCORES OF SENTENCES WITH PROPER NOUNS  R INCRSD
for(int k=0;k<len;k++)
   if(propernoun[k])
   {
       counter[k][1]+=avg/2;
   }


// Arrange sentences in dezc order based on importance

double max=0,t=0; boolean equal=false;
for(int m=0;m<len-1;m++)
    { 
        max=counter[m][1];
               

        for(int j=m+1;j<len;j++)
        {  
            equal=false;
           if(counter[j][1]==max && (counter[m][0]<counter[j][0])) equal=true; 
           if(counter[j][1]>=max && equal==false) 
           {
            max = counter[j][1];
            
           t=counter[m][1];
           counter[m][1]=max;
           counter[j][1]=t;
           
           t=counter[m][0];
           counter[m][0]=counter[j][0];
           counter[j][0]=t; 
           }
        } 
          
           
        
    }

      {

      for (int k=0;k<len;k++)
          for(int l=0;l<questions.size();l++)
                                         if((Integer.parseInt(questions.elementAt(l)+""))==k)
                                             selected[k]=true;
          
        while(no>0)
    {
           System.out.print("no rem is "+no);
        c=0;
        if(v!=i)
            {
                if (v!=-1)
                {i=v;
                }
                else
                {
                
                  for(int k=0;k<len;k++)
            {
            int m=(int)counter[k][0];
           // summary1.append(m+" is m");
            if(!selected[m])
            {
            i=m;
            break;
            }
            }
                
                }
              
             }
          else
            {
                
                for(int k=0;k<len;k++)
            {
            int m=(int)counter[k][0];
           // summary1.append(m+" is m");
            if(!selected[m])
            {
            i=m;
            break;
            }
            }
            }
     
             if (!selected[i] && words[i].size()>4)
             {
                 qflag=true;
                  for(int l=0;l<questions.size();l++)
                      {
                             if((Integer.parseInt(questions.elementAt(l)+""))==i)
                                qflag=false;
                      }
             if(qflag)
             {
             sel_sent.add(i);
            selected[i]=true; 
             no--;
             temp_sel[i]=false;//to make the selected sentence false
             }
             
             }
             
             
        for(int k=0;k<matchedSentences[i].size();k++)
            {
                
                int u=Integer.parseInt(matchedSentences[i].elementAt(k)+"");
                temp_sel[u]=false;
                
            }


       
           
        for(int k=0;k<len;k++)
            if(temp_sel[k]==false)
                c++;
 //    summary1.append(c+" is c"+"\n");
        
     if(c==len)
        {
      //   summary1.append("related to all"+"\n");
         for(int k=0;k<len;k++)
              if(!selected[k])
                 temp_sel[k]=true;
         
        
     }
        else
        {
    //summary1.append(c+"  is the length");
        for(int j=0;j<len;j++)
            {
              if(!selected[j]) 
              {
                  if(temp_sel[j])
                  {
                  v=j;
                  break;
                  
                  }
              }
             
            }
        }
        
        }
        
        
      }
      summary1.append("Summary------------"+"\n\n");
      
      }
     // for(int j=0;j<sel_sent.size();j++)
       //   summary1.append((sel_sent.elementAt(j))+"\n ");
      
      
      
         for(int j=0;j<sel_sent.size()-1;j++)
         {
                for(int k=j+1;k<sel_sent.size();k++)
                {
                int x=Integer.parseInt(sel_sent.elementAt(j)+"");
                int y=Integer.parseInt(sel_sent.elementAt(k)+"");
                int z=0;
                if (y<x)
                    {
                    z=x;
                    x=y;
                    y=z;
                    sel_sent.remove(j);
                   sel_sent.add(j, x); 
                  sel_sent.remove(k);
                   sel_sent.add(k, y);
                    }
                
                }
         }
      
     /* for(int j=0;j<sel_sent.size();j++)
          summary1.append((sel_sent.elementAt(j))+"\n ");
      */
       int x=Integer.parseInt(sel_sent.elementAt(0)+"");
      summary1.append("          "+sentence.elementAt(x)+"");
      for(int j=1;j<sel_sent.size();j++)
      {
          x=Integer.parseInt(sel_sent.elementAt(j)+"");
         summary1.append(sentence.elementAt(x)+"");
         
         
      }
     
     //summary1.append(percentage+" slider..........");
              
}



    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {

            
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }
    static BufferedReader input;
  
    static JFileChooser fc;
static int para=0;
    static int no;
    static String newline=""; 
static String d;
static String sen[];
  static int len=0;
 static Vector sentence;
 static Vector matchedSentences[];
 static Vector words[],keywords[],words1[];
  static double [][] match;
  static int counter [];
  static int perc=50,thres=0;
static Vector sel_sent;
static boolean selected[];
static int percentage=50;
static int seqno=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton b1;
    public javax.swing.JPanel button;
    public javax.swing.JPanel data;
    public static javax.swing.JTextArea data1;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JSlider jSlider1;
    public static javax.swing.JTextArea jTextArea2;
    public javax.swing.JPanel jpmain;
    public static javax.swing.JTextArea summary1;
    // End of variables declaration//GEN-END:variables
}
