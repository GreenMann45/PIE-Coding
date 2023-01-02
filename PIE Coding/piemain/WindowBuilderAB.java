//***IMPORTANT***
//set project folder to JRE 1.7 in order to work

//THIS SHIT WORKS IN VSCODE LETS GOOOOOOO
package piemain;
/*Programmer: Green Mann
Purpose: This program is to test WindowBuilder in VSCode :D (it works! try it out yourself!!)
Issues: I managed to figure out how to convert your name into an if statement, but I am currently having issues with converting the age response
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBuilderAB {

    private JFrame frmClubMembers;
    private final JTextField nameText = new JTextField();
    //age is "emailText"
    private final JTextField emailText = new JTextField(); //emailtext used to be "private" and not "final" (also didnt have = "new JTextField();"")
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WindowBuilderAB window = new WindowBuilderAB();
                    window.frmClubMembers.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public WindowBuilderAB() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmClubMembers = new JFrame();
        frmClubMembers.getContentPane().setBackground(Color.YELLOW);
        frmClubMembers.setTitle("Club Members");
        frmClubMembers.setBounds(100, 100, 523, 365);
        frmClubMembers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 172, 148, 0 };
        gridBagLayout.rowHeights = new int[] { 135, 0, 0, 0, 0, 0, 0, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        frmClubMembers.getContentPane().setLayout(gridBagLayout);

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 0;
        frmClubMembers.getContentPane().add(panel, gbc_panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
        gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
        gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
        gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        panel.setLayout(gbl_panel);

        ////////////////////////////////////////////////////////////////////////// NAME
        JLabel name = new JLabel("Name");
        GridBagConstraints gbc_name = new GridBagConstraints();
        gbc_name.insets = new Insets(0, 0, 5, 5);
        gbc_name.gridx = 1;
        gbc_name.gridy = 3;
        panel.add(name, gbc_name);
        GridBagConstraints gbc_nameText = new GridBagConstraints();
        gbc_nameText.anchor = GridBagConstraints.WEST;
        gbc_nameText.insets = new Insets(0, 0, 5, 0);
        gbc_nameText.gridx = 2;
        gbc_nameText.gridy = 3;
        panel.add(nameText, gbc_nameText);
        nameText.setColumns(10);

        ////////////////////////////////////////////////////////////////////////// AGE
        JLabel age = new JLabel("Age");
        GridBagConstraints gbc_age = new GridBagConstraints();
        gbc_age.insets = new Insets(0, 0, 0, 5);
        gbc_age.gridx = 1;
        gbc_age.gridy = 4;
        panel.add(age, gbc_age);
       

        //this is also age but it seems i have named it "emailText" for some reason
        //emailText = new JTextField();
        GridBagConstraints gbc_emailText = new GridBagConstraints();
        gbc_emailText.anchor = GridBagConstraints.WEST;
        gbc_emailText.gridx = 2;
        gbc_emailText.gridy = 4;
        panel.add(emailText, gbc_emailText);
        emailText.setColumns(10);

        JLabel doYouLike = new JLabel("Do you like the colour yellow?");
        GridBagConstraints gbc_doYouLike = new GridBagConstraints();
        gbc_doYouLike.insets = new Insets(0, 0, 5, 0);
        gbc_doYouLike.gridx = 1;
        gbc_doYouLike.gridy = 1;
        frmClubMembers.getContentPane().add(doYouLike, gbc_doYouLike);

        final JRadioButton yes = new JRadioButton("Yes");
        buttonGroup.add(yes);
        yes.setBackground(Color.YELLOW);
        GridBagConstraints gbc_yes = new GridBagConstraints();
        gbc_yes.insets = new Insets(0, 0, 5, 0);
        gbc_yes.gridx = 1;
        gbc_yes.gridy = 2;
        frmClubMembers.getContentPane().add(yes, gbc_yes);

        final JRadioButton no = new JRadioButton("No");
        buttonGroup.add(no);
        no.setBackground(Color.YELLOW);
        GridBagConstraints gbc_no = new GridBagConstraints();
        gbc_no.insets = new Insets(0, 0, 5, 0);
        gbc_no.gridx = 1;
        gbc_no.gridy = 3;
        frmClubMembers.getContentPane().add(no, gbc_no);

        JButton submit = new JButton("Submit");
        submit.setBackground(Color.ORANGE);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (no.isSelected() == true) {
                    System.out.println(">:(");
                }
                if (yes.isSelected() == true) {
                    System.out.println("YAY!");
                }
                //// This is entirely new, I wonder if I can do console output for JLabel since it did not have one previously
                String nameFinal;
                String ageFinal;

                nameFinal = nameText.getText();
                if (nameFinal.contains("pene")) {
                    System.out.println("PEEPEE!!");
                }
                else {
                    System.out.println("Your name is " + nameFinal);
                }
                //// I MADE IT WORK!!!! /////////////////////////////////
                
                ageFinal = emailText.getText();
                if (ageFinal.contains("18")) {
                    System.out.println("AHOOGIE");
                } 
                else {
                    System.out.println("Your age is: " + ageFinal);
                }
                ///////The age is string but I don't think it matters :DDDDDD
            }

        });
        GridBagConstraints gbc_submit = new GridBagConstraints();
        gbc_submit.insets = new Insets(0, 0, 5, 0);
        gbc_submit.anchor = GridBagConstraints.SOUTH;
        gbc_submit.gridx = 1;
        gbc_submit.gridy = 5;
        frmClubMembers.getContentPane().add(submit, gbc_submit);
    }

}
