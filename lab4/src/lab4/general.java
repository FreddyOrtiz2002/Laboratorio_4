package lab4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class general extends javax.swing.JFrame {
ArrayList<Estudiante> curso=new ArrayList<Estudiante>();
int Cantestudiantes;
int Cantnotas;
File archivo;
String[] NombreColumnasTablaMortalidad={"nombre","promedio","aprovacion"};
String[] NombreColumnasTablaNotas;
Object[][] tamaño;
String[][] datosTablaMortalidad;
    public general(int Cantestudiantes, int Cantnotas) {
        this.Cantestudiantes = Cantestudiantes;
        this.Cantnotas = (Cantnotas+1);
        //se define la primera tabla
        NombreColumnasTablaNotas=new String[(Cantnotas+1)];
        tamaño=new Object[this.Cantestudiantes][this.Cantnotas];
       NombreColumnasTablaNotas[0]="nombres";
        for(int i=0;i<this.Cantestudiantes;i++)
        {
            for(int j=0;j<this.Cantnotas;j++)
            {
                tamaño[i][j]=null;
            }
        }
        NombreColumnasTablaNotas[0]="nombres";
        for(int i=1;i<this.Cantnotas;i++)
        {
            NombreColumnasTablaNotas[i]="nota"+i;
        }
        //se define la tabla de mortalidad
        
        datosTablaMortalidad=new String[Cantestudiantes][3];
        for(int i=0;i<Cantestudiantes;i++)
        {
            for(int j=0;j<3;j++)
            {
             datosTablaMortalidad[i][j]="";   
            }
        }
        initComponents();
        
    }
    public general(int Cantestudiantes, int Cantnotas, File archivo) {
        this.Cantestudiantes = Cantestudiantes;
        this.Cantnotas = Cantnotas;
        this.archivo = archivo;
        
        
    }
    public general() {}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable(tamaño,NombreColumnasTablaNotas);
        jButton2 = new javax.swing.JButton();
        NombreHistorico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panelGrafica = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaMortalidad = new javax.swing.JTable(datosTablaMortalidad,NombreColumnasTablaMortalidad);
        calcularNotas1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(tablaNotas);

        jButton2.setText("Mostrar Historico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Estudiante");

        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("                HISTORICO");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Notas");

        tablaMortalidad.setModel(null);
        jScrollPane6.setViewportView(tablaMortalidad);

        calcularNotas1.setText("Calcular notas");
        calcularNotas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularNotas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(71, 71, 71)
                                        .addComponent(NombreHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(calcularNotas1)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(calcularNotas1)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String nombre=NombreHistorico.getText();
       boolean existe=false;
       int posicionDelEstudiante=0;
       for(int i=0;i<Cantestudiantes;i++)
       {
           if(nombre==curso.get(i).Nombre)
           {
               existe=true;
               posicionDelEstudiante=i;
           }
       }
       if(existe==true)
       {
           XYSeries historico=new XYSeries(nombre);
           for(int i=0;i<Cantnotas-1;i++)
           {
               historico.add(i, curso.get(posicionDelEstudiante).notas[i]);
           }
           XYSeriesCollection dataset=new XYSeriesCollection();
           dataset.addSeries(historico);
           JFreeChart grafico=ChartFactory.createXYLineChart(nombre,"","",dataset,PlotOrientation.HORIZONTAL,true,true,true);
           
            CategoryPlot catPlot=grafico.getCategoryPlot();
            //catPlot.setRangeGridlinePaint(Color.BLACK);
            ChartPanel chartPanel=new ChartPanel(grafico);
            panelGrafica.removeAll();
            panelGrafica.add(chartPanel, BorderLayout.CENTER);
            panelGrafica.validate();
            

               
               
           }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Estudiante estudiante;
    String nombre = null;
    float[] notas=new float[(Cantnotas-1)];
        for(int i=0;i<Cantestudiantes;i++)
            {
                for(int j=0;j<Cantnotas;j++)
                {
                    if(j==0)
                    {
                        nombre=tablaNotas.getValueAt(i, j).toString();
                    }else if(j>0)
                    {
                        notas[j-1]=Float.parseFloat(tablaNotas.getValueAt(i, j).toString());
                    } 
                }
                estudiante=new Estudiante(nombre,notas);
                curso.add(estudiante);        
            }
      //Falta ingresar valores a la tabla de mortalidad  
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void calcularNotas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularNotas1ActionPerformed
        Estudiante estudiante;
    String nombre = null;
    float[] notas=new float[(Cantnotas-1)];
        for(int i=0;i<Cantestudiantes;i++)
            {
                for(int j=0;j<Cantnotas;j++)
                {
                    if(j==0)
                    {
                        nombre=tablaNotas.getValueAt(i, j).toString();
                    }else if(j>0)
                    {
                        notas[j-1]=Float.parseFloat(tablaNotas.getValueAt(i, j).toString());
                    } 
                }
                estudiante=new Estudiante(nombre,notas);
                curso.add(estudiante);        
            }
      //Falta ingresar valores a la tabla de mortalidad
      
    }//GEN-LAST:event_calcularNotas1ActionPerformed

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
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new general().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreHistorico;
    private javax.swing.JButton calcularNotas1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JTable tablaMortalidad;
    private javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables
}
