import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//import com.sun.java.swing.plaf.windows.*;

public class SearchManager extends JFrame {
  public static final String newline = "\n";
  public static final String SHOW_ALL = "Show Certificates";
  public static final String EXIT = "Exit";

  private JComboBox cmbCertificationType;
  private JPanel pSearchCriteria;
  private JTextArea taSelectedCandidates;

  public SearchManager() throws Exception {
    super("Iterator Pattern - Example");

    // Create controls
    taSelectedCandidates = new JTextArea(15, 20);
    //taSelectedCandidates.setMargin(new Insets(1,1,1,1));
    taSelectedCandidates.setEditable(false);

    pSearchCriteria = new JPanel();

    //Create Labels
    JLabel lblSelectedCandidates = new JLabel("List :");

    //Create the open button
    JButton btnGetSelectedCandidates =
      new JButton(SearchManager.SHOW_ALL);
    btnGetSelectedCandidates.setMnemonic(KeyEvent.VK_S);
    JButton btnExit = new JButton(SearchManager.EXIT);
    btnExit.setMnemonic(KeyEvent.VK_X);

    buttonHandler vf = new buttonHandler(this);

    btnGetSelectedCandidates.addActionListener(vf);
    btnExit.addActionListener(vf);

    //For layout purposes, put the buttons in a separate panel
    JPanel buttonPanel = new JPanel();
    JPanel panel = new JPanel();

    GridBagLayout gridbag2 = new GridBagLayout();
    panel.setLayout(gridbag2);
    panel.add(btnGetSelectedCandidates);
    panel.add(btnExit);

    GridBagConstraints gbc2 = new GridBagConstraints();
    gbc2.gridx = 0;
    gbc2.gridy = 0;
    gridbag2.setConstraints(btnGetSelectedCandidates, gbc2);
    gbc2.gridx = 3;
    gbc2.gridy = 0;
    gridbag2.setConstraints(btnExit, gbc2);

    //****************************************************
    GridBagLayout gridbag = new GridBagLayout();
    buttonPanel.setLayout(gridbag);
    GridBagConstraints gbc = new GridBagConstraints();

    buttonPanel.add(lblSelectedCandidates);
    buttonPanel.add(taSelectedCandidates);
    buttonPanel.add(panel);

    gbc.insets.top = 5;
    gbc.insets.bottom = 5;
    gbc.insets.left = 5;
    gbc.insets.right = 5;

    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 0;
    gbc.gridy = 1;
    gridbag.setConstraints(lblSelectedCandidates, gbc);

    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 0;
    gbc.gridy = 2;
    gridbag.setConstraints(taSelectedCandidates, gbc);

    gbc.insets.left = 2;
    gbc.insets.right = 2;
    gbc.insets.top = 40;
    gbc.gridx = 0;
    gbc.gridy = 6;
    gridbag.setConstraints(panel, gbc);

    //****************************************************
    //Add the buttons and the log to the frame
    Container contentPane = getContentPane();
    contentPane.add(buttonPanel, BorderLayout.CENTER);
    try {
   //   UIManager.setLookAndFeel(new WindowsLookAndFeel());
      SwingUtilities.updateComponentTreeUI(
        SearchManager.this);
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }

  public static void main(String[] args) throws Exception {

    JFrame frame = new SearchManager();
    frame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          }
        }
                           );

    //frame.pack();
    frame.setSize(600, 500);
    frame.setVisible(true);
  }
  public void setSelectedCandidates(String selectedCandidates) {
    taSelectedCandidates.setText(selectedCandidates);
  }

}
class buttonHandler implements ActionListener {
  SearchManager manager;
  public void actionPerformed(ActionEvent e) {

    if (e.getActionCommand().equals(SearchManager.EXIT)) {
      System.exit(1);
    }
    if (e.getActionCommand().equals(SearchManager.SHOW_ALL)) {
      AllCandidates ac = new AllCandidates();
      String selectedCandidates =
        "Name --- Cert Type --- Location" + "\n" + 
          "--------------------------------------";

      while (ac.hasNext()) {
        Candidate c = (Candidate) ac.next();
        selectedCandidates = selectedCandidates + "\n" +
            c.getName() + " - " +
            c.getCertificationType() + " - " +
            c.getLocation();
      }
      manager.setSelectedCandidates(selectedCandidates);
    }
  }
  public buttonHandler() {
  }
  public buttonHandler(SearchManager inmanager) {
    manager = inmanager;
  }

}
