package org.courses.ex3_4;

public class ExpertDocumentWorker extends ProDocumentWorker{

    public ExpertDocumentWorker(){}

    @Override
    public void saveDocument() {
        System.out.println("Документ збережено у новому форматі");
    }
}
