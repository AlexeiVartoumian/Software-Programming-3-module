package Worksheet8DesPatternBehaviour.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        /**
         * Chain of responsibility passes on a clients request until
         * a handler knows what exactly the clients properties are.
         * Could result in a circular reference or error if all cases are not considered.
         * Otherwise the idea is that each Chain member has an instance of the same Chain class
         * assigned to it with that instance being different to the Owner chain.
         */
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);

        file = new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.jpg", "video", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.doc", "doc", "C:");
        textHandler.process(file);

        System.out.println("---------------------------------");

        file = new File("Abc.bat", "bat", "C:");
        textHandler.process(file);

    }
}
