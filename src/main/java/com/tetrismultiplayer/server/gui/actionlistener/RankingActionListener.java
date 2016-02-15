package main.java.com.tetrismultiplayer.server.gui.actionlistener;

import main.java.com.tetrismultiplayer.server.gui.frame.RankingFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RankingActionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    RankingFrame frame = new RankingFrame();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

}