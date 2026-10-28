package app;

import app.config.Config;
import app.domain.Person;
import app.userinterface.AppUserInterface;

public class VirtualWalletApplication {

    public static void main(String[] args) {

        AppUserInterface appUserInterface = Config.app();

        appUserInterface.startApp();

    }
}
