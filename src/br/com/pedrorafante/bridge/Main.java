package br.com.pedrorafante.bridge;

import br.com.pedrorafante.bridge.plataforms.Facebook;
import br.com.pedrorafante.bridge.plataforms.IPlatform;
import br.com.pedrorafante.bridge.plataforms.TwitchTV;
import br.com.pedrorafante.bridge.plataforms.YouTube;
import br.com.pedrorafante.bridge.transmissions.AdvancedLive;
import br.com.pedrorafante.bridge.transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());

    }

    public static void startLive(IPlatform platform){
        /*System.out.println("....Aguarde!!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        System.out.println("....Aguarde!!");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();

    }
}
