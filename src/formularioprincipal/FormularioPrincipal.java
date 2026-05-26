/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioprincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioPrincipal extends JFrame {

    // O
    JLabel lblNumero1, lblNumero2;
    JTextField txtNumero1, txtNumero2;
    JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

    // T
    JLabel lblCelsius, lblFahrenheit;
    JTextField txtCelsius, txtFahrenheit;
    JButton btnCtoF, btnFtoC;

    // M
    JLabel lblDolares, lblPesos;
    JTextField txtDolares, txtPesos;
    JButton btnUsdCop, btnCopUsd;

    public FormularioPrincipal() {

        setTitle("Construcción de Software I");
        setSize(600, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
        // S O
       

        JLabel titulo1 = new JLabel("OPERACIONES MATEMÁTICAS");
        titulo1.setBounds(180, 40, 250, 30);
        add(titulo1);

        lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 60, 100, 30);
        add(lblNumero1);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(140, 60, 120, 30);
        add(txtNumero1);

        lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(300, 60, 100, 30);
        add(lblNumero2);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(390, 60, 120, 30);
        add(txtNumero2);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(50, 110, 100, 30);
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(170, 110, 100, 30);
        add(btnRestar);

        btnMultiplicar = new JButton("Multiplicar");
        btnMultiplicar.setBounds(290, 110, 120, 30);
        add(btnMultiplicar);

        btnDividir = new JButton("Dividir");
        btnDividir.setBounds(430, 110, 100, 30);
        add(btnDividir);

        
        // S T
        

        JLabel titulo2 = new JLabel("CONVERSIÓN DE TEMPERATURA");
        titulo2.setBounds(160, 180, 300, 30);
        add(titulo2);

        lblCelsius = new JLabel("Celsius:");
        lblCelsius.setBounds(50, 220, 100, 30);
        add(lblCelsius);

        txtCelsius = new JTextField();
        txtCelsius.setBounds(140, 220, 120, 30);
        add(txtCelsius);

        btnCtoF = new JButton("°C a °F");
        btnCtoF.setBounds(300, 220, 100, 30);
        add(btnCtoF);

        lblFahrenheit = new JLabel("Fahrenheit:");
        lblFahrenheit.setBounds(50, 270, 100, 30);
        add(lblFahrenheit);

        txtFahrenheit = new JTextField();
        txtFahrenheit.setBounds(140, 270, 120, 30);
        add(txtFahrenheit);

        btnFtoC = new JButton("°F a °C");
        btnFtoC.setBounds(300, 270, 100, 30);
        add(btnFtoC);

        
        // S M
       

        JLabel titulo3 = new JLabel("CONVERSIÓN DE MONEDA");
        titulo3.setBounds(180, 340, 250, 30);
        add(titulo3);

        lblDolares = new JLabel("Dólares USD:");
        lblDolares.setBounds(50, 380, 120, 30);
        add(lblDolares);

        txtDolares = new JTextField();
        txtDolares.setBounds(170, 380, 120, 30);
        add(txtDolares);

        btnUsdCop = new JButton("USD a COP");
        btnUsdCop.setBounds(320, 380, 120, 30);
        add(btnUsdCop);

        lblPesos = new JLabel("Pesos COP:");
        lblPesos.setBounds(50, 420, 120, 30);
        add(lblPesos);

        txtPesos = new JTextField();
        txtPesos.setBounds(170, 420, 120, 30);
        add(txtPesos);

        btnCopUsd = new JButton("COP a USD");
        btnCopUsd.setBounds(320, 420, 120, 30);
        add(btnCopUsd);

        
        // E O
        
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double n1 = Double.parseDouble(txtNumero1.getText());
                    double n2 = Double.parseDouble(txtNumero2.getText());

                    double resultado = n1 + n2;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + resultado);

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese números válidos");

                }

            }
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double n1 = Double.parseDouble(txtNumero1.getText());
                    double n2 = Double.parseDouble(txtNumero2.getText());

                    double resultado = n1 - n2;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + resultado);

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese números válidos");

                }

            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double n1 = Double.parseDouble(txtNumero1.getText());
                    double n2 = Double.parseDouble(txtNumero2.getText());

                    double resultado = n1 * n2;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + resultado);

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese números válidos");

                }

            }
        });

        btnDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double n1 = Double.parseDouble(txtNumero1.getText());
                    double n2 = Double.parseDouble(txtNumero2.getText());

                    if (n2 == 0) {

                        JOptionPane.showMessageDialog(null,
                                "No se puede dividir entre cero");
                        return;
                    }

                    double resultado = n1 / n2;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + resultado);

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese números válidos");

                }

            }
        });

       
        // E T
       

        btnCtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double celsius = Double.parseDouble(txtCelsius.getText());

                    double fahrenheit = (celsius * 9 / 5) + 32;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + fahrenheit + " °F");

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese una temperatura válida");

                }

            }
        });

        btnFtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double fahrenheit = Double.parseDouble(txtFahrenheit.getText());

                    double celsius = (fahrenheit - 32) * 5 / 9;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + celsius + " °C");

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese una temperatura válida");

                }

            }
        });

       
        // E M
        

        btnUsdCop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double dolares = Double.parseDouble(txtDolares.getText());

                    // V N
                    if (dolares < 0) {

                        JOptionPane.showMessageDialog(null,
                                "No puede ingresar valores negativos");

                        return;
                    }

                    double pesos = dolares * 3800;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + pesos + " COP");

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese un valor válido");

                }

            }
        });

        btnCopUsd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    double pesos = Double.parseDouble(txtPesos.getText());

                    // V N
                    if (pesos < 0) {

                        JOptionPane.showMessageDialog(null,
                                "No puede ingresar valores negativos");

                        return;
                    }

                    double dolares = pesos / 3800;

                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + dolares + " USD");

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese un valor válido");

                }

            }
        });

    }

    public static void main(String[] args) {

        FormularioPrincipal formulario = new FormularioPrincipal();
        formulario.setVisible(true);

    }

}