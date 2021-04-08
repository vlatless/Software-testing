package com.company.DataDomain;

public class Sound {
    private SoundType soundType;

    public Sound(SoundType soundType) {
        this.soundType = soundType;
    }

    public void ringOut() {
        System.out.println(soundType);
    }

    public SoundType getSoundType() {
        return soundType;
    }
}
