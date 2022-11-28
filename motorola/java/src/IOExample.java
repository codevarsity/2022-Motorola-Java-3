import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class IOExample {

    public static void main(String[] args) {
        File[] roots = File.listRoots() ;
        for ( File root : roots) {
            System.out.println(root.toString());
        }

        IOExample ioExample = new IOExample();
//        ioExample.createDataIO();
//        ioExample.testDataIO();
//        ioExample.printStringFromURL("http://www.google.com");
//
//        File fout = new File("/Users/amitgulati/testing.txt");
//        ioExample.writeToFile("Hello World from java", fout);

        ioExample.testJSONData();


    }


    void createDataIO() {
        File file = new File("/Users/amitgulati/data.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file);
            DataOutputStream dataOut = new DataOutputStream(fout);
            dataOut.writeFloat(10.0f);
            dataOut.writeFloat(20.0f);
            dataOut.writeFloat(30.0f);
            dataOut.writeFloat(40.0f);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    void testDataIO() {
        File file = new File("/Users/amitgulati/data.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            DataInputStream dataStream = new DataInputStream(inputStream);

            double data = dataStream.readFloat();
            System.out.println(data);
            data = dataStream.readFloat();
            System.out.println(data);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    void testJSONData() {
        try {
            URL url = new URL("https://www.googleapis.com/books/v1/volumes?q=India");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            System.out.println(line);
            while( line != null) {
                line = bufferedReader.readLine();
                System.out.println(line);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void testFileIO() {
        File file = new File("/Users/amitgulati/text.txt");
        if (file.exists()) {
            System.out.println("FIle exists");
        } else {
            System.out.println("FIle does not exist");
        }

        try {
            InputStream inputStream = new FileInputStream(file);
            (new IOExample()).printInputStream(inputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    void printInputStream(InputStream inputStream) {
        try {
            byte value = (byte) inputStream.read();
            while(value != -1) {

                value = (byte) inputStream.read();
                System.out.println((char)value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void printStringFromURL(String link) {
        try {
            URL url = new URL(link);
            URLConnection connection = url.openConnection();
            InputStream stream = connection.getInputStream();
            printInputStream(stream);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    void writeToFile(String str, File output) {
        try {
            FileOutputStream fout = new FileOutputStream(output

            );
            byte[] stringBytes = str.getBytes();
            fout.write(stringBytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
