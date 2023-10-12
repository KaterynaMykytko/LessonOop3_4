package org.courses.ex3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ключ pro або exp");
        String key = scanner.next();

        switch (key) {
            case "pro": {
                DocumentWorker proDocumentWorker = new ProDocumentWorker();
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
                break;
            }
            case "exp":{
                DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();
                break;
            }
            default:
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
                break;
        }
    }
}
