package screen_saver;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Component("lala")
public abstract class ColorFrame extends JFrame {
    private final String title;

    @Autowired(required = false)
    private Color color;

    @Autowired
    ScreenSaverConfig config;


    private Random random = new Random();

    @PostConstruct
    public void init(){
        setTitle(title);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void moveToRandomLocation() {
        color = config.color();
        System.out.println(config.getClass().getName());
        setLocation(random.nextInt(1600),random.nextInt(900));
        getContentPane().setBackground(color);
        repaint();
    }

    protected abstract Color getColorBean() ;


}













