/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.Date;
import java.util.ArrayList;
import person.Person;
import person.Sex;
import static person.Sex.FEMALE;
import static person.Sex.MALE;

/**
 *
 * @author Lazar
 */
public class Form extends javax.swing.JFrame {


    ArrayList<Person> persons = new ArrayList<Person>();
    public Form() {
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

        btnGroupGender = new javax.swing.ButtonGroup();
        labelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelSurname = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        labelDate = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        labelSex = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        nameError = new javax.swing.JLabel();
        surnameError = new javax.swing.JLabel();
        dateError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfPersons = new javax.swing.JTextArea();
        sexError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelName.setText("Name:");

        txtName.setPreferredSize(new java.awt.Dimension(250, 20));

        labelSurname.setText("Surname:");

        txtSurname.setPreferredSize(new java.awt.Dimension(250, 20));

        labelDate.setText("Birth date:");

        labelSex.setText("Sex:");

        btnGroupGender.add(male);
        male.setText("Male");

        btnGroupGender.add(female);
        female.setText("Female");

        btnSubmit.setText("ADD");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        nameError.setForeground(new java.awt.Color(255, 0, 0));

        surnameError.setForeground(new java.awt.Color(255, 0, 0));

        dateError.setForeground(new java.awt.Color(255, 0, 0));

        listOfPersons.setColumns(20);
        listOfPersons.setRows(5);
        jScrollPane1.setViewportView(listOfPersons);

        sexError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSex)
                                .addGap(94, 94, 94)
                                .addComponent(male)
                                .addGap(18, 18, 18)
                                .addComponent(female))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSurname)
                                    .addComponent(labelDate))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameError)
                                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(surnameError)
                                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateError)
                                            .addComponent(sexError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(labelName))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(nameError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(surnameError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDate)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSex)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sexError, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Date birthday = this.datePicker.getDate();
        Sex sex;
        if(this.female.isSelected()) sex = FEMALE;
        else sex = MALE;
        if(this.txtName.getText().equals("")){
            nameError.setText("You have not entered user's name!");
            return;
        }
        if(this.txtSurname.getText().equals("")){
            surnameError.setText("You have not entered user's surname!");
            return;
        }
        //ne znam sta vraca metoda getDate iz JDatePicker-a
//        if(this.datePicker.getDate() == null){
//            surnameError.setText("You have not entered user's birthday!");
//            return;
//        }
 
        if(this.datePicker.getDate().after(new Date())){
            dateError.setText("You have entered invalid date of birth");
            return;
        }
        //nece da radi nesto  ?!
        if(!this.male.isSelected()){
            sexError.setText("You have not chosen your sex");
            return;
        }
        
        Person p = new Person(this.txtName.getText().trim(), this.txtSurname.getText().trim(), birthday, sex);
        persons.add(p);
        this.datePicker.setDate(null);
        this.txtName.setText("");
        this.txtSurname.setText("");
        btnGroupGender.clearSelection();
        //mora da postoji bolji nacin da se gruoisu labele koje su raydvojene u formi a da se ne koristi JPanel, 
        //samo sto ja bas i ne znam kako
        nameError.setText("");
        surnameError.setText("");
        sexError.setText("");
        dateError.setText("");

        listOfPersons.append("Name: " + p.getName() + "; surname: " + p.getSurname() + "; sex: " + p.getSex() + "; date of birth: " + p.getBirthday() + "\n");
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    public void printList(){
        
//        for(Person p : persons){
//            listOfPersons.setText("Name: " + p.getName() + "; surname: " + p.getSurname() + "; sex: " + p.getSex() + "; date of birth: " + p.getBirthday() + "\n");
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel dateError;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JRadioButton female;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSex;
    private javax.swing.JLabel labelSurname;
    private javax.swing.JTextArea listOfPersons;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel nameError;
    private javax.swing.JLabel sexError;
    private javax.swing.JLabel surnameError;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

 
}
