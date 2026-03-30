package labtask1;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Invoice_Generator extends JFrame {

    private JTextField txtClientName, txtHourlyRate, txtHoursWorked, txtTaxRate;
    private JCheckBox chkDiscount;
    private JTextArea areaReport;
    private JButton btnGenerate, btnClear;

    public Invoice_Generator() {
        // Basic Frame Setup
        setTitle("Invoice Generator");
        setSize(450, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // --- Part A: Input Section (User Data Entry) ---
        JPanel pnlInput = new JPanel(new GridLayout(5, 2, 5, 10));
        pnlInput.setBorder(BorderFactory.createTitledBorder("Input Section"));

        pnlInput.add(new JLabel("Client Name:"));
        txtClientName = new JTextField();
        pnlInput.add(txtClientName);

        pnlInput.add(new JLabel("Hourly Rate ($):"));
        txtHourlyRate = new JTextField();
        pnlInput.add(txtHourlyRate);

        pnlInput.add(new JLabel("Number of Hours Worked:"));
        txtHoursWorked = new JTextField();
        pnlInput.add(txtHoursWorked);

        pnlInput.add(new JLabel("Tax Rate (%):"));
        txtTaxRate = new JTextField();
        pnlInput.add(txtTaxRate);

        chkDiscount = new JCheckBox("Apply 10% Discount");
        pnlInput.add(new JLabel("Options:"));
        pnlInput.add(chkDiscount);

        // --- Part B: Output Report Area ---
        areaReport = new JTextArea();
        areaReport.setEditable(false); // Non-editable as per requirements
        areaReport.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(areaReport);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Invoice Report"));

        // --- Buttons Section ---
        JPanel pnlButtons = new JPanel(new FlowLayout());
        btnGenerate = new JButton("Generate Report");
        btnClear = new JButton("Clear Form");
        
        pnlButtons.add(btnGenerate);
        pnlButtons.add(btnClear);

        // Add everything to the main frame
        add(pnlInput, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(pnlButtons, BorderLayout.SOUTH);

        // --- Event Listeners ---
        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplay();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void calculateAndDisplay() {
        try {
            // Retrieve inputs
            String clientName = txtClientName.getText();
            double rate = Double.parseDouble(txtHourlyRate.getText());
            double hours = Double.parseDouble(txtHoursWorked.getText());
            double taxRate = Double.parseDouble(txtTaxRate.getText());

            // Calculations
            double subtotal = rate * hours;
            double taxAmount = subtotal * (taxRate / 100);
            double discountAmount = 0;

            if (chkDiscount.isSelected()) {
                // Applying 10% discount on the subtotal
                discountAmount = subtotal * 0.10;
            }

            double totalDue = (subtotal + taxAmount) - discountAmount;

            // Generate Formatted Report
            StringBuilder report = new StringBuilder();
            report.append("Client: ").append(clientName).append("\n");
            report.append("------------------------------------------\n");
            report.append("Invoice Generator\n");
            report.append("Service: Software Development\n");
            report.append(String.format("Hourly Rate: $%.2f\n", rate));
            report.append(String.format("Hours Worked: %.2f\n", hours));
            report.append(String.format("Subtotal: $%.2f\n", subtotal));
            report.append(String.format("Tax Amount: $%.2f\n", taxAmount));
            
            if (chkDiscount.isSelected()) {
                report.append(String.format("Discount (10%%): -$%.2f\n", discountAmount));
            }
            
            report.append("------------------------------------------\n");
            report.append(String.format("FINAL TOTAL DUE: $%.2f\n", totalDue));
            report.append("------------------------------------------\n");
            report.append("Thank you for your business!");

            areaReport.setText(report.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Please enter numeric values for rates and hours.");
        }
    }

    private void clearFields() {
        txtClientName.setText("");
        txtHourlyRate.setText("");
        txtHoursWorked.setText("");
        txtTaxRate.setText("");
        chkDiscount.setSelected(false);
        areaReport.setText("");
    }

    public static void main(String[] args) {
        // Ensure UI runs on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new Invoice_Generator().setVisible(true);
        });
    }
}