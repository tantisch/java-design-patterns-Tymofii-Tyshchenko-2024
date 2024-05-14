package task_14_3_2;

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        FileHandler imageOpener = new ImageOpener();
        FileHandler documentOpener = new DocumentOpener();
        FileHandler tableOpener = new TableOpener();
        FileHandler presentationOpener = new PresentationOpener();
        FileHandler pdfOpener = new PdfOpener();

        imageOpener.setNext(documentOpener);
        documentOpener.setNext(tableOpener);
        tableOpener.setNext(presentationOpener);
        presentationOpener.setNext(pdfOpener);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            // open file
            imageOpener.openFile(file);
        }
    }
}
