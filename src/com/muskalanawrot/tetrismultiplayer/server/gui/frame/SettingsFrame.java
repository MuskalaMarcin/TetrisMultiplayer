package com.muskalanawrot.tetrismultiplayer.server.gui.frame;

import javax.swing.JFrame;

import com.muskalanawrot.tetrismultiplayer.server.gui.panel.SettingsPanel;

public class SettingsFrame extends JFrame
{
    private static final long serialVersionUID = -5099033041385494292L;

    private SettingsPanel settingsPanel;

    /**
     * Create the frame.
     */
    public SettingsFrame()
    {
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setTitle("Ustawienia");
	settingsPanel = new SettingsPanel();
	setContentPane(settingsPanel);
	setSize(500,400);
	setLocationRelativeTo(null);
    }

}
