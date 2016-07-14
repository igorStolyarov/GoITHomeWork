package ua.goit.gojavaonline.student.igorstolyarov.module03.files;

public class AudioFiles extends Files {
    private double bitrate;
    private String encoding;

    public double getBitrate() {
        return bitrate;
    }

    public void setBitrate(double bitrate) {
        this.bitrate = bitrate;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
