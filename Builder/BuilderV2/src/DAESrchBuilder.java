// Se debe extender el ejercicio a la captura de datos de una empresa de analítica de datos ("Data analytical enterprise") con los siguientes datos:
// Dirección ("Address", en el inglés)
// Número de Identificación del Empleador (EIN ("Employer Identification Number"), en el inglés),
// Dirección electrónica("E-mail", en el inglés)
// URL del sitio web("URL of web site", en el inglés)
// Número de teléfono ("Phone number", en el inglés).
// Estos datos serían los utilizados para generar la sentencia SQL correspondiente.

package src;

import java.awt.*;
import javax.swing.*;

class DAESrchBuilder extends UIBuilder {

  private JTextField txtAddress = new JTextField(20);
  private JTextField txtEIN = new JTextField(10);
  private JTextField txtUserEMail = new JTextField(15);
  private JTextField txtURL = new JTextField(25);
  private JTextField txtTel = new JTextField(10);
  

  public void addUIControls() {
    searchUI = new JPanel();
    JLabel lblEmail = new JLabel("E-mail:");
    JLabel lblURL = new JLabel("URL of web site:");
    JLabel lblAddress = new JLabel("Address:");
    JLabel lblTel = new JLabel("Phone number:");
    JLabel lblEIN = new JLabel("Employer Identification Number :");

    GridBagLayout gridbag = new GridBagLayout();
    searchUI.setLayout(gridbag);
    GridBagConstraints gbc = new GridBagConstraints();
    searchUI.add(lblEmail);
    searchUI.add(txtUserEMail);
    searchUI.add(lblURL);
    searchUI.add(txtURL);
    searchUI.add(lblAddress);
    searchUI.add(txtAddress);
    searchUI.add(lblTel);
    searchUI.add(txtTel);
    searchUI.add(lblEIN);
    searchUI.add(txtEIN);

    gbc.anchor = GridBagConstraints.WEST;

    gbc.insets.top = 5;
    gbc.insets.bottom = 5;
    gbc.insets.left = 5;
    gbc.insets.right = 5;

    gbc.gridx = 0;
    gbc.gridy = 0;
    gridbag.setConstraints(lblEmail, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    gridbag.setConstraints(lblURL, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    gridbag.setConstraints(lblAddress, gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    gridbag.setConstraints(lblTel, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    gridbag.setConstraints(lblEIN, gbc);

    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 1;
    gbc.gridy = 0;
    gridbag.setConstraints(txtUserEMail, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    gridbag.setConstraints(txtURL, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    gridbag.setConstraints(txtAddress, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    gridbag.setConstraints(txtTel, gbc);
    gbc.gridx = 1;
    gbc.gridy = 4;
    gridbag.setConstraints(txtEIN, gbc);
  }

  public void initialize() {

    txtAddress.setText("Cll 00 #00-00");
    txtEIN.setText("00000000");
    txtUserEMail.setText("Example@example.com");
    txtURL.setText("https://example.com");

  }

  public String getSQL() {
    return ("Select * from Data_analytical_enterprise where UserEMail='" +
        txtUserEMail.getText() + "'" + " and URL='" +
        txtURL.getText() + "' and Address='" +
        txtAddress.getText() + "'" + "and Phone='" +
        txtTel.getText() + "' and EmpID='" +
        txtEIN.getText() + "'");
  }

}
