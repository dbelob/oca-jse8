package acme.enthuware.standard_tests.test3.test63;

public class Logger {
    private StringBuilder sb = new StringBuilder();

    public void logMsg(String location, String message) {
        sb.append(location);
        sb.append("-");
        sb.append(message);
    }

    public void dumpLog() {
        System.out.println(sb.toString());
        //Empty the contents of sb here
        sb.delete(0, sb.length());
    }
}