//Program made by YewTM for Goonstation servers.
//Released under the CC BY-NC 3.0 US license
//Attribution-NonCommercial 3.0 United States
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.Number.*;

public class TelesciCalculator extends JPanel {
    private JLabel titleText;
    private DefaultListModel < String > coordinateListModel = new DefaultListModel < > ();
    private JList coordinateList;
    private JTextField cpuX1Input;
    private JLabel cpuX1Label;
    private JLabel cpuY1Label;
    private JTextField cpuY1Input;
    private JLabel gpsX1Label;
    private JLabel gpsY1Label;
    private JTextField gpsX1Input;
    private JTextField gpsY1Input;
    private JLabel cpuX2Label;
    private JLabel cpuY2Label;
    private JTextField cpuX2Input;
    private JTextField cpuY2Input;
    private JTextField gpsX2Input;
    private JTextField gpsY2Input;
    private JLabel gpsX2Label;
    private JLabel gpsY2Label;
    private JLabel listTitleText;
    private JLabel targetXLabel;
    private JLabel targetYLabel;
    private JTextField targetXInput;
    private JTextField targetYInput;
    private JLabel coordinateLabel;
    private JTextField coordinateNameInput;
    private JToggleButton calculateButton;
    private JToggleButton mathButton;
    private JToggleButton clearButton;
    private JButton listclearButton;
    private JButton undoButton;
    //Possible Error messages:
    String[] errorMessages = {
        "Invaid input(s), decimals/integers only!",
        "No found input(s)!",
        "Uh oh! Ummmmm...."
    };
    private String topString = "Name: X, Y";
    public TelesciCalculator() {
        //construct preComponents
        coordinateListModel.addElement(topString);
        //construct components
        titleText = new JLabel("Nanotrasen Regulation Telescience Coordinate Calculator.");
        coordinateList = new JList(coordinateListModel);
        cpuX1Input = new JTextField(1);
        cpuX1Label = new JLabel("Computer X 1:");
        cpuY1Label = new JLabel("Computer Y 1:");
        cpuY1Input = new JTextField(1);
        gpsX1Label = new JLabel("GPS X 1:");
        gpsY1Label = new JLabel("GPS Y 1:");
        gpsX1Input = new JTextField(1);
        gpsY1Input = new JTextField(1);
        cpuX2Label = new JLabel("Computer X 2:");
        cpuY2Label = new JLabel("Computer Y 2:");
        cpuX2Input = new JTextField(1);
        cpuY2Input = new JTextField(1);
        gpsX2Input = new JTextField(1);
        gpsY2Input = new JTextField(1);
        gpsX2Label = new JLabel("GPS X 2:");
        gpsY2Label = new JLabel("GPS Y 2:");
        listTitleText = new JLabel("Real Coordinate List:");
        targetXLabel = new JLabel("Target X Coordinate:");
        targetYLabel = new JLabel("Target Y Coordinate:");
        targetXInput = new JTextField(1);
        targetYInput = new JTextField(1);
        coordinateLabel = new JLabel("Coordinate Name:");
        coordinateNameInput = new JTextField(1);
        calculateButton = new JToggleButton("Calculate", false);
        mathButton = new JToggleButton("View Math", false);
        clearButton = new JToggleButton("Clear Inputs", false);
        listclearButton = new JButton("Clear List");
        undoButton = new JButton("Undo");

        //set components properties
        titleText.setToolTipText("Created by Yewâ„¢ - v0.01 - Thanks Muk!");
        coordinateList.setToolTipText("Every result is recorded here!");
        cpuX1Input.setToolTipText("The X coordinate of the Telescience computer for your first test.");
        cpuX1Label.setToolTipText("The X coordinate of the Telescience computer for your first test.");
        cpuY1Label.setToolTipText("The Y coordinate of the Telescience computer for your first test.");
        cpuY1Input.setToolTipText("The Y coordinate of the Telescience computer for your first test.");
        gpsX1Label.setToolTipText("The X Coordinate of where your first test GPS ends up.");
        gpsY1Label.setToolTipText("The Y Coordinate of where your first test GPS ends up.");
        gpsX1Input.setToolTipText("The X Coordinate of where your first test GPS ends up.");
        gpsY1Input.setToolTipText("The Y Coordinate of where your first test GPS ends up.");
        cpuX2Label.setToolTipText("The X coordinate of the Telescience computer for your second test.");
        cpuY2Label.setToolTipText("The Y coordinate of the Telescience computer for your second test.");
        cpuX2Input.setToolTipText("The X coordinate of the Telescience computer for your second test.");
        cpuY2Input.setToolTipText("The Y coordinate of the Telescience computer for your second test.");
        gpsX2Input.setToolTipText("The X Coordinate of where your second test GPS ends up.");
        gpsY2Input.setToolTipText("The Y Coordinate of where your second test GPS ends up.");
        gpsX2Label.setToolTipText("The X Coordinate of where your second test GPS ends up.");
        gpsY2Label.setToolTipText("The Y Coordinate of where your second test GPS ends up.");
        listTitleText.setToolTipText("Every result attempted appears under here.");
        targetXLabel.setToolTipText("The X coordinate of the place you want to target!");
        targetYLabel.setToolTipText("The Y coordinate of the place you want to target!");
        targetXInput.setEnabled(true);
        targetXInput.setToolTipText("The X coordinate of the place you want to target!");
        targetYInput.setEnabled(true);
        targetYInput.setToolTipText("The Y coordinate of the place you want to target!");
        coordinateLabel.setEnabled(true);
        coordinateLabel.setToolTipText("The (optional) name of the place you want to target!");
        coordinateNameInput.setToolTipText("The (optional) name of the place you want to target!");
        calculateButton.setEnabled(true);
        calculateButton.setToolTipText("Hit this once you input everything!");
        mathButton.setEnabled(false);
        mathButton.setToolTipText("This is to double check the programs work!");
        clearButton.setEnabled(true);
        clearButton.setToolTipText("Clears all your inputs!");
        listclearButton.setToolTipText("Clears the Coordinate List!");
        undoButton.setToolTipText("Deletes the last coordinate entry.");

        //adjust size and set layout
        setPreferredSize(new Dimension(507, 367));
        setLayout(null);

        //add components
        add(titleText);
        add(coordinateList);
        add(cpuX1Input);
        add(cpuX1Label);
        add(cpuY1Label);
        add(cpuY1Input);
        add(gpsX1Label);
        add(gpsY1Label);
        add(gpsX1Input);
        add(gpsY1Input);
        add(cpuX2Label);
        add(cpuY2Label);
        add(cpuX2Input);
        add(cpuY2Input);
        add(gpsX2Input);
        add(gpsY2Input);
        add(gpsX2Label);
        add(gpsY2Label);
        add(listTitleText);
        add(targetXLabel);
        add(targetYLabel);
        add(targetXInput);
        add(targetYInput);
        add(coordinateLabel);
        add(coordinateNameInput);
        add(calculateButton);
        add(mathButton);
        add(clearButton);
        add(listclearButton);
        add(undoButton);

        //set component bounds (only needed by Absolute Positioning)
        titleText.setBounds(10, 0, 330, 30);
        coordinateList.setBounds(340, 45, 160, 230);
        cpuX1Input.setBounds(105, 45, 95, 25);
        cpuX1Label.setBounds(15, 45, 90, 25);
        cpuY1Label.setBounds(15, 75, 90, 25);
        cpuY1Input.setBounds(105, 75, 95, 25);
        gpsX1Label.setBounds(210, 45, 55, 25);
        gpsY1Label.setBounds(210, 75, 55, 25);
        gpsX1Input.setBounds(265, 45, 60, 25);
        gpsY1Input.setBounds(265, 75, 60, 25);
        cpuX2Label.setBounds(15, 125, 90, 25);
        cpuY2Label.setBounds(15, 155, 90, 25);
        cpuX2Input.setBounds(105, 125, 95, 25);
        cpuY2Input.setBounds(105, 155, 95, 25);
        gpsX2Input.setBounds(265, 125, 60, 25);
        gpsY2Input.setBounds(265, 155, 60, 25);
        gpsX2Label.setBounds(210, 125, 55, 25);
        gpsY2Label.setBounds(210, 155, 55, 25);
        listTitleText.setBounds(340, 20, 145, 25);
        targetXLabel.setBounds(40, 200, 120, 25);
        targetYLabel.setBounds(40, 250, 120, 25);
        targetXInput.setBounds(65, 225, 70, 25);
        targetYInput.setBounds(65, 275, 70, 25);
        coordinateLabel.setBounds(40, 300, 120, 25);
        coordinateNameInput.setBounds(65, 325, 70, 25);
        calculateButton.setBounds(190, 205, 130, 30);
        mathButton.setBounds(190, 245, 130, 30);
        clearButton.setBounds(190, 285, 130, 30);
        listclearButton.setBounds(410, 285, 90, 30);
        undoButton.setBounds(340, 285, 65, 30);
        //Button Listeners
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                coordinateListModel.addElement(calculateCoords(
                    cpuX1Input.getText(),
                    cpuY1Input.getText(),
                    gpsX1Input.getText(),
                    gpsY1Input.getText(),
                    cpuX2Input.getText(),
                    cpuY2Input.getText(),
                    gpsX2Input.getText(),
                    gpsY2Input.getText(),
                    targetXInput.getText(),
                    targetYInput.getText(),
                    coordinateNameInput.getText(),
                    7
                ).toString());
            }
        });
        mathButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {}
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cpuX1Input.setText("");
                cpuY1Input.setText("");
                gpsX1Input.setText("");
                gpsY1Input.setText("");
                cpuX2Input.setText("");
                cpuY2Input.setText("");
                gpsX2Input.setText("");
                gpsY2Input.setText("");
                targetXInput.setText("");
                targetYInput.setText("");
            }
        });
        listclearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                coordinateListModel.removeAllElements();
                coordinateListModel.addElement(topString);
            }
        });
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                coordinateListModel.remove(coordinateListModel.size() - 1);
                if (coordinateListModel.size() == 0) {
                    coordinateListModel.addElement(topString);
                }
            }
        }); 
    }
    public Object calculateCoords(String cpux1, String cpuy1, String gpsx1, String gpsy1, String cpux2, String cpuy2, String gpsx2, String gpsy2, String targetx, String targety, String name, int returnvalue) {
        double n_cpux1 = Double.valueOf(cpux1);
        double n_cpuy1 = Double.valueOf(cpuy1);
        double n_gpsx1 = Double.valueOf(gpsx1);
        double n_gpsy1 = Double.valueOf(gpsy1);
        double n_cpux2 = Double.valueOf(cpux2);
        double n_cpuy2 = Double.valueOf(cpuy2);
        double n_gpsx2 = Double.valueOf(gpsx2);
        double n_gpsy2 = Double.valueOf(gpsy2);
        double n_targetx = Double.valueOf(targetx);
        double n_targety = Double.valueOf(targety);
        double X_Multiplier = (n_gpsx2 - n_gpsx1) / (n_cpux2 - n_cpux1);
        double Y_Multiplier = (n_gpsy2 - n_gpsy1) / (n_cpuy2 - n_cpuy1);
        double X_Drift = (X_Multiplier * n_cpux1) - n_gpsx1;
        double Y_Drift = (Y_Multiplier * n_cpuy1) - n_gpsy1;
        double Tele_X = (n_targetx + X_Drift) / X_Multiplier;
        double Tele_Y = (n_targety + Y_Drift) / Y_Multiplier;
        String Final_Coords = name + ": " + Tele_X + ", " + Tele_Y;
        switch (returnvalue) {
            case 1:
                return X_Multiplier;
            case 2:
                return Y_Multiplier;
            case 3:
                return X_Drift;
            case 4:
                return Y_Drift;
            case 5:
                return Tele_X;
            case 6:
                return Tele_Y;
            case 7:
                return Final_Coords;
            default:
                return errorMessages[2];
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("NRTCC - Nanotrasen Regulation Teleporter Science Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TelesciCalculator());
        frame.pack();
        frame.setVisible(true);
    }
}
