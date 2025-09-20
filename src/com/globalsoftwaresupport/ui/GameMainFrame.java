package com.globalsoftwaresupport.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.constants.GameVariables;
import com.globalsoftwaresupport.image.ImageFactory;
import com.globalsoftwaresupport.image.ImageType;

public class GameMainFrame extends JFrame {
	
	public GameMainFrame() {
		initialize();
	}

	private void initialize() {
		
		// create menu bar
		createMenuBar();
		
		// we can add the panels to the main frame
		add(new GamePanel());
		
		pack();
		
		// define the title of the frame ...
		setTitle(Constants.GAME_TITLE);
		// set icon of the game (logo)
		setIconImage(ImageFactory.createImage(ImageType.LOGO).getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		// this is how we make the application (and the frame) visible
		setVisible(true);
	}
	
	private void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		// Create File menu
		JMenu fileMenu = new JMenu("Menu");
		
		// Create Pause/Resume menu item
		JMenuItem pauseItem = new JMenuItem("Pause");
		pauseItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameVariables.PAUSED = !GameVariables.PAUSED;
				pauseItem.setText(GameVariables.PAUSED ? "Resume" : "Pause");
			}
		});
		
		// Create Quit menu item
		JMenuItem quitItem = new JMenuItem("Quit");
		quitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		fileMenu.add(pauseItem);
		fileMenu.addSeparator();
		fileMenu.add(quitItem);
		menuBar.add(fileMenu);
		
		setJMenuBar(menuBar);
	}
}
