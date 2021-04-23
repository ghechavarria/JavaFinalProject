package carDealerFamily;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JProgressBar;

public class LoadingBar extends JFrame{
	
	JProgressBar loadingBar = new JProgressBar(0, 1000);
	
	public LoadingBar() {
		loadingBar.setBounds(40,40,160,30);
        loadingBar.setValue(0);
        loadingBar.setStringPainted(true);
        loadingBar.setFont(new Font("MonoLisa", Font.BOLD,15));
        loadingBar.setForeground(Color.DARK_GRAY);
        loadingBar.setBackground(Color.WHITE);
        add(loadingBar);
        setSize(250,150);
        setLayout(null);
	}
	
	public void load() {
        for(int i = 0; i <= 1000; i+= 100) {
            loadingBar.setValue(i);
            try {
                Thread.sleep(150);
            }catch(Exception e) {
                System.out.println(e);
            }
        }
        loadingBar.setString("Done!");
    }

}
