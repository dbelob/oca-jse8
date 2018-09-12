package acme.appendix_b.creating_and_running_sample_applications;

public class Example {
    public static void main(String[] args) {
//        float value = 102.0; // DOES NOT COMPILE
        float value = 102.0f;

        float value1 = 102;
        float value2 = (int) 102.0;
//        float value3 = 1f * 0.0; // DOES NOT COMPILE
        float value4 = 1f * (short) 0.0;
//        float value5 = 1f * (boolean) 0; // DOES NOT COMPILE
    }
}