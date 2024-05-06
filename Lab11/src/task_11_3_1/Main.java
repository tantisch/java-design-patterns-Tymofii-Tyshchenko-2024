package task_11_3_1;

public class Main {

    public static void main(String[] args) {

        String fileName = "youtubevideo.ogg";
        String format = "mp4";

        VideoFile videoFile = new VideoFile(fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec()); // програємо файл не правильним кодеком
//        videoFile.play(new OggCompressionCodec());   // програємо файл правильним кодеком

        System.out.println("\n======= VideoConversionFacade: conversion started. =======");

        VideoConversionFacade facade = new VideoConversionFacade();
        Codec destinationCodec = new MPEG4CompressionCodec();
        VideoFile videoFileConverted = facade.convert(videoFile, destinationCodec);

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");

        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}
