interface Exporter {
    void exportCSV();
    void exportPDF();

    default void exportToJSON() {
        System.out.println("Exporting to JSON (default support)");
    }
}

class Report implements Exporter {
    public void exportCSV() {
        System.out.println("Report exported as CSV");
    }

    public void exportPDF() {
        System.out.println("Report exported as PDF");
    }
}

public class ExportTest {
    public static void main(String[] args) {
        Exporter report = new Report();
        report.exportCSV();
        report.exportPDF();
        report.exportToJSON(); 
    }
}

