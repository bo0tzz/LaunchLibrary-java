package me.bo0tzz.launchlibrary.retrofit;

public enum Mode {

    LIST("list"),
    SUMMARY("summary"),
    VERBOSE("verbose");

    private final String string;

    Mode(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
