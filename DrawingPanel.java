import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

public class DrawingPanel extends JPanel {
    private List<Point> points = new ArrayList<>();

    public DrawingPanel() {
        MouseInputAdapter mia = new MouseInputAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                points.clear();
                repaint();
            }
        };
        addMouseMotionListener(mia);
        addMouseListener(mia);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1), p2 = points.get(i);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Draw");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(new DrawingPanel());
            f.setSize(400, 400);
            f.setVisible(true);
        });
    }
}
