package Home_9;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "log.txt";
        String logLevelInfo = "INFO";
        String logLevelDebug = "DEBUG";
        String logMessage1 = "INFO, This is an informational message.";
        String logMessage2 = "WARNING, This is a warning message.";
        String logMessage3 = "ERROR, This is an error message.";
        String logMessage4 = "DEBUG, This is a debug message.";
        Main.writeLog(filename, logMessage1, logMessage2, logMessage3, logMessage4);
         System.out.println(" ");
        System.out.println(Main.readLog(filename));
        System.out.println(" ");
        System.out.println(Main.getLogError(filename, logLevelInfo, logLevelDebug));
    }

    public static void writeLog(String filename, String logMessage1, String logMessage2, String logMessage3, String logMessage4) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filename, true));
            bufferedWriter.newLine();
            bufferedWriter.write(logMessage1);
            bufferedWriter.newLine();
            bufferedWriter.write(logMessage2);
            bufferedWriter.newLine();
            bufferedWriter.write(logMessage3);
            bufferedWriter.newLine();
            bufferedWriter.write(logMessage4);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String readLog(String filename) {
        StringBuilder fileCore = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                fileCore.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return fileCore.toString();
    }

    public static String getLogError(String filename, String logLevelInfo, String logLevelDebug) {
        StringBuilder fileCore = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(logLevelInfo) || line.startsWith(logLevelDebug)) {
                    fileCore.append(line).append("\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fileCore.toString();
    }

}







