public class Main
{
    public static void main (String [] jom)
    {
        {
            javax.swing.SwingUtilities.invokeLater(() -> {
                javax.swing.JFrame frame = new javax.swing.JFrame("Login Page");
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new LoginPage());
                frame.setSize(967, 617); // You can use frame.pack() if you prefer auto-sizing
                frame.setLocationRelativeTo(null); // Center on screen
                frame.setVisible(true);
            });
        }
    }
}
//ll