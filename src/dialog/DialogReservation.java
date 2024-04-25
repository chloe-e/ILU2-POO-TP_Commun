/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.AdaptateurDuNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private AdaptateurDuNoyauFonctionnel inf;
    private int numClient;
    
    public DialogReservation(AdaptateurDuNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        frameReservation.enableTimePicker();
    }

    public void handleTimeSelectedEvent(String time) {
        frameReservation.enableNbPersonsPicker();
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        frameReservation.enableTablePicker();
    }

    public void handleTableSelectedEvent(int numTable) {
        frameReservation.enableConfirmerButton();
    }

    public void handleCancelEvent() {
        frameReservation.cleanForm();
    }

    public void handleValidationEvent() {
        frameReservation.confirmForm();
    }
    
    public void handleUserConnected(int numClient) {
    	this.numClient = numClient;
    	frameReservation.setVisible(true);
    	}
    
    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new AdaptateurDuNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
