/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projobiekt_hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Bieron
 */
public class ManageFrame extends javax.swing.JFrame {

    public enum ManageMode {
	RESERVATIONS, ROOMS;
    }
    
    private ManageMode manageMode;
    
    /**
     * Creates new form ManageFrame
         * @param mode
     */
        
    public ManageFrame(ManageMode mode) {
        manageMode = mode;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelReeservation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jXDatePickerReservationFrom = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerReservationTo = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxRooms = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPeopleNumber = new javax.swing.JTextField();
        jPanelReservationOptions = new javax.swing.JPanel();
        jCheckBoxReservBath = new javax.swing.JCheckBox();
        jCheckBoxReservGoodView = new javax.swing.JCheckBox();
        jCheckBoxReservKitchen = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldReservationPrice = new javax.swing.JTextField();
        jButtonCheckPrice = new javax.swing.JButton();
        jButtonOk = new javax.swing.JButton();
        jPanelRoom = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldRoomNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRoomPeopleNumber = new javax.swing.JTextField();
        jPanelRoomOptions = new javax.swing.JPanel();
        jCheckBoxBath = new javax.swing.JCheckBox();
        jCheckBoxGoodView = new javax.swing.JCheckBox();
        jCheckBoxKitchen = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBaseRoomPrice = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Reservation from:");

        jLabel2.setText("Resevation To:");

        jLabel3.setText("Reserved Room");

        jLabel4.setText("Number of people:");

        jCheckBoxReservBath.setText("Bathroom");

        jCheckBoxReservGoodView.setText("Good view");
        jCheckBoxReservGoodView.setToolTipText("");

        jCheckBoxReservKitchen.setText("Kitchen");

        javax.swing.GroupLayout jPanelReservationOptionsLayout = new javax.swing.GroupLayout(jPanelReservationOptions);
        jPanelReservationOptions.setLayout(jPanelReservationOptionsLayout);
        jPanelReservationOptionsLayout.setHorizontalGroup(
            jPanelReservationOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationOptionsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jCheckBoxReservBath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jCheckBoxReservGoodView)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxReservKitchen)
                .addGap(13, 13, 13))
        );
        jPanelReservationOptionsLayout.setVerticalGroup(
            jPanelReservationOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationOptionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelReservationOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxReservBath)
                    .addComponent(jCheckBoxReservGoodView)
                    .addComponent(jCheckBoxReservKitchen))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setText("Reservation price per person:");

        jTextFieldReservationPrice.setEnabled(false);

        jButtonCheckPrice.setText("Check Price");
        jButtonCheckPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCheckPriceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelReeservationLayout = new javax.swing.GroupLayout(jPanelReeservation);
        jPanelReeservation.setLayout(jPanelReeservationLayout);
        jPanelReeservationLayout.setHorizontalGroup(
            jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReeservationLayout.createSequentialGroup()
                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelReeservationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelReeservationLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldReservationPrice))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelReeservationLayout.createSequentialGroup()
                                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPeopleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXDatePickerReservationTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXDatePickerReservationFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))))
                    .addGroup(jPanelReeservationLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCheckPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jPanelReservationOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelReeservationLayout.setVerticalGroup(
            jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReeservationLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jXDatePickerReservationFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jXDatePickerReservationTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPeopleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReeservationLayout.createSequentialGroup()
                        .addComponent(jPanelReservationOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReeservationLayout.createSequentialGroup()
                        .addComponent(jButtonCheckPrice)
                        .addGap(26, 26, 26)))
                .addGroup(jPanelReeservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldReservationPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButtonOk.setText("OK");
        jButtonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOkMouseClicked(evt);
            }
        });

        jLabel6.setText("Room number:");

        jLabel7.setText("Number of people:");

        jCheckBoxBath.setText("Bathroom");

        jCheckBoxGoodView.setText("Good view");
        jCheckBoxGoodView.setToolTipText("");

        jCheckBoxKitchen.setText("Kitchen");

        javax.swing.GroupLayout jPanelRoomOptionsLayout = new javax.swing.GroupLayout(jPanelRoomOptions);
        jPanelRoomOptions.setLayout(jPanelRoomOptionsLayout);
        jPanelRoomOptionsLayout.setHorizontalGroup(
            jPanelRoomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoomOptionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jCheckBoxBath)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxGoodView)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxKitchen)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelRoomOptionsLayout.setVerticalGroup(
            jPanelRoomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoomOptionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelRoomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxBath)
                    .addComponent(jCheckBoxGoodView)
                    .addComponent(jCheckBoxKitchen))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel8.setText("Base reservation price:");

        javax.swing.GroupLayout jPanelRoomLayout = new javax.swing.GroupLayout(jPanelRoom);
        jPanelRoom.setLayout(jPanelRoomLayout);
        jPanelRoomLayout.setHorizontalGroup(
            jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoomLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRoomOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRoomLayout.createSequentialGroup()
                        .addGroup(jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRoomNumber)
                            .addComponent(jTextFieldRoomPeopleNumber)
                            .addComponent(jTextFieldBaseRoomPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelRoomLayout.setVerticalGroup(
            jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoomLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRoomPeopleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldBaseRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jPanelRoomOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCancel.setText("Cancel");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanelReeservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelReeservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (manageMode == ManageMode.RESERVATIONS) {
            this.jPanelReeservation.setVisible(true);
            this.jPanelRoom.setVisible(false);
            this.jPanelReservationOptions.setBorder(BorderFactory.createTitledBorder("Reservation options"));
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            this.jXDatePickerReservationFrom.setFormats(dateFormat);
            this.jXDatePickerReservationTo.setFormats(dateFormat);
            ArrayList<Reservation> reservations = MainFrame.lists.reservations();
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel(); 
            for(Room room : MainFrame.lists.rooms()) {
                boolean roomFound = false;
                for(Reservation reservation : reservations) {
                    if (reservation.roomNumber() == room.number()) {
                        roomFound = true;
                        break;
                    }
                }
                if(!roomFound) {
                    model.addElement(String.valueOf(room.number()));
                }
            }
            this.jComboBoxRooms.setModel(model);
        }
        
        if (manageMode == ManageMode.ROOMS) {
            this.jPanelReeservation.setVisible(false);
            this.jPanelRoom.setVisible(true);
            this.jPanelRoomOptions.setBorder(BorderFactory.createTitledBorder("Room options"));
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        // TODO add your handling code here:
        MainFrame mainFrame = new MainFrame();
        this.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOkMouseClicked
        // TODO add your handling code here:
        if (manageMode == ManageMode.RESERVATIONS) {
            ArrayList<Reservation> reservations = MainFrame.lists.reservations();
            Date reservationFrom = this.jXDatePickerReservationFrom.getDate();
            Date reservationTo = this.jXDatePickerReservationTo.getDate();
            long price = CalculateReservationPrice();
            String reservPeople = this.jTextFieldPeopleNumber.getText();
            String roomNumber = (String) this.jComboBoxRooms.getSelectedItem();
            if(reservationFrom == null || reservationTo == null || price == -1 || reservPeople.isEmpty())  {
                JOptionPane.showMessageDialog(rootPane, "Not all of the required fields have been filled", null,JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            if(reservationFrom.before(reservationTo) || reservationFrom.getTime() == reservationTo.getTime()) {
                JOptionPane.showMessageDialog(rootPane, "Incorrect date input", null,JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            if(!CheckPeopleNumber(reservPeople)) {
                JOptionPane.showMessageDialog(rootPane, "Can't make reservation with more people then the maximum", null,JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            try {
                
            }
        }
        
        if (manageMode == ManageMode.ROOMS) {
            ArrayList<Room> rooms = MainFrame.lists.rooms();
            String roomPrice = this.jTextFieldBaseRoomPrice.getText();
            String roomNum = this.jTextFieldRoomNumber.getText();
            String roomPeople = this.jTextFieldRoomPeopleNumber.getText();
            if(roomPrice.isEmpty() || roomNum.isEmpty() || roomPeople.isEmpty() ) {
                JOptionPane.showMessageDialog(rootPane, "Not all of the required fields have been filled", null,JOptionPane.INFORMATION_MESSAGE);
            }
            
            try {
                 Long numberInput = Long.parseLong(roomNum);
                 int peopleInput = Integer.parseInt(roomPeople);
                 Long priceInput = Long.parseLong(roomPrice);
                 Room newRoom = new Room(numberInput,peopleInput,priceInput,this.jCheckBoxBath.isSelected(),this.jCheckBoxKitchen.isSelected(),this.jCheckBoxGoodView.isSelected());
                 rooms.add(newRoom);
                 boolean result = MainFrame.lists.saveLists();
                 if (result) {
                     JOptionPane.showMessageDialog(rootPane, "New room has been registered", null,JOptionPane.INFORMATION_MESSAGE);
                 }
            }
            catch(Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Something went wrong. Terminating application", null,JOptionPane.ERROR_MESSAGE); 
                    System.exit(1);
            }
            
        }
        
        MainFrame mainFrame = new MainFrame();
        this.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jButtonOkMouseClicked
    
    private long CalculateReservationPrice() {
        long price = -1;
        String roomNumber = (String) this.jComboBoxRooms.getSelectedItem();
        try {
            long number = Long.parseLong(roomNumber);
            for(Room foundRoom : MainFrame.lists.rooms()) {
                if(foundRoom.number() == number) {
                    price = foundRoom.price();
                    if(jCheckBoxReservBath.isSelected()) {
                        price += 100;
                    }
                    if(jCheckBoxReservKitchen.isSelected()) {
                        price += 75;
                    }
                    if(jCheckBoxReservGoodView.isSelected()) {
                        price += 150;
                    }
                    break;                    
                }
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect room selected", null,JOptionPane.INFORMATION_MESSAGE);
        }
        finally {
            return price;
        }
    } 
    
    private boolean CheckPeopleNumber(String peopleText) {
        boolean result = false;
        String roomNumber = (String) this.jComboBoxRooms.getSelectedItem();
        try {
            long number = Long.parseLong(roomNumber);
            int peopleInput = Integer.parseInt(peopleText);
            for(Room foundRoom : MainFrame.lists.rooms()) {
                if(foundRoom.number() == number) {
                    if(foundRoom.people() >= peopleInput ) {
                        return true;
                    } 
                    break;                    
                }
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect number of people in room ", null,JOptionPane.INFORMATION_MESSAGE);
        }
        finally {
            return result;
        }
    }
    
    private void jButtonCheckPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCheckPriceMouseClicked
        // TODO add your handling code here:
        long price = CalculateReservationPrice();
        if(price != -1) {
            this.jTextFieldReservationPrice.setText(String.valueOf(price));
        }
    }//GEN-LAST:event_jButtonCheckPriceMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCheckPrice;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JCheckBox jCheckBoxBath;
    private javax.swing.JCheckBox jCheckBoxGoodView;
    private javax.swing.JCheckBox jCheckBoxKitchen;
    private javax.swing.JCheckBox jCheckBoxReservBath;
    private javax.swing.JCheckBox jCheckBoxReservGoodView;
    private javax.swing.JCheckBox jCheckBoxReservKitchen;
    private javax.swing.JComboBox<String> jComboBoxRooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelReeservation;
    private javax.swing.JPanel jPanelReservationOptions;
    private javax.swing.JPanel jPanelRoom;
    private javax.swing.JPanel jPanelRoomOptions;
    private javax.swing.JTextField jTextFieldBaseRoomPrice;
    private javax.swing.JTextField jTextFieldPeopleNumber;
    private javax.swing.JTextField jTextFieldReservationPrice;
    private javax.swing.JTextField jTextFieldRoomNumber;
    private javax.swing.JTextField jTextFieldRoomPeopleNumber;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerReservationFrom;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerReservationTo;
    // End of variables declaration//GEN-END:variables
    }
