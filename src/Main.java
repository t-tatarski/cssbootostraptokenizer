import java.io.*;


public class Main {
    
    private static String PATH ="/var/root/Desktop/JavacBlog/css/bootstrap.min.css";

    public static void main(String[] args) throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(PATH),"rw");
        System.out.println("pozycja w pliku przed"+randomAccessFile.getFilePointer());
        String wynik = randomAccessFile.readLine();
        System.out.println(wynik);
        System.out.println("pozycja wi plilku"+randomAccessFile.getFilePointer());

        File initFile = new File ("/var/root/Desktop/JavacBlog/css/bootstrap.min.css");
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(initFile);
            int i=0;
            while((i=inputStream.read())!=-1){
            if ((char)i==';') {
                System.out.println("\n");
               } else {
                System.out.print((char)i);
               }
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }

