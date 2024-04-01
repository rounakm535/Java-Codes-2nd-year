import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class JavaLab extends JFrame implements ActionListener {
    JTextField rollNoField, nameField;
    JButton insertButton, clearButton;

    public JavaLab() {
        setTitle("Student Details");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel rollNoLabel = new JLabel("Roll No.:");
        rollNoField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        insertButton = new JButton("Insert");
        insertButton.addActionListener(this);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        panel.add(rollNoLabel);
        panel.add(rollNoField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(insertButton);
        panel.add(clearButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            String rollNo = rollNoField.getText();
            String name = nameField.getText();
            insertIntoDatabase(rollNo, name);
            rollNoField.setText("");
            nameField.setText("");
        } else if (e.getSource() == clearButton) {
            rollNoField.setText("");
            nameField.setText("");
        }
    }

    private void insertIntoDatabase(String rollNo, String name) {
        String url = "jdbc:mysql://localhost:3306/CSE_28";
        String user = "root";
        String password = "123456789";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String query = "INSERT INTO TEST (roll_no, name) VALUES ('" + rollNo + "', '" + name + "')";
            statement.executeUpdate(query);
            statement.close();
            connection.close();
            System.out.println("Inserted: Roll No. " + rollNo + ", Name: " + name);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new JavaLab();
    }
}