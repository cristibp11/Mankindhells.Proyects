package B1_06.Lofify.Servidor.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;

public class IU_Servidor {

	private JFrame frame;
	private JTabbedPane tpnlMOD1;
	private JPanel pnlCanciones;
	private JPanel pnlAlbumes;
	private JButton btnAadir;
	private JPanel pnlMOD1;
	private JPanel pnlBotones;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_Servidor window = new IU_Servidor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public IU_Servidor() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 709, 674);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		pnlMOD1 = new JPanel();
		frame.getContentPane().add(pnlMOD1, "name_172617068452863");
		pnlMOD1.setLayout(new BorderLayout(0, 0));
		
		pnlBotones = new JPanel();
		pnlMOD1.add(pnlBotones, BorderLayout.SOUTH);
		
		btnAadir = new JButton("Añadir");
		pnlBotones.add(btnAadir);
		
		tpnlMOD1 = new JTabbedPane(JTabbedPane.TOP);
		pnlMOD1.add(tpnlMOD1, BorderLayout.CENTER);
		
		pnlCanciones = new JPanel();
		tpnlMOD1.addTab("Canciones", null, pnlCanciones, null);
		pnlCanciones.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlAlbumes = new JPanel();
		tpnlMOD1.addTab("Álbumes", null, pnlAlbumes, null);
	}
}
