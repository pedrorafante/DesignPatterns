package br.com.pedrorafante.bridge.transmissions;

import br.com.pedrorafante.bridge.plataforms.IPlatform;

public class AdvancedLive extends Live{
    public AdvancedLive(IPlatform platform) {
        super(platform);
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na transmissão!");
    }

    public void comments(){
        System.out.println("Comentários liberados na live;");
    }


}

