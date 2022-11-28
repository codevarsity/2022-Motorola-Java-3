import java.io.FileInputStream;
import java.io.FileNotFoundException;

class DivideByZeroException extends  Exception {

}

class Averages {
    void printAverage() {
        System.out.println("PrintingAverage ");
        float average = computeAverage(100, 10);
        System.out.println("Average = " + average);
    }

    float computeAverage(int sum, int items) {
        float result = 0;
        try {
            result = division(sum, items);
        } catch(DivideByZeroException e) {
            return -99999;
        }
        return result;
    }

    float division(int number, int divisor) throws DivideByZeroException{
        if (divisor == 0) {
            throw new DivideByZeroException();
        }
        return number/divisor;
    }
}


class FileOpener {
    void openFile(String file) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(file);
    }
}


public class ExceptionHandling {
    public static void main(String[] args) {
        Averages a = new Averages();
        a.printAverage();

        FileOpener opener = new FileOpener();
        try {
            opener.openFile("test");
        }catch(FileNotFoundException e) {

        }
        catch(Exception err) {

        }


    }
}
