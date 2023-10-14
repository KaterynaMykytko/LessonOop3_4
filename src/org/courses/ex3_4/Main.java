package org.courses.ex3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ключ pro або exp");
        String key = scanner.next();
        DocumentWorker documentWorker;

        switch (key) {
            case "pro": {
                documentWorker  = new ProDocumentWorker();
                break;
            }
            case "exp":{
                documentWorker = new ExpertDocumentWorker();
                break;
            }
            default:
                documentWorker = new DocumentWorker();
                break;
        }
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
