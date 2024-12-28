package task5;
import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm extends Frame implements ActionListener 
{

    Label lblFirstName, lblLastName, lblDob, lblGender, lblPlace, lblContact;
    TextField txtFirstName, txtLastName, txtDob, txtPlace, txtContact;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    Button btnSubmit;

    public UserRegistrationForm() 
    {
        setTitle("User Registration Form");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2));

        lblFirstName = new Label("First Name:");
        txtFirstName = new TextField();
        
        lblLastName = new Label("Last Name:");
        txtLastName = new TextField();
        
        lblDob = new Label("Date of Birth:");
        txtDob = new TextField();
        
        lblGender = new Label("Gender:");
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, true);
        female = new Checkbox("Female", genderGroup, false);
        
        lblPlace = new Label("Place:");
        txtPlace = new TextField();
        
        lblContact = new Label("Contact Number:");
        txtContact = new TextField();
        
        btnSubmit = new Button("Submit");
        btnSubmit.addActionListener(this);

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblDob);
        add(txtDob);
        add(lblGender);
        
        Panel genderPanel = new Panel();
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);
        
        add(lblPlace);
        add(txtPlace);
        add(lblContact);
        add(txtContact);
        add(new Label(""));
        add(btnSubmit);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String dob = txtDob.getText();
        String gender = genderGroup.getSelectedCheckbox().getLabel();
        String place = txtPlace.getText();
        String contact = txtContact.getText();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("Place: " + place);
        System.out.println("Contact Number: " + contact);
    }

    public static void main(String[] args) 
    {
        new UserRegistrationForm();
    }
}
