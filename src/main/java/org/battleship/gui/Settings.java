package org.battleship.gui;

import java.io.IOException;
import java.util.Properties;

public class Settings {
    private final Properties properties = new Properties();

    public Settings() {
        try {
            this.properties.load(getClass().getClassLoader().getResourceAsStream("program.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProgramVersion() {
        return this.properties.getProperty("version");
    }
}
