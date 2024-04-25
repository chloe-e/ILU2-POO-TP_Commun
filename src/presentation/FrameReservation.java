/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpPanel = new javax.swing.JPanel();
        buttonValider = new javax.swing.JButton();
        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        labelDatePicker = new javax.swing.JLabel();
        labelTimePicker = new javax.swing.JLabel();
        timePicker = new javax.swing.JComboBox<>();
        buttonAnnuler = new javax.swing.JButton();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        labelTablePicker = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTables = new javax.swing.JList<>();
        nbPersonsPanel = new javax.swing.JPanel();
        labelNbPersons = new javax.swing.JLabel();
        nbPersonsPicker = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonValider.setText("Valider");
        buttonValider.setEnabled(false);
        buttonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonValiderActionPerformed(evt);
            }
        });

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        labelDatePicker.setText("Choisissez la date");

        labelTimePicker.setText("Choisissez l'heure");
        labelTimePicker.setEnabled(false);

        timePicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        timePicker.setEnabled(false);
        timePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timePickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDatePicker)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTimePicker)
                    .addComponent(timePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDatePicker)
                    .addComponent(labelTimePicker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        buttonAnnuler.setText("Annuler");
        buttonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnnulerActionPerformed(evt);
            }
        });

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablesImage.setEnabled(false);

        labelTablePicker.setText("Choisissez votre table");
        labelTablePicker.setEnabled(false);

        listTables.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 2", "Table 3", "Table 4", "Table 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTables.setEnabled(false);
        listTables.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTablesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listTables);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(labelTablePicker)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelTablePicker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        labelNbPersons.setText("Indiquez le nombre de personnes");
        labelNbPersons.setEnabled(false);

        nbPersonsPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        nbPersonsPicker.setEnabled(false);
        nbPersonsPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbPersonsPickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbPersonsPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNbPersons))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelNbPersons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nbPersonsPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout popUpPanelLayout = new javax.swing.GroupLayout(popUpPanel);
        popUpPanel.setLayout(popUpPanelLayout);
        popUpPanelLayout.setHorizontalGroup(
            popUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popUpPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonValider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAnnuler)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        popUpPanelLayout.setVerticalGroup(
            popUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonValider)
                    .addComponent(buttonAnnuler))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(popUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(popUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timePickerActionPerformed
        dialog.handleTimeSelectedEvent(timePicker.getSelectedItem().toString());
    }//GEN-LAST:event_timePickerActionPerformed

    private void buttonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValiderActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_buttonValiderActionPerformed

    private void buttonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnnulerActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_buttonAnnulerActionPerformed

    private void nbPersonsPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbPersonsPickerActionPerformed
        dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt(nbPersonsPicker.getSelectedItem().toString()));
    }//GEN-LAST:event_nbPersonsPickerActionPerformed

    private void listTablesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTablesValueChanged
        String selectedValue = listTables.getSelectedValue();
        char numTable = selectedValue.charAt(6);
        dialog.handleTableSelectedEvent(numTable);
    }//GEN-LAST:event_listTablesValueChanged

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(datePicker.getDate());
    }
    
    public void enableTimePicker(){
        timePicker.setEnabled(true);
        labelTimePicker.setEnabled(true);
    }
    public void enableNbPersonsPicker(){
        nbPersonsPicker.setEnabled(true);
        labelNbPersons.setEnabled(true);
    }
    public void enableTablePicker(){
        tablesImage.setEnabled(true);
        labelTablePicker.setEnabled(true);
        listTables.setEnabled(true);
    }
    public void enableConfirmerButton(){
        buttonValider.setEnabled(true);
    }
    
    public void cleanForm(){
        buttonValider.setEnabled(false);
        labelNbPersons.setEnabled(false);
        labelTablePicker.setEnabled(false);
        labelTimePicker.setEnabled(false);
        listTables.setEnabled(false);
        nbPersonsPicker.setEnabled(false);
        tablesImage.setEnabled(false);
        timePicker.setEnabled(false);   
    }
    
    public void confirmForm(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
        String date = datePicker.getDate().format(formatter);
        String message = "Réservation validée pour le " + date +
            " à " + timePicker.getSelectedItem().toString() + " pour "
                + nbPersonsPicker.getSelectedItem().toString() + " personnes "
                + " à la table " + listTables.getSelectedValue().charAt(6) + ".";
        JOptionPane.showMessageDialog(popUpPanel,message,"Confirmation de réservation",JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnnuler;
    private javax.swing.JButton buttonValider;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDatePicker;
    private javax.swing.JLabel labelNbPersons;
    private javax.swing.JLabel labelTablePicker;
    private javax.swing.JLabel labelTimePicker;
    private javax.swing.JList<String> listTables;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JComboBox<String> nbPersonsPicker;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JPanel popUpPanel;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JComboBox<String> timePicker;
    // End of variables declaration//GEN-END:variables

}
