public class MenuApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Animation animation = new Animation();
            frame.add(animation); // Add the animation panel to the frame

            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}